package com.proje.controller.main;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.proje.DAO.CustomerDAO;
import com.proje.DAO.ProductDAO;
import com.proje.model.Customer;
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
	
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String productNo = request.getParameter("searchNo");
        Product product = ProductDAO.find(productNo);
        String return_str = "<img src=\"" + product.getPhoto() + "\"> " + product.getName() + " - " + product.getPrice() + " TL";
        response.getWriter().write(return_str);
    }
}