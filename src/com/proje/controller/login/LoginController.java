package com.proje.controller.login;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.proje.DAO.OrderDAO;
import com.proje.controller.main.HomeController;
import com.proje.model.Login;
import com.proje.model.Order;
import com.proje.model.User;
import com.proje.utilities.SafeLogin;

@WebServlet(asyncSupported = true, urlPatterns = { "/LoginServlet" })
public class LoginController extends HttpServlet {
	public static HttpSession session;
	public HttpServletRequest request;
    public HttpServletResponse response;
	private static final long serialVersionUID = 633170033630746350L;
	
	public LoginController() {
    }
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		final String success_page   = "home";
		final String unsuccess_page = "userLogin.jsp";
		String page = null;
		
		try {
			session = request.getSession();
	        synchronized(session) {
	        	Login l = new Login();
	        	User user = new User();
	        	l.setName((String)request.getParameter("userName"));
	        	l.setPassword((String)request.getParameter("password"));
	        	
	        	user = SafeLogin.userControl(l);
                if (user.getPass()) {
    	        	session.setAttribute("user", user);
    	        	session.setAttribute("user_id", user.getId());
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
}
