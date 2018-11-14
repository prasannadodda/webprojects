package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo3
 */
@WebServlet("/Demo3")
public class Demo3 extends HttpServlet {
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
		
		
		List<String> playerNames =new ArrayList<>();
		playerNames.add("Sachin");
		playerNames.add(" Virat");
		playerNames.add("Dhoni");
		playerNames.add("Sewag");
		PrintWriter out =response.getWriter();
		
		out.println("<ul type=bullet>");
		for (String s : playerNames) {
			
			out.println("<li>");
			
			out.println(s);
			
			out.println("</li>");
			
			
		
		}
		out.println("</ul");
		
		
		
		
		
	}

}
