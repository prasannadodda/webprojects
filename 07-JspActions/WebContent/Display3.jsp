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


<jsp:setProperty property="id" name="acc" param="txtid"/>
<jsp:setProperty property="customerName" name="acc" param="txtname"/>
<jsp:setProperty property="balance" name="acc" param="txtbal"/>
<jsp:setProperty property="date1" name="acc" param="txtdate"/>


<jsp:getProperty property="id" name="acc"/>
<jsp:getProperty property="customerName" name="acc"/>
<jsp:getProperty property="balance" name="acc"/> 
<jsp:getProperty property="doj" name="acc"/>
 
</body>
</html>