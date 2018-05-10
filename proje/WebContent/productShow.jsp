<%@ taglib prefix="z" tagdir="/WEB-INF/tags" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<z:layout title="Ürün">

    <main style="margin-top:75px;">
      <div class="container-full-width">
      
      <div class="container container-white" style="margin-top:20px">
      
      	
	<c:if test="${(product.name == null) || String.valueOf(product.name).equals(\"NaN\")}">
		<h1>Ürün Bulunamadı!</h1>
	</c:if>
      
      
    <c:if test="${product != null && !String.valueOf(product.name).equals(\"NaN\")}">
	    <div class="row">
	      <div class="col-md-6">
	        <img src="images/product/iphone7.png" alt="Apple Iphone 7" width="300" height="300" />
	      </div>
	      <div class="col-md-6">
		        <h2>${product.name}</h2>
		        Ürün Numarası: ${product.no}</br>
		        <strong>Detaylar:</strong></br>
		        <div class="product-detail" style="max-height: 300px;  overflow-y: auto;">
		          <p>Ürün açıklaması eklenebilir
		        </div>
		          <h1>₺ 0 (Fiyat eklensin)</h1></br>
		        Stok Durumu: <strong>${product.stock}</strong></br>
		        <!-- Button -->
		        
		        <form action="orderAdd" method="post">
		        	<input name="toDo" type="hidden" value="add">
			        <input name="product_no" type="hidden" value="${product.no}">
			        <input name="payment_no" type="hidden" value="${product.no}">
			        <input type="submit" class="btn btn-warning" name="login" value="Sepete Ekle">
			    </form>
		    </div>
	    </div>
	</c:if>

	</div>
	</div>
    </main>
</z:layout>