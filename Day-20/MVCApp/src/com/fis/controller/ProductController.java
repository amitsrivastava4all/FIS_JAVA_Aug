package com.fis.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fis.dao.ProductDAO;
import com.fis.dto.ProductDTO;

/**
 * Servlet implementation class ProductController
 */
@WebServlet("/productctrl")
public class ProductController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String productType = request.getParameter("searchProduct");
		ProductDTO productDTO = new ProductDTO();
		productDTO.setType(productType);
		ProductDAO productDAO= new ProductDAO();
		try {
			ArrayList<ProductDTO> productList = productDAO.getProducts(productDTO);
			request.setAttribute("productlist", productList);
			RequestDispatcher rd = request.getRequestDispatcher("search.jsp");
			rd.forward(request, response);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			response.sendRedirect("error.jsp");
			e.printStackTrace();
			
		} catch (SQLException e) {
			response.sendRedirect("error.jsp");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
