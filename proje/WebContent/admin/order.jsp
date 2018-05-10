<%@ taglib prefix="z" tagdir="/WEB-INF/tags/admin" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<z:layout title="Anasayfa">
	<h1>Sipariş Yönetim Paneli</h1>
	<table class="table table-hover table-striped">
   		<thead>
			<tr>
				<th>Sipariş No</th>
				<th>Siparişi Veren Müşteri Adı</th>
				<th>Ürün Adı</th>
				<th>Fiyatı</th>
				<th>Ödeme Türü</th>
				<th>Sipariş Tarihi</th>
				<th>İşlemler</th>
			</tr>
	    </thead>
	    <tbody>
 			<c:forEach var="order" items="${orders}">
				<tr>
				  	<td>${order.orderNo }</td>
				    <td>${order.customerName} ${order.customerSurname}</td>
					<td>${order.productName}</td>
					<td>${order.productPrice}</td>
					<td>${order.paymentName}</td>
					<td>${order.orderDate}</td>
				    <td>
			    		<form action="orderDelete" method="post">
				        	<input name="toDo" type="hidden" value="delete">
					        <input name="no" type="hidden" value="${order.orderNo}">
					        <input type="submit" class="btn btn-danger" value="Sil">
	    				</form>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</z:layout>