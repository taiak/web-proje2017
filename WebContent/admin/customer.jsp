<%@ taglib prefix="z" tagdir="/WEB-INF/tags/admin" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<z:layout title="Anasayfa">
	<h1>Müşteri Yönetim Paneli</h1>
	<table class="table table-hover table-striped">
   		<thead>
			<tr>
				<th>Müşteri No</th>
				<th>Adı</th>
				<th>Soyadı</th>
				<th>E-Posta</th>
				<th>İşlemler</th>
			</tr>
	    </thead>
	    <tbody>
 			<c:forEach var="customer" items="${customers}">
				<tr>
				  	<td>${customer.no }</td>
				    <td>${customer.name}</td>
				    <td>${customer.surname}</td>
				    <td>${customer.email}</td>
				    <td>
			    		<form action="editCustomer" method="post">
				        	<input name="toDo" type="hidden" value="edit">
					        <input name="no" type="hidden" value="${customer.no}">
					        <input type="submit" class="btn btn-warning" value="Düzenle">
	    				</form>
			    		<form action="editCustomer" method="post">
				        	<input name="toDo" type="hidden" value="delete">
					        <input name="no" type="hidden" value="${customer.no}">
					        <input type="submit" class="btn btn-danger" value="Sil">
	    				</form>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</z:layout>