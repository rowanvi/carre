

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
        <script type="text/javascript">
            jQuery(document).ready(function () {
                jQuery('#login').submit(function () {
                    var u = jQuery('#username').val();
                    var p = jQuery('#password').val();
                    if (u == '' && p == '') {
                        jQuery('.login-alert').fadeIn();
                        return false;
                    }
                });
            });
        </script>
        <style>
            .inputwrapper input{
                width:100%;
                height: 12%;
            }
        </style>



        <!--[if lte IE 8]><script language="javascript" type="text/javascript" src="js/excanvas.min.js"></script><![endif]-->
    </head>



    <body class="loginpage">

        <div class="loginpanel">
            <div class="loginpanelinner">
                <div class="logo animate0 bounceIn"><img src="${pageContext.request.contextPath}/resources/admin/images/logo.png" alt="" width="280px" height="140px"/></div>

                <c:url var="addAction" value="/admin/check" ></c:url>
                <form:form action="${addAction}" id="login" commandName="users">
                   
                        <div class="inputwrapper login-alert">
                            <div class="alert alert-error">Onjuiste gegevens</div>
                        </div>
                        <div class="inputwrapper animate1 bounceIn">
                            <form:input type="text" path="username" placeholder="Username" />
                        </div>
                        <div class="inputwrapper animate2 bounceIn">
                            <form:input type="text" path="password" placeholder="Password" />
                        </div>
                        <div class="inputwrapper animate3 bounceIn">
                            <button name="submit">Log In</button>
                        </div>


                    </form:form>
                </div><!--loginpanelinner-->
            </div><!--loginpanel-->

            <div class="loginfooter">
                <p>Copyirght &copy; 2016 Carré, All rights reserved.</p>
            </div>

        </body>

    </html>
