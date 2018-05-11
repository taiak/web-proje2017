<%@ taglib prefix="z" tagdir="/WEB-INF/tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<z:layout title="Kullanıcı Girişi">

	<!-- Title Page -->
	<section class="bg-title-page p-t-40 p-b-50 flex-col-c-m" style="background-image: url(images/login.jpg);">
		<h2 class="l-text2 t-center">
			GİRİŞ YAP
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
          <form action="LoginServlet" method="post">
              <div class="bo4 of-hidden size15 m-b-20">
                <input type="text" name="userName" placeholder="Kullanıcı Adı " class="sizefull s-text7 p-l-22 p-r-22" /><br/>
              </div>
              <div class="bo4 of-hidden size15 m-b-20">
                <input type="password" name="password" placeholder="Parola" class="sizefull s-text7 p-l-22 p-r-22" /><br/>
              </div>
              <div class="w-size25">
                <input type="submit" name="login" value="Giriş Yap" class="flex-c-m size2 bg1 bo-rad-23 hov1 m-text3 trans-0-4"/>
              </div>
          </form>
				</div>
			</div>
		</div>
	</section>
</z:layout>