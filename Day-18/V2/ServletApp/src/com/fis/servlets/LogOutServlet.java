package com.fis.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LogOutServlet
 */
public class LogOutServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
		HttpSession session = request.getSession(false);
//		if(session==null){
//			response.sendRedirect("login.html");
//		}
//		else
//		{
			session.removeAttribute("user");
			session.removeAttribute("role");
			session.invalidate();
			out.println("Logout SuccessFully ! ");
		//}
		out.close();
	}

}
