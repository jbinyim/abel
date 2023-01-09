<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"  />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>

$().ready(function() {
	
	$("#btnOverlapped").click(function(){
		
	    var memberId = $("#memberId").val();
	   
	    if (memberId == ''){
	   		alert("ID를 입력하세요");
	   		return;
	    }
	   
	    $.ajax({
	       type : "get",
	       url  : "${contextPath}/member/checkDuplicatedId?memberId=" + memberId,
	       success : function (data){
	          if (data == "duplicate"){
				  alert("사용할 수 있는 ID입니다.");
	          }
	          else {
	          	  alert("사용할 수 없는 ID입니다.");
	          }
	       }
	    });
	    
	 });	

</script>
</head>
<body>
	
	<form action="${contextPath }/member/register" method="post">
		<h3>회원가입</h3>
		<table border="1">
			<tr>
				<td>아이디</td>
				<td>
					<input type="text" name="memberId" maxlength="15" placeholder="아이디를 입력하세요" />&emsp;
					<input type="button" id="btnOverlapped" value="중복확인" />
				</td>
			</tr>
		</table>	
	</form>

</body>
</html>