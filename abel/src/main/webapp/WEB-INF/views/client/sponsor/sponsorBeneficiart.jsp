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
	
	$("[name='payMethod']").change(function(){
		
		var keyword = $("[name='payMethod']:checked").val();
		var setView = "";
		
		if (keyword == "phone") {
			
			setView = "핸드폰 번호 : ";
			setView += "<select>";
			setView += "<option value='010'>010</option>";
			setView += "<option value='017'>017</option>";
			setView += "<option value='018'>018</option>";
			setView += "<option value='019'>019</option>";
			setView += "</select> - " 
			setView += "<input type='text' size='10'> - "; 
			setView += "<input type='text' size='10'>"; 
			setView += "</select>"
		}
		else {
			setView = "카드번호 : <input type='text' size='10'> ";
			setView += "<input type='text' size='10'> ";
			setView += "<input type='text' size='10'> ";
			setView += "<input type='text' size='10'> ";
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
							<input type="hidden" name="memberId" value="${orderer.memberId}">
							<input type="hidden" name="beneficiartCd" value="${beneficiartDto.beneficiartCd }">
							<input type="hidden" name="point" value="${beneficiartDto.point}">
							<div class="mt-10">
								<p>후원자 이름</p>
								<input type="text" name="sponsorNm" placeholder="후원자 이름 입력하세요."
									onfocus="this.placeholder = ''"  required class="single-input">
							</div>
							<p>
								<input type="radio" name=payMethod value="card" checked > 신용카드	
								<input type="radio" name="payMethod" value="phone"> 휴대폰 결제
							</p>
							<div>
							<p id="target">
								<select id="hp1" >
									<option value="010">010</option>
									<option value="017">017</option>
									<option value="018">018</option>
									<option value="019">019</option>
								</select> - 
								<input type="text" size="10"> - 
								<input type="text" size="10">
							</p>
							</div>
							<div id="payHp" class="mt-10">
								<p>핸드폰 결제</p>
								<input type="text" name="payHp" placeholder="핸드폰 번호 입력하세요."
									onfocus="this.placeholder = ''" onblur="this.placeholder = 'Email address'" required
									class="single-input">
							</div>
							<div class="mt-10">
								<p>후원 메세지</p>
								<input type="text" name="sponsorShipMessage" placeholder="후원메세지입력하세요."
									onfocus="this.placeholder = ''"  required class="single-input">
							</div>
							<div>
								<button type="submit" id="design" class="genric-btn info circle">후원</button>
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