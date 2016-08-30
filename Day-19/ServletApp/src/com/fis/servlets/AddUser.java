package com.fis.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AddUser
 */
public class AddUser extends HttpServlet {
	private ServletConfig sc ;
	@Override
	public void init(ServletConfig sc) throws ServletException{
		super.init(sc);
		this.sc = sc;
		
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String methodType = request.getMethod();
		// Prevent from Caching
		//response.setHeader("Cache-Control", "private, no-store, no-cache, must-revalidate");

		request.getRequestDispatcher("header.fis").include(request, response);
		
		// Checking the Session is already created...
		HttpSession session = request.getSession(false);
		
//		if(session==null){
//			response.sendRedirect("login.html");
//		}
//		else{
			String contextParam = sc.getServletContext().getInitParameter("drivername");
			response.setContentType("text/html");
			String driverName =sc.getInitParameter("drivername");
			String branch = request.getParameter("branch");
			out.println("<html><body><form action='logout.fis'>"
					+"<input type='hidden' value='"+branch+"' name='branch'>"
					+ "<button type='submit'>"
					+ "Logout</button></form> Branch is "+branch+" Driver Name "+driverName+" Context Param is "+contextParam+" </body></html>");
		session.setMaxInactiveInterval(5*60);
			String userid = (String)session.getAttribute("userid");
		String role= (String)session.getAttribute("role");
			//String userid =request.getParameter("user");
		//String role = request.getParameter("role");
		out.println("Welcome "+userid +" Role :: "+role);
		
		out.println("Add User ");
		request.setAttribute("coming", "Coming from Add User");
		RequestDispatcher rd = request.getRequestDispatcher("deleteuser.fis");
		rd.forward(request, response);
		//response.sendRedirect("deleteuser.fis");
		out.close();
		//}
	}

}
