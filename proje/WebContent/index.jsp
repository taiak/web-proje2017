<%@ taglib prefix="z" tagdir="/WEB-INF/tags" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<z:layout title="Anasayfa">

	<!-- Slide1 -->
	<section class="slide1">
		<div class="wrap-slick1">
			<div class="slick1">
				<div class="item-slick1 item1-slick1" style="background-image: url(images/master-slide-01.jpg);">
					<div class="wrap-content-slide1 sizefull flex-col-c-m p-l-15 p-r-15 p-t-150 p-b-170">
						<span class="caption1-slide1 m-text1 t-center animated visible-false m-b-15" data-appear="fadeInDown">
							Hiç Bir İşinize Yaramayacak Para İsrafı Ürünler 
						</span>

						<h2 class="caption2-slide1 xl-text1 t-center animated visible-false m-b-37" data-appear="fadeInUp">
							AT KAFALARI
						</h2>

						<div class="wrap-btn-slide1 w-size1 animated visible-false" data-appear="zoomIn">
							<!-- Button -->
							<a href="productShow.jsp" class="flex-c-m size2 bo-rad-23 s-text2 bgwhite hov1 trans-0-4">
								Paranı İsraf Et
							</a>
						</div>
					</div>
				</div>

				<div class="item-slick1 item2-slick1" style="background-image: url(images/master-slide-02.jpg);">
					<div class="wrap-content-slide1 sizefull flex-col-c-m p-l-15 p-r-15 p-t-150 p-b-170">
						<span class="caption1-slide1 m-text1 t-center animated visible-false m-b-15" data-appear="rollIn">
							Başka Yerde Yok! (Olabilir de ...) FBI Bundan Nefret Ediyor!
						</span>

						<h2 class="caption2-slide1 xl-text1 t-center animated visible-false m-b-37" data-appear="lightSpeedIn">
							KAMERA KAPATMA ŞEYSİ!
						</h2>

						<div class="wrap-btn-slide1 w-size1 animated visible-false" data-appear="slideInUp">
							<!-- Button -->
							<a href="productShow.jsp" class="flex-c-m size2 bo-rad-23 s-text2 bgwhite hov1 trans-0-4">
								O Da Neymiş :O
							</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>



	<div class="row">
	 	<c:forEach var="product" items="${products}">
	 		<div class="col-md-3">
				<div class="card">
				  <img class="card-img-top" src="https://vignette.wikia.nocookie.net/roblox-phantom-forces/images/7/7c/Noimage.png/revision/latest?cb=20171115203949" alt="Card image cap">
				  <div class="card-body">
				    <h5 class="card-title">${product.name}</h5>
				    <p class="card-text">${product.stock} adet</p>
				    <a href="productShow.jsp?id=<c:out value='${product.no}' />" class="btn btn-primary">İncele</a>
				  </div>
				</div>
			</div>
		</c:forEach>
	</div>


</z:layout>
