package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.criteria.CriteriaBuilder.In;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.entity.Customer;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet(name = "RegServlet", urlPatterns = { "/Reg" })
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
//cusotmerid
		PrintWriter out = response.getWriter();
		Customer customer = new Customer();
		String strId = request.getParameter("txtId");
		if (strId != null) {
			int id = Integer.parseInt(strId);
			customer.setId(id);
		} 
		
		//customername
		String name=request.getParameter("name");
		if(name!=null)
		{
			customer.setName(name);
			out.println(customer.getName()
					+ "<br>");
			
		}
		//customer mail
		String emailid=request.getParameter("emailid");
		if(emailid !=null)
		{
			customer.setEmail(emailid);
			out.println(customer.getEmail()
					+ "<br>");
			
		}
		
		String phone=request.getParameter("phone");
		if( phone !=null)
		{
			customer.setPhone(phone);;
			out.println(customer.getPhone()
					+ "<br>");
		}
		String address=request.getParameter("address");
		if(address !=null)
		{
			customer.setAddress(address);;
			out.println(customer.getAddress()
					+ "<br>");
		}
		
		String sgender=request.getParameter("gender");
		if(sgender!=null)
		{
			int  gender=Integer.parseInt(sgender);
			customer.setGender(gender);
			out.println(customer.getGender()
					+ "<br>");
		
	}
		
		
		
		
	String strIsPrivilaged =request.getParameter("checkedPrivilaged");
	if(strIsPrivilaged==null)
	{
		customer.setPrivilaged(false);
	}
	else if(strIsPrivilaged.equals(true))
	{
		customer.setPrivilaged(true);
	}
	
	//date
String strDoj=request.getParameter("date");
if(strDoj!=null)
{
	SimpleDateFormat slf= new SimpleDateFormat("yyyy-mm-dd");
	
	try {
	Date	doj = slf.parse(strDoj);
		customer.setDoj(doj);
		out.println(customer.getDoj()
				+ "<br>");
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}


String amount=request.getParameter("balance");
if(amount!=null)
{
	double balance= Double.parseDouble(amount);
	customer.setBalanceAmount(balance);
	out.println(customer.getBalanceAmount()
			+ "<br>");

}


String strRating =request.getParameter("txtRating");
if(strRating!=null)
{
	int rating=Integer.parseInt(strRating);
	customer.setCustomerRating(rating);
	out.println(customer.getCustomerRating()
			+ "<br>");
}
	


	
	}
}
