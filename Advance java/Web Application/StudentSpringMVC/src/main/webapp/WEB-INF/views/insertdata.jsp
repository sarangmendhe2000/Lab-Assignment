<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="addStudent" method="post">
	Student Id : <input type="text" name="sid" id="sid">
	Student Name : <input type="text" name="sname" id="sname">
	Student Address : <input type="text" name="addr" id="addr">
	Student Email : <input type="email" name="email" id="email">
	Student DoB : <input type="date" name="date" id="date">
	
	<button type="submit">Add Product</button>
	</form>
</body>
</html>