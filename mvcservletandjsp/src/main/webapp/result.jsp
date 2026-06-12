<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Average</title>
</head>
<body>
<%
int result=(Integer) request.getAttribute("result");
out.println("Average of two number is : "+ result);

%>
</body>
</html>