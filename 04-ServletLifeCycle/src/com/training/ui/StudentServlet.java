package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet(
		urlPatterns = { "/StudentServlet" }, 
		initParams = { 
				@WebInitParam(name = "i_rollNumber", value = "105"), 
				@WebInitParam(name = "i_name", value = "prasanna"), 
				@WebInitParam(name = "i_age", value = "22")
		})
public class StudentServlet extends HttpServlet {
	
	
	private int rollNumber;
	private String name;
	private int age;
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println(this.age+"<br>");
		out.println(this.name+"<br>");
		out.print(this.rollNumber+"<br>");
		
	}
	@Override
	public void init() throws ServletException {
		
		ServletConfig config =getServletConfig();
		String strRoll =config.getInitParameter("i_rollNumber");
		String  strName=config.getInitParameter("i_name");
		String strAge=config.getInitParameter("i_age");
		this.rollNumber=Integer.parseInt(strRoll);
		this.name=strName;
		this.age=Integer.parseInt(strAge);
		
	}
	
	
	

}
