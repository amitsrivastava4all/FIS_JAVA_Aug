package com.fis.login.view;

import java.sql.SQLException;
import java.util.Scanner;

import com.fis.login.dao.UserDAO;
import com.fis.login.dto.UserDTO;

public class LoginApp {
	static Scanner scanner= new Scanner(System.in);
	
	public static  void doRegister(){
		System.out.println("Enter the Userid");
		String userid = scanner.next();
		System.out.println("Enter the Password");
		String password = scanner.next();
		UserDTO userDTO  = new UserDTO();
		userDTO.setUserid(userid);
		userDTO.setPassword(password);
		try {
			if(UserDAO.doRegister(userDTO)){
				System.out.println("Register Done..");
			}
			else
			{
				System.out.println("Register Not Done !");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static  void doLogin(){
		System.out.println("Enter the Userid");
		String userid = scanner.next();
		System.out.println("Enter the Password");
		String password = scanner.next();
		UserDTO userDTO  = new UserDTO();
		userDTO.setUserid(userid);
		userDTO.setPassword(password);
		try {
			if(UserDAO.doLogin(userDTO)){
				System.out.println("Welcome "+userid);
			}
			else
			{
				System.out.println("Invalid Userid or Password !");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		System.out.println("1. Login");
		System.out.println("2. Register");
		System.out.println("Enter the Choice...");
		int choice = scanner.nextInt();
		switch(choice){
		case 1:
			doLogin();
			break;
		case 2:
			doRegister();
			break;
		default:
			System.out.println("Wrong Choice...");
		}
	}
}
