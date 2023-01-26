<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath"  value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<style>
	.single-input-primary{display: inline;}
	#design{background-color:#33cc99;}
	#design2{background-color:#33cc99; margin:0 auto;}
</style>
</head>
<body>

    <!-- bradcam_area_start  -->
    <div class="bradcam_area breadcam_bg overlay d-flex align-items-center justify-content-center">
        <div class="container">
            <div class="row">
                <div class="col-xl-12">
                    <div class="bradcam_text text-center">
                        <h3>1:1 어린이 후원</h3>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- bradcam_area_end  -->
    
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
						<form action="${contextPath }/beneficiart/searchBeneficiart" method="get">
							<div class="mt-10">
								<h4>* 검색하기</h4>
								<input type="text" name="word" placeholder="검색어를 입력하세요."
									onfocus="this.placeholder = ''" onblur="this.placeholder = '검색어를 입력하세요.'" required
									class="single-input">
									<input type="hidden" name="method" value="search">
									<input type="submit" id="design2" value="검색" onclick="execDaumPostcode();" style="width: 10%; padding-left: 0" class="genric-btn info radius">
							</div>
						</form>
					</div>

				</div>
			</div>
		</div>
	</div>

    <!-- popular_causes_area_start  -->
    <div class="popular_causes_area pt-120">
        <div class="container">
            <div class="row">
            <c:choose>
            	<c:when test="${empty beneficiartList}">
                   <div class="product__item">
           			<h3>등록된 상품이 없습니다.</h3>
                   </div>
           		</c:when>
           		<c:otherwise>
		            	<c:forEach var="beneficiartDto" items="${beneficiartList }" varStatus="i">
			                <div class="col-lg-4 col-md-6">
			                    <div class="single_cause">
			                        <div class="thumb">
			                            <img src="${contextPath }/admin/beneficiart/thumbnails?beneficiartFileName=${beneficiartDto.beneficiartFileName}" >
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
			                            <a href="cause_details.html"><h4>안녕하세요 저는 ${beneficiartDto.beneficiartNm }입니다.</h4></a>
		                            	<p>저는 ${beneficiartDto.beneficiartCountry }에 사는 어린이에요.<br/>
		                              	   저는 ${beneficiartDto.beneficiartBirth }에 태어났습니다.</p>
			                            <a class="read_more" href="${contextPath }/beneficiart/beneficiartMore?beneficiartCd=${beneficiartDto.beneficiartCd}">자세히 보기</a>
			                        </div>
			                    </div>
			                </div>
		                </c:forEach>
	                </c:otherwise>
                </c:choose>
            </div>
        </div>
    </div>
    <!-- popular_causes_area_end  -->


</body>
</html>