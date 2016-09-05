package com.fis.dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class CommonDAO {

		private static CommonDAO commonDAO = new CommonDAO();
		private CommonDAO(){
			
		}
		
		public static CommonDAO getObject(){
			return commonDAO;
			
		}
		
		public Connection getConnection() throws SQLException, ClassNotFoundException, NamingException{
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:comp/env");
			DataSource ds = (DataSource) envContext.lookup("jdbc/mydbjndi");
			
			System.out.println("DS is "+ds);
			Connection con = ds.getConnection();
			if(con!=null){
				System.out.println("Connection created...");
			}
			return con;
			
			//ResourceBundle rb= ResourceBundle.getBundle("db");
			//Class.forName(rb.getString("driver"));
			//Connection con = DriverManager.getConnection(rb.getString("databaseurl"),rb.getString("userid"),rb.getString("password"));
			//return con;
			
		}
}
