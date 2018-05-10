package com.main.admin;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proje.beans.Product;
import com.proje.dao.ProductDao;

/**
 * Servlet implementation class AdminProductServlet
 */
@WebServlet("/AdminProductServlet")
public class AdminProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public ArrayList <Product> products;
	public HttpServletRequest request;
    public HttpServletResponse response;
    
	public AdminProductServlet(HttpServletRequest request, HttpServletResponse response) {
	    this.request = request;
	    this.response = response;
    }

	public void index() throws ServletException, IOException {
		if (com.login.servlet.AdminLoginServlet.session != null && com.login.servlet.AdminLoginServlet.session.getAttribute("admin") != null) {
			products = ProductDao.list();
			request.setAttribute("products", products);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("product.jsp");
	        dispatcher.forward(request, response);
		}else {
		    RequestDispatcher dispatcher = request.getRequestDispatcher("login");
		    dispatcher.forward(request, response);
		}
	}
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		if (com.login.servlet.AdminLoginServlet.session != null && (Boolean)com.login.servlet.AdminLoginServlet.session.getAttribute("admin") == true) {
			String toDo = request.getParameter("toDo");
			if(toDo.equals("delete")) {
				Product product = new Product();
				product.setNo(String.valueOf(request.getParameter("product_no")));
				ProductDao.delete(product);
				
			    RequestDispatcher dispatcher = request.getRequestDispatcher("home");
			    dispatcher.forward(request, response);
			}else if(toDo.equals("edit")) {
				Product product = ProductDao.find(String.valueOf(request.getParameter("product_no")));
				request.setAttribute("product", product);
			    RequestDispatcher dispatcher = request.getRequestDispatcher("productEdit.jsp");
			    dispatcher.forward(request, response);
			}else if(toDo.equals("update")) {
				Product product = ProductDao.find(String.valueOf(request.getParameter("product_no")));
				
				
				ProductDao.update(product);
			    RequestDispatcher dispatcher = request.getRequestDispatcher("home");
			    dispatcher.forward(request, response);
			}
		}else {
			com.login.servlet.AdminLoginServlet.session = null;
		    RequestDispatcher dispatcher = request.getRequestDispatcher("login");
		    dispatcher.forward(request, response);
		}
	}
	
}