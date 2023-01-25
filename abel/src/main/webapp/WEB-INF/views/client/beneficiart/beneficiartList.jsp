<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath"  value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
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
			                            <img src="${contextPath }/thumbnails?beneficiartFileName=${beneficiartDto.beneficiartFileName}" >
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
			                            <a class="read_more" href="cause_details.html">자세히 보기</a>
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


    <div data-scroll-index='1' class="make_donation_area section_padding">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-lg-6">
                    <div class="section_title text-center mb-55">
                        <h3><span>바로 후원하기</span></h3>
                    </div>
                </div>
            </div>
            <div class="row justify-content-center">
                <div class="col-lg-6">
                    <form action="#" class="donation_form">
                        <div class="row align-items-center">
                            <div class="col-md-4">
                                <div class="single_amount">
                                    <div class="input_field">
                                        <div class="input-group">
                                            <div class="input-group-prepend">
                                              <span class="input-group-text" id="basic-addon1">원</span>
                                            </div>
                                            <input type="text" class="form-control" placeholder="40,200" aria-label="Username" aria-describedby="basic-addon1">
                                          </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-8">
                                <div class="single_amount">
                                   <div class="fixed_donat d-flex align-items-center justify-content-between">
                                       <div class="select_prise">
                                           <h4>Select Amount:</h4>
                                       </div>
                                        <div class="single_doonate"> 
                                            <input type="radio" id="blns_1" name="radio-group" checked>
                                            <label for="blns_1">10</label>
                                        </div>
                                        <div class="single_doonate"> 
                                            <input type="radio" id="blns_2" name="radio-group" checked>
                                            <label for="blns_2">30</label>
                                        </div>
                                        <div class="single_doonate"> 
                                            <input type="radio" id="Other" name="radio-group" checked>
                                            <label for="Other">Other</label>
                                        </div>
                                   </div>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
            <div class="row">
                <div class="col-12">
                    <div class="donate_now_btn text-center">
                        <a href="#" class="boxed-btn4">후원하기</a>
                    </div>
                </div>

            </div>
        </div>
    </div>
</body>
</html>