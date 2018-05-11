package com.proje.controller.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proje.controller.admin.AdminCustomerController;
import com.proje.controller.admin.AdminHomeController;
import com.proje.controller.admin.AdminOrderController;
import com.proje.controller.admin.AdminProductController;
import com.proje.controller.login.AdminLoginController;

@WebServlet("/JspRoutesController")
public class JspRoutesController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getServletPath();
        request.setCharacterEncoding("UTF-8");
        HomeController           home         = new HomeController         (request, response);
        UserLoginController      login        = new UserLoginController    (request, response);
        ProductsController       products     = new ProductsController     (request, response);
        OrdersController         order        = new OrdersController       (request, response);
        ProfileController        profile      = new ProfileController      (request, response);
        ProductShowController    product      = new ProductShowController  (request, response);
        AdminHomeController      admin        = new AdminHomeController    (request, response);
        AdminLoginController     adminLogin   = new AdminLoginController   (request, response);
        AdminProductController   adminProduct = new AdminProductController (request, response);
        AdminCustomerController  adminCustomer= new AdminCustomerController(request, response);
        AdminOrderController     adminOrder   = new AdminOrderController   (request, response);
        CustomerController       customer     = new CustomerController     (request, response);
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
		case "/orderPay":
			order.doPost(request, response);
			break;
		default:
			home.index();
        }
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
