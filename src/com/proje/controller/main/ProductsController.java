package com.proje.controller.main;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.proje.DAO.CustomerDAO;
import com.proje.DAO.ProductDAO;
import com.proje.model.Customer;
import com.proje.model.Product;

@WebServlet("/ProductsServlet")
public class ProductsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public HttpServletRequest request;
    public HttpServletResponse response;
    
	public ProductsController(HttpServletRequest request, HttpServletResponse response) {
	    this.request = request;
	    this.response = response;
    }

	public void index() throws ServletException, IOException {
		ArrayList <Product> products = ProductDAO.list();
		request.setAttribute("products", products);
        RequestDispatcher dispatcher = request.getRequestDispatcher("products.jsp");
        dispatcher.forward(request, response);
	}
	
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String productNo = request.getParameter("searchNo");
        Product product = ProductDAO.find(productNo);
        String unformatted = "<div class=\"col-md-3\"> <div class=\"card\"> <img class=\"card-img-top\" src=\"%s\" alt=\"%s\" width=\"250\" height=\"300\"> <div class=\"card-body bg-light\"> <h5 class=\"card-title\">%s</h5> <center> <p class=\"card-text\"><strong><font color=\"red\">%s TL</font></strong></p> <a href=\"product?id=%s\" class=\"btn btn-primary\">Urunu Incele</a> <form action=\"orderAdd\" method=\"post\"> <input name=\"toDo\" type=\"hidden\" value=\"add\"> <input name=\"product_no\" type=\"hidden\" value=\"%s\"><input type=\"submit\" name=\"login\" class=\"btn btn-warning\" value=\"Sepete Ekle\"> </form> </center> </div> </div> </div>";
        String formatted = String.format(unformatted, product.getPhoto(), product.getName(), product.getName(), product.getPrice(), product.getNo(), product.getNo() );
        response.getWriter().write(formatted);
    }
}