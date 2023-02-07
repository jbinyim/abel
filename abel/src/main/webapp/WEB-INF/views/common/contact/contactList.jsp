<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath"  value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>

	function removeContact() {
		
		
		var contactCdList = "";
		if (confirm("정말로 삭제하시겠습니까?")) {
			
			$("[name='contactCd']:checked").each(function(){
				contactCdList += $(this).val() + ",";
			});
			
			if (contactCdList == "") {
				alert("삭제할 내역이 없습니다.");
				return;
			}
			
			location.href = "${contextPath}/removeContact?contactCdList="+contactCdList;
		}
		
	}

	function selectAllContact() {
		if ($("#changeAllChoice").prop("checked")) {
			$("[name='contactCd']").prop("checked" , true);
		}
		else {
			$("[name='contactCd']").prop("checked" , false);
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
                        <h3>관리자 고객센터</h3>
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

	<!-- Start Align Area -->
	<div class="whole-wrap">
		<div class="container box_1170">
			<div class="section-top-border">
				<h3 class="mb-30">문의사항</h3>
				<div class="progress-table-wrap">
				<h6><input type="checkbox" id="changeAllChoice" onchange="selectAllContact()"> &nbsp;전체선택</h6>
					<div class="progress-table">
						<div class="table-head">
							<div class="serial"></div>
							<div class="country">제목 / 작성자</div>
							<div class="visit">메일</div>
							<div class="percentage">작성일</div>
						</div>
						<c:choose>
							<c:when test="${empty contactList }">
								<div class="country">문의사항이 없습니다.</div>
							</c:when>
							<c:otherwise>
								<c:forEach var="commonDto" items="${contactList }">
									<div class="table-row">
										<div class="serial"><input type="checkbox" name="contactCd" value="${commonDto.contactCd }"></div>
										<div class="country"><a href="${contextPath }/contactDetail?contactCd=${commonDto.contactCd}">${commonDto.content} / ${commonDto.name } </a></div>
										<div class="visit">${commonDto.email }</div>
										<div class="percentage">${commonDto.regDt }</div>
									</div>
								</c:forEach>
							</c:otherwise>
						</c:choose>
						<div>
							<a href="javascript:removeContact();"><button type="submit" class="genric-btn info circle">삭제하기</button></a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- End Align Area -->

</body>
</html>