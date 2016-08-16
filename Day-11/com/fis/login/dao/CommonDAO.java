package com.fis.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

// Singleton
// 1. Eager Singleton
// 2. Lazy Singleton
public class CommonDAO {
	private static CommonDAO commonDAO;
	//private static CommonDAO commonDAO =new CommonDAO();
	private CommonDAO(){
		
	}
	
	//1. Eager Singleton
//	public static CommonDAO getObject(){
//		
//		return commonDAO;
//		
//	}
	
	// 2. Lazy Singleton
	public  static CommonDAO getObject(){
		synchronized(CommonDAO.class){
		if(commonDAO==null){
			commonDAO = new CommonDAO();
		}
		}
		return commonDAO;
	}
	public Connection getConnection() throws ClassNotFoundException, SQLException{
		Connection con   = null;
		// To read the Properties file
		ResourceBundle rb = ResourceBundle.getBundle("db");
		String driverName = rb.getString("driver");
		String dburl = rb.getString("databaseurl");
		String userid=rb.getString("userid");
		String password=rb.getString("password");
		Class.forName(driverName);
		con = DriverManager.getConnection(dburl,userid,password);
		return con;
		
	}

}
