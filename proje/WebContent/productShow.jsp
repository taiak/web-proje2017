<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Ürünler</title>
	<jsp:include page="_metadata.jsp"></jsp:include>
</head>
<body class="animsition">

	<!-- Header -->
    <jsp:include page="_header.jsp"></jsp:include>

    <main style="margin-top:75px;">
      <div class="container-full-width">
      
      <div class="container container-white" style="margin-top:20px">
    <div class="row">
      <div class="col-md-6">
        <img src="images/product/iphone7.png" alt="Apple Iphone 7" width="300" height="300" />
      </div>
      <div class="col-md-6">
        <h2>Apple Iphone 7</h2>
        Apple</br>
        <strong>Detaylar:</strong></br>
        <div class="product-detail" style="max-height: 300px;  overflow-y: auto;">
          <p>Ekranı var
          <br />Kulaklık girişi yok
          <br />İşlemcisi var
          <br />Ram i var
          <br />Grafik İşlem Birimi Var
          <br />Sesi çıkıyor
          <br />Parmak izi okuma var
          <br />Siri var
          <br />iOS güncelleştirmelerini alıyor
          <br />Çeşitli renkleri var
          <br />Basit kullanım
          <br />Kolay bozulmaz
          <br />Kapalı kaynak</p>
        </div>
          <h1>₺ 5000.0</h1></br>
        Stok Durumu: <strong>Mevcut</strong></br>
        Bu ürün 85 defa görüntülendi.
        <!-- Button -->
        <a href="productShow.jsp" class="flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4">
          Sepete Ekle
        </a>
      </div>
    </div>


    </main>


	<!-- Footer -->
    <jsp:include page="_footer.jsp"></jsp:include>
</body>
</html>
