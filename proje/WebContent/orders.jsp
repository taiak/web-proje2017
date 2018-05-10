<%@ taglib prefix="z" tagdir="/WEB-INF/tags" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<z:layout title="Siparişler">
	<div class="container">
		<table class="table table-hover table-striped">
    		<thead>
				<tr>
					<th>Ürün Adı</th>
					<th>Ödeme Türü</th>
					<th>Sipariş Numarası</th>
				</tr>
		    </thead>
		    <tbody>
		    	<c:forEach var="order" items="${orders}">
			      <tr>
			        <td>${order.productName}</td>
			        <td>${order.paymentName}</td>
			        <td>${order.orderNo}</td>
			      </tr>
		      	</c:forEach>
		      
		    </tbody>
		  </table>
	</div>
</z:layout>
