<%@ taglib prefix="z" tagdir="/WEB-INF/tags/admin" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<z:layout title="Anasayfa">
	<h1>Ürün Yönetim Paneli</h1>
	<form action="editProduct" method="post">
    	<input name="toDo" type="hidden" value="new">
     <input type="submit" class="btn btn-lg btn-block btn-success" value="Yeni Ürün Ekle">
	</form>
	<table class="table table-hover table-striped">
   		<thead>
			<tr>
				<th>Ürün No</th>
				<th>Ürün Adı</th>
				<th>Ürün Fiyatı</th>
				<th>Stok</th>
				<th>İşlemler</th>
			</tr>
	    </thead>
	    <tbody>
 			<c:forEach var="product" items="${products}">
				<tr>
				  	<td>${product.no }</td>
				    <td>${product.name}</td>
				    <td>${product.price}</td>
				    <td>${product.stock}</td>
				    <td>
			    		<a href="../product?id=${product.no}" class="btn btn-primary">İncele</a>
			    		<form action="editProduct" method="post">
				        	<input name="toDo" type="hidden" value="edit">
					        <input name="no" type="hidden" value="${product.no}">
					        <input type="submit" class="btn btn-warning" value="Düzenle">
	    				</form>
			    		<form action="editProduct" method="post">
				        	<input name="toDo" type="hidden" value="delete">
					        <input name="no" type="hidden" value="${product.no}">
					        <input type="submit" class="btn btn-danger" value="Sil">
	    				</form>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</z:layout>