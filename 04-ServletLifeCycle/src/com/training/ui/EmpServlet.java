package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmpServlet
 */
@WebServlet("/EmpServlet")
public class EmpServlet extends HttpServlet {
	
	
	private int id;
	private int salary;
	private String name;
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
		
		
		
		System.out.println("\n\n\t\t"+new Date());
		
		System.out.println(this.add(10, 25));
		PrintWriter out =response.getWriter();
		out.println(this.id+"<br");
		
		out.println(this.salary+"<br>");
		
	}

	@Override
	
	public void init() throws ServletException { //init is used to initialization
		System.out.println(" init () is called");
		this.id=25;
		this.name="prasanna";
		this.salary=2530;
		
	}
	@Override
	public void destroy() {
		System.out.println("\n\n\t\t destory () is called");
		
	}
	
	public int add(int a,int b)
	{
		return a+b;
	}
	
	
}
