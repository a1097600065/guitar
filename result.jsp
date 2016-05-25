<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Iresult</title>
</head>
<body>
<table>
<center>
<tr>查询结果</tr>
<tr>
	<td>编号</td>
	<td>型号</td>
	<td>生产</td>
	<td>类型</td>
	<td>木质</td>
</tr>

<c:forEach items="${requestScope.list}" var="p">
	<tr>
	<td>${p.id}</td>
	<td>${p.model}</td>
	<td>${p.builder}</td>
	<td>${p.type}</td>
	<td>${p.wood}</td>
	
	</tr>

</c:forEach>



</center>
</table>

</body>
</html>
