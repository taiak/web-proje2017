package com.main.admin;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AdminHomeServlet")
public class AdminHomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public HttpServletRequest request;
    public HttpServletResponse response;
    
	public AdminHomeServlet(HttpServletRequest request, HttpServletResponse response) {
	    this.request = request;
	    this.response = response;
    }

	public void index() throws ServletException, IOException {
		if (com.proje.login.AdminLoginServlet.session != null && com.proje.login.AdminLoginServlet.session.getAttribute("admin") != null) {
	        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
	        dispatcher.forward(request, response);
		}else {
		    RequestDispatcher dispatcher = request.getRequestDispatcher("login");
		    dispatcher.forward(request, response);
		}
	}
}
