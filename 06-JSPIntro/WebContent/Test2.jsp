<%@page import="javax.sound.midi.SysexMessage"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
		int x=10,y=20; 
		out.println(x);
		out.println(y);
		out.println(this.num1);
		out.println(this.num2);
		this.add(1000,2002);
		this.welcomeuser();
%>

<%!
		int num1,num2;
		int add(int v1,int v2)
		{
		return v1+v2;
		}
		void welcomeuser(){
			System.out.println("Welcome to JSP");
		}
%>  <!-- Declaration Element and defining fucntions  they become meber value of the class when servlet is created -->

<%=add(10,10) %>



</body>
</html>