<%@ taglib prefix="z" tagdir="/WEB-INF/tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<z:layout title="Kayıt Ol">

	<!-- Title Page -->
	<section class="bg-title-page p-t-40 p-b-50 flex-col-c-m" style="background-image: url(images/login.jpg);">
		<h2 class="l-text2 t-center">
			KAYIT OL
		</h2>
	</section>

	<!-- content page -->
	<section class="bgwhite p-t-66 p-b-38">
		<div class="container">
			<div class="row">
				<div class="col-md-4 p-b-30">
					<div class="hov-img-zoom">
						<img src="images/login-user-icon.png" alt="Giriş Yap">
					</div>
				</div>

				<div class="col-md-8 p-b-30">
          <form action="registerCustomer" method="post">
          		<input type="hidden" name="toDo" value="register">
              <div class="bo4 of-hidden size15 m-b-20">
                <input type="text" name="email" placeholder="E-Posta Adresi " class="sizefull s-text7 p-l-22 p-r-22" /><br/>
              </div>
              <div class="bo4 of-hidden size15 m-b-20">
                <input type="text" name="name" placeholder="İsim " class="sizefull s-text7 p-l-22 p-r-22" /><br/>
              </div>
              <div class="bo4 of-hidden size15 m-b-20">
                <input type="text" name="surname" placeholder="Soyisim " class="sizefull s-text7 p-l-22 p-r-22" /><br/>
              </div>
              <div class="bo4 of-hidden size15 m-b-20">
                <input type="password" name="password_plain" placeholder="Parola" class="sizefull s-text7 p-l-22 p-r-22" /><br/>
              </div>
              <div class="w-size25">
                <input type="submit" name="logon" value="Kayıt Ol" class="flex-c-m size2 bg1 bo-rad-23 hov1 m-text3 trans-0-4"/>
              </div>
          </form>
				</div>
			</div>
		</div>
	</section>
</z:layout>