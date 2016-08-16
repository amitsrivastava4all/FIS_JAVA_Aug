package com.fis.login.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.fis.login.dto.UserDTO;

//Data Access Object
public class UserDAO {
	
	public static boolean doRegister(UserDTO userDTO) throws ClassNotFoundException, SQLException{
		CommonDAO commonDAO = CommonDAO.getObject();
		Connection con = null;
		PreparedStatement pstmt = null;
		int recordEffected = 0;
		boolean isRecordAdded = false;
		try
		{
			con= commonDAO.getConnection();
			pstmt = con.prepareStatement(CommonDAOConstants.USER_REGISTER_SQL);
			pstmt.setString(1, userDTO.getUserid());
			pstmt.setString(2, userDTO.getPassword());
			recordEffected = pstmt.executeUpdate(); // Insert, Delete , Update
			if(recordEffected>0){
				isRecordAdded = true;
			}
		}
		finally{
			if(pstmt!=null){
				pstmt.close();
			}
			if(con!=null){
				con.close();
			}
		}
		return isRecordAdded;
	}
	
	public static boolean doLogin(UserDTO userDTO) throws ClassNotFoundException, SQLException{ 
		//CommonDAO commonDAO = new CommonDAO();
		CommonDAO commonDAO = CommonDAO.getObject();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		boolean isFound = false;
		try{
			con = commonDAO.getConnection();
			pstmt = con.prepareStatement(CommonDAOConstants.USER_LOGIN_SQL);
			pstmt.setString(1, userDTO.getUserid());
			pstmt.setString(2, userDTO.getPassword());
			rs = pstmt.executeQuery();
			if(rs.next()){
				isFound = true;
			}
		}
		finally{
			if(rs!=null){
				rs.close();
			}
			if(pstmt!=null){
				pstmt.close();
			}
			if(con!=null){
				con.close();
			}
		}
		return isFound;
	}

}
