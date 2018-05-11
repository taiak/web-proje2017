package com.proje.controller.main;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proje.DAO.ProductDAO;
import com.proje.model.Product;

@WebServlet("/ProductsServlet")
public class ProductsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public HttpServletRequest request;
    public HttpServletResponse response;
    
	public ProductsController(HttpServletRequest request, HttpServletResponse response) {
	    this.request = request;
	    this.response = response;
    }

	public void index() throws ServletException, IOException {
		ArrayList <Product> products = ProductDAO.list();
		request.setAttribute("products", products);
        RequestDispatcher dispatcher = request.getRequestDispatcher("products.jsp");
        dispatcher.forward(request, response);
	}
}