package com.fis.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.fis.dto.UserDTO;

public class UserDAO {
	
	public boolean isUserExist(UserDTO userDTO) throws ClassNotFoundException, SQLException{
		CommonDAO commonDAO = CommonDAO.getObject();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		boolean isFound = false;
		String sql = "select userid , password from user_mst where userid=? and password=?";
		try{
		con = commonDAO.getConnection();
		pstmt = con.prepareStatement(sql);
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
