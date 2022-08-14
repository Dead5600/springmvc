<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>help page</title>
</head>
<body>
	<h1>... he gets help from his friends</h1>
	<% 
		String name = (String)request.getAttribute("name");
		Integer rollNum =(Integer)request.getAttribute("RollNum");
		LocalDateTime time = (LocalDateTime)request.getAttribute("Time");
	%>
	<h1>name is
		<%= name %>
	</h1>
	
	<h1>Roll Number is 
		<%= rollNum %>
	</h1>
	
	<h1>Time is
		<%= time.toString() %>
	</h1>
	
	
</body>
</html>