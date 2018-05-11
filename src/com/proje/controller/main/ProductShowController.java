package com.proje.controller.main;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proje.DAO.ProductDAO;
import com.proje.model.Product;

@WebServlet("/ProductShowServlet")
public class ProductShowController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public HttpServletRequest request;
    public HttpServletResponse response;
    
	public ProductShowController(HttpServletRequest request, HttpServletResponse response) {
	    this.request = request;
	    this.response = response;
    }
	
	public void show() throws ServletException, IOException {
		String no = request.getParameter("id");
		if(no != null) {
			Product product = ProductDAO.find(no);
			request.setAttribute("product", product);
		}
        RequestDispatcher dispatcher = request.getRequestDispatcher("productShow.jsp");
        dispatcher.forward(request, response);
	}
}