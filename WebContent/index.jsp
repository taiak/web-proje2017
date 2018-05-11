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
							<a href="product?id=20" class="flex-c-m size2 bo-rad-23 s-text2 bgwhite hov1 trans-0-4">
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
							<a href="product?id=21" class="flex-c-m size2 bo-rad-23 s-text2 bgwhite hov1 trans-0-4">
								O Da Neymiş :O
							</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>




	<div class="container">
		<div class="row">
		 	<c:forEach var="product" items="${products}">
		 		<div class="col-md-3">
					<div class="card">
					  <img class="card-img-top" src="${product.photo}" alt="${product.name}" width="250" height="300">
					  <div class="card-body">
					    <h5 class="card-title">${product.name}</h5>
					    <p class="card-text">${product.price} TL</p>
					    <center>
				    		<a href="product?id=<c:out value='${product.no}' />" class="btn btn-danger">İncele</a>
				    		<form action="orderAdd" method="post">
					        	<input name="toDo" type="hidden" value="add">
						        <input name="product_no" type="hidden" value="<c:out value='${product.no}' />">
						        <input name="payment_no" type="hidden" value="2">
						        <input type="submit" name="login" class="btn btn-warning" value="Sepete Ekle">
		    				</form>
					    </center>
					  </div>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>


<script type="text/javascript">
function ajaxMetodu() {
    var xmlhttp;
    if (window.XMLHttpRequest) {    // IE7+, Firefox, Chrome, Opera, Safari
        xmlhttp = new XMLHttpRequest();
     } else {    // IE6, IE5
         xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
     }
     xmlhttp.onreadystatechange = function() {
         if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
             document.getElementById("searchNo").innerHTML = xmlhttp.responseText;
         }
     }
     var no = $('#searchNo').val();
     $.ajax({
         url:'findProduct',
         data:{searchNo: no},
         type:'get',
         success: function(data){
             $("#findProduct").html(data);
         }
     });
 }
</script>

	<div class="jumbotron">
	<center>
		<h2>Ürün Numarasıyla Ara</h2>
		<p id="findProduct"></p>
		<input id="searchNo" name="searchNo" type="text">
		<input type="submit"  value="Ürün Ara" onClick="ajaxMetodu()">
	</center>
	</div>

</z:layout>
