<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EL JSTL JSP</title>
</head>
<body>
	<h1>Hello world</h1>
	<%
		int x = 4;
		int y = 3;
		int z = x+y;
		request.setAttribute("newT", z);
		
	%>
	<h3><%  out.println(z);%></h3>
	<h3><%= z%></h3>
	<h3>${requestScope.newT}</h3>
	
</body>
</html>