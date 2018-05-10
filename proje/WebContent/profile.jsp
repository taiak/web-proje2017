<%@ taglib prefix="z" tagdir="/WEB-INF/tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<z:layout title="Profil">
	<div class="container">
		<h1 class="display-1">${user.name}</h1>
		<h2>E-Posta: ${user.email}</h2>
		<h3>Üyelik Numarası: ${user.id}</h3>
	</div>
</z:layout>