<%@ taglib prefix="z" tagdir="/WEB-INF/tags" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<z:layout title="Profil">
	<div class="container">
		<div class="row">
			<div class="col-9">
				<h1 class="display-1">${user.name} ${user.surname}</h1>
				<h2>Tamamlanan Siparişlerim</h2>
				<table class="table table-hover table-striped">
		    		<thead>
						<tr>
							<th>Ürün Fotoğrafı</th>
							<th>Ürün Adı</th>
							<th>Fiyat</th>
						</tr>
				    </thead>
				    <tbody>
						<c:forEach var="order" items="${userOrders}" varStatus="loop">
					      <tr>
					      	<td>
					      		<a href="product?id=${order.productNo}">
					      			<img src="${products.get(loop.index).photo}" width="100" height="100">
					      		</a>
					      	</td>
					        <td><strong>${products.get(loop.index).name}</strong></td>
					        <td><strong>${products.get(loop.index).price} TL</strong></td>
					      </tr>
				      	</c:forEach>
				    </tbody>
				 </table>
				<div class="row">
			      	<div class="col-9"><h1>Tüm Harcamalar Toplamı:</h1></div>
			      	<div class="col-3"><h1><strong>${allCompletedOrdersPriceSum} TL</strong></h1></div>
		      	</div>
			</div>
			<div class="col-3">
				<img src="images/avatar.png" height="300px" width="300px"/>
				<h2>E-Posta: ${user.email}</h2>
				<h3>Üyelik Numarası: ${user.id}</h3>			
			</div>
		</div>
	</div>
</z:layout>