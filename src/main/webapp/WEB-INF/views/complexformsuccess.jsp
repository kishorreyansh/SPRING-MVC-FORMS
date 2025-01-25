<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success Page</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<h1 class="text-center mt-4 text-primary">Student Details</h1>
	<hr>
	<h2 class="text-center mt-4 text-primary">${student.name }</h2>
	<h2 class="text-center mt-4 text-primary">${student.id }</h2>
	<h2 class="text-center mt-4 text-primary">${student.dob }</h2>
	<h2 class="text-center mt-4 text-primary">${student.courses }</h2>
	<h2 class="text-center mt-4 text-primary">${student.gender }</h2>
	<h2 class="text-center mt-4 text-primary">${student.type }</h2>
	<h2 class="text-center mt-4 text-primary">${student.address.street }</h2>
	<h2 class="text-center mt-4 text-primary">${student.address.city }</h2>
</body>
</html>