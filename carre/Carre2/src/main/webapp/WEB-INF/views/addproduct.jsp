

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page contentType="text/html" pageEncoding="windows-1252"%>
<html>

    <!-- Mirrored from themetrace.com/demo/shamcey/dashboard.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 25 Oct 2016 08:31:59 GMT -->
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Carre | Dashboard</title>
        <link href="<c:url value="/resources/admin/css/style.default.css" />" rel="stylesheet">
        <link href="<c:url value="/resources/admin/css/responsive-tables.css" />" rel="stylesheet">
        <script src="<c:url value="/resources/admin/js/jquery-1.9.1.min.js" />"></script>
        <script src="<c:url value="/resources/admin/js/jquery-migrate-1.1.1.min.js" />"></script>
        <script src="<c:url value="/resources/admin/js/jquery-ui-1.10.3.min.js" />"></script>
        <script src="<c:url value="/resources/admin/js/modernizr.min.js" />"></script>
        <script src="<c:url value="/resources/admin/js/bootstrap.min.js" />"></script>
        <script src="<c:url value="/resources/admin/js/responsive-tables.js" />"></script>
        <script src="<c:url value="/resources/admin/js/jquery.slimscroll.js" />"></script>
        <script src="<c:url value="/resources/admin/js/custom.js" />"></script>



        <!--[if lte IE 8]><script language="javascript" type="text/javascript" src="js/excanvas.min.js"></script><![endif]-->
    </head>

    <body>



        <div id="mainwrapper" class="mainwrapper">

            <div class="header">
                <div class="logo">
                    <a href="dashboard"><img src="resources/admin/images/logo.png" alt="" /></a>
                </div>
                <div class="headerinner">
                    <ul class="headmenu">
                        <li class="right">
                            <div class="userloggedinfo">

                                <div class="userinfo">
                                    <h5>Admin Admin <small>- admin@admin.com</small></h5>
                                    <ul>
                                        <li><a href="index">Log uit</a></li>
                                    </ul>
                                </div>
                            </div>
                        </li>
                    </ul><!--headmenu-->
                </div>
            </div>

            <div class="leftpanel">

                <div class="leftmenu">        
                    <ul class="nav nav-tabs nav-stacked">
                        <li class="nav-header">Navigation</li>
                        <li><a href="dashboard"><span class="iconfa-laptop"></span> Dashboard</a></li>
                        <li class="dropdown active"><a href="#"><span class="iconfa-shopping-cart"></span> Producten</a>
                            <ul>
                                <li><a href="productlist"><span class="iconfa-shopping-cart"></span> Alle producten</a></li>
                                <li><a href="addproduct"><span class="iconfa-shopping-cart"></span> Voeg product toe</a></li>
                                <li><a href="categorie"><span class="iconfa-shopping-cart"></span> Categorie</a></li>
                                <li><a href="catalogus"><span class="iconfa-shopping-cart"></span> Catalogus</a></li>
                            </ul>
                        </li>
                        <li class="dropdown"><a href="#"><span class="iconfa-th-list"></span> Orders</a>
                            <ul>
                                <li><a href="orders"><span class="iconfa-th-list"></span> Alle Orders</a></li>
                                <li><a href="orderlist"><span class="iconfa-th-list"></span> Order lijst per voorstelling</a></li>
                            </ul>
                        </li>
                        <li><a href="voorstelling"><span class="iconfa-calendar"></span> Voorstellingen</a></li>
                        <li><a href="financien"><span class="iconfa-list"></span> Financiën</a></li>
                    </ul>
                </div><!--leftmenu-->

            </div><!-- leftpanel -->


            <div class="rightpanel">

                <div class="maincontent">
                    <div class="maincontentinner">
                        <div class="row-fluid">
                            <div class="span4 profile-left">

                                <div class="widgetbox profile-photo">
                                    <div class="headtitle">
                                        <div class="btn-group">
                                            <button data-toggle="dropdown" class="btn dropdown-toggle">Acties <span class="caret"></span></button>
                                            <ul class="dropdown-menu">
                                                <li><a href="#">Edit image</a></li>
                                                <li><a href="#">Verwijder image</a></li>
                                            </ul>
                                        </div>
                                        <h4 class="widgettitle">Product image</h4>
                                    </div>
                                    <div class="widgetcontent">
                                        <div class="profilethumb">
                                            <img src="images/profilethumb.png" alt="" class="img-polaroid" />
                                        </div><!--profilethumb-->
                                    </div>
                                </div>



                            </div><!--span4-->
                            <div class="span8">
                                <c:url var="addAction" value="/addproduct/add" ></c:url>
                                <form:form action="${addAction}" class="editprofileform" commandName="product">



                                    <div class="widgetbox personal-information">
                                        <h4 class="widgettitle">Product informatie</h4>
                                        <div class="widgetcontent">
                                            <c:if test="${!empty product.id}">
                                                <tr>
                                                    <td>
                                                        <form:label path="id">
                                                            <spring:message text="ID"/>
                                                        </form:label>
                                                    </td>
                                                    <td>
                                                        <form:input path="id" readonly="true" size="8"  disabled="true" />
                                                        <form:hidden path="id" />
                                                    </td> 
                                                </tr>
                                            </c:if>
                                            <p>
                                                <label>Naam:</label>
                                                <form:input path="productnaam" />
                                            </p>
                                            <p>
                                                <label>Prijs:</label>
                                                <form:input path="prijs" />
                                            </p>
                                            <p>
                                                <label>Voorraad:</label>
                                                <form:input path="voorraad" />
                                            </p>
                                            <p>
                                                <label>Status:</label>
                                                //                                            <input type="checkbox" /> Op voorraad <br />
                                                //                                            <input type="checkbox" /> Uitverkocht <br />
                                                //											<input type="checkbox" /> Disable<br />
                                                <form:input path="status" />
                                            </p>
                                            <p>
                                                <label>Omschrijving:</label>
                                                <form:input path="omschrijving" />
                                            </p>
                                            <p>
                                                <label>Categorie</label>
                                                <form:input path="categorieid" />
                                            </p>

                                        </div>
                                    </div>

                                    <p>
                                        <c:if test="${!empty product.productnaam}">
                                            <input type="submit"
                                                   value="<spring:message text="Edit product"/>" />
                                        </c:if>
                                        <c:if test="${empty product.productnaam}">
                                            <input type="submit"
                                                   value="<spring:message text="Add product"/>" />
                                        </c:if>


                                    </form:form>
                            </div><!--span8-->
                        </div><!--row-fluid-->
                        <div class="footer">
                            <div class="footer-left">
                                <span>Copyirght &copy; 2016 Carré, All rights reserved.</span>
                            </div>
                            <div class="footer-right">
                                <span></span>
                            </div>
                        </div><!--footer-->

                    </div><!--maincontentinner-->
                </div><!--maincontent-->

            </div><!--rightpanel-->

        </div><!--mainwrapper-->

    </body>

</html>
