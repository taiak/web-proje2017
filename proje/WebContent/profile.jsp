<%@ taglib prefix="z" tagdir="/WEB-INF/tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<z:layout title="Profil">
	<div class="container">
		<div class="row">
			<div class="col-9">
				<h1 class="display-1">${user.name}</h1>
			</div>
			<div class="col-3">
				<img src="https://www.iconspng.com/uploads/abstract-user-icon-3/abstract-user-icon-3.png" height="300px" width="300px"/>
				<h2>E-Posta: ${user.email}</h2>
				<h3>Üyelik Numarası: ${user.id}</h3>			
			</div>
		</div>
	</div>
</z:layout>