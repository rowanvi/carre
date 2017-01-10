

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
                    <a href="${pageContext.request.contextPath}/admin/dashboard"><img src="${pageContext.request.contextPath}/resources/admin/images/logo.png" alt="" /></a>
                </div>
                <div class="headerinner">
                    <ul class="headmenu">
                        <li class="right">
                            <div class="userloggedinfo">

                                <div class="userinfo">
                                    <h5>Admin Admin <small>- admin@admin.com</small></h5>
                                    <ul>
                                        <li><a href="${pageContext.request.contextPath}/admin">Log uit</a></li>
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
                        <li><a href="${pageContext.request.contextPath}/admin/dashboard"><span class="iconfa-laptop"></span> Dashboard</a></li>
                        <li class="dropdown"><a href="#"><span class="iconfa-shopping-cart"></span> Producten</a>
                            <ul>
                                <li><a href="${pageContext.request.contextPath}/admin/productlist"><span class="iconfa-shopping-cart"></span> Alle producten</a></li>
                                <li><a href="${pageContext.request.contextPath}/admin/addproduct"><span class="iconfa-shopping-cart"></span> Voeg product toe</a></li>
                                <li><a href="${pageContext.request.contextPath}/admin/categorie"><span class="iconfa-shopping-cart"></span> Categorie</a></li>

                            </ul>
                        </li>
                        <li class="dropdown"><a href="#"><span class="iconfa-th-list"></span> Orders</a>
                            <ul>
                                <li><a href="${pageContext.request.contextPath}/admin/orders"><span class="iconfa-th-list"></span> Alle Orders</a></li>
                                <li><a href="${pageContext.request.contextPath}/admin/orderlist"><span class="iconfa-th-list"></span> Order lijst per voorstelling</a></li>
                            </ul>
                        </li>
                        <li><a href="${pageContext.request.contextPath}/admin/voorstelling"><span class="iconfa-calendar"></span> Voorstellingen</a></li>
                        <li><a href="${pageContext.request.contextPath}/admin/financien"><span class="iconfa-list"></span> Financiën</a></li>
                        <li class="active"><a href="${pageContext.request.contextPath}/admin/users"><span class="iconfa-user"></span> Users</a></li>
                    </ul>
                </div><!--leftmenu-->

            </div><!-- leftpanel -->


            <div class="rightpanel">



                <div class="maincontent">
                    <div class="maincontentinner">
                        <div class="widgetbox box-inverse">
                            <h4 class="widgettitle">Users</h4>
                            <div class="widgetcontent wc1">

                                <c:url var="addAction" value="/admin/users/add" ></c:url>

                                <form:form action="${addAction}" commandName="users">
                                    <c:if test="${!empty users.id}">
                                        <tr>
                                            <td>

                                            </td>
                                            <td>

                                                <form:hidden path="id" />
                                            </td> 
                                        </tr>
                                    </c:if>
                                    <div class="par control-group">
                                        <label class="control-label">Username</label>
                                        <div class="controls"><form:input path="username" /></div>


                                    </div>
                                    <div class="par control-group">
                                        <label class="control-label">Wachtwoord</label>
                                        <div class="controls"><form:input path="password" /></div>


                                    </div>
                                    <div class="par control-group">
                                        <label class="control-label">Rank</label>
                                        <div class="controls"><form:input path="rank" /></div>


                                    </div>

                                    <p class="stdformbutton">
                                        <c:if test="${!empty users.username}">
                                            <input type="submit"
                                                   value="<spring:message text="Edit Users"/>" />
                                        </c:if>
                                        <c:if test="${empty users.username}">
                                            <input type="submit"
                                                   value="<spring:message text="Add Users"/>" />
                                        </c:if>
                                    </p>
                                </form:form>
                            </div><!--widgetcontent-->
                        </div><!--widget-->
                        <h4 class="widgettitle">Users</h4>
                        <c:if test="${!empty listUsers}">
                            <table id="dyntable" class="table table-bordered responsive">
                                <colgroup>
                                    <col class="con0" />
                                    <col class="con1" />
                                    <col class="con0" />
                                    <col class="con1" />
                                    <col class="con0" />
                                    <col class="con1" />
                                    <col class="con0" />
                                </colgroup>
                                <thead>
                                    <tr>
                                        <th class="head0">Username</th>
                                        <th class="head0">Rank</th>
                                        <th class="head1">Acties</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach items="${listUsers}" var="users">
                                        <tr>
                                            <td>${users.username}</td>
                                            <td>${users.rank}</td>
                                            <td class="center"><a href="${pageContext.request.contextPath}/admin/users/edit/${users.id}" >Edit</a></td>
                                        </tr>
                                    </c:forEach>

                                </tbody>
                            </table>
                        </c:if>

                        <br /><br />


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