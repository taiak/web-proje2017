package com.login.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.proje.beans.Login;
import com.proje.beans.*;
import com.proje.dao.*;

@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {

	private static final long serialVersionUID = 633170033630746350L;
	
	public AdminLoginServlet() {
	    super();
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		final String success_page   = "about.jsp";
		final String unsuccess_page = "about.jsp";
		String page = null;
		try {
	        HttpSession session = request.getSession();
	        synchronized(session) {
	        	Login l = new Login();

	        	l.setName((String)request.getParameter("userName"));
	        	l.setPassword((String)request.getParameter("password"));
	        	
                page = (SafeLogin.adminControl(l)) ? success_page: unsuccess_page;
                
                RequestDispatcher dispatcher = request.getRequestDispatcher(page);
                
                dispatcher.forward(request, response);
             }
        } catch (Exception e) {
        	System.out.println(e);
        }
	}
}

