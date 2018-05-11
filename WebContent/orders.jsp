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
					<th>İşlemler</th>
				</tr>
		    </thead>
		    <tbody>
		    	<c:forEach var="order" items="${orders}">
			      <tr>
			        <td>${order.productName}</td>
			        <td>${order.paymentName}</td>
			        <td>${order.orderNo}</td>
			        <td>
			        <form action="orderDelete" method="post">
			        	<input name="toDo" type="hidden" value="delete">
				        <input name="order_no" type="hidden" value="${order.orderNo}">
				        <input type="submit" class="btn btn-danger" name="login" value="Sil">
			    	</form>
			    	</td>
			      </tr>
		      	</c:forEach>
		      
		    </tbody>
		  </table>
	</div>
</z:layout>
