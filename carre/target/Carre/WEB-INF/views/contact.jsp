<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="windows-1252"%>
<html class="no-js" lang="en">

    <head>
        <meta charset="utf-8">
        <meta http-equiv="x-ua-compatible" content="ie=edge"/>
        <title>Home | Carre Pre-Order</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="shortcut icon" type="image/x-icon" href="img/favicon.ico">
        <!-- google fonts -->
        <link href='https://fonts.googleapis.com/css?family=Lato:400,900,700,300' rel='stylesheet'
              type='text/css'>
        <!-- Place favicon.ico in the root directory -->
        <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
        <link href="<c:url value="/resources/css/jquery-ui.min.css" />" rel="stylesheet">
        <link href="<c:url value="/resources/css/meanmenu.min.css" />" rel="stylesheet">
        <link href="<c:url value="/resources/lib/rs-plugin/settings.css" />" rel="stylesheet">
        <link href="<c:url value="/resources/css/owl.carousel.css" />" rel="stylesheet">
        <link href="<c:url value="/resources/css/font-awesome.min.css" />" rel="stylesheet">

        <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">

        <link href="<c:url value="/resources/css/responsive.css" />" rel="stylesheet">


        <script src="<c:url value="/resources/js/vendor/modernizr-2.8.3.min.js" />"></script>

    </head>
    <body class="home-1">


        <div class="header-top-area hidden-xs">
            <div class="container">
                <div class="row">
                    <div class="col-lg-6 col-md-6 col-sm-4">
                        <div class="welcome">
                            <span class="phone">Telefoon</span> <span class="hidden-sm">/</span>
                            <span class="email hidden-sm">Email</span>
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6 col-sm-8">
                        <div class="top-menu">
                            <ul id="currency">
                                <li><a href="#">NL <i class="fa fa-angle-down"></i></a>
                                    <ul>
                                         <li><a href="${pageContext.request.contextPath}/Webshop_engels">EN</a></li>
                                    </ul>
                                </li>
                            </ul>
                            <ul>
                                
                                <li><a href="${pageContext.request.contextPath}/cart">Winkelwagen</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- header-top-area end -->
        <div class="sticky-wrapper">
            <header>			
                <!-- header-bottom-area start -->            
                <div class="header-bottom-area">
                    <div class="container">
                        <div class="row">
                            <div class="col-lg-9 col-md-9 col-sm-9 col-xs-12">
                                <div class="logo">
                                    <img src ="${pageContext.request.contextPath}/resources/img/logo.png" width="280px" height="140px"/>
                                </div>
                            </div>

                            <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12 account-wrap">

                                <!-- Header shopping cart -->

                                <div class="my-account-holder">                
                                    <div class="total-cart my-account-title" data-toggle="my-cart">
                                        <div class="user-icon float-left">
                                            <a href="${pageContext.request.contextPath}/cart"><i class="fa fa-shopping-cart" aria-hidden="true"></i></a>
                                        </div>
                                        <div class="float-left cart-link">
                                            <a href="${pageContext.request.contextPath}/cart"></a>
                                        </div>
                                        <div class="clearfix"></div>  
                 
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- header-bottom-area end -->
                <!-- main-menu-area start -->
                <div class="main-menu-area hidden-xs">
                    <div class="container">
                        <div class="row">
                            <div class="col-lg-12 col-md-12 col-sm-12">
                                <div class="main-menu">
                                    <nav>
                                        <ul>
                                            <li><a href="${pageContext.request.contextPath}/">home</a>

                                            <li><a href="${pageContext.request.contextPath}/webshop">Shop</a></li>
                 <li><a href="${pageContext.request.contextPath}/cart">Winkelwagen</a></li>
                                            <li><a href="${pageContext.request.contextPath}/contact">contact</a></li>
                                        </ul>
                                    </nav>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>             
                <!-- main-menu-area end -->
                <!-- mobile-menu-area start -->
                <div class="mobile-menu-area visible-xs">
                    <div class="container">
                        <div class="row">
                            <div class="col-md-12">
                                <div class="mobile-menu">
                                    <nav id="dropdown">
                                        <ul>
                                          
                                                <li><a href="${pageContext.request.contextPath}/">home</a>

                                                <li><a href="${pageContext.request.contextPath}/webshop">Shop</a></li>
                 <li><a href="${pageContext.request.contextPath}/cart">Winkelwagen</a></li>
                                                <li><a href="${pageContext.request.contextPath}/contact">contact</a></li>
                                           
                                        </ul>
                                    </nav>
                                </div>					
                            </div>
                        </div>
                    </div>
                </div>
                <!-- mobile-menu-area end -->			
            </header>
        </div> 

    <!-- heading-banner start -->
    <div class="heading-banner">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <ul class="breadcrumb">
                        <li><a href="#">Home</a></li>
                        <li class="active">Contact</li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
    <!-- heading-banner end -->
    <!-- map-area start -->
    <div class="map-area">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div id="googleMap" style="width: 100%; height: 410px;">
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- map-area end -->
    <!-- contact-area start -->
    <div class="contact-area">
        <div class="container">
            <div class="row">
                <div class="col-md-6 col-sm-12 col-xs-12">
                    <div class="contact-form">
                        <h3>
                            <i class="fa fa-envelope-o"></i>Contact formulier</h3>
                        <div class="row">
                            <form action="#" method="POST">
                            <div class="col-md-6 col-sm-6 col-xs-12">
                                <input name="name" type="text" placeholder="Naam" />
                            </div>
                            <div class="col-md-6 col-sm-6 col-xs-12">
                                <input name="email" type="email" placeholder="Email" />
                            </div>
                            <div class="col-md-12 col-sm-12 col-xs-12">
                                <input name="subject" type="text" placeholder="Onderwerp" />
                            </div>
                            <div class="col-md-12 col-sm-12 col-xs-12">
                                <textarea name="message" id="message" cols="30" rows="10" placeholder="Bericht"></textarea>
                                <input type="submit" value="Stuur bericht" />
                            </div>
                            </form>
                        </div>
                    </div>
                </div>
                <!-- contact-info start -->
                <div class="col-md-6 col-sm-12 col-xs-12">
                    <div class="contact-info">
                        <h3>
                            Contact info</h3>
                        <ul>
                            <li><i class="fa fa-map-marker"></i><strong>Adres</strong> Amstel 115-125, 1018 EM Amsterdam</li>
                            <li><i class="fa fa-envelope"></i><strong>Telefoon</strong> 020 52 49 494</li>
                            <li><i class="fa fa-mobile"></i><strong>Email:</strong> <a href="#">info@carre.nl</a>
                            </li>
                        </ul>
                    </div>
                </div>
                <!-- contact-info end -->
            </div>
        </div>
    </div>
    <!-- contact-area end -->
    <!-- footer start -->
    <footer>
			<!-- footer-top-area start -->
			<div class="footer-top-area">
				<div class="container">
					<div class="row">
						<!-- footer-widget start -->
						<div class="col-lg-3 col-md-3 col-sm-4">
							<div class="footer-widget">
                            <div class="footer-logo"><img src="${pageContext.request.contextPath}/resources/img/logo.png"/></div>								
								<p>Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum. .</p>
								<address class="box-address">
										<span class="fa fa-home"></span>Adres Amstel 115-125,<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 1018 EM Amsterdam<br>
										<span class="fa fa-phone"></span> <b class="color-dark">Nummer 020 52 49 494</b><br>										
										<span class="fa fa-envelope"></span> <a class="color" href="mailto:admin@yourdomain.com">Email</a>
								</address>                                
							</div>
						</div>
						<!-- footer-widget end -->
						<!-- footer-widget start -->
						<div class="col-lg-3 col-md-3 hidden-sm">
							<div class="footer-widget">
								<h3>Site map</h3>
								<ul class="footer-menu">
									<li><a href="${pageContext.request.contextPath}/">Home</a></li>
									<li><a href="${pageContext.request.contextPath}/webshop">Shop</a></li>
									<li><a href="${pageContext.request.contextPath}/cart">Checkout</a></li>
									<li><a href="${pageContext.request.contextPath}/contact">Contact</a></li>
								</ul>
							</div>
						</div>
						<!-- footer-widget end -->
						<!-- footer-widget start -->
						<div class="col-lg-3 col-md-3 col-sm-4">
							<div class="footer-widget">
								<h3>Voorwaarden</h3>
								<ul class="footer-menu">
									<li><a href="#">Algemene voorwaarden</a></li>
									<li><a href="#">Terms en services</a></li>
								</ul>
							</div>
						</div>
						<!-- footer-widget end -->
						<!-- footer-widget start -->
						<div class="col-lg-3 col-md-3 col-sm-4">
							<div class="footer-widget">		
                                <h3>Nieuwsbrief</h3>
                                <div class="subscribe-title">                               
                                <form action="#">
                                <div class="subscribe-form">
                                    <input type="text" placeholder="Your Email.........">
                                    <button>
                                        Abboneer</button>
                                </div>
                                </form>
                                </div>						
							</div>
						</div>
						<!-- footer-widget end -->
					</div>
				</div>
			</div>
			<!-- footer-top-area end -->
			<!-- footer-bottom-area start -->
			<div class="footer-bottom-area">
				<div class="container">
					<div class="row">
						<div class="col-lg-6 col-md-6 col-sm-6">
							<div class="copyright">
								<p>Copyright © 2016 <a href="#" target="_blank">Carre</a>. All Rights Reserved</p>
							</div>
						</div>
						<div class="col-lg-6 col-md-6 col-sm-6">
							<div class="payment-img">
								<img src="${pageContext.request.contextPath}/resources/img/payment.png" alt="" />
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- footer-bottom-area end -->
		</footer>
    <!-- footer end -->
 
    <!-- all js here -->
    <!-- jquery latest version -->
    <script src="<c:url value="/resources/js/jquery-3.1.1.min.js" />"></script>
    <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
    <script src="<c:url value="/resources/js/owl.carousel.min.js" />"></script>
    <script src="<c:url value="/resources/js/jquery-ui.min.js" />"></script>

    <script src="<c:url value="/resources/lib/rs-plugin/js/jquery.themepunch.revolution.min.js" />"></script>
    <script src="<c:url value="/resources/lib/rs-plugin/js/jquery.themepunch.tools.min.js" />"></script>
    <script src="<c:url value="/resources/lib/rs-plugin/rs.home.js" />"></script>

    <script src="<c:url value="/resources/js/jquery.meanmenu.js" />"></script>      
    <script src="<c:url value="/resources/js/wow.min.js" />"></script>
    <script src="<c:url value="/resources/js/plugins.js" />"></script>       
    <script src="<c:url value="/resources/js/main.js" />"></script>
    <script src="<c:url value="/resources/js/jquery.cookie.js" />"></script>
	<!-- Maps -->
	<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBuU_0_uLMnFM-2oWod_fzC0atPZj7dHlU"></script>
    <script>
        function initialize() {
            var mapOptions = {
                zoom: 15,
                scrollwheel: false,
                center: new google.maps.LatLng(52.3623872, 4.9042637)
            };

            var map = new google.maps.Map(document.getElementById('googleMap'),
				  mapOptions);


            var marker = new google.maps.Marker({
                position: map.getCenter(),
                map: map
            });

        }

        google.maps.event.addDomListener(window, 'load', initialize);
    </script>
</body>
</body>
</html>
