<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="BA" class="com.training.ui.BankAccount" scope="request"></jsp:useBean>
<table border='1' background="pink">
<tr>
<td>AccountId</td>

<td> 
<jsp:getProperty property="id" name="BA"/></td>
</tr>
<tr>
<td>Name of the Customer</td>
<td>
<jsp:getProperty property="customerName" name="BA"/></td>
</tr>
<tr>
<td>Balance</td>
<td>
<jsp:getProperty property="balance" name="BA"/></td>
</tr>









</table>

</body>
</html>