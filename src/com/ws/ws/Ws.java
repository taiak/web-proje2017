package com.ws.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.proje.DAO.OrderDAO;
import com.proje.DAO.ProductDAO;

@WebService(targetNamespace = "http://ws.ws.com/", portName = "WsPort", serviceName = "WsService")
public class Ws {
	@WebMethod(operationName = "count", action = "urn:Count")
	@WebResult(name = "return")
	public static int count(@WebParam(name = "arg0") int n) {
		return OrderDAO.count(n);
	}
		
	@WebMethod(operationName = "productCount", action = "urn:ProductCount")
	@WebResult(name = "return")
	public static int productCount() {
		return ProductDAO.list().size();
	}
	
	@WebMethod(operationName = "productName", action = "urn:ProductName")
	@WebResult(name = "return")
	public static String productName(@WebParam(name = "arg0") int n) {
		return ProductDAO.list().get(n).getName();
	}
}
