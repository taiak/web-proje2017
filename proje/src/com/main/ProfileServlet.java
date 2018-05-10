package com.main;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proje.beans.Order;
import com.proje.beans.User;
import com.proje.dao.OrderDao;

@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public HttpServletRequest request;
    public HttpServletResponse response;
    
	public ProfileServlet(HttpServletRequest request, HttpServletResponse response) {
	    this.request = request;
	    this.response = response;
    }

	public void index() throws ServletException, IOException {
		if (com.login.servlet.LoginServlet.session != null) {
			User user = (User) com.login.servlet.LoginServlet.session.getAttribute("user");
			request.setAttribute("user", user);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("profile.jsp");
	        dispatcher.forward(request, response);
		}else {
	        RequestDispatcher dispatcher = request.getRequestDispatcher("login");
	        dispatcher.forward(request, response);
		}
	}
}