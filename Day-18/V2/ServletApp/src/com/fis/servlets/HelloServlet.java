package com.fis.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fis.dao.UserDAO;
import com.fis.dto.RightDTO;
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
			response.setContentType("text/html");
			out.println("<html><body>");
			UserDTO userDTOObject = userDAO.isUserExist(userDTO);
			if(userDTOObject!=null){
				// Creating a New Session Here (SessionId)
				HttpSession session = request.getSession(true);
				session.setAttribute("userid", userid);
				
				System.out.println("*************** "+userDTOObject);
				
				out.println("Welcome "+userDTOObject.getUserid()+"No of User Login "+SessionCountListener.getSessionCount());
				if(userDTOObject.getRoleDTO()!=null){
					session.setAttribute("role", userDTOObject.getRoleDTO().getRoleName());
					out.println("Role "+userDTOObject.getRoleDTO().getRoleName());
				if(userDTOObject.getRoleDTO().getRightList()!=null && 
						userDTOObject.getRoleDTO().getRightList().size()>0){
					for(RightDTO right : userDTOObject.getRoleDTO().getRightList()){
						System.out.println("Screen Name is "+right.getScreenName());
						String urlWithSession = response.encodeURL(right.getScreenName()+".fis");
						System.out.println("After URL Encoce "+urlWithSession);
						out.println("<a href='"+urlWithSession+"'>"
						//out.println("<a href='"+right.getScreenName()+"'>"
						//+"?user="+userDTOObject.getUserid()
						//+"&role="+userDTOObject.getRoleDTO().getRoleName()+"'>"
						+right.getRightName()+"</a>");
					}
				}
				else
				{
					out.println("U Don't Have Any Rights");
				}
				}
				else
				{
					out.println("No Matching Role Found...");
				}
				
		//if(userDAO.isUserExist(userDTO)){
		//if(userid.equals(password)){
			//out.println("Welcome "+userid);
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
		out.println("</body></html>");
		out.close();
	}

}
