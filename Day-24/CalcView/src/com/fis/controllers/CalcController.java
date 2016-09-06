package com.fis.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fis.beans.CalcBeanRemote;

/**
 * Servlet implementation class CalcController
 */
@WebServlet("/calcCtrl")
public class CalcController extends HttpServlet {
	@EJB
	CalcBeanRemote remote;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int firstNumber = Integer.parseInt(request.getParameter("firstno"));
		int secondNumber = Integer.parseInt(request.getParameter("secondno"));
		int result = remote.add(firstNumber, secondNumber);
		PrintWriter out = response.getWriter();
		out.println("Sum is "+result);
		out.close();
	}

}
