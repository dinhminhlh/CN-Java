<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Them nguoi dung moi</h1>
<form action="/BanHangjsp/user/viewUser.jsp" method = "post">
	<input name = "name" type = "text" placeholder="Ten nguoi dung"> <br> <br>
	<input name = "password" type = "password" placeholder="Mat khau"><br><br>
	<input name = "phone" type = "text" placeholder="Dien thoai"><br><br>
	<textarea rows="25" cols="25" name = "about" placeholder="Gioi thieu"></textarea>
	<input name = "favorite1" type = "checkbox" value = "xem phim"> Xem phim
	<input name = "favorite2" type = "checkbox" value = "nghe nhac"> Nghe nhac
	
	<input type = "submit" value="Them">
</form>
</body>
</html>