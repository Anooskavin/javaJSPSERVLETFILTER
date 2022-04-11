<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  errorPage="error.jsp"
     %>  
    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="grey">

<%! int a=10;  // Declarative%> 


<% //Scriptlet
 
	int i=Integer.parseInt(request.getParameter("num1"));
	int j=Integer.parseInt(request.getParameter("num2"));
	
	int k=i+j;
	out.println("Output : "+k);
	pageContext.setAttribute("name", "@kg",PageContext.SESSION_SCOPE);
	
	int c=i/j;
	
	
	
%>
<%= a %> 

</body>
</html>