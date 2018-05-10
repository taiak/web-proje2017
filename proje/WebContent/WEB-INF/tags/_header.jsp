<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page pageEncoding="UTF-8"%>
<header class="header1">
  <!-- Header desktop -->
  <div class="container-menu-header">
    <div class="topbar">

      <span class="topbar-child1">
          <a href="https://play.google.com/store/apps/details?id=com.nispeteng.kafeinmetre" target="_blank">Günlük Kafein Tüketim Miktarınızı Takip Etmek İçin Android Uygulamamızı İndirebilirsiniz: Kafeinmetre</a>
      </span>
    </div>

    <div class="wrap_header">
      <!-- Logo -->
      <a href="index.jsp" class="logo">
        <img src="images/icons/logo.png" alt="IMG-LOGO">
      </a>

      <!-- Menu -->
      <div class="wrap_menu">
        <nav class="menu">
          <ul class="main_menu">
            <li>
              <a href="home">Anasayfa</a>
            </li>

            <li>
              <a href="products">Ürünler</a>
            </li>

            <li>
              <a href="about.jsp">Hakkımızda</a>
            </li>

            <li>
              <a href="contact.jsp">İletişim</a>
            </li>
          </ul>
        </nav>
      </div>

      <!-- Header Icon -->
      <div class="header-icons">
		<c:if test="${sessionScope.user != null }">
        <a href="profile" class="header-wrapicon1 dis-block">
          <img src="images/icons/icon-header-01.png" class="header-icon1" alt="VAR">HOŞGELDİNİZ ${sessionScope.user.name}
        </a>
		</c:if>
		
		
		<c:if test="${sessionScope.user == null }">
        <a href="login" class="header-wrapicon1 dis-block">
          <img src="images/icons/icon-header-01.png" class="header-icon1" alt="YOK">GİRİŞ YAPILMADI.
        </a>
		</c:if>
		
        <span class="linedivide1"></span>
		
		<c:if test="${sessionScope.user != null}">
	        <div class="header-wrapicon2">
	        <a href="orders">
	          <img src="images/icons/icon-header-02.png" class="header-icon1 js-show-header-dropdown" alt="ICON">
	          <span class="header-icons-noti">
	          		${sessionScope.orderCount}
	          </span>
	         </a>
	        </div>
        </c:if>
      </div>
    </div>
  </div>
</header>