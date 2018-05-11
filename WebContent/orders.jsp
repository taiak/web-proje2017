<%@ taglib prefix="z" tagdir="/WEB-INF/tags" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<z:layout title="Ürün Sepeti">
	<div class="container">
	<h1>Ürün Sepeti</h1>
	
		<table class="table table-hover table-striped">
    		<thead>
				<tr>
					<th>Ürün Fotoğrafı</th>
					<th>Ürün Adı</th>
					<th>Fiyat</th>
					<th>İşlemler</th>
				</tr>
		    </thead>
		    <tbody>
		    	<c:forEach var="order" items="${myOrders}" varStatus="loop">
			      <tr>
			      	<td>
			      		<a href="product?id=${order.productNo}">
			      			<img src="${products.get(loop.index).photo}" width="100" height="100">
			      		</a>
			      	</td>
			        <td><strong>${products.get(loop.index).name}</strong></td>
			        <td><strong>${products.get(loop.index).price} TL</strong></td>
			        <td>
			        <form action="orderDelete" method="post">
			        	<input name="toDo" type="hidden" value="delete">
			        	<input name="order_index" type="hidden" value="${loop.index}">
				        <input name="order_no" type="hidden" value="${order.orderNo}">
				        <input type="submit" class="btn btn-danger" name="login" value="Sil">
			    	</form>
			    	</td>
			      </tr>
		      	</c:forEach>
		    </tbody>
		  </table>
		  
		      
	      <div class="row">
	      	<div class="col-9"><h1>Sepet Toplamı:</h1></div>
	      	<div class="col-3"><h1><strong>${productPriceSum} TL</strong></h1></div>
	      </div>
	      <p>-</p>
	      <div class="row">
	      	<div class="col-12 float-right">
	      		Ödeme Türü: 
		      	<select name="payment_no" form="orderPayForm">
				  <option value="1">Kapıda Ödeme</option>
				  <option value="2">Banka Kartı ile 3D Ödeme</option>
				  <option value="3">Kredi Kartı ile Ödeme</option>
				  <option value="4">Puanlar ile Ödeme</option>
				</select>
				<p>-</p>
	      		<form id ="orderPayForm" action="orderPay" method="post">
		        	<input name="toDo" type="hidden" value="orderPay">
			        <input name="order_no" type="hidden" value="${order.orderNo}">
			        <input type="submit" class="btn btn-lg btn-block btn-success" name="login" value="Sipariş Oluştur">
		    	</form>
	      	</div>
	      </div>
	</div>
</z:layout>
