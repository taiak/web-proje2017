<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Anasayfa</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->
	<link rel="icon" type="image/png" href="images/icons/favicon.png"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/themify/themify-icons.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/elegant-font/html-css/style.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/slick/slick.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/lightbox2/css/lightbox.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="css/util.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">
<!--===============================================================================================-->
</head>
<body class="animsition">

	<!-- Header -->
    <jsp:include page="_header.jsp"></jsp:include>

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
							<a href="product.jsp" class="flex-c-m size2 bo-rad-23 s-text2 bgwhite hov1 trans-0-4">
								Paranı İsraf Et
							</a>
						</div>
					</div>
				</div>

				<div class="item-slick1 item2-slick1" style="background-image: url(images/master-slide-02.jpg);">
					<div class="wrap-content-slide1 sizefull flex-col-c-m p-l-15 p-r-15 p-t-150 p-b-170">
						<span class="caption1-slide1 m-text1 t-center animated visible-false m-b-15" data-appear="rollIn">
							Başka Yerde Yok!
						</span>

						<h2 class="caption2-slide1 xl-text1 t-center animated visible-false m-b-37" data-appear="lightSpeedIn">
							Elektriksiz Çalışan Bilgisayar
						</h2>

						<div class="wrap-btn-slide1 w-size1 animated visible-false" data-appear="slideInUp">
							<!-- Button -->
							<a href="product.jsp" class="flex-c-m size2 bo-rad-23 s-text2 bgwhite hov1 trans-0-4">
								O Da Neymiş :O
							</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>

	<!-- New Product -->
	<section class="newproduct bgwhite p-t-45 p-b-105">
		<div class="container">
			<div class="sec-title p-b-60">
				<h3 class="m-text5 t-center">
					Fırsat Ürünleri
				</h3>
			</div>

						<!-- Product -->
						<div class="row">
								<div class="col-sm-12 col-md-6 col-lg-4 p-b-50">
									<!-- Block2 -->
									<div class="block2">
										<div class="block2-img wrap-pic-w of-hidden pos-relative block2-labelnew">
											<img src="images/item-01.jpg" alt="IMG-PRODUCT">
		
											<div class="block2-overlay trans-0-4">
												<a href="#" class="block2-btn-addwishlist hov-pointer trans-0-4">
													<i class="icon-wishlist icon_heart_alt" aria-hidden="true"></i>
													<i class="icon-wishlist icon_heart dis-none" aria-hidden="true"></i>
												</a>
		
												<div class="block2-btn-addcart w-size1 trans-0-4">
													<!-- Button -->
													<button class="flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4">
														Add to Cart
													</button>
												</div>
											</div>
										</div>
		
										<div class="block2-txt p-t-20">
											<a href="product-detail.jsp" class="block2-name dis-block s-text3 p-b-5">
												Dışı Seni İçi Beni Yakan Ateş
											</a>
		
											<span class="block2-price m-text6 p-r-5">
												$75.00
											</span>
										</div>
									</div>
								</div>
		
								<div class="col-sm-12 col-md-6 col-lg-4 p-b-50">
									<!-- Block2 -->
									<div class="block2">
										<div class="block2-img wrap-pic-w of-hidden pos-relative">
											<img src="images/item-01.jpg" alt="IMG-PRODUCT">
		
											<div class="block2-overlay trans-0-4">
												<a href="#" class="block2-btn-addwishlist hov-pointer trans-0-4">
													<i class="icon-wishlist icon_heart_alt" aria-hidden="true"></i>
													<i class="icon-wishlist icon_heart dis-none" aria-hidden="true"></i>
												</a>
		
												<div class="block2-btn-addcart w-size1 trans-0-4">
													<!-- Button -->
													<button class="flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4">
														Add to Cart
													</button>
												</div>
											</div>
										</div>
		
										<div class="block2-txt p-t-20">
											<a href="product-detail.jsp" class="block2-name dis-block s-text3 p-b-5">
												Yürüyen Uçak Maketi
											</a>
		
											<span class="block2-price m-text6 p-r-5">
												$92.50
											</span>
										</div>
									</div>
								</div>
		
								<div class="col-sm-12 col-md-6 col-lg-4 p-b-50">
									<!-- Block2 -->
									<div class="block2">
										<div class="block2-img wrap-pic-w of-hidden pos-relative">
											<img src="images/item-01.jpg" alt="IMG-PRODUCT">
		
											<div class="block2-overlay trans-0-4">
												<a href="#" class="block2-btn-addwishlist hov-pointer trans-0-4">
													<i class="icon-wishlist icon_heart_alt" aria-hidden="true"></i>
													<i class="icon-wishlist icon_heart dis-none" aria-hidden="true"></i>
												</a>
		
												<div class="block2-btn-addcart w-size1 trans-0-4">
													<!-- Button -->
													<button class="flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4">
														Add to Cart
													</button>
												</div>
											</div>
										</div>
		
										<div class="block2-txt p-t-20">
											<a href="product-detail.jsp" class="block2-name dis-block s-text3 p-b-5">
												OMÜ Öğrenci Profili
											</a>
		
											<span class="block2-price m-text6 p-r-5">
												$165.90
											</span>
										</div>
									</div>
								</div>
		
								<div class="col-sm-12 col-md-6 col-lg-4 p-b-50">
									<!-- Block2 -->
									<div class="block2">
										<div class="block2-img wrap-pic-w of-hidden pos-relative block2-labelsale">
											<img src="images/item-01.jpg" alt="IMG-PRODUCT">
		
											<div class="block2-overlay trans-0-4">
												<a href="#" class="block2-btn-addwishlist hov-pointer trans-0-4">
													<i class="icon-wishlist icon_heart_alt" aria-hidden="true"></i>
													<i class="icon-wishlist icon_heart dis-none" aria-hidden="true"></i>
												</a>
		
												<div class="block2-btn-addcart w-size1 trans-0-4">
													<!-- Button -->
													<button class="flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4">
														Add to Cart
													</button>
												</div>
											</div>
										</div>
		
										<div class="block2-txt p-t-20">
											<a href="product-detail.jsp" class="block2-name dis-block s-text3 p-b-5">
												ÖYAK Başkanı
											</a>
		
											<span class="block2-oldprice m-text7 p-r-5">
												$29.50
											</span>
		
											<span class="block2-newprice m-text8 p-r-5">
												$15.90
											</span>
										</div>
									</div>
								</div>
		
								<div class="col-sm-12 col-md-6 col-lg-4 p-b-50">
									<!-- Block2 -->
									<div class="block2">
										<div class="block2-img wrap-pic-w of-hidden pos-relative block2-labelnew">
											<img src="images/item-01.jpg" alt="IMG-PRODUCT">
		
											<div class="block2-overlay trans-0-4">
												<a href="#" class="block2-btn-addwishlist hov-pointer trans-0-4">
													<i class="icon-wishlist icon_heart_alt" aria-hidden="true"></i>
													<i class="icon-wishlist icon_heart dis-none" aria-hidden="true"></i>
												</a>
		
												<div class="block2-btn-addcart w-size1 trans-0-4">
													<!-- Button -->
													<button class="flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4">
														Add to Cart
													</button>
												</div>
											</div>
										</div>
		
										<div class="block2-txt p-t-20">
											<a href="product-detail.jsp" class="block2-name dis-block s-text3 p-b-5">
												Her Şeye Gülen Adam
											</a>
		
											<span class="block2-price m-text6 p-r-5">
												$75.00
											</span>
										</div>
									</div>
								</div>
		
								<div class="col-sm-12 col-md-6 col-lg-4 p-b-50">
									<!-- Block2 -->
									<div class="block2">
										<div class="block2-img wrap-pic-w of-hidden pos-relative">
											<img src="images/item-01.jpg" alt="IMG-PRODUCT">
		
											<div class="block2-overlay trans-0-4">
												<a href="#" class="block2-btn-addwishlist hov-pointer trans-0-4">
													<i class="icon-wishlist icon_heart_alt" aria-hidden="true"></i>
													<i class="icon-wishlist icon_heart dis-none" aria-hidden="true"></i>
												</a>
		
												<div class="block2-btn-addcart w-size1 trans-0-4">
													<!-- Button -->
													<button class="flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4">
														Add to Cart
													</button>
												</div>
											</div>
										</div>
		
										<div class="block2-txt p-t-20">
											<a href="product-detail.jsp" class="block2-name dis-block s-text3 p-b-5">
												Minecraft Köpeği
											</a>
		
											<span class="block2-price m-text6 p-r-5">
												$92.50
											</span>
										</div>
									</div>
								</div>
		
								<div class="col-sm-12 col-md-6 col-lg-4 p-b-50">
									<!-- Block2 -->
									<div class="block2">
										<div class="block2-img wrap-pic-w of-hidden pos-relative block2-labelnew">
											<img src="images/item-01.jpg" alt="IMG-PRODUCT">
		
											<div class="block2-overlay trans-0-4">
												<a href="#" class="block2-btn-addwishlist hov-pointer trans-0-4">
													<i class="icon-wishlist icon_heart_alt" aria-hidden="true"></i>
													<i class="icon-wishlist icon_heart dis-none" aria-hidden="true"></i>
												</a>
		
												<div class="block2-btn-addcart w-size1 trans-0-4">
													<!-- Button -->
													<button class="flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4">
														Add to Cart
													</button>
												</div>
											</div>
										</div>
		
										<div class="block2-txt p-t-20">
											<a href="product-detail.jsp" class="block2-name dis-block s-text3 p-b-5">
												Çorum Uranyumu
											</a>
		
											<span class="block2-price m-text6 p-r-5">
												$75.00
											</span>
										</div>
									</div>
								</div>
		
								<div class="col-sm-12 col-md-6 col-lg-4 p-b-50">
									<!-- Block2 -->
									<div class="block2">
										<div class="block2-img wrap-pic-w of-hidden pos-relative">
											<img src="images/item-01.jpg" alt="IMG-PRODUCT">
		
											<div class="block2-overlay trans-0-4">
												<a href="#" class="block2-btn-addwishlist hov-pointer trans-0-4">
													<i class="icon-wishlist icon_heart_alt" aria-hidden="true"></i>
													<i class="icon-wishlist icon_heart dis-none" aria-hidden="true"></i>
												</a>
		
												<div class="block2-btn-addcart w-size1 trans-0-4">
													<!-- Button -->
													<button class="flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4">
														Add to Cart
													</button>
												</div>
											</div>
										</div>
		
										<div class="block2-txt p-t-20">
											<a href="product-detail.jsp" class="block2-name dis-block s-text3 p-b-5">
												Tipik Malatyalı
											</a>
		
											<span class="block2-price m-text6 p-r-5">
												$92.50
											</span>
										</div>
									</div>
								</div>
		
								<div class="col-sm-12 col-md-6 col-lg-4 p-b-50">
									<!-- Block2 -->
									<div class="block2">
										<div class="block2-img wrap-pic-w of-hidden pos-relative">
											<img src="images/item-01.jpg" alt="IMG-PRODUCT">
		
											<div class="block2-overlay trans-0-4">
												<a href="#" class="block2-btn-addwishlist hov-pointer trans-0-4">
													<i class="icon-wishlist icon_heart_alt" aria-hidden="true"></i>
													<i class="icon-wishlist icon_heart dis-none" aria-hidden="true"></i>
												</a>
		
												<div class="block2-btn-addcart w-size1 trans-0-4">
													<!-- Button -->
													<button class="flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4">
														Add to Cart
													</button>
												</div>
											</div>
										</div>
		
										<div class="block2-txt p-t-20">
											<a href="product-detail.jsp" class="block2-name dis-block s-text3 p-b-5">
												Tuvalet ( Derslerde Örnek Olarak Verilebilir )
											</a>
		
											<span class="block2-price m-text6 p-r-5">
												$165.90
											</span>
										</div>
									</div>
								</div>
		
								<div class="col-sm-12 col-md-6 col-lg-4 p-b-50">
									<!-- Block2 -->
									<div class="block2">
										<div class="block2-img wrap-pic-w of-hidden pos-relative block2-labelsale">
											<img src="images/item-01.jpg" alt="IMG-PRODUCT">
		
											<div class="block2-overlay trans-0-4">
												<a href="#" class="block2-btn-addwishlist hov-pointer trans-0-4">
													<i class="icon-wishlist icon_heart_alt" aria-hidden="true"></i>
													<i class="icon-wishlist icon_heart dis-none" aria-hidden="true"></i>
												</a>
		
												<div class="block2-btn-addcart w-size1 trans-0-4">
													<!-- Button -->
													<button class="flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4">
														Add to Cart
													</button>
												</div>
											</div>
										</div>
		
										<div class="block2-txt p-t-20">
											<a href="product-detail.jsp" class="block2-name dis-block s-text3 p-b-5">
												Türkçe - Orkça Sözlük 
											</a>
		
											<span class="block2-oldprice m-text7 p-r-5">
												$29.50
											</span>
		
											<span class="block2-newprice m-text8 p-r-5">
												$15.90
											</span>
										</div>
									</div>
								</div>
		
								<div class="col-sm-12 col-md-6 col-lg-4 p-b-50">
									<!-- Block2 -->
									<div class="block2">
										<div class="block2-img wrap-pic-w of-hidden pos-relative block2-labelnew">
											<img src="images/item-01.jpg" alt="IMG-PRODUCT">
		
											<div class="block2-overlay trans-0-4">
												<a href="#" class="block2-btn-addwishlist hov-pointer trans-0-4">
													<i class="icon-wishlist icon_heart_alt" aria-hidden="true"></i>
													<i class="icon-wishlist icon_heart dis-none" aria-hidden="true"></i>
												</a>
		
												<div class="block2-btn-addcart w-size1 trans-0-4">
													<!-- Button -->
													<button class="flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4">
														Add to Cart
													</button>
												</div>
											</div>
										</div>
		
										<div class="block2-txt p-t-20">
											<a href="product-detail.jsp" class="block2-name dis-block s-text3 p-b-5">
												Delmeyen Delgeç
											</a>
		
											<span class="block2-price m-text6 p-r-5">
												$75.00
											</span>
										</div>
									</div>
								</div>
		
								<div class="col-sm-12 col-md-6 col-lg-4 p-b-50">
									<!-- Block2 -->
									<div class="block2">
										<div class="block2-img wrap-pic-w of-hidden pos-relative">
											<img src="images/item-01.jpg" alt="IMG-PRODUCT">
		
											<div class="block2-overlay trans-0-4">
												<a href="#" class="block2-btn-addwishlist hov-pointer trans-0-4">
													<i class="icon-wishlist icon_heart_alt" aria-hidden="true"></i>
													<i class="icon-wishlist icon_heart dis-none" aria-hidden="true"></i>
												</a>
		
												<div class="block2-btn-addcart w-size1 trans-0-4">
													<!-- Button -->
													<button class="flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4">
														Add to Cart
													</button>
												</div>
											</div>
										</div>
		
										<div class="block2-txt p-t-20">
											<a href="product-detail.jsp" class="block2-name dis-block s-text3 p-b-5">
												En Baba Anakart
											</a>
		
											<span class="block2-price m-text6 p-r-5">
												$92.50
											</span>
										</div>
									</div>
								</div>
							</div>
		</div>
	</section>


	<!-- Shipping -->
	<section class="shipping bgwhite p-t-62 p-b-46">
		<div class="flex-w p-l-15 p-r-15">
			<div class="flex-col-c w-size5 p-l-15 p-r-15 p-t-16 p-b-15 respon1">
				<h4 class="m-text12 t-center">
					Kargo Ücreti Yok!
				</h4>

				<a href="#" class="s-text11 t-center">
					Evet yok! Çünkü bir şey alacağınız zaman bizim dükkana gelip almanız gerekiyor.
				</a>
			</div>

			<div class="flex-col-c w-size5 p-l-15 p-r-15 p-t-16 p-b-15 bo2 respon2">
				<h4 class="m-text12 t-center">
					Ürün İadesini Dert Etmeyin!
				</h4>

				<span class="s-text11 t-center">
					Çünkü kesinlikle sattığımız ürünü geri almıyoruz.
				</span>
			</div>

			<div class="flex-col-c w-size5 p-l-15 p-r-15 p-t-16 p-b-15 respon1">
				<h4 class="m-text12 t-center">
					Hızlı Teslimat
				</h4>

				<span class="s-text11 t-center">
					Ürünü depodan getirip sizin elinize vermek taş çatlasın 5 dakika.
				</span>
			</div>
		</div>
	</section>


	<!-- Footer -->
    <jsp:include page="_footer.jsp"></jsp:include>




	<!-- Back to top -->
	<div class="btn-back-to-top bg0-hov" id="myBtn">
		<span class="symbol-btn-back-to-top">
			<i class="fa fa-angle-double-up" aria-hidden="true"></i>
		</span>
	</div>

	<!-- Container Selection1 -->
	<div id="dropDownSelect1"></div>



<!--===============================================================================================-->
	<script type="text/javascript" src="vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script type="text/javascript" src="vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
	<script type="text/javascript" src="vendor/bootstrap/js/popper.js"></script>
	<script type="text/javascript" src="vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script type="text/javascript" src="vendor/select2/select2.min.js"></script>
	<script type="text/javascript">
		$(".selection-1").select2({
			minimumResultsForSearch: 20,
			dropdownParent: $('#dropDownSelect1')
		});
	</script>
<!--===============================================================================================-->
	<script type="text/javascript" src="vendor/slick/slick.min.js"></script>
	<script type="text/javascript" src="js/slick-custom.js"></script>
<!--===============================================================================================-->
	<script type="text/javascript" src="vendor/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
	<script type="text/javascript" src="vendor/lightbox2/js/lightbox.min.js"></script>
<!--===============================================================================================-->
	<script type="text/javascript" src="vendor/sweetalert/sweetalert.min.js"></script>
	<script type="text/javascript">
		$('.block2-btn-addcart').each(function(){
			var nameProduct = $(this).parent().parent().parent().find('.block2-name').jsp();
			$(this).on('click', function(){
				swal(nameProduct, "is added to cart !", "success");
			});
		});

		$('.block2-btn-addwishlist').each(function(){
			var nameProduct = $(this).parent().parent().parent().find('.block2-name').jsp();
			$(this).on('click', function(){
				swal(nameProduct, "is added to wishlist !", "success");
			});
		});
	</script>

<!--===============================================================================================-->
	<script src="js/main.js"></script>

</body>
</html>
