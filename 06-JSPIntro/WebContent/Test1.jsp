<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Different elements occur in JSP</h1>
<%
int x=100;
int y=200;
 %>
 <%=x %>+<%=y %>  <!-- it just concatinates -->
 <%=x+y %>  <!--  //it will sum of two number -->
 <%=Integer.parseInt("125") %> <!--  function -->
 
</body>
</html>