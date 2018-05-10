 package com.main;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.login.servlet.SafeLogin;
import com.proje.beans.Login;
import com.proje.beans.Order;
import com.proje.beans.User;
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
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		if (com.login.servlet.LoginServlet.session != null && com.login.servlet.LoginServlet.session.getAttribute("user") != null) {
			String toDo = request.getParameter("toDo");
			if(toDo.equals("add")) {
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
				LocalDate localDate = LocalDate.now();
				
				Order order = new Order();
				order.setCustomerNo(String.valueOf(com.login.servlet.LoginServlet.session.getAttribute("user_id")));
				order.setOrderDate(String.valueOf(dtf.format(localDate)));
				
				order.setProductNo(String.valueOf(request.getParameter("product_no")));
				order.setPaymentNo(String.valueOf("2")); // TODO: PaymentNo neyse ona göre düzenlenecek
				OrderDao.add(order);
				
			    RequestDispatcher dispatcher = request.getRequestDispatcher("orders");
			    dispatcher.forward(request, response);
	
			}else if(toDo.equals("delete")) {
				Order order = new Order();
				order.setOrderNo(String.valueOf(request.getParameter("order_no")));
				OrderDao.delete(order);
				
			    RequestDispatcher dispatcher = request.getRequestDispatcher("orders");
			    dispatcher.forward(request, response);
			}
		}else {
		    RequestDispatcher dispatcher = request.getRequestDispatcher("login");
		    dispatcher.forward(request, response);
		}
	}
}