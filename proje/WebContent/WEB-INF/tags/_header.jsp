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
              <a href="products.jsp">Ürünler</a>
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
      <jsp:useBean id="user" class="com.proje.beans.User" ></jsp:useBean>
        <a href="userLogin.jsp" class="header-wrapicon1 dis-block">
          <img src="images/icons/icon-header-01.png" class="header-icon1" alt="ICON">
        </a>

        <span class="linedivide1"></span>

        <div class="header-wrapicon2">
          <img src="images/icons/icon-header-02.png" class="header-icon1 js-show-header-dropdown" alt="ICON">
          <span class="header-icons-noti">0</span>

          <!-- Header cart noti -->
          <div class="header-cart header-dropdown">
            <ul class="header-cart-wrapitem">
              <li class="header-cart-item">
                <div class="header-cart-item-img">
                  <img src="images/item-cart-01.jpg" alt="IMG">
                </div>

                <div class="header-cart-item-txt">
                  <a href="#" class="header-cart-item-name">
                    White Shirt With Pleat Detail Back
                  </a>

                  <span class="header-cart-item-info">
                    1 x $19.00
                  </span>
                </div>
              </li>

              <li class="header-cart-item">
                <div class="header-cart-item-img">
                  <img src="images/item-cart-02.jpg" alt="IMG">
                </div>

                <div class="header-cart-item-txt">
                  <a href="#" class="header-cart-item-name">
                    Converse All Star Hi Black Canvas
                  </a>

                  <span class="header-cart-item-info">
                    1 x $39.00
                  </span>
                </div>
              </li>

              <li class="header-cart-item">
                <div class="header-cart-item-img">
                  <img src="images/item-cart-03.jpg" alt="IMG">
                </div>

                <div class="header-cart-item-txt">
                  <a href="#" class="header-cart-item-name">
                    Nixon Porter Leather Watch In Tan
                  </a>

                  <span class="header-cart-item-info">
                    1 x $17.00
                  </span>
                </div>
              </li>
            </ul>

            <div class="header-cart-total">
              Total: $75.00
            </div>

            <div class="header-cart-buttons">
              <div class="header-cart-wrapbtn">
                <!-- Button -->
                <a href="cart.jsp" class="flex-c-m size1 bg1 bo-rad-20 hov1 s-text1 trans-0-4">
                  View Cart
                </a>
              </div>

              <div class="header-cart-wrapbtn">
                <!-- Button -->
                <a href="#" class="flex-c-m size1 bg1 bo-rad-20 hov1 s-text1 trans-0-4">
                  Check Out
                </a>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</header>