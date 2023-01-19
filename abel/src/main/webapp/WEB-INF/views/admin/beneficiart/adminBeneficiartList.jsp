<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"  />
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
                        <h3>후원관리</h3>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- bradcam_area_end  -->
	<div class="section-top-border text-right">
					<h3 class="mb-30"><a href="${contextPath }/admin/beneficiart/adminBeneficiartAdd">추가하기</a></h3>
					<div class="row">
					</div>
				</div>
    <!-- popular_causes_area_start  -->
    <div class="popular_causes_area pt-120">
        <div class="container">
            <div class="row">
	            
                <c:forEach var="beneficiartDto" items="${adminBeneficiartList }" varStatus="i">
	                <div class="col-lg-4 col-md-6">
	                    <div class="single_cause">
		                     <div class="thumb">
		                            <img src="${contextPath }/admin/beneficiart/thumbnails?beneficiartFileName=${beneficiartDto.beneficiartFileName}"  alt="">
		                        </div>
	                        <div class="causes_content">
	                            <div class="custom_progress_bar">
	                                <div class="progress">
	                                    <div class="progress-bar" role="progressbar" style="width: 30%;" aria-valuenow="30" aria-valuemin="0" aria-valuemax="100">
	                                        <span class="progres_count">
	                                            30%
	                                        </span>
	                                    </div>
	                                  </div>
	                            </div>
		                            <div class="balance d-flex justify-content-between align-items-center">
		                                <span>후원유형: 정기후원</span>
		                                <span>월: ${beneficiartDto.contribution }원</span>
		                            </div>
		                            <a href="cause_details.html"><h4>안녕하세요 저는 ${beneficiartDto.beneficiartNm }입니다.</h4></a>
		                            <p>저는 ${beneficiartDto.beneficiartCountry }에 사는 어린이에요.<br/>
		                               저는 ${beneficiartDto.beneficiartBirth }에 태어났습니다.</p>
		                            <a class="read_more" href="cause_details.html">자세히 보기</a>
		                        </div>
		                    </div>
		                </div>
                  </c:forEach>
	            </div>
        </div>
    </div>
    <!-- popular_causes_area_end  -->

</body>
</html>