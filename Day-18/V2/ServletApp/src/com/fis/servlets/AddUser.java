package com.fis.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AddUser
 */
public class AddUser extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		// Prevent from Caching
		//response.setHeader("Cache-Control", "private, no-store, no-cache, must-revalidate");

		request.getRequestDispatcher("header.fis").include(request, response);
		
		// Checking the Session is already created...
		HttpSession session = request.getSession(false);
		
//		if(session==null){
//			response.sendRedirect("login.html");
//		}
//		else{
			response.setContentType("text/html");
			out.println("<html><body><form action='logout.fis'><button type='submit'>"
					+ "Logout</button></form></body></html>");
		session.setMaxInactiveInterval(5*60);
			String userid = (String)session.getAttribute("userid");
		String role= (String)session.getAttribute("role");
			//String userid =request.getParameter("user");
		//String role = request.getParameter("role");
		out.println("Welcome "+userid +" Role :: "+role);
		out.println("Add User ");
		out.close();
		//}
	}

}
