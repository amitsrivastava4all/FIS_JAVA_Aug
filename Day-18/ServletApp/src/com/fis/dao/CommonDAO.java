package com.fis.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class CommonDAO {

		private static CommonDAO commonDAO = new CommonDAO();
		private CommonDAO(){
			
		}
		
		public static CommonDAO getObject(){
			return commonDAO;
			
		}
		
		public Connection getConnection() throws SQLException, ClassNotFoundException{
			ResourceBundle rb= ResourceBundle.getBundle("db");
			Class.forName(rb.getString("driver"));
			Connection con = DriverManager.getConnection(rb.getString("databaseurl"),rb.getString("userid"),rb.getString("password"));
			return con;
			
		}
}
