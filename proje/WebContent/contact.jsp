<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Contact</title>
	<jsp:include page="_metadata.jsp"></jsp:include>

</head>
<body class="animsition">

	<!-- Header -->
  <jsp:include page="_header.jsp"></jsp:include>


	<!-- Title Page -->
	<section class="bg-title-page p-t-40 p-b-50 flex-col-c-m" style="background-image: url(images/contact-us-other.png);">
		<h2 class="l-text2 t-center">
			İLETİŞİME GEÇ
		</h2>
	</section>

	<!-- content page -->
	<section class="bgwhite p-t-66 p-b-60">
		<div class="container">
			<div class="row">
				<div class="col-md-6 p-b-30">
					<div class="p-r-20 p-r-0-lg">
						<div class="contact-map size21" id="google_map" data-map-x="41.364491" data-map-y="36.184540" data-pin="images/nispet-small.png" data-scrollwhell="0" data-draggable="1"></div>
					</div>
				</div>

				<div class="col-md-6 p-b-30">
					<h4>E-Posta</h4>
					Merak ettiğiniz veya sormak istediğiniz bir şey mi var? Bizimle <a href="mailto:nispeteng@gmail.com"/>nispeteng@gmail.com</a> adresinden iletişime geçebilirsiniz.
				</div>
			</div>
		</div>
	</section>


	<!-- Footer -->
	<jsp:include page="_footer.jsp"></jsp:include>

</body>
</html>
