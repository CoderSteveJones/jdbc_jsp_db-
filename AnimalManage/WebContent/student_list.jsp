<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>学生列表</h1>
	<table border="1" width="500">
		<tr>
			<td>学生编号</td>
			<td>姓名</td>
			<td>年龄</td>
			<td>住址</td>
		</tr>
		<c:forEach items="${list}" var="stu">
			<tr>
			<td>${stu.id}</td>
			<td>${stu.name}</td>
			<td>${stu.age}</td>
			<td>${stu.address}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>