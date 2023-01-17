<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath"  value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<header>
        <div class="header-area ">
            <div class="header-top_area">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-xl-6 col-md-12 col-lg-8">
                            <div class="short_contact_list">
                                <ul>
                                    <li><a href="#"> <i class="fa fa-phone"></i> +1 (454) 556-5656</a></li>
                                    <li><a href="#"> <i class="fa fa-envelope"></i>Yourmail@gmail.com</a></li>
                                </ul>
                            </div>
                        </div>
                        <div class="col-xl-6 col-md-6 col-lg-4">
                            <div class="social_media_links d-none d-lg-block">
                           		<c:choose>
                           			<c:when test="${sessionScope.memberId eq null}">
		                                <a href="${contextPath }/member/login">
		                                    <i>login</i>
		                                </a>
		                                <a href="${contextPath }/member/register">
		                                    <i>register</i>
		                                </a>
		                            </c:when>
		                            <c:otherwise>
		                                <a href="${contextPath }/member/logout">
		                                    <i>로그아웃</i>
		                                </a>
		                                <a href="#">
		                                    <i>회원정보 수정</i>
		                                </a>
		                            </c:otherwise>
                                </c:choose>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div id="sticky-header" class="main-header-area">
                <div class="container-fluid">
                    <div class="row align-items-center">
                        <div class="col-xl-3 col-lg-3">
                            <div class="logo">
                                <a href="${contextPath }/main">
                                    <img src="${contextPath }/resources/bootstrap/img/logo.png" alt="">
                                </a>
                            </div>
                        </div>
                        <div class="col-xl-9 col-lg-9">
                            <div class="main-menu">
                                <nav>
                                    <ul id="navigation">
                                        <li><a href="index.html">소식</a></li>
                                        <li><a href="About.html">후기</a></li>
                                        <li><a href="#">맞춤후원 <i class="ti-angle-down"></i></a>
                                            <ul class="submenu">
                                                <li><a href="${contextPath }/beneficiart/beneficiartList">기념일 후원</a></li>
                                                <li><a href="single-blog.html">주제별 후원</a></li>
                                            </ul>
                                        </li>
                                        <li><a href="#">어린이후원 <i class="ti-angle-down"></i></a>
                                            <ul class="submenu">
                                                <li><a href="elements.html">함께후원</a></li>
                                                <li><a href="${contextPath }/beneficiart/beneficiartList">1:1 어린이후원</a></li>
                                            </ul>
                                        </li>
                                        <li><a href="contact.html">소개</a></li>
                                    </ul>
                                </nav>
                                <div class="Appointment">
                                    <div class="book_btn d-none d-lg-block">
                                        <a data-scroll-nav='1' href="#">바로 후원하기</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-12">
                            <div class="mobile_menu d-block d-lg-none"></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </header>


</body>
</html>