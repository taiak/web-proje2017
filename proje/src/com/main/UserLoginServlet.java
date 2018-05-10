package com.main;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserLoginServlet")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public HttpServletRequest request;
    public HttpServletResponse response;
    
	public UserLoginServlet(HttpServletRequest request, HttpServletResponse response) {
	    this.request = request;
	    this.response = response;
    }

	public void index() throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("userLogin.jsp");
        dispatcher.forward(request, response);
	}
	
	public void logout() throws ServletException, IOException {
		if (com.login.servlet.LoginServlet.session != null ){
			com.login.servlet.LoginServlet.session.removeAttribute("user");
			com.login.servlet.LoginServlet.session.removeAttribute("user_id");
			com.login.servlet.LoginServlet.session.removeAttribute("orderCount");

			com.login.servlet.LoginServlet.session = null;
		}

        RequestDispatcher dispatcher = request.getRequestDispatcher("home");
        dispatcher.forward(request, response);
	}
}