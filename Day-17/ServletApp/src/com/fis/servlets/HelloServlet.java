package com.fis.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fis.dao.UserDAO;
import com.fis.dto.UserDTO;

/**
 * Servlet implementation class HelloServlet
 */
// Step - 1 Extend the HttpServlet
public class HelloServlet extends HttpServlet {
	
	// Step -2 Override the doGet method
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		// Take Login Page Data
		String userid = request.getParameter("userid");
		String password = request.getParameter("password");
		UserDAO userDAO  = new UserDAO();
		UserDTO userDTO = new UserDTO();
		userDTO.setUserid(userid);
		userDTO.setPassword(password);
		try{
		if(userDAO.isUserExist(userDTO)){
		//if(userid.equals(password)){
			out.println("Welcome "+userid);
		}
		else
		{
			out.println("Invalid Userid or Password...");
		}
		}
		catch(SQLException e){
			response.sendRedirect("error.html");
			e.printStackTrace();
		}
		catch(ClassNotFoundException e){
			response.sendRedirect("error.html");
			e.printStackTrace();
		}
		catch(Exception e){
			response.sendRedirect("error.html");
			e.printStackTrace();
		}
		//Date date = new Date();
		
		//out.println("<h1>Hello User ! "+date+"</h1>");
		out.close();
	}

}
