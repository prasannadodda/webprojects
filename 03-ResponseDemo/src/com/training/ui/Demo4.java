package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo4
 */
@WebServlet("/Demo4")
public class Demo4 extends HttpServlet {
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
		String []subjects={"English","Maths"," Science"};
		double []marks={70.0,75.0,81.0};
		double sum=0.0;
		
		out.println("<table border=1>");
		 out.println("<tr>");
		 out.println("<td>Subjects</td>");
		 out.println("<td>Marks</td>");
		 out.println("</tr>");
		
		for(int i=0;i<subjects.length;i++) {
			
			 out.println("<tr>");
			 out.println("<td>"+subjects[i]+"</td>");
			 out.println("<td>"+marks[i]+"</td>");
			
			sum=sum+marks[i];
			 out.println("</tr>");
			 
		}
		out.println("<tr>");
		out.println("<td>Total</td>");
		out.println("<td>"+sum+"</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Average</td>");
		out.println("<td>"+(sum/(subjects.length))+"</td>");
		out.println("</tr>");
		
			
		out.println("</table>");
	
	}
		
		
		
}