<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>Login page</h2>
	
	<h3>${message}</h3>
	
	<form action="validate" method="post">
	UserName :<input type="text" name="uname" id="uname" value="uname">
	password :<input type="password" name="pass" id="pass" value="pass">
	 <button type="submit"> Login</button>
	</form>
</body>
</html>