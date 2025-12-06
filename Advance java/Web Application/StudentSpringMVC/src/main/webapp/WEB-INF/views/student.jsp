<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<h1>Hello</h1>
		<h1>${message}</h1>
		
		<table border="2">
		<thead>
			<tr>
			
			<th>ID</th>
			<th>Name</th>
			<th>Email</th>
			<th>Address</th>
			<th>Date Of Birth</th>
			<th>Action</th>
			
			</tr>
		
		</thead>
		
		<tbody>
		
		<c:forEach var="stud" items="${slist}" >
		
		<tr>
			<td>${stud.sid}</td>
			<td>${stud.sname}</td>
			<td>${stud.addr}</td>
			<td>${stud.email}</td>
			<td>${stud.dob}</td>
			<td><a href="#">Edit</a> <a href="#">Delete</a></td>
			
			
		
		</tr>
		</c:forEach>
		
		</tbody>
		
		</table>
		
		<a href="addStudent">Add New Student</a>
</body>
</html>