<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
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
                                        <li><a href="#">EN</a></li>
                                    </ul>
                                </li>
                            </ul>
                            <ul>
                                <li><a href="#">Account</a></li>
                                <li><a href="cart.html">Winkelwagen</a></li>
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
                                    <img src ="resources/img/logo.png" width="280px" height="140px"/>
                                </div>
                            </div>

                            <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12 account-wrap">

                                <!-- Header shopping cart -->

                                <div class="my-account-holder">                
                                    <div class="total-cart my-account-title" data-toggle="my-cart">
                                        <div class="user-icon float-left">
                                            <i class="fa fa-shopping-cart" aria-hidden="true"></i>
                                        </div>
                                        <div class="float-left cart-link">
                                            <a href="#">1 Item(s)</a>
                                        </div>
                                        <div class="clearfix"></div>  
                                        <ul>
                                            <li>
                                                <div class="cart-img">
                                                    <a href="#"><img src="resources/cart/total-cart.jpg" alt="" /></a>											    
                                                </div>
                                                <div class="cart-info">
                                                    <h4><a href="#">Cola</a></h4>
                                                    <span>&euro; 300,00 <span>x 1</span></span>
                                                </div>
                                                <div class="del-icon">
                                                    <i class="fa fa-times-circle"></i>
                                                </div>
                                            </li>
                                            <li>
                                                <div class="subtotal-text">Subtotal: </div>
                                                <div class="subtotal-price">&euro; 300.00</div>
                                            </li>
                                            <li>
                                                <a href="cart.html" class="button float-right">Checkout</a>										    
                                            </li>
                                        </ul>                   
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
                                            <li><a href="">home</a>

                                            <li><a href="shop">Shop</a></li>

                                            <li><a href="contact">contact</a></li>
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
                                            <ul>
                                                <li><a href="">home</a>

                                                <li><a href="shop">Shop</a></li>

                                                <li><a href="contact">contact</a></li>
                                            </ul>
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
                        <li><a href="#">Shop</a></li>
                        
                    </ul>
                </div>
            </div>
        </div>
    </div>
    <!-- heading-banner end -->
    <!-- shop-area start -->
    <div class="shop-area">
        <div class="container">
            <div class="row">
                <!-- left-sidebar start -->
                <div class="col-lg-3 col-md-3 col-sm-12 col-xs-12">
                    <!-- widget-categories start -->
                    <aside class="widget widget-categories">
							<h3 class="sidebar-title">Menu</h3>
							<ul class="sidebar-menu">
								<li><a href="#">Speciale broodjes</a> <span class="count">(3)</span></li>
								<li><a href="#">Klassieke broodjes</a> <span class="count">(5)</span></li>
								<li><a href="#">Panini's</a> <span class="count">(3)</span></li>
								<li><a href="#">Salades</a> <span class="count">(3)</span></li>
								<li><a href="#">Dranken</a> <span class="count">(8)</span></li>
								<li><a href="#">Halal</a> <span class="count">(2)</span></li>
								<li><a href="#">Glutenvrij</a> <span class="count">(2)</span></li>
							</ul>
						
								
						</aside>
                    <!-- widget-categories end -->
                    <!-- shop-filter start -->
                    <aside class="widget shop-filter">
							<h3 class="sidebar-title">Prijs</h3>
							<div class="info_widget">
								<div class="price_filter">
									<div id="slider-range"></div>
									<div class="price_slider_amount">
										<input type="text" id="amount" name="price"  placeholder="Add Your Price" />
										<input type="submit"  value="Zoeken"/>  
									</div>
								</div>
							</div>							
						</aside>
                    <!-- shop-filter end -->
                    <!-- filter-by start -->
                    <aside>
							
                           
												
						</aside>
                   
                </div>
                <!-- left-sidebar end -->
                <!-- shop-content start -->
                <div class="col-lg-9 col-md-9 col-sm-12 col-xs-12">
                    <div class="shop-content">
                        <!-- Nav tabs -->
                        <ul class="shop-tab" role="tablist">
                            <li role="presentation" class="active"><a href="#home" aria-controls="home" role="tab"
                               
                            <li role="presentation"><a href="#profile" aria-controls="profile" role="tab" data-toggle="tab">

                        </ul>
                        <div class="show-result">
                            <p>
                                Toon 1&ndash;6 van 6 resultaten</p>	
                        </div>

                        <!-- Tab panes -->
                        <div class="tab-content">
                            <div role="tabpanel" class="tab-pane active" id="home">
                                <div class="row">
                                    <!-- single-product start -->
                                    <div class="col-lg-4 col-md-4 col-sm-4">
                                        <div class="single-product">
                                            <div class="product-img">
                                                <a href="single-product.html">
                                                    <img class="primary-img" src="img/product/1.jpg" alt="" width="250" height= "150" />
                                                    <img class="secondary-img" src="img/product/2.jpg" alt="" />
                                                </a>
                                                <div class="product-action">
                                                    <div class="pro-button-top">
                                                        <a href="#">Toevoegen aan winkelwagen</a>
                                                    </div>
                                                    <div class="pro-button-bottom">
                                                       
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="product-info">
                                                <h3>
                                                    <a href="single-product.html">Broodje gezond</a></h3>
                                                <div class="pro-price">
                                                    <span class="normal">�3,15</span> <span class="old">�4,50</span>
                                                </div>
                                                <div class="pro-rating">
                                                    <i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i><i
                                                        class="fa fa-star"></i><i class="fa fa-star"></i>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <!-- single-product end -->
                                    <!-- single-product start -->
                                    <div class="col-lg-4 col-md-4 col-sm-4">
                                        <div class="single-product">
                                            <div class="product-img">
                                                <a href="single-product.html">
                                                    <img class="primary-img" src="img/product/5.jpg" alt="" />
                                                    <img class="secondary-img" src="img/product/6.jpg" alt="" />
                                                </a>
                                                <div class="product-action">
                                                    <div class="pro-button-top">
                                                        <a href="#">Toevoegen aan winkelwagen</a>
                                                    </div>
                                                    <div class="pro-button-bottom">
                                                        
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="product-info">
                                                <h3>
                                                    <a href="single-product.html">Panini kip/ham</a></h3>
                                                <div class="pro-price">
                                                    <span class="normal">�3,00</span> <span class="old">�3,50</span>
                                                </div>
                                                <div class="pro-rating">
                                                    <i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i><i
                                                        class="fa fa-star"></i><i class="fa fa-star"></i>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <!-- single-product end -->
                                    <!-- single-product start -->
                                    <div class="col-lg-4 col-md-4 col-sm-4">
                                        <div class="single-product">
                                            <div class="product-img">
                                                <a href="single-product.html">
                                                    <img class="primary-img" src="img/product/19.jpg" alt="" />
                                                    <img class="secondary-img" src="img/product/20.jpg" alt="" />
                                                </a>
                                                <div class="product-action">
                                                    <div class="pro-button-top">
                                                        <a href="#">Toevoegen aan winkelwagen</a>
                                                    </div>
                                                    <div class="pro-button-bottom">
                                                        
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="product-info">
                                                <h3>
                                                    <a href="single-product.html">Mix salade</a></h3>
                                                <div class="pro-price">
                                                    <span class="normal">�3,50</span> <span class="old">�4,00</span>
                                                </div>
                                                <div class="pro-rating">
                                                    <i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i><i
                                                        class="fa fa-star"></i><i class="fa fa-star"></i>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <!-- single-product end -->
                                    <!-- single-product start -->
                                    <div class="col-lg-4 col-md-4 col-sm-4">
                                        <div class="single-product">
                                            <div class="product-img">
                                                <a href="single-product.html">
                                                    <img class="primary-img" src="img/product/35.jpg" alt="" />
                                                    <img class="secondary-img" src="img/product/36.jpg" alt="" />
                                                </a>
                                                <div class="product-action">
                                                    <div class="pro-button-top">
                                                        <a href="#">Toevoegen aan winkelwagen</a>
                                                    </div>
                                                    <div class="pro-button-bottom">
                                                        
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="product-info">
                                                <h3>
                                                    <a href="single-product.html">Broodje kip speciaal </a></h3>
                                                <div class="pro-price">
                                                    <span class="normal">�4,00</span> <span class="old">�4,75</span>
                                                </div>
                                                <div class="pro-rating">
                                                    <i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i><i
                                                        class="fa fa-star"></i><i class="fa fa-star"></i>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <!-- single-product end -->
                                    <!-- single-product start -->
                                    <div class="col-lg-4 col-md-4 col-sm-4">
                                        <div class="single-product">
                                            <div class="product-img">
                                                <a href="single-product.html">
                                                    <img class="primary-img" src="img/product/9.jpg" alt="" />
                                                    <img class="secondary-img" src="img/product/10.jpg" alt="" />
                                                </a>
                                                <div class="product-action">
                                                    <div class="pro-button-top">
                                                        <a href="#">Toevoegen aan winkelwagen</a>
                                                    </div>
                                                    <div class="pro-button-bottom">
                                                        
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="product-info">
                                                <h3>
                                                    <a href="single-product.html">Sourcy mineraal water</a></h3>
                                                <div class="pro-price">
                                                    <span class="normal">�1,00</span> <span class="old">�1,50</span>
                                                </div>
                                                <div class="pro-rating">
                                                    <i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i><i
                                                        class="fa fa-star"></i><i class="fa fa-star"></i>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <!-- single-product end -->
                                    <!-- single-product start -->
                                    <div class="col-lg-4 col-md-4 col-sm-4">
                                        <div class="single-product">
                                            <div class="product-img">
                                                <a href="single-product.html">
                                                    <img class="primary-img" src="img/product/12.jpg" alt="" />
                                                    <img class="secondary-img" src="img/product/13.jpg" alt="" />
                                                </a>
                                                <div class="product-action">
                                                    <div class="pro-button-top">
                                                        <a href="#">Toevoegen aan winkelwagen</a>
                                                    </div>
                                                    <div class="pro-button-bottom">
                                                       
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="product-info">
                                                <h3>
                                                    <a href="single-product.html">Koffie regular</a></h3>
                                                <div class="pro-price">
                                                    <span class="normal">�1,50</span> <span class="old">�2,00</span>
                                                </div>
                                                <div class="pro-rating">
                                                    <i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i><i
                                                        class="fa fa-star"></i><i class="fa fa-star"></i>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    
                                </div>
                            </div>
                            <div role="tabpanel" class="tab-pane" id="profile">
                                <div class="row shop-list">
                                    <!-- single-product start -->
                                    <div class="col-md-12">
                                        <div class="single-product">
                                            <div class="product-img">
                                                <a href="single-product.html">
                                                    <img class="primary-img" src="img/product/15.jpg" alt="" />
                                                    <img class="secondary-img" src="img/product/16.jpg" alt="" />
                                                </a>
                                            </div>
                                            <div class="product-info">
                                                <h3>
                                                    <a href="single-product.html">Feugiat justo lacinia</a></h3>
                                                <div class="pro-price">
                                                    <span class="normal">$150</span> <span class="old">$180</span>
                                                </div>
                                                <div class="pro-rating">
                                                    <i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i><i
                                                        class="fa fa-star"></i><i class="fa fa-star"></i>
                                                </div>
                                                <div class="product-desc">
                                                    <p>
                                                        Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam fringilla augue nec
                                                        est tristique auctor. Donec non est at libero vulputate rutrum. Morbi ornare lectus
                                                        quis justo gravida semper. Nulla tellus mi, vulputate adipiscing cursus eu, suscipit
                                                        id nulla.</p>
                                                </div>
                                                <div class="product-action">
                                                    <div class="pro-button-top">
                                                        <a href="#">add to cart</a>
                                                    </div>
                                                    <div class="pro-button-bottom">
                                                        <a href="#"><i class="fa fa-heart"></i></a><a href="#"><i class="fa fa-retweet"></i>
                                                        </a><a href="#"><i class="fa fa-search-plus"></i></a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <!-- single-product end -->
                                    <!-- single-product start -->
                                    <div class="col-md-12">
                                        <div class="single-product">
                                            <div class="product-img">
                                                <a href="single-product.html">
                                                    <img class="primary-img" src="img/product/22.jpg" alt="" />
                                                    <img class="secondary-img" src="img/product/23.jpg" alt="" />
                                                </a>
                                            </div>
                                            <div class="product-info">
                                                <h3>
                                                    <a href="single-product.html">Feugiat justo lacinia</a></h3>
                                                <div class="pro-price">
                                                    <span class="normal">$150</span> <span class="old">$180</span>
                                                </div>
                                                <div class="pro-rating">
                                                    <i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i><i
                                                        class="fa fa-star"></i><i class="fa fa-star"></i>
                                                </div>
                                                <div class="product-desc">
                                                    <p>
                                                        Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam fringilla augue nec
                                                        est tristique auctor. Donec non est at libero vulputate rutrum. Morbi ornare lectus
                                                        quis justo gravida semper. Nulla tellus mi, vulputate adipiscing cursus eu, suscipit
                                                        id nulla.</p>
                                                </div>
                                                <div class="product-action">
                                                    <div class="pro-button-top">
                                                        <a href="#">add to cart</a>
                                                    </div>
                                                    <div class="pro-button-bottom">
                                                        <a href="#"><i class="fa fa-heart"></i></a><a href="#"><i class="fa fa-retweet"></i>
                                                        </a><a href="#"><i class="fa fa-search-plus"></i></a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <!-- single-product end -->
                                    <!-- single-product start -->
                                    <div class="col-md-12">
                                        <div class="single-product">
                                            <div class="product-img">
                                                <a href="single-product.html">
                                                    <img class="primary-img" src="img/product/8.jpg" alt="" />
                                                    <img class="secondary-img" src="img/product/7.jpg" alt="" />
                                                </a>
                                            </div>
                                            <div class="product-info">
                                                <h3>
                                                    <a href="single-product.html">Feugiat justo lacinia</a></h3>
                                                <div class="pro-price">
                                                    <span class="normal">$150</span> <span class="old">$180</span>
                                                </div>
                                                <div class="pro-rating">
                                                    <i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i><i
                                                        class="fa fa-star"></i><i class="fa fa-star"></i>
                                                </div>
                                                <div class="product-desc">
                                                    <p>
                                                        Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam fringilla augue nec
                                                        est tristique auctor. Donec non est at libero vulputate rutrum. Morbi ornare lectus
                                                        quis justo gravida semper. Nulla tellus mi, vulputate adipiscing cursus eu, suscipit
                                                        id nulla.</p>
                                                </div>
                                                <div class="product-action">
                                                    <div class="pro-button-top">
                                                        <a href="#">add to cart</a>
                                                    </div>
                                                    <div class="pro-button-bottom">
                                                        <a href="#"><i class="fa fa-heart"></i></a><a href="#"><i class="fa fa-retweet"></i>
                                                        </a><a href="#"><i class="fa fa-search-plus"></i></a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <!-- single-product end -->
                                    <!-- single-product start -->
                                    <div class="col-md-12">
                                        <div class="single-product">
                                            <div class="product-img">
                                                <a href="single-product.html">
                                                    <img class="primary-img" src="img/product/16.jpg" alt="" />
                                                    <img class="secondary-img" src="img/product/17.jpg" alt="" />
                                                </a>
                                            </div>
                                            <div class="product-info">
                                                <h3>
                                                    <a href="single-product.html">Feugiat justo lacinia</a></h3>
                                                <div class="pro-price">
                                                    <span class="normal">$150</span> <span class="old">$180</span>
                                                </div>
                                                <div class="pro-rating">
                                                    <i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i><i
                                                        class="fa fa-star"></i><i class="fa fa-star"></i>
                                                </div>
                                                <div class="product-desc">
                                                    <p>
                                                        Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam fringilla augue nec
                                                        est tristique auctor. Donec non est at libero vulputate rutrum. Morbi ornare lectus
                                                        quis justo gravida semper. Nulla tellus mi, vulputate adipiscing cursus eu, suscipit
                                                        id nulla.</p>
                                                </div>
                                                <div class="product-action">
                                                    <div class="pro-button-top">
                                                        <a href="#">add to cart</a>
                                                    </div>
                                                    <div class="pro-button-bottom">
                                                        <a href="#"><i class="fa fa-heart"></i></a><a href="#"><i class="fa fa-retweet"></i>
                                                        </a><a href="#"><i class="fa fa-search-plus"></i></a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <!-- single-product end -->
                                </div>
                            </div>
                        </div>
                    </div>

                </div>
                <!-- shop-content end -->
            </div>
        </div>
    </div>
    <!-- footer start -->
     <footer>
        <!-- footer-top-area start -->
        <div class="footer-top-area">
            <div class="container">
                <div class="row">
                    <!-- footer-widget start -->
                    <div class="col-lg-3 col-md-3 col-sm-4">
                        <div class="footer-widget">
                            <div class="footer-logo"><img src="resources/img/logo.png"/></div>								
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
                                <li><a href="#">Home</a></li>
                                <li><a href="#">Shop</a></li>
                                <li><a href="#">Checkout</a></li>
                                <li><a href="#">Contact</a></li>
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
                            <p>Copyright � 2016 <a href="#" target="_blank">Carre</a>. All Rights Reserved</p>
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6 col-sm-6">
                        <div class="payment-img">
                            <img src="img/payment.png" alt="" />
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







</body>
</html>