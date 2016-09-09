package com.srivastava.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
 * Data Access Layer , which talk to MySQL
 */
public class DBHelper {
	
	private static Connection getConnection() throws ClassNotFoundException, SQLException{
		Connection con = null;
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
		return con;
	}
	public static boolean addNewUser(User userObject) throws ClassNotFoundException, SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		int recCount = 0;
		boolean isRecordAdded = false;
		try
		{
			con = getConnection();
			pstmt= con.prepareStatement("insert into user (name,password) values(?,?)");
			pstmt.setString(1, userObject.getName());
			pstmt.setString(2,userObject.getPassword());
			recCount = pstmt.executeUpdate();
			if(recCount>0){
				isRecordAdded = true;
			}
		}
		finally{
			// Clean up code
			if(pstmt!=null){
			pstmt.close();
			}
			if(con!=null){
			con.close();
			}
		}
		return isRecordAdded;
	}
	
	public static boolean deleteUser(User userObject) throws ClassNotFoundException, SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		int recCount = 0;
		boolean isRecordDeleted = false;
		try
		{
			con = getConnection();
			pstmt= con.prepareStatement("delete from user where name=?");
			pstmt.setString(1, userObject.getName());
			
			recCount = pstmt.executeUpdate();
			if(recCount>0){
				isRecordDeleted = true;
			}
		}
		finally{
			// Clean up code
			if(pstmt!=null){
			pstmt.close();
			}
			if(con!=null){
			con.close();
			}
		}
		return isRecordDeleted;
	}
	
	public static boolean updateUser(User userObject) throws ClassNotFoundException, SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		int recCount = 0;
		boolean isRecordDeleted = false;
		try
		{
			con = getConnection();
			pstmt= con.prepareStatement("update user set password=? where name=?");
			pstmt.setString(1,userObject.getPassword());
			pstmt.setString(2, userObject.getName());
			
			recCount = pstmt.executeUpdate();
			if(recCount>0){
				isRecordDeleted = true;
			}
		}
		finally{
			// Clean up code
			if(pstmt!=null){
			pstmt.close();
			}
			if(con!=null){
			con.close();
			}
		}
		return isRecordDeleted;
	}
	
	public static List<User> searchByUserName(User userObject) throws ClassNotFoundException, SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int recCunt = 0;
		List<User> userList = new ArrayList<User>();
		User user = null;
		boolean isRecordDeleted = false;
		try
		{
			con = getConnection();
			pstmt= con.prepareStatement("select name, password from user where name=?");
			
			pstmt.setString(1, userObject.getName());
			
			rs = pstmt.executeQuery();
			while(rs.next()){
				user = new User();
				user.setName(rs.getString("name"));
				user.setPassword(rs.getString("password"));
				userList.add(user);
			}
		}
		finally{
			// Clean up code
			if(pstmt!=null){
			pstmt.close();
			}
			if(con!=null){
			con.close();
			}
		}
		return userList;
	}

}
