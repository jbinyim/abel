<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"  />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#design{background-color:#33cc99;}
</style>
</head>
<body>
<!-- bradcam_area_start  -->
    <div class="bradcam_area breadcam_bg overlay d-flex align-items-center justify-content-center">
        <div class="container">
            <div class="row">
                <div class="col-xl-12">
                    <div class="bradcam_text text-center">
                        <h3>수정하기</h3>
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
						<h3 class="mb-30">수혜자 수정</h3>
						<form action="${contextPath }/admin/beneficiart/adminBeneficiartDetail" method="post" enctype="multipart/form-data" class="mt-10">
							 <input type="hidden" name="beneficiartCd" value="${beneficiaratDto.beneficiartCd }">
								<div class="mt-10">
									<p>수혜자 이름</p>
									<input type="text" name="beneficiartNm" value="${beneficiaratDto.beneficiartNm }"
										required class="single-input">
								</div>
								<div class="mt-10">
									<p>수혜자 소개</p>
									<input type="text" name="beneficiartComment" value="${beneficiaratDto.beneficiartComment }"
										 required class="single-input">
								</div>
								<div class="mt-10">
									<p>후원금액</p>
									<input type="text" name="contribution" value="${beneficiaratDto.contribution }"
									 	required class="single-input">
								</div>
								<div class="mt-10">
									<p> 수혜자 생년월일</p>
									<input type="text" name="beneficiartBirth" placeholder="ex) 19991214"
										onfocus="this.placeholder = ''" onblur="this.placeholder = 'ex) 19991214'" required
										class="single-input">
								</div>
								<div class="mt-10 single_doonate">
									<p>수혜자 성별</p>
	                                    <input class="form-control" type="radio"  id="m" name="beneficiartSex" value="m"> &emsp;
	                                    <label for="m">남</label>
	                                    <input class="form-control" type="radio"  id="f" name="beneficiartSex" value="f"> &emsp;
	                                    <label for="f">여</label>
	                            </div>
								<div class="mt-10">
									<p>수혜자 취미</p>
									<input type="text" name="beneficiartHobby" placeholder="수혜자 취미"
										onfocus="this.placeholder = ''" onblur="this.placeholder = '수혜자 취미'" required
										class="single-input">
								</div>
								<div class="mt-10">
									<p>수헤자 가족</p>
									<input type="text" name="beneficiartFamily" placeholder="수헤자 가족" 
										onfocus="this.placeholder = ''" onblur="this.placeholder = '수헤자 가족'" required
										class="single-input-primary"> &emsp;
								</div>
								<div class="mt-10">
									<p>수헤자 국가</p>
									<input type="text" name="beneficiartCountry" placeholder="수헤자 국가."
										onfocus="this.placeholder = ''" onblur="this.placeholder = '수헤자 국가.'" required
										class="single-input-accent">
								</div>
								<div class="mt-10">
									<p>수헤자 사진</p>
									<input type="file" name="beneficiartFileName" placeholder="수헤자 사진."
										onfocus="this.placeholder = ''" onblur="this.placeholder = '수헤자 사진.'"
										required class="single-input-secondary">
								</div>
								<div>
									<button type="submit" id="design" class="genric-btn info circle">등록</button>
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