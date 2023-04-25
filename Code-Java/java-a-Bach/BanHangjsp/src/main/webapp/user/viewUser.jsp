<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String name = request.getParameter("name");
	String password = request.getParameter("password");
	String phone = request.getParameter("phone");
	String about = request.getParameter("about");
	String favorite1 = request.getParameter("favorite1");
	String favorite2 = request.getParameter("favorite2");
	
	String fav = "";
	if(favorite1 != null){
		fav += favorite1+" and ";
	}
	if(favorite2 != null){
		fav += favorite2;
	}
%>
<table>
	<tr>
		<td>Ten</td>
		<td><%= name %>
	</tr>
	<tr>
		<td>Mat khau</td>
		<td><%= password %>
	</tr>
	<tr>
		<td>Dien thoai</td>
		<td><%= phone %>
	</tr>
	<tr>
		<td>Gioi thieu</td>
		<td><%= about %>
	</tr>
	<tr>
		<td>So thich</td>
		<td><%= fav %>
	</tr>
</table>


</body>
</html>