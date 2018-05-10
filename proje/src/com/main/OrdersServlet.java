package com.main;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proje.beans.Order;
import com.proje.dao.OrderDao;

/**
 * Servlet implementation class OrdersServlet
 */
@WebServlet("/OrdersServlet")
public class OrdersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public HttpServletRequest request;
    public HttpServletResponse response;
    
	public OrdersServlet(HttpServletRequest request, HttpServletResponse response) {
	    this.request = request;
	    this.response = response;
    }

	public void index() throws ServletException, IOException {
		if (com.login.servlet.LoginServlet.session != null) {
			ArrayList <Order> orders = OrderDao.getOrderByUserId(Integer.parseInt(String.valueOf(com.login.servlet.LoginServlet.session.getAttribute("user_id"))));
			request.setAttribute("orders", orders);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("orders.jsp");
	        dispatcher.forward(request, response);
		}else {
	        RequestDispatcher dispatcher = request.getRequestDispatcher("login");
	        dispatcher.forward(request, response);
		}
	}
}