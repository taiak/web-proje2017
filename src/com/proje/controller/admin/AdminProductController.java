package com.proje.controller.admin;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proje.DAO.ProductDAO;
import com.proje.model.Product;

@WebServlet("/AdminProductServlet")
public class AdminProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public ArrayList <Product> products;
	public HttpServletRequest request;
    public HttpServletResponse response;
    
	public AdminProductController(HttpServletRequest request, HttpServletResponse response) {
	    this.request = request;
	    this.response = response;
    }

	public void index() throws ServletException, IOException {
		if (com.proje.controller.login.AdminLoginController.session != null && com.proje.controller.login.AdminLoginController.session.getAttribute("admin") != null) {
			products = ProductDAO.list();
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
		System.out.println("Product:doPost");
		response.setContentType("text/html");
		if (com.proje.controller.login.AdminLoginController.session != null && (Boolean)com.proje.controller.login.AdminLoginController.session.getAttribute("admin") == true) {
			System.out.println("Product:sessionOK");
			String toDo = request.getParameter("toDo");
			if(toDo.equals("delete")) {
				Product product = new Product();
				product.setNo(String.valueOf(request.getParameter("no")));
				ProductDAO.delete(product);
				
			    RequestDispatcher dispatcher = request.getRequestDispatcher("product");
			    dispatcher.forward(request, response);
			}else if(toDo.equals("new")) {
				System.out.println("Product:new");
				Product product = new Product();
				request.setAttribute("product", product);
				request.setAttribute("toDo", "create");
			    RequestDispatcher dispatcher = request.getRequestDispatcher("productEdit.jsp");
			    dispatcher.forward(request, response);
			}else if(toDo.equals("create")) {
				System.out.println("Product:create");
				Product product = new Product();
				product = getAttributes(request, product);
				ProductDAO.add(product);
			    RequestDispatcher dispatcher = request.getRequestDispatcher("product");
			    dispatcher.forward(request, response);
			}else if(toDo.equals("edit")) {
				System.out.println("Product:edit");
				Product product = ProductDAO.find(String.valueOf(request.getParameter("no")));
				request.setAttribute("product", product);
				request.setAttribute("toDo", "update");
			    RequestDispatcher dispatcher = request.getRequestDispatcher("productEdit.jsp");
			    dispatcher.forward(request, response);
			}else if(toDo.equals("update")) {
				System.out.println("Product:update");
				Product product = ProductDAO.find(String.valueOf(request.getParameter("no")));
				product = getAttributes(request, product);
				ProductDAO.update(product);
			    RequestDispatcher dispatcher = request.getRequestDispatcher("product");
			    dispatcher.forward(request, response);
			}
		}else {
		    RequestDispatcher dispatcher = request.getRequestDispatcher("login");
		    dispatcher.forward(request, response);
		}
	}

	public Product getAttributes(HttpServletRequest request, Product item) {
		item.setNo(request.getParameter("no"));
		item.setName(request.getParameter("name"));
		item.setPrice(request.getParameter("price"));
		item.setStock(request.getParameter("stock"));
		item.setPhoto(request.getParameter("photo"));
		item.setComment(request.getParameter("comment"));
		return item;
	}
	
}