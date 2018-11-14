package com.training.ui;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Compossing
 */
@WebServlet("/Compossing")
public class Compossing extends HttpServlet {
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
		
		RequestDispatcher dispatcher1,dispatcher2,dispatcher3=null;
		dispatcher1=request.getRequestDispatcher("Header.html");
		dispatcher2=request.getRequestDispatcher("Main.html");
		dispatcher3=request.getRequestDispatcher("Footer.html");
		dispatcher1.include(request, response);
		dispatcher2.include(request, response);
		dispatcher3.include(request, response);
	}

}
