package com.proje.controller.admin;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AdminHomeServlet")
public class AdminHomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public HttpServletRequest request;
    public HttpServletResponse response;
    
	public AdminHomeController(HttpServletRequest request, HttpServletResponse response) {
	    this.request = request;
	    this.response = response;
    }

	public void index() throws ServletException, IOException {
		if (com.proje.controller.login.AdminLoginController.session != null && com.proje.controller.login.AdminLoginController.session.getAttribute("admin") != null) {
	        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
	        dispatcher.forward(request, response);
		}else {
		    RequestDispatcher dispatcher = request.getRequestDispatcher("login");
		    dispatcher.forward(request, response);
		}
	}
}
