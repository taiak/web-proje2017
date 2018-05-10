<%@page pageEncoding="UTF-8"%>

<footer class="bg6 p-t-45 p-b-43 p-l-45 p-r-45">
  <div class="flex-w p-b-90">
    <div class="w-size6 p-t-30 p-l-15 p-r-15 respon3">
      <h4 class="s-text12 p-b-30">
        İLETİŞİME GEÇİN
      </h4>

      <div>
        <p class="s-text7 w-size27">
          Merak ettiğiniz veya sormak istediğiniz bir şey mi var? Bizimle <a href="mailto:nispeteng@gmail.com"/>nispeteng@gmail.com</a> adresinden iletişime geçebilirsiniz."
        </p>
      </div>
    </div>

    <div class="w-size7 p-t-30 p-l-15 p-r-15 respon4">
      <h4 class="s-text12 p-b-30">
        Bağlantılar
      </h4>

      <ul>
        <li class="p-b-9">
          <a href="home" class="s-text7">
            Anasayfa
          </a>
        </li>

        <li class="p-b-9">
          <a href="login" class="s-text7">
            Üye Girişi
          </a>
        </li>
        
       	<li class="p-b-9">
          <a href="orders" class="s-text7">
            Siparişlerim
          </a>
        </li>
      </ul>
    </div>

    <div class="w-size7 p-t-30 p-l-15 p-r-15 respon4">
    </div>

    <div class="w-size7 p-t-30 p-l-15 p-r-15 respon4">
    </div>

    <div class="w-size8 p-t-30 p-l-15 p-r-15 respon3">
    </div>
  </div>

  <div class="t-center p-l-15 p-r-15">
    <div class="t-center s-text8 p-t-20">
      Nispet Team - 2018 - Ondokuz Mayıs Üniversitesi Bilgisayar Mühendisliği - Tema: <i class="fa fa-heart-o" aria-hidden="true"></i> <a href="https://colorlib.com" target="_blank">Colorlib</a>
    </div>
  </div>
</footer>




	<!-- Back to top -->
	<div class="btn-back-to-top bg0-hov" id="myBtn">
		<span class="symbol-btn-back-to-top">
			<i class="fa fa-angle-double-up" aria-hidden="true"></i>
		</span>
	</div>

	<!-- Container Selection1 -->
	<div id="dropDownSelect1"></div>



<!--===============================================================================================-->
	<script type="text/javascript" src"../vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script type="text/javascript" src"../vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
	<script type="text/javascript" src"../vendor/bootstrap/js/popper.js"></script>
	<script type="text/javascript" src"../vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script type="text/javascript" src"../vendor/select2/select2.min.js"></script>
	<script type="text/javascript">
		$(".selection-1").select2({
			minimumResultsForSearch: 20,
			dropdownParent: $('#dropDownSelect1')
		});
	</script>
<!--===============================================================================================-->
	<script type="text/javascript" src"../vendor/slick/slick.min.js"></script>
	<script type="text/javascript" src"../js/slick-custom.js"></script>
<!--===============================================================================================-->
	<script type="text/javascript" src"../vendor/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
	<script type="text/javascript" src"../vendor/lightbox2/js/lightbox.min.js"></script>
<!--===============================================================================================-->
	<script type="text/javascript" src"../vendor/sweetalert/sweetalert.min.js"></script>
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
	<script src"../js/main.js"></script>
