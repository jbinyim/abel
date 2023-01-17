<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"  />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#style{background-color:#33cc99;}
</style>
<script>

</script>
</head>
<body>
<!-- bradcam_area_start  -->
    <div class="bradcam_area breadcam_bg overlay d-flex align-items-center justify-content-center">
        <div class="container">
            <div class="row">
                <div class="col-xl-12">
                    <div class="bradcam_text text-center">
                        <h3>관리자 로그인</h3>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- bradcam_area_end  -->

	<!-- Start Align Area -->
	<div class="whole-wrap">
		<div class="container box_1170">
			<div class="section-top-border">
				<div class="row">
					<div class="col-md-3">
						<img src="img/elements/d.jpg" alt="" class="img-fluid">
					</div>
				</div>
			</div>
			<div class="section-top-border">
				<div class="row">
					<div class="col-lg-8 col-md-8">
						<h3 class="mb-30">로그인</h3>
						<form action="${contextPath }/admin/member/adminLogin" method="post">
							<div class="mt-10">
								<p>아이디</p>
								<input type="text" name="memberId" placeholder="아이디를 입력하세요."
									onfocus="this.placeholder = ''" onblur="this.placeholder = '아이디를 입력하세요.'" required
									class="single-input">
							</div>
							<div class="mt-10">
								<p>비밀번호</p>
								<input type="password" name="memberPasswd" placeholder="비밀번호를 입력하세요."
									onfocus="this.placeholder = ''" onblur="this.placeholder = '비밀번호를 입력하세요.'" required
									class="single-input">
							</div>
							<div>
							<button type="submit" id="style" class="genric-btn info circle">로그인</button>
							</div>
						</form>
					</div>

				</div>
			</div>
		</div>
	</div>
	<!-- End Align Area -->

</body>
</html>