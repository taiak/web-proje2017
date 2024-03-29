package com.proje.controller.login;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.proje.model.Login;
import com.proje.utilities.SafeLogin;

@WebServlet("/AdminLoginServlet")
public class AdminLoginController extends HttpServlet {
	public static HttpSession session;
	public HttpServletRequest request;
    public HttpServletResponse response;

	private static final long serialVersionUID = 633170033630746350L;
	
	public AdminLoginController(HttpServletRequest request, HttpServletResponse response) {
	    this.request = request;
	    this.response = response;
    }
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		final String success_page   = "home";
		final String unsuccess_page = "adminLogin.jsp";
		String page = null;
		try {
	        session = request.getSession();
	        synchronized(session) {
	        	Login l = new Login();

	        	l.setName((String)request.getParameter("userName"));
	        	l.setPassword((String)request.getParameter("password"));
	        	
	        	if (SafeLogin.adminControl(l)) {
    	        	session.setAttribute("admin", true);             	
                	page = success_page;
                }else {
                	page = unsuccess_page;
                }
                
                RequestDispatcher dispatcher = request.getRequestDispatcher(page);
                
                dispatcher.forward(request, response);
             }
        } catch (Exception e) {
        	System.out.println(e);
        }
	}

	public void logout() throws ServletException, IOException {
		if (session != null )
			com.proje.controller.login.LoginController.session.setAttribute("admin", false);

        RequestDispatcher dispatcher = request.getRequestDispatcher("login");
        dispatcher.forward(request, response);
	}
}

