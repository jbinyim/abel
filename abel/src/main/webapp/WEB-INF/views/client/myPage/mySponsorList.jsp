<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
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
                        <h3>내 후원목록</h3>
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
				<h3 class="mb-30">Left Aligned</h3>
				<div class="row">
					<div class="col-md-3">
						<img src="${contextPath }/admin/beneficiart/thumbnails?beneficiartFileName=${beneficiartDto.beneficiartFileName}"  class="img-fluid">
					</div>
					<div class="col-md-9 mt-sm-20">
						<p></p>
					</div>
				</div>
			</div>
		</div>
	</div>
	

	<!-- Start Align Area -->
	<div class="whole-wrap">
		<div class="container box_1170">
			<div class="section-top-border">
				<h3 class="mb-30">후원목록</h3>
				<div class="progress-table-wrap">
					<div class="progress-table">
						<div class="table-head">
							<div class="serial">번호</div>
							<div class="country">후원정보</div>
							<div class="visit">후원금</div>
							<div class="percentage">후원 방법</div>
						</div>
						<c:choose>
							<c:when test="${empty mySponsorList }">
								<div class="country">조회된 수혜자가 없습니다.</div>
							</c:when>
							<c:otherwise>
								<c:forEach var="mySponsor" items="${mySponsorList }" varStatus="i">
									<div class="table-row">
										<div class="serial"><img src="${contextPath }/admin/beneficiart/thumbnails?beneficiartFileName=${beneficiartDto.beneficiartFileName}"  class="img-fluid"></div>
										<div class="country"><a href="${contextPath }/beneficiart/beneficiartMore?beneficiartCd=${beneficiartDto.beneficiartCd }">
																		${mySponsor.beneficiartNm } // ${mySponsor.sponsorShipMessage }</a></div>
										<div class="visit">${mySponsor.contribution - mySponsor.contribution * mySponsor.discountRate}원</div>
										<div class="percentage">${mySponsor.paymentMethod }</div>
									</div>
								</c:forEach>
							</c:otherwise>
						</c:choose>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- End Align Area -->

</body>
</html>