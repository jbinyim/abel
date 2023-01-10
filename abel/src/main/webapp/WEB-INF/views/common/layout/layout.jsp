<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath"  value="${pageContext.request.contextPath}" />
<!doctype html>
<html class="no-js" lang="zxx">

<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title><tiles:insertAttribute name="title" /></title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- <link rel="manifest" href="site.webmanifest"> -->
    <link rel="shortcut icon" type="image/x-icon" href="${contextPath }/resources/bootstrap/img/favicon.png">
    <!-- Place favicon.ico in the root directory -->

    <!-- CSS here -->
    <link rel="stylesheet" href="${contextPath }/resources/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${contextPath }/resources/bootstrap/css/owl.carousel.min.css">
    <link rel="stylesheet" href="${contextPath }/resources/bootstrap/css/magnific-popup.css">
    <link rel="stylesheet" href="${contextPath }/resources/bootstrap/css/font-awesome.min.css">
    <link rel="stylesheet" href="${contextPath }/resources/bootstrap/css/themify-icons.css">
    <link rel="stylesheet" href="${contextPath }/resources/bootstrap/css/nice-select.css">
    <link rel="stylesheet" href="${contextPath }/resources/bootstrap/css/flaticon.css">
    <link rel="stylesheet" href="${contextPath }/resources/bootstrap/css/gijgo.css">
    <link rel="stylesheet" href="${contextPath }/resources/bootstrap/css/animate.css">
    <link rel="stylesheet" href="${contextPath }/resources/bootstrap/css/slicknav.css">
    <link rel="stylesheet" href="${contextPath }/resources/bootstrap/css/style.css">
    <script src="${contextPath }/resources/bootstrap/js/vendor/jquery-1.12.4.min.js"></script>
    <!-- <link rel="stylesheet" href="css/responsive.css"> -->
</head>

<body>
    <!--[if lte IE 9]>
            <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="https://browsehappy.com/">upgrade your browser</a> to improve your experience and security.</p>
        <![endif]-->


    <!-- header-start -->
    <tiles:insertAttribute name="header" />
    <!-- header-end -->

    <tiles:insertAttribute name="body" />

    <!-- footer_start  -->
   <tiles:insertAttribute name="footer" />
    <!-- footer_end  -->

    <!-- link that opens popup -->

    <!-- JS here -->
    <script src="${contextPath }/resources/bootstrap/js/vendor/modernizr-3.5.0.min.js"></script>
    <script src="${contextPath }/resources/bootstrap/js/popper.min.js"></script>
    <script src="${contextPath }/resources/bootstrap/js/bootstrap.min.js"></script>
    <script src="${contextPath }/resources/bootstrap/js/owl.carousel.min.js"></script>
    <script src="${contextPath }/resources/bootstrap/js/isotope.pkgd.min.js"></script>
    <script src="${contextPath }/resources/bootstrap/js/ajax-form.js"></script>
    <script src="${contextPath }/resources/bootstrap/js/waypoints.min.js"></script>
    <script src="${contextPath }/resources/bootstrap/js/jquery.counterup.min.js"></script>
    <script src="${contextPath }/resources/bootstrap/js/imagesloaded.pkgd.min.js"></script>
    <script src="${contextPath }/resources/bootstrap/js/scrollIt.js"></script>
    <script src="${contextPath }/resources/bootstrap/js/jquery.scrollUp.min.js"></script>
    <script src="${contextPath }/resources/bootstrap/js/wow.min.js"></script>
    <script src="${contextPath }/resources/bootstrap/js/nice-select.min.js"></script>
    <script src="${contextPath }/resources/bootstrap/js/jquery.slicknav.min.js"></script>
    <script src="${contextPath }/resources/bootstrap/js/jquery.magnific-popup.min.js"></script>
    <script src="${contextPath }/resources/bootstrap/js/plugins.js"></script>
    <script src="${contextPath }/resources/bootstrap/js/gijgo.min.js"></script>
    <!--contact js-->
    <script src="${contextPath }/resources/bootstrap/js/contact.js"></script>
    <script src="${contextPath }/resources/bootstrap/js/jquery.ajaxchimp.min.js"></script>
    <script src="${contextPath }/resources/bootstrap/js/jquery.form.js"></script>
    <script src="${contextPath }/resources/bootstrap/js/jquery.validate.min.js"></script>
    <script src="${contextPath }/resources/bootstrap/js/mail-script.js"></script>

    <script src="${contextPath }/resources/bootstrap/js/main.js"></script>
</body>

</html>