<%@ taglib prefix="z" tagdir="/WEB-INF/tags/admin" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<z:layout title="Müşteri Yönet">
	<form action="editCustomer" method="post">
                 <input name="toDo"             type="hidden" value="${toDo}"                         >
                 <input name="no"               type="hidden" value="${customer.no                  }">
		Adı:     <input name="name"             type="text"   value="${customer.name                }"></br>
		Soyadı:  <input name="surname"          type="text"   value="${customer.surname             }"></br>
		E-Mail:  <input name="email"            type="text"   value="${customer.email               }"></br>
		Parola:  <input name="password_plain"   type="password"                                       ></br>
		

		         <input name="send"    type="submit" class="btn btn-danger" value="Kaydet"  >
	</form>
</z:layout>