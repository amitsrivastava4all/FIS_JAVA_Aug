package com.fis.banking.loans.dao;

import java.util.Date;

import com.fis.banking.loans.dto.LoginDTO;
import com.fis.banking.loans.dto.UserDetailDTO;

// DAO - Data Access object
public class LoginDAO {
	public UserDetailDTO isUserExist(LoginDTO loginDTO){
	//public boolean isUserExist(LoginDTO loginDTO){
	//public boolean isUserExist(String userid, String password){
		UserDetailDTO userDetailDTO = null;
		boolean isFound = false;
		System.out.println("Connection Open");
		if(loginDTO.getUserid().equals(loginDTO.getPassword())){
			userDetailDTO = new UserDetailDTO();
			userDetailDTO.setUserName("amit");
			userDetailDTO.setPhoto("amit.png");
			userDetailDTO.setLoginDateTime(new Date());
			//if(userid.equals(password)){
			//isFound = true;
		}
		
		System.out.println("Connection Close");
		//return isFound;
		return userDetailDTO;
	}

}
