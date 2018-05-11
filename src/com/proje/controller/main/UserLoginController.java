package com.proje.controller.main;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserLoginServlet")
public class UserLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public HttpServletRequest request;
    public HttpServletResponse response;
    
	public UserLoginController(HttpServletRequest request, HttpServletResponse response) {
	    this.request = request;
	    this.response = response;
    }

	public void index() throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("userLogin.jsp");
        dispatcher.forward(request, response);
	}
	
	public void logout() throws ServletException, IOException {
		if (com.proje.controller.login.LoginController.session != null ) {
			com.proje.controller.login.LoginController.session.removeAttribute("user");
			com.proje.controller.login.LoginController.session.removeAttribute("user_id");
		}

        RequestDispatcher dispatcher = request.getRequestDispatcher("home");
        dispatcher.forward(request, response);
	}
}