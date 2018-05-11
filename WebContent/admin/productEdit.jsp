<%@ taglib prefix="z" tagdir="/WEB-INF/tags/admin" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<z:layout title="Ürün Yönet">
	<form action="editProduct" method="post">
                 <input name="toDo"    type="hidden" value="${toDo}"                        >
                 <input name="no"      type="hidden" value="${product.no                  }">
		Adı:     <input name="name"    type="text"   value="${product.name                }"></br>
		Fiyatı:  <input name="price"   type="text"   value="${product.price               }"></br>
		Stok:    <input name="stock"   type="text"   value="${product.stock               }"></br>
		Fotoğraf:<input name="photo"   type="text"   value="${product.photo               }"></br>
		Detay:   <input name="comment" type="text"   value="${product.comment             }"></br>
		         <input name="send"    type="submit" class="btn btn-danger" value="Kaydet"  >
	</form>
</z:layout>