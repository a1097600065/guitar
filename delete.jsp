<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Delete</title>
</head>
<body>
<form action="http://localhost:8080/GuitarSearch/DelServlet" method="get">
输入要删除的吉他ID：
<input type="text" name="id" />
<input type="submit" value="删除"/>
</form>
</body>
</html>
