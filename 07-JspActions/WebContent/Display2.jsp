<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 
<jsp:useBean id="acc" class="com.training.ui.BankAccount" scope="page"></jsp:useBean>
<jsp:getProperty property="id" name="acc"/>
<jsp:getProperty property="customerName" name="acc"/>
<jsp:getProperty property="balance" name="acc"/>

<jsp:setProperty property="id" name="acc" value="5001"/>
<jsp:setProperty property="customerName" name="acc" value="Aravindh"/>
<jsp:setProperty property="balance" name="acc" value="15000"/>


<jsp:getProperty property="id" name="acc"/>
<jsp:getProperty property="customerName" name="acc"/>
<jsp:getProperty property="balance" name="acc"/> 
 


</body>
</html>