<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ page import="java.io.*,java.util.*,java.sql.*"%>    
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- 
	String  name=request.getAttribute("label").toString();
out.println(name);
%> --%>

${label}<br>
${student}<br>


<c:out value="${label}" />

<c:forEach items="${student}" var="s">
${s.name} <br/>
</c:forEach>

<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/mario" user="root" password="" />
<sql:query  var="rs" dataSource="${db}">SELECT * FROM gadgets</sql:query>
<c:forEach items="${rs.rows}" var="row">
<c:out value="${row.name}"></c:out>
</c:forEach>


<c:set var="str" value="anooskavin 3 year" /><br>
Length : ${fn:length(str)}
<c:forEach items="${fn:split(str,' ')}" var="i">
<br>
${i}
</c:forEach>

<c:if test="${fn:contains(str,'oo')}">

OO is in STR

</c:if>

</body>
</html>