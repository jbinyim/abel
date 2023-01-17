<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"  />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.single-input-primary{display: inline;}
	#design{background-color:#33cc99;}
	#design2{background-color:#33cc99; margin:0 auto;}
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
                        <h3>Register</h3>
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
						<h3 class="mb-30">회원가입</h3>
						<form action="#">
							<div class="mt-10">
								<p>아이디</p>
								<input type="text" name="memberId" placeholder="아이디를 입력하세요."
									onfocus="this.placeholder = ''" onblur="this.placeholder = '아이디를 입력하세요.'" required
									class="single-input">
							</div>
							<div class="mt-10">
								<p>비밀번호</p>
								<input type="text" name="memberPasswd" placeholder="비밀번호를 입력하세요."
									onfocus="this.placeholder = ''" onblur="this.placeholder = '비밀번호를 입력하세요.'" required
									class="single-input">
							</div>
							<div class="mt-10">
								<p>이름</p>
								<input type="text" name="memberNm" placeholder="이름을 입력하세요."
									onfocus="this.placeholder = ''" onblur="this.placeholder = '이름을 입력하세요.'" required
									class="single-input">
							</div>
							<div class="mt-10">
								<p>이메일</p>
								<input type="email" name="email" placeholder="이메일을 입력하세요."
									onfocus="this.placeholder = ''" onblur="this.placeholder = '이메일을 입력하세요.'" required
									class="single-input">
								<label for="emailstsYn">
                                       patron에서 발송하는 E-mail을 수신합니다.
                                       <input type="checkbox" id="emailstsYn" name="emailstsYn" value="Y">
                                       <span class="checkmark"></span>
                                </label>
							</div>
							<div class="mt-10">
								<p>생년월일</p>
								<input type="text" name="dateBirth" placeholder="생년월일 ex) 19991214"
									onfocus="this.placeholder = ''" onblur="this.placeholder = '생년월일 ex) 19991214'" required
									class="single-input">
							</div>
							<div class="mt-10 single_doonate">
								<p>성별</p>
                                    <input class="form-control" type="radio"  id="m" name="sex" value="m"> &emsp;
                                    <label for="m">남</label>
                                    <input class="form-control" type="radio"  id="f" name="sex" value="f"> &emsp;
                                    <label for="f">여</label>
                            </div>
							<div class="mt-10">
								<p>핸드폰 번호</p>
								<input type="text" name="hp" placeholder="-를 제외하고 적어주세요."
									onfocus="this.placeholder = ''" onblur="this.placeholder = '-를 제외하고 적어주세요.'" required
									class="single-input">
									<label for="smsstsYn">
	                                        patron에서 발송하는 SMS 소식을 수신합니다.
	                                        <input type="checkbox" id="smsstsYn" name="smsstsYn" value="Y">
	                                        <span class="checkmark"></span>
	                                </label>
							</div>
							<div class="mt-10">
								<p>주소</p>
								<input type="text" name="zipcode" placeholder="우편번호" style="width: 20%;"
									onfocus="this.placeholder = ''" onblur="this.placeholder = '우편번호'" required
									class="single-input-primary"> &emsp;
									<input type="button" id="design2" value="검색" onclick="execDaumPostcode();" style="width: 10%; padding-left: 0" class="genric-btn info radius">
							</div>
							<div class="mt-10">
								<input type="text" name="roadAddress" placeholder="도로명 주소를 입력하세요."
									onfocus="this.placeholder = ''" onblur="this.placeholder = '도로명 주소를 입력하세요.'" required
									class="single-input-accent">
							</div>
							<div class="mt-10">
								<input type="text" name="namujiAddress" placeholder="상세주소를 입력하세요."
									onfocus="this.placeholder = ''" onblur="this.placeholder = '상세주소를 입력하세요.'"
									required class="single-input-secondary">
							</div>
							<div>
								<button type="submit" id="design" class="genric-btn info circle">회원가입</button>
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