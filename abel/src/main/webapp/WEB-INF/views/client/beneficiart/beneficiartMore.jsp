<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath"  value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>

function processToCart(beneficiartCd) {
	
	if ("${memberId == null}" == "true") {
		alert("로그인을 진행해주세요.");
		location.href = "${contextPath }/member/login";
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
                        <h3>어린이 정보</h3>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- bradcam_area_end  -->

    <!-- popular_causes_area_start  -->
    <div class="popular_causes_area pt-120 cause_details ">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 col-md-12">
                    <div class="single_cause">
                        <div class="thumb">
                            <img src="${contextPath }/admin/beneficiart/thumbnails?beneficiartFileName=${beneficiartDto.beneficiartFileName}">
                        </div>
                        <div class="causes_content">
                            <div class="custom_progress_bar">
                                <div class="progress">
                                    <div class="progress-bar" role="progressbar" style="width: 30%;" aria-valuenow="30" aria-valuemin="0" aria-valuemax="100">
                                    </div>
                                  </div>
                            </div>
                            <div class="balance d-flex justify-content-between align-items-center">
                                <span>후원유형: 정기후원</span>
                                <span>월: ${beneficiartDto.contribution }원</span>
                            </div>
                            <h4>안녕하세요 저는 ${beneficiartDto.beneficiartNm }입니다.</h4>
                            <p>어린이 번호 : ${beneficiartDto. beneficiartCd}</p>
                            <p>* ${beneficiartDto. beneficiartBirth}에 태어났어요.</p>
                            <p>* 성별 : ${beneficiartDto. beneficiartSex}</p>
                            <p>* 저는 ${beneficiartDto. beneficiartHobby}를 좋아해요.</p>
                            <p>* 저는 ${beneficiartDto. beneficiartFamily}와 함께 살고있어요.</p>
                            <p>* 저는 ${beneficiartDto. beneficiartCountry}에서 살고있어요.</p>
                            <p>* ${beneficiartDto. beneficiartComment}</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- popular_causes_area_end  -->


    <div class="make_donation_area section_padding">
        <div class="container">
            <div class="row justify-content-center">
            </div>
            <div class="row justify-content-center">
                <div class="col-lg-6">
                    <form action="#" class="donation_form">
                        <div class="row align-items-center">
                        </div>
                    </form>
                </div>
            </div>
            <div class="row">
                <div class="col-12">
                    <div class="donate_now_btn text-center">
                        <a href="${contextPath }/sponsor/sponsorBeneficiart?beneficiartCd=${beneficiartDto.beneficiartCd}" class="boxed-btn4" onclick="processToCart">바로 후원하기</a>
                    </div>
                </div>

            </div>
        </div>
    </div>
    
    <div class="popular_causes_area pt-120 cause_details ">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 col-md-12">
                    <div class="single_cause">
                    	<div class="causes_content">
                    		<h4>우리 ${beneficiartDto.beneficiartNm }은(는) 후원자님을 만나면 어떤 지원을 받나요?</h4>
                    	</div>
                    </div>
                </div>
            </div>
         </div>
   	</div>
    
</body>
</html>