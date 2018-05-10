<%@ taglib prefix="z" tagdir="/WEB-INF/tags" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<z:layout title="Ürünler">

	<!-- New Products -->
	<section class="newproduct bgwhite p-t-45 p-b-105">
		<div class="container">
			<div class="sec-title p-b-60">
				<h3 class="m-text5 t-center">
					BATAN GEMİNİN MALLARI BUNLAR
					<p> TRUMP DA BURADAN ALIYOR!</p>
				</h3>
			</div>
			
			<div class="row">
			 	<c:forEach var="product" items="${products}">
			 		<div class="col-md-3">
						<div class="card">
						  <img class="card-img-top" src="https://vignette.wikia.nocookie.net/roblox-phantom-forces/images/7/7c/Noimage.png/revision/latest?cb=20171115203949" alt="Card image cap">
						  <div class="card-body">
						    <h5 class="card-title">${product.name}</h5>
						    <p class="card-text">${product.stock} adet</p>
						    <a href="product?id=<c:out value='${product.no}' />" class="btn btn-primary">İncele</a>
						  </div>
						</div>
					</div>
				</c:forEach>
			</div>
			
		</div>
	</section>

	<!-- Shipping -->
	<section class="shipping bgwhite p-t-62 p-b-46">
		<div class="flex-w p-l-15 p-r-15">
			<div class="flex-col-c w-size5 p-l-15 p-r-15 p-t-16 p-b-15 respon1">
				<h4 class="m-text12 t-center">
					Kargo Ücreti Yok!
				</h4>

				<a href="#" class="s-text11 t-center">
					Evet yok! Çünkü bir şey alacağınız zaman bizim dükkana gelip almanız gerekiyor.
				</a>
			</div>

			<div class="flex-col-c w-size5 p-l-15 p-r-15 p-t-16 p-b-15 bo2 respon2">
				<h4 class="m-text12 t-center">
					Ürün İadesini Dert Etmeyin!
				</h4>

				<span class="s-text11 t-center">
					Çünkü kesinlikle sattığımız ürünü geri almıyoruz.
				</span>
			</div>

			<div class="flex-col-c w-size5 p-l-15 p-r-15 p-t-16 p-b-15 respon1">
				<h4 class="m-text12 t-center">
					Hızlı Teslimat
				</h4>

				<span class="s-text11 t-center">
					Ürünü depodan getirip sizin elinize vermek taş çatlasın 5 dakika.
				</span>
			</div>
		</div>
	</section>
</z:layout>
