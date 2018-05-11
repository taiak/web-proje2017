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

import com.proje.DAO.ProductDAO;
import com.proje.model.Order;
import com.proje.model.Product;


@WebServlet("/HomeServlet")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static HttpSession session = null;
	public ArrayList <Order> myOrders;
	public ArrayList <Product> products;
	public HttpServletRequest request;
    public HttpServletResponse response;
    
	public HomeController(HttpServletRequest request, HttpServletResponse response) {
	    this.request = request;
	    this.response = response;
	    if(session == null) {
	    	myOrders = new ArrayList<Order>();
		    session = request.getSession();
		    System.out.println("New Attribute");
			session.setAttribute("myOrders", myOrders);
	    }
	    System.out.println(session.getAttribute("myOrders"));
    }

	public void index() throws ServletException, IOException {
		products = ProductDAO.last(8);
		request.setAttribute("products", products);
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
	}
	
	public void about() throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("about.jsp");
        dispatcher.forward(request, response);
	}
	
	public void contact() throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("contact.jsp");
        dispatcher.forward(request, response);
	}
}