<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
<meta charset="UTF-8">
<title>JPQL - Name Like</title>
</head>
<body>
	<h1>JPQL - Name Like</h1>
	총 페이지 수 : ${totalRecord }<br>
	현재 페이지 : ${nowPage }<br>
	<c:forEach items="${members }" var="m">
		아이디 : ${m.id }<br>
		이름 : ${m.name }<br>
		이메일 : ${m.email }<br>
		<hr>
	</c:forEach>
</body>
</html>