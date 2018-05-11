package com.proje.controller.admin;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proje.DAO.CustomerDAO;
import com.proje.model.Customer;

@WebServlet("/AdminCustomerServlet")
public class AdminCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public ArrayList <Customer> customers;
	public HttpServletRequest request;
    public HttpServletResponse response;
    
	public AdminCustomerController(HttpServletRequest request, HttpServletResponse response) {
	    this.request = request;
	    this.response = response;
    }

	public void index() throws ServletException, IOException {
		if (com.proje.controller.login.AdminLoginController.session != null && com.proje.controller.login.AdminLoginController.session.getAttribute("admin") != null) {
			customers = CustomerDAO.list();
			request.setAttribute("customers", customers);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("customer.jsp");
	        dispatcher.forward(request, response);
		}else {
		    RequestDispatcher dispatcher = request.getRequestDispatcher("login");
		    dispatcher.forward(request, response);
		}
	}
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Customer:doPost");
		response.setContentType("text/html");
		if (com.proje.controller.login.AdminLoginController.session != null && (Boolean)com.proje.controller.login.AdminLoginController.session.getAttribute("admin") == true) {
			System.out.println("Customer:sessionOK");
			String toDo = request.getParameter("toDo");
			if(toDo.equals("delete")) {
				Customer customer = new Customer();
				System.out.println("DeleteCustomer: " + request.getParameter("no"));
				customer.setNo(String.valueOf(request.getParameter("no")));
				CustomerDAO.delete(customer);
				
			    RequestDispatcher dispatcher = request.getRequestDispatcher("customer");
			    dispatcher.forward(request, response);
			}else if(toDo.equals("new")) {
				System.out.println("Customer:new");
				Customer customer = new Customer();
				request.setAttribute("customer", customer);
				request.setAttribute("toDo", "create");
			    RequestDispatcher dispatcher = request.getRequestDispatcher("customerEdit.jsp");
			    dispatcher.forward(request, response);
			}else if(toDo.equals("create")) {
				System.out.println("Customer:create");
				Customer customer = new Customer();
				customer = getAttributes(request, customer);
				CustomerDAO.add(customer);
			    RequestDispatcher dispatcher = request.getRequestDispatcher("customer");
			    dispatcher.forward(request, response);
			}else if(toDo.equals("edit")) {
				System.out.println("Customer:edit");
				Customer customer = CustomerDAO.find(String.valueOf(request.getParameter("no")));
				request.setAttribute("customer", customer);
				request.setAttribute("toDo", "update");
			    RequestDispatcher dispatcher = request.getRequestDispatcher("customerEdit.jsp");
			    dispatcher.forward(request, response);
			}else if(toDo.equals("update")) {
				System.out.println("Customer:update");
				Customer customer = CustomerDAO.find(String.valueOf(request.getParameter("no")));
				customer = getAttributes(request, customer);
				CustomerDAO.update(customer);
			    RequestDispatcher dispatcher = request.getRequestDispatcher("customer");
			    dispatcher.forward(request, response);
			}
		}else {
		    RequestDispatcher dispatcher = request.getRequestDispatcher("login");
		    dispatcher.forward(request, response);
		}
	}

	public Customer getAttributes(HttpServletRequest request, Customer item) {
		item.setNo(request.getParameter("no"));
		item.setName(request.getParameter("name"));
		item.setSurname(request.getParameter("surname"));
		item.setEmail(request.getParameter("email"));
		item.setHashedPassword(request.getParameter("password_plain"));
		return item;
	}
	
}