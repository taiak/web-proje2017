 package com.main;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.proje.beans.Customer;
import com.proje.beans.Order;
import com.proje.dao.CustomerDao;
import com.proje.dao.OrderDao;

@WebServlet("/CustomerServlet")
public class CustomerServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public HttpServletRequest request;
    public HttpServletResponse response;
    
    public CustomerServlet(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
    }
    
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        HttpSession session = com.login.servlet.LoginServlet.session;
        
        if (session != null) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("user");
            dispatcher.forward(request, response);
            return;
        }
        String toDo = request.getParameter("toDo");
        if(toDo.equals("register")) {
            Customer customer = new Customer();
            customer.setEmail(String.valueOf(request.getParameter("email")));
            customer.setName(String.valueOf(request.getParameter("name")));
            customer.setSurname(String.valueOf(request.getParameter("surname")));
            customer.setHashedPassword(String.valueOf(request.getParameter("password_plain")));
            CustomerDao.add(customer);
            
            RequestDispatcher dispatcher = request.getRequestDispatcher("login");
            dispatcher.forward(request, response);
        }
    }


    public void index() throws ServletException, IOException {
        if (com.login.servlet.LoginServlet.session != null && !com.login.servlet.LoginServlet.session.getAttribute("user_id").equals("Nan")) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("login");
            dispatcher.forward(request, response);
        }else {
            RequestDispatcher dispatcher = request.getRequestDispatcher("newCustomer.jsp");
            dispatcher.forward(request, response);
        }
    }
    
}