
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.Connection" %>
    <%@ page import="java.sql.DriverManager" %>
    <%@ page import="java.sql.Statement" %>
    <%@ page import="java.sql.*" %>
    
    
  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	101 <br>
	Navin <br>
	88 <br>
	
	<%
		Class.forName("org.postgresql.Driver");%>
		<%
		String s="select * from student where SID=1";	
		Connection c=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123");
		Statement stmt=c.createStatement();
		ResultSet res=stmt.executeQuery(s);
		
		res.next();
		
		
	
	%>
	
	Rollno : <%= res.getString(1) %><br>
	Name   : <%= res.getString(2) %><br>
	Grade  : <%= res.getString(3) %>
	
	<% res.close(); %>>
</body>
</html>