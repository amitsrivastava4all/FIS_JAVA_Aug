package com.fis.banking.loans.views;

import java.util.Scanner;

import com.fis.banking.loans.dao.LoginDAO;
import com.fis.banking.loans.dto.LoginDTO;
import com.fis.banking.loans.dto.UserDetailDTO;

public class LoginView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Userid");
		String userid = scanner.next();
		System.out.println("Enter the Password");
		String password = scanner.next();
		LoginDAO loginDAO = new LoginDAO();
		LoginDTO loginDTO = new LoginDTO();
		loginDTO.setUserid(userid);
		loginDTO.setPassword(password);
		UserDetailDTO userDetailDTO = loginDAO.isUserExist(loginDTO);
		if(userDetailDTO!=null){
		//if(loginDAO.isUserExist(loginDTO))
		//if(loginDAO.isUserExist(userid,password))
		//{
			System.out.println("Welcome "+userid);
			System.out.println("UserName is "+userDetailDTO.getUserName());
			System.out.println("Photo "+userDetailDTO.getPhoto());
			System.out.println("Login Date "+userDetailDTO.getLoginDateTime());
		}
		else
		{
			System.out.println("Invalid Userid or Password");
		}
		scanner.close();

	}

}
