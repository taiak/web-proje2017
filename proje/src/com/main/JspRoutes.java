package com.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.login.servlet.LoginServlet;

@WebServlet("/JspRoutes")
public class JspRoutes extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getServletPath();
        request.setCharacterEncoding("UTF-8");
        HomeServlet           home     = new HomeServlet        (request, response);
        UserLoginServlet      login    = new UserLoginServlet   (request, response);
        ProductsServlet       products = new ProductsServlet    (request, response);
        OrdersServlet         order    = new OrdersServlet      (request, response);
        ProfileServlet        profile  = new ProfileServlet     (request, response);
        ProductShowServlet    product  = new ProductShowServlet (request, response);
        
        switch (action) {
		case "/home":
			home.index();
			break;
		case "/login":
			login.index();
			break;
		case "/products":
			products.index();
			break;
		case "/orders":
			order.index();
			break;
		case "/profile":
			profile.index();
			break;
		case "/product":
			product.show();
			break;
		default:
			home.index();
        }
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
