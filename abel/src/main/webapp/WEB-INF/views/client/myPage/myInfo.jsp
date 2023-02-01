<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
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
	function removeMember(){
		if (confirm("정말로 탈퇴하시겠습니까?")) {
			location.href = "${contextPath}/myPage/removeMember?memberId=" + $("#memberId").val();
		}
	}
</script>
</head>
<body>



<!-- bradcam_area_start  -->
    <div class="bradcam_area breadcam_bg overlay d-flex align-items-center justify-content-center">
        <div class="container">
            <div class="row">
                <div class="col-xl-12">
                    <div class="bradcam_text text-center">
                        <h3>내 정보</h3>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- bradcam_area_end  -->
	<div class="section-top-border text-right">
					<a href="${contextPath }/myPage/mySponsorList"><button type="submit" id="design" class="genric-btn info circle">내 후원 목록</button></a>
					<div class="row">
	</div>
	</div>
	<!-- Start Align Area -->
	<div class="whole-wrap">
		<div class="container box_1170">
			<div class="section-top-border">
				<div class="row">
					<div class="col-lg-8 col-md-8">
						<h3 class="mb-30">내 정보 수정</h3>
						<form action="${contextPath }/myPage/modifyInfo" method="post" enctype="multipart/form-data" class="mt-10">
								<div class="mt-10">
									<p>아이디</p>
									<input type="text" id="memberId" name="memberId" value="${memberDto.memberId }" readonly
										required class="single-input">
								</div>
								<div class="mt-10">
									<p>비밀번호</p>
									<input type="password" name="memberPasswd" value="${memberDto.memberPasswd }" readonly  required class="single-input">
								</div>
								<div class="mt-10">
									<p>이름</p>
									<input type="text" name="memberNm" value="${memberDto.memberNm }"  required class="single-input">
								</div>
								<div class="mt-10">
									<p>생년월일</p>
									<input type="text" name="dateBirth" value="${memberDto.dateBirth }"
										required class="single-input">
								</div>
								<div class="mt-10 single_doonate">
									<p>성별</p>
	                                    <input class="form-control" type="radio"  id="m" name="sex" value="m" <c:if test="${memberDto.sex eq 'm'}">checked</c:if>> &emsp;
	                                    <label for="m">남</label>
	                                    <input class="form-control" type="radio"  id="f" name="sex" value="f" <c:if test="${memberDto.sex eq 'f'}">checked</c:if>> &emsp;
	                                    <label for="f">여</label>
	                            </div>
								<div class="mt-10">
									<p>이메일</p>
									<input type="text" name="email" value="${memberDto.email }"
										required class="single-input">
									<label for="emailstsYn">
                                        BMS에서 발송하는 E-mail을 수신합니다.
                                        <input type="checkbox" id="emailstsYn" name="emailstsYn" value="Y" <c:if test="${memberDto.emailstsYn eq 'Y'}">checked</c:if>>
                                        <span class="checkmark"></span>
                                    </label>
								</div>
								<div class="mt-10">
									<p>핸드폰 번호</p>
									<input type="text" name="hp" value="${memberDto.hp }"
										required class="single-input-primary">
									<label for="smsstsYn">
	                                        BMS에서 발송하는 SMS 소식을 수신합니다.
	                                        <input type="checkbox" id="smsstsYn" name="smsstsYn" value="Y" <c:if test="${memberDto.smsstsYn eq 'Y'}">checked</c:if>>
	                                        <span class="checkmark"></span>
                                    </label>	
								</div>
								<div class="mt-10">
								<p>주소</p>
								<input type="text" name="zipcode"  style="width: 20%;" value="${memberDto.zipcode }"
									onfocus="this.placeholder = ''"
									class="single-input-primary"> &emsp;
									<input type="button" id="design2" value="검색" onclick="execDaumPostcode();" style="width: 10%; padding-left: 0" class="genric-btn info radius">
								</div>
								<p>도로명 주소</p>
								<div class="mt-10">
									<input type="text" name="roadAddress" placeholder="도로명 주소를 입력하세요." value="${memberDto.roadAddress }"
										onfocus="this.placeholder = ''" onblur="this.placeholder = '도로명 주소를 입력하세요.'" required
										class="single-input-accent">
								</div>
								<p>지번</p>
								<div class="mt-10">
									<input type="text" name="jibunAddress" placeholder="지번주소를 입력하세요." value="${memberDto.jibunAddress }"
										onfocus="this.placeholder = ''" 
										required class="single-input-secondary">
								</div>
								<p>상세주소</p>
								<div class="mt-10">
									<input type="text" name="namujiAddress" placeholder="상세주소를 입력하세요." value="${memberDto.namujiAddress }"
										onfocus="this.placeholder = ''" onblur="this.placeholder = '상세주소를 입력하세요.'"
										required class="single-input-secondary">
								</div>
								<div>
									<button type="submit" id="design" class="genric-btn info circle">수정</button>
								</div>
								<div class="section-top-border text-right">
									<a href="javascript:removeMember();"><span class="genric-btn info circle">탈퇴</span></a>
									<div class="row">
								</div>
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