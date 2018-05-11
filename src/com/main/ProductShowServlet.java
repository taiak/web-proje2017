package com.main;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proje.controller.ProductController;
import com.proje.model.Product;

@WebServlet("/ProductShowServlet")
public class ProductShowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public HttpServletRequest request;
    public HttpServletResponse response;
    
	public ProductShowServlet(HttpServletRequest request, HttpServletResponse response) {
	    this.request = request;
	    this.response = response;
    }
	
	public void show() throws ServletException, IOException {
		String no = request.getParameter("id");
		if(no != null) {
			Product product = ProductController.find(no);
			request.setAttribute("product", product);
		}
        RequestDispatcher dispatcher = request.getRequestDispatcher("productShow.jsp");
        dispatcher.forward(request, response);
	}
}