package com.proje.controller.main;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proje.model.User;

@WebServlet("/ProfileServlet")
public class ProfileController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public HttpServletRequest request;
    public HttpServletResponse response;
    
	public ProfileController(HttpServletRequest request, HttpServletResponse response) {
	    this.request = request;
	    this.response = response;
    }

	public void index() throws ServletException, IOException {
		if (com.proje.controller.login.LoginController.session != null) {
			User user = (User) com.proje.controller.login.LoginController.session.getAttribute("user");
			request.setAttribute("user", user);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("profile.jsp");
	        dispatcher.forward(request, response);
		}else {
	        RequestDispatcher dispatcher = request.getRequestDispatcher("login");
	        dispatcher.forward(request, response);
		}
	}
}