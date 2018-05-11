package com.proje.controller.admin;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proje.DAO.OrderDAO;
import com.proje.model.Order;

@WebServlet("/AdminOrderServlet")
public class AdminOrderController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public ArrayList <Order> orders;
	public HttpServletRequest request;
    public HttpServletResponse response;
    
	public AdminOrderController(HttpServletRequest request, HttpServletResponse response) {
	    this.request = request;
	    this.response = response;
    }

	public void index() throws ServletException, IOException {
		if (com.proje.controller.login.AdminLoginController.session != null &&
				com.proje.controller.login.AdminLoginController.session.getAttribute("admin") != null) {
			orders = OrderDAO.list();
			request.setAttribute("orders", orders);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("order.jsp");
	        dispatcher.forward(request, response);
		}else {
		    RequestDispatcher dispatcher = request.getRequestDispatcher("login");
		    dispatcher.forward(request, response);
		}
	}
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Order:doPost");
		response.setContentType("text/html");
		if (com.proje.controller.login.AdminLoginController.session != null &&
				(Boolean)com.proje.controller.login.AdminLoginController.session.getAttribute("admin") == true) {
			System.out.println("Order:sessionOK");
			String toDo = request.getParameter("toDo");
			if(toDo.equals("delete")) {
				Order order = new Order();
				order.setOrderNo((String.valueOf(request.getParameter("no"))));
				OrderDAO.delete(order);
				
			    RequestDispatcher dispatcher = request.getRequestDispatcher("order");
			    dispatcher.forward(request, response);
			}
		}else {
		    RequestDispatcher dispatcher = request.getRequestDispatcher("login");
		    dispatcher.forward(request, response);
		}
	}

}