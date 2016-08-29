package com.fis.dao;

import static com.fis.dao.constants.DAOConstants.LOGIN_SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.fis.dto.RightDTO;
import com.fis.dto.RoleDTO;
import com.fis.dto.UserDTO;

public class UserDAO {
	
	public UserDTO isUserExist(UserDTO userDTO) throws ClassNotFoundException, SQLException{
		UserDTO userObject = null;
		RoleDTO roleDTO = null;
		ArrayList<RightDTO> rightList = new ArrayList<>();
		CommonDAO commonDAO = CommonDAO.getObject();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		boolean isFound = false;
		 
		try{
		con = commonDAO.getConnection();
		pstmt = con.prepareStatement(LOGIN_SQL);
		pstmt.setString(1, userDTO.getUserid());
		pstmt.setString(2, userDTO.getPassword());
		rs = pstmt.executeQuery();
		while(rs.next()){
			if(roleDTO==null){
				roleDTO = new RoleDTO();
				roleDTO.setRoleId(rs.getInt("roleid"));
				roleDTO.setRoleName(rs.getString("rolename"));
				
			}
			
			if(userObject==null){
				userObject = new UserDTO();
				userObject.setUserid(rs.getString("userid"));
			}
			
			
			//userObject.setRoleDTO(roleDTO);
			RightDTO rightDTO = new RightDTO();
			rightDTO.setRightId(rs.getInt("rightid"));
			rightDTO.setRightName(rs.getString("rightname"));
			rightDTO.setScreenName(rs.getString("screenname"));
			rightList.add(rightDTO);
			
		}
		System.out.println("Role DTO "+roleDTO);
		System.out.println("RightList "+rightList);
		if(userObject!=null){
			if(roleDTO!=null){
				userObject.setRoleDTO(roleDTO);
			}
		}
		if(rightList.size()>0){
			roleDTO.setRightList(rightList);
		}
//		if(rs.next()){
//			isFound = true;
//		}
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
		return userObject;
		}

}
