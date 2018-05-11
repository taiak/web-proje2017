<%@ taglib prefix="z" tagdir="/WEB-INF/tags/admin" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<z:layout title="Müşteri Yönet">
	<h1>Müşteri Bilgileri Düzenle</h1>
	<form action="editCustomer" method="post">
	    <input name="toDo"    type="hidden" value="${toDo}"                        >
	    <input name="no"      type="hidden" value="${customer.no.equals("NaN") ? "" : customer.no}">
		<table class="table table-striped">
		    <tbody>
		      <tr>
		        <td>Adı</td>
		        <td><input name="name" type="text" value="${customer.no.equals("NaN") ? "" : customer.name}"></td>
		      </tr>
		      <tr>
		        <td>Soyadı</td>
		        <td><input name="surname" type="text" value="${customer.no.equals("NaN") ? "" : customer.surname}"></td>
		      </tr>
		      <tr>
		        <td>Email</td>
		        <td><input name="email" type="text" value="${customer.no.equals("NaN") ? "" : customer.email}"></td>
		      </tr>
		      <tr>
		        <td>Parola</td>
		        <td><input name="password_plain" type="password"></td>
		      </tr>
		      <tr>
		      	<td colspan="2">
		      		<input name="send" type="submit" class="btn btn-lg btn-block btn-danger" value="Kaydet" >
		      		</td>
		      </tr>
		    </tbody>
		 </table>
  	</form>

</z:layout>