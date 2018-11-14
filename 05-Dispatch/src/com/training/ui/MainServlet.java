package com.training.ui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
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
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("DummyServlet");
		List<String> cityNames= new ArrayList<>();
cityNames.add("chennai");
cityNames.add("Hyderabad");
cityNames.add("Bangalore");
cityNames.add("Pune");
		
		
		
		String myName="prasasnna";
		String myNativePalce="Nandigama";
		
		request.setAttribute("NAME",myName);
		request.setAttribute("PALCE",myNativePalce);
		request.setAttribute("TODAY",new Date());
		request.setAttribute("AGE",new Integer(21));
		dispatcher.forward(request, response);
	}

}
