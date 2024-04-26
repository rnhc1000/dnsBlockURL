<?php

$dominio =  $_SERVER['SERVER_NAME'];
if (strpos($_SERVER['HTTP_X_FORWARDED_PROTO'], 'https') !== false) {
    $url = "https://$dominio";
} else {
    $url = "$dominio";
}


?>
<!doctype html>
<html lang="pt-br">

<head>

    <!--====== Required meta tags ======-->
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!--====== Title ======-->
    <title>Conteúdo Bloqueado no Brasil</title>

    <!--====== Favicon Icon ======-->
    <link rel="shortcut icon" href="assets/images/favicon.svg" type="image/svg">

    <!--====== Bootstrap css ======-->
    <link rel="stylesheet" href="assets/css/bootstrap.min.css">

    <!--====== Slick css ======-->
    <link rel="stylesheet" href="assets/css/slick.css">

    <!--====== Magnific Popup css ======-->
    <link rel="stylesheet" href="assets/css/magnific-popup.css">

    <!--====== Line Icons css ======-->
    <link rel="stylesheet" href="assets/css/LineIcons.css">

    <!--====== Default css ======-->
    <link rel="stylesheet" href="assets/css/default.css">

    <!--====== Style css ======-->
    <link rel="stylesheet" href="assets/css/style.css">


</head>

<body style="background-color: #333333;">

    <!--====== HEADER ONE PART START ======-->

    <header class="header-area">
        <div id="home" class="header-content-area d-flex align-items-center">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="header-wrapper">
                            <div class="header-content">
                                <h3 class="header-title"><?php echo $_SERVER['SERVER_NAME']; ?></h3>
                                <p class="text"><br><br><br>
                                    O website <strong><span class="text-danger"><?php echo "$url"; ?></span></strong> foi oficialmente bloqueado por determinação da Agência Nacional de Telecomunicações (Anatel), por meio dos poderes conferidos pela República Federativa do Brasil.
                                </p>
                            </div>
                            <div class="header-image d-none d-lg-block">
                                <div class="image">
                                    <img src="assets/images/stop-blocked-icon.svg" alt="Header">
                                </div>
                            </div>
                        </div>
                    </div>
                </div> <!-- row -->
            </div> <!-- container -->
            <div class="header-shape">
                <img src="assets/images/shape.svg" alt="shape">
            </div> <!-- header-shape -->
        </div> <!-- header content area -->
    </header>

    <!--====== HEADER ONE PART ENDS ======-->

    <!--====== FOOTER PART START ======-->

    <footer id="footer" class="footer-area">
        <div class="footer-widget pt-10 pb-50">
            <div class="container">
                <div class="align-items-center">
                    <img src="assets/images/logo.png" alt="Logo">
                </div>
            </div> <!-- container -->
        </div> <!-- footer widget -->


    </footer>

    <!--====== FOOTER PART ENDS ======-->

    <!--====== BACK TOP TOP PART START ======-->

    <a href="#" class="back-to-top"><i class="lni-chevron-up"></i></a>

    <!--====== BACK TOP TOP PART ENDS ======-->




    <!--====== jquery js ======-->
    <script src="assets/js/vendor/modernizr-3.6.0.min.js"></script>
    <script src="assets/js/vendor/jquery-1.12.4.min.js"></script>

    <!--====== Bootstrap js ======-->
    <script src="assets/js/bootstrap.min.js"></script>
    <script src="assets/js/popper.min.js"></script>


    <!--====== Images Loaded js ======-->
    <script src="assets/js/imagesloaded.pkgd.min.js"></script>

    <!--====== Scrolling Nav js ======-->
    <script src="assets/js/jquery.easing.min.js"></script>
    <script src="assets/js/scrolling-nav.js"></script>


    <!--====== Slick js ======-->
    <script src="assets/js/slick.min.js"></script>


    <!--====== Main js ======-->
    <script src="assets/js/main.js"></script>

</body>

</html>