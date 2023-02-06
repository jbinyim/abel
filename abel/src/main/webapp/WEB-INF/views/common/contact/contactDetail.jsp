<%@ page language="java" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath"  value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- bradcam_area_start  -->
    <div class="bradcam_area breadcam_bg overlay d-flex align-items-center justify-content-center">
        <div class="container">
            <div class="row">
                <div class="col-xl-12">
                    <div class="bradcam_text text-center">
                        <h3>문의 상세</h3>
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
					<div class="col-lg-8 col-md-8">
							<div class="mt-10">
								<p>문의자 성함</p>
								<input type="text" name="adminId" value="${commonDto.name }" disabled
									onfocus="this.placeholder = ''"  required
									class="single-input">
							</div>
							<div class="mt-10">
								<p>문의자 이메일</p>
								<input type="text" name="adminId" value="${commonDto.email }" disabled
									onfocus="this.placeholder = ''"  required
									class="single-input">
							</div>
							<div class="mt-10">
								<p>제목</p>
								<input type="text" name="adminId" value="${commonDto.subject }" disabled
									onfocus="this.placeholder = ''"  required
									class="single-input">
							</div>
							<div class="mt-10">
								<p>상세 내용</p>
								<input type="text" name="adminId" value="${commonDto.content }" disabled
									onfocus="this.placeholder = ''"  required
									class="single-input">
							</div>
					</div>

				</div>
			</div>
		</div>
	</div>
	<!-- End Align Area -->
</body>
</html>