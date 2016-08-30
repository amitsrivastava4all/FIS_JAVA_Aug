package com.fis.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
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
//@WebServlet
// Step - 1 Extend the HttpServlet
public class HelloServlet extends HttpServlet {
	
	private ServletConfig sc ;
	@Override
	public void init(ServletConfig sc) throws ServletException{
		super.init(sc);
		this.sc = sc;
		
	}
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
			String color = CookieCheck.isCookieFound(request);
			System.out.println("Cookie Color "+color);
			response.setContentType("text/html");
			out.println("<html>");
			UserDTO userDTOObject = userDAO.isUserExist(userDTO);
			if(userDTOObject!=null){
				// Creating a New Session Here (SessionId)
				HttpSession session = request.getSession(true);
				session.setAttribute("userid", userid);
				String branch = request.getParameter("branch");
				if(color==null){
					String colorName = request.getParameter("favcolor");
					Cookie cookie = new Cookie("myfavcolor",colorName);
					cookie.setMaxAge(365*24*60*60);
					response.addCookie(cookie);
					System.out.println(" colorName :: "+colorName);
					color=colorName;
					
				}
				
//				boolean isCookieFound = true;
//				// Creating Cookie
//				// Checking Cookie is Exist on User Machine
//				Cookie cookie[] = request.getCookies();  //Fetch Domain Specific Cookies
//				
//				if(cookie!=null && cookie.length>0){
//					for(Cookie c : cookie){
//						if(c.getName().equals("myfavcolor")){
//							isCookieFound = true;
//							break;
//						}
//					}
//				}
				
				System.out.println("*************** "+userDTOObject);
				String contextParam = sc.getServletContext().getInitParameter("drivername");
				out.println("<body bgcolor='"+color+"'>");
				out.println("Driver Name is "+sc.getInitParameter("drivername"));
				out.println("Context Driver "+contextParam);
				ServletContext context = sc.getServletContext();
				context.setAttribute("branch", branch);
				
				out.println("Welcome "+userDTOObject.getUserid()+"No of User Login "+SessionCountListener.getSessionCount());
				if(userDTOObject.getRoleDTO()!=null){
					session.setAttribute("role", userDTOObject.getRoleDTO().getRoleName());
					out.println("Role "+userDTOObject.getRoleDTO().getRoleName());
				if(userDTOObject.getRoleDTO().getRightList()!=null && 
						userDTOObject.getRoleDTO().getRightList().size()>0){
					for(RightDTO right : userDTOObject.getRoleDTO().getRightList()){
						System.out.println("Screen Name is "+right.getScreenName());
						String urlWithSession = response.encodeURL(right.getScreenName()+".fis?branch="+branch);
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
