package com.proje.controller.main;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proje.DAO.OrderDAO;
import com.proje.DAO.ProductDAO;
import com.proje.model.Order;
import com.proje.model.Product;
import com.proje.model.User;

@WebServlet("/ProfileServlet")
public class ProfileController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public HttpServletRequest request;
    public HttpServletResponse response;
    
	public ProfileController(HttpServletRequest request, HttpServletResponse response) {
	    this.request = request;
	    this.response = response;
    }

	public void index() throws ServletException, IOException {
		if (com.proje.controller.login.LoginController.session == null) {
	        RequestDispatcher dispatcher = request.getRequestDispatcher("login");
	        dispatcher.forward(request, response);
	        return;
		}
			
		User user = (User) com.proje.controller.login.LoginController.session.getAttribute("user");			
		ArrayList<Order> userOrders = OrderDAO.getOrderByUserId(Integer.parseInt(user.getId()));
	    ArrayList <Product> products = new ArrayList<Product>();
	        
		Order order;
		Product product;
	    float allCompletedOrdersPriceSum = 0;
	        
	    for (int i = 0; i < userOrders.size(); i++) {
			order = userOrders.get(i);
			product = ProductDAO.find(order.getProductNo());
			allCompletedOrdersPriceSum += Float.parseFloat(product.getPrice());
			products.add(product);
		}
	        
	    request.setAttribute("user", user);
	    request.setAttribute("userOrders", userOrders);
	    request.setAttribute("products", products);
	    request.setAttribute("allCompletedOrdersPriceSum", allCompletedOrdersPriceSum);
			
	    RequestDispatcher dispatcher = request.getRequestDispatcher("profile.jsp");
	    dispatcher.forward(request, response);
	}
}