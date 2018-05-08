<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Hakkımızda</title>
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
	<link rel="stylesheet" type="text/css" href="vendor/slick/slick.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="css/util.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">
<!--===============================================================================================-->
</head>
<body class="animsition">

	<!-- Header -->
  <jsp:include page="_header.jsp"></jsp:include>

	<!-- Title Page -->
	<section class="bg-title-page p-t-40 p-b-50 flex-col-c-m" style="background-image: url(images/about-us-banner.jpg);">
		<h2 class="l-text2 t-center">
			Hakkımızda
		</h2>
	</section>

	<!-- content page -->
	<section class="bgwhite p-t-66 p-b-38">
		<div class="container">
			<div class="row">
				<div class="col-md-4 p-b-30">
					<div class="hov-img-zoom">
						<img src="images/nispet-big.png" alt="Nispet">
					</div>
				</div>

				<div class="col-md-8 p-b-30">
					<h3 class="m-text26 p-t-15 p-b-16">
						Nispet'in Hikayesi
					</h3>

					<p class="p-b-28">
						Nispet kelimesi temel olarak iki farklı anlama sahiptir.
						Bu anlamlardan ilki "bu şuna nispeten daha güzel" cümlesinde kullanıldığı anlamıyla iki varlığın birbirine kıyası,
						birbiriyle özellik bakımından karşılaştırılması anlamını içerir.
						Bir diğer anlamı ise "bu işi şuna nispet olsun diye yapmış" cümlesinde kullanılan anlamıyla bir işi bir kişiye
						karşı olarak, gıcıklık olsun diye veya sırf onun hoşuna gitmemesi için yapma anlamını içerir.
						Bizim grubumuzun adı olan "Nispet" kelimesi de bu iki anlamı da ihtiva edecek şekilde konulmuştur.
						Daha detaylı hikayesi de var aslında, ancak o şimdilik bizde kalsın.
					</p>

					<div class="bo13 p-l-29 m-l-9 p-b-10">
						<p class="p-b-11">
							Bir projeyi gerçeklerken adım adım ilerle. Bir anda her şeyin tam olmasına gerek yok. Önce çalışır hale getir, daha sonra iyileştir.
						</p>

						<span class="s-text7">
							- Serhat Celil İLERİ
						</span>
					</div>

					<p>&nbsp;</p>

					<div class="bo13 p-l-29 m-l-9 p-b-10">
						<p class="p-b-11">
							Bir gökdelen inşa ederken "temeli atalım nasıl olsa gerisi gelir" denilemez. Sağlam bir proje için ilk baştan itibaren her şey planlanarak ilerlenmelidir.
						</p>

						<span class="s-text7">
							- Taha Yasir KIROĞLU
						</span>
					</div>

					<p>&nbsp;</p>

					<div class="bo13 p-l-29 m-l-9 p-b-10">
						<p class="p-b-11">
							Öyle her eline İngiliz anahtarını alan ben ustayım diye dolaşırsa daha çok bu sorunlarla karşılaşırsınız.
						</p>

						<span class="s-text7">
							- Sanayideki Hamdi Usta
						</span>
					</div>
				</div>
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

	<!-- Container Selection -->
	<div id="dropDownSelect1"></div>
	<div id="dropDownSelect2"></div>



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

		$(".selection-2").select2({
			minimumResultsForSearch: 20,
			dropdownParent: $('#dropDownSelect2')
		});
	</script>
<!--===============================================================================================-->
	<script src="js/main.js"></script>

</body>
</html>
