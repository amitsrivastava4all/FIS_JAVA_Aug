package com.rest.server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class DataServiceHelper {
	public static final String DB_URL = "jdbc:mysql://localhost:3306/mydb";
	public static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
	// Creating DataBase Connection
	private static Connection getConnection() throws ClassNotFoundException,SQLException {
		Connection con = null;
		Class.forName(DRIVER_NAME);
		con = DriverManager.getConnection(DB_URL, "root", "root");
		return con; 
	}
	public static List<User> executeQuery(String query) throws ClassNotFoundException,SQLException {
		List<User> asl = new ArrayList<User>();
		Connection con = getConnection();
		//Query to the Database
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		// Then Traverse the Query Result and store in the ArrayList
		while (rs.next()) {
			User user = new User(rs.getString("name"), rs.getString("password"));
			asl.add(user);
		}
		rs.close();
		stmt.close();
		con.close();
		return asl; 
		}
	
	public static boolean addNewUser(User userObject) throws ClassNotFoundException, SQLException{
		System.out.println("Inside Add User in DataService "+userObject);
		boolean isAdded= false;
		Connection con = null;
		PreparedStatement pstmt = null;
		con = getConnection();
		pstmt = con.prepareStatement("insert into user (name,password) values(?,?)");
		pstmt.setString(1,userObject.getUserName());
		pstmt.setString(2,userObject.getUserPasswd());
		int recCount = pstmt.executeUpdate();
		if(recCount>0){
			isAdded = true;
		}
		System.out.println("Add User in DataService "+userObject);
		return isAdded;
	}
	public static boolean deleteUser(User userObject) throws ClassNotFoundException, SQLException{
		boolean isDeleted= false;
		Connection con = null;
		PreparedStatement pstmt = null;
		con = getConnection();
		pstmt = con.prepareStatement("delete from user where name=?");
		pstmt.setString(1,userObject.getUserName());
		/*pstmt.setString(2,userObject.getUserPasswd());*/
		int recCount = pstmt.executeUpdate();
		if(recCount>0){
			isDeleted = true;
		}
		System.out.println("Inside Delete "+isDeleted);
		return isDeleted;
	}
	public static boolean updateUser(User userObject) throws ClassNotFoundException, SQLException{
		boolean isUpdated = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		con = getConnection();
		pstmt = con.prepareStatement("update  user set password=? where name=?");
		pstmt.setString(1,userObject.getUserPasswd());
		pstmt.setString(2,userObject.getUserName());
		int recCount = pstmt.executeUpdate();
		if(recCount>0){
			isUpdated=true;
		}
		return isUpdated;
	}
	/*public static void executeUpdateQuery(String query) throws SQLException,ClassNotFoundException {
		Connection con = getConnection();
		Statement stmt = con.createStatement();
		stmt.execute(query);
		stmt.close();
		con.close();
	}*/

	
}