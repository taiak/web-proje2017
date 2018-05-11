package com.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.main.admin.AdminCustomerServlet;
import com.main.admin.AdminHomeServlet;
import com.main.admin.AdminOrderServlet;
import com.main.admin.AdminProductServlet;
import com.proje.login.AdminLoginServlet;

@WebServlet("/JspRoutes")
public class JspRoutes extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getServletPath();
        request.setCharacterEncoding("UTF-8");
        HomeServlet           home         = new HomeServlet         (request, response);
        UserLoginServlet      login        = new UserLoginServlet    (request, response);
        ProductsServlet       products     = new ProductsServlet     (request, response);
        OrdersServlet         order        = new OrdersServlet       (request, response);
        ProfileServlet        profile      = new ProfileServlet      (request, response);
        ProductShowServlet    product      = new ProductShowServlet  (request, response);
        AdminHomeServlet      admin        = new AdminHomeServlet    (request, response);
        AdminLoginServlet     adminLogin   = new AdminLoginServlet   (request, response);
        AdminProductServlet   adminProduct = new AdminProductServlet (request, response);
        AdminCustomerServlet  adminCustomer= new AdminCustomerServlet(request, response);
        AdminOrderServlet     adminOrder   = new AdminOrderServlet   (request, response);
        CustomerServlet       customer     = new CustomerServlet     (request, response);
		System.out.println(action);
        switch (action) {
		case "/home":
			home.index();
			break;
		case "/login":
			login.index();
			break;
		case "/logout":
			login.logout();
			break;
		case "/products":
			products.index();
			break;
		case "/orders":
			order.index();
			break;
		case "/orderAdd":
			order.doPost(request, response);
			break;
		case "/orderDelete":
			order.doPost(request, response);
			break;
		case "/profile":
			profile.index();
			break;
		case "/product":
			product.show();
			break;
		case "/about":
			home.about();
			break;
		case "/contact":
			home.contact();
			break;
		case "/admin/home":
			admin.index();
			break;
		case "/admin/login":
			adminLogin.doPost(request, response);
			break;
		case "/admin/logout":
			adminLogin.logout();
			break;
		case "/admin/product":
			adminProduct.index();
			break;
		case "/admin/editProduct":
			adminProduct.doPost(request, response);
			break;
		case "/admin/customer":
			adminCustomer.index();
			break;
		case "/admin/editCustomer":
			adminCustomer.doPost(request, response);
			break;
		case "/admin/order":
			adminOrder.index();
			break;
		case "/admin/orderDelete":
			adminOrder.doPost(request, response);
			break;
		case "/admin/AdminLoginServlet":
			adminLogin.doPost(request, response);
			break;
		case "/register":
			customer.index();
			break;
		case "/registerCustomer":
			customer.doPost(request, response);
			break;
		default:
			home.index();
        }
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
