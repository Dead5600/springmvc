<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HomePage</title>
</head>
<body>

	<h1>Welcome on  home webpage</h1>
	<h1>prathamesh</h1>
	
	<% 
	String name = (String)request.getAttribute("name");
	Integer id = (Integer)request.getAttribute("id");
	List<String> city = (List<String>)request.getAttribute("c1");
	
	%>
	<h1>Name is
	<%=name %>
	</h1>
	
	<h1>Id is
	<%=id %>
	</h1>
	
	<h1>list is
	<% 
		for(String s:city)
	{
		out.println(s);
	}
		%>
	
	</h1>
</body>

</html>