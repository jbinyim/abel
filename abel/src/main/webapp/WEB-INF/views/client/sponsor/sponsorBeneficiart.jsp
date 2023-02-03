<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
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
<script>

$(function(){
	
	$("[name='paymentMethod']").change(function(){
		
		var keyword = $("[name='paymentMethod']:checked").val();
		var setView = "";
		
		if (keyword == "phone") {
			
			setView = "핸드폰 번호 : ";
			setView += "<input type='text' size='20' name='payHp' placeholder='- 를 뺴고 입력해주세요.'>"; 
		}
		else {
			
			setView += "카드회사";
			setView += "<select name='cardCompany'>";
			setView += "<option value='삼성'>삼성</option>";
			setView += "<option value='하나SK'>하나SK</option>";
			setView += "<option value='현대'>현대</option>";
			setView += "<option value='KB'>KB</option>";
			setView += "<option value='신한'>신한</option>";
			setView += "<option value='롯데'>롯데</option>";
			setView += "<option value='BC'>BC</option>";
			setView += "<option value='시티'>시티</option>";
			setView += "<option value='NH농협'>NH농협</option>";
			setView += "</select>"
		}
		$("#target").html(setView);
		
	});
	
	
});

</script>
</head>
<body>
<!-- bradcam_area_start  -->
    <div class="bradcam_area breadcam_bg overlay d-flex align-items-center justify-content-center">
        <div class="container">
            <div class="row">
                <div class="col-xl-12">
                    <div class="bradcam_text text-center">
                        <h3>후원하기</h3>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- bradcam_area_end  -->

	<!-- Start Sample Area -->
	<!-- End Sample Area -->

	<!-- Start Button -->
	<!-- End Button -->
	
	<div class="whole-wrap">
		<div class="container box_1170">
			<div class="section-top-border">
				<h3 class="mb-30">어린이 정보</h3>
				<div class="row">
					<div class="col-md-3">
						<img src="${contextPath }/admin/beneficiart/thumbnails?beneficiartFileName=${beneficiartDto.beneficiartFileName}"  class="img-fluid">
					</div>
					<div class="col-md-9 mt-sm-20">
						<p><h4>${beneficiartDto.beneficiartNm }</h4>
							   ${beneficiartDto.beneficiartBirth } &nbsp; // ${beneficiartDto.beneficiartCountry } &nbsp; // ${beneficiartDto. beneficiartSex}</p>
						<p>후원유형: 정기후원</p>	  
						<p>월: ${beneficiartDto.contribution }원</p> 
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Start Align Area -->
	<div class="whole-wrap">
		<div class="container box_1170">
			<div class="section-top-border">
				<div class="row">
					<div class="col-lg-8 col-md-8">
						<h3 class="mb-30">후원 상세</h3>
						<form action="${contextPath }/sponsor/sponsorBeneficiart" method="post">
							<input type="hidden" name="memberId" value="${sponsor.memberId}">
							<input type="hidden" name="beneficiartCd" value="${beneficiartDto.beneficiartCd }">
							<input type="hidden" name="point" value="${beneficiartDto.point}">
							<div class="mt-10">
								<p>후원자 이름</p>
								<input type="text" name="sponsorNm" placeholder="후원자 이름 입력하세요."
									onfocus="this.placeholder = ''"  required class="single-input">
							</div>
							<div class="mt-10 single_doonate">
								<p>결제 방법</p>
                                    <input class="form-control" type="radio"  id="card" name="paymentMethod" value="card" > &emsp;
                                    <label for="card">카드결제</label>
                                    <input class="form-control" type="radio" id="phone" name="paymentMethod" value="phone"> 
                                    <label for="phone">핸드폰결제</label>
                            </div>
							<div>
							<p id="target">
								<input type="text" name="payHp">
							</p>
							</div>
							<div class="mt-10">
								<p>후원 메세지</p>
								<input type="text" name="sponsorShipMessage" placeholder="후원메세지입력하세요."
									onfocus="this.placeholder = ''"  required class="single-input">
							</div>
							<div class="mt-10">
								<p>수혜자 이름</p>
								<input type="text" name="beneficiartNm" value="${beneficiartDto.beneficiartNm }" readonly
									onfocus="this.placeholder = ''"  required class="single-input">
							</div>
							<div class="mt-10">
								<p>후원금</p>
								<input type="text" name="sponsorAmount" value="${beneficiartDto.contribution }"  readonly
									onfocus="this.placeholder = ''"   required class="single-input">
							</div>
							
							<div>
								<button type="submit" id="design" class="genric-btn info circle">후원하기</button>
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