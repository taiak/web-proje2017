<%@ taglib prefix="z" tagdir="/WEB-INF/tags/admin" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<z:layout title="Ürün Yönet">
	<h1>Ürün Ekle / Düzenle</h1>
	<form action="editProduct" method="post">
	    <input name="toDo"    type="hidden" value="${toDo}"                        >
	    <input name="no"      type="hidden" value="${product.no.equals("NaN") ? "" : product.no                  }">
		<table class="table table-striped">
		    <tbody>
		      <tr>
		        <td>Adı</td>
		        <td><input name="name"    type="text"     value="${product.no.equals("NaN") ? "" : product.name                }"></td>
		      </tr>
		      <tr>
		        <td>Fiyatı</td>
		        <td><input name="price"   type="text"     value="${product.no.equals("NaN") ? "" : product.price               }"></td>
		      </tr>
		      <tr>
		        <td>Stok</td>
		        <td><input name="stock"   type="text"     value="${product.no.equals("NaN") ? "" : product.stock               }"></td>
		      </tr>
		      <tr>
		        <td>Fotoğraf</td>
		        <td><input name="photo"   type="text"     value="${product.no.equals("NaN") ? "" : product.photo               }"></td>
		      </tr>
		      <tr>
		        <td>Detay</td>
		        <td><textarea name="comment"              value="${product.no.equals("NaN") ? "" : product.comment             }"></textarea></td>
		      </tr>
		      <tr>
		      	<td colspan="2"><input name="send"    type="submit" class="btn btn-lg btn-block btn-danger" value="Kaydet"  ></td>
		      </tr>
		    </tbody>
		 </table>
  	</form>
</z:layout>