package com.taining.bean;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo5
 */
@WebServlet("/Demo5")
public class Demo5 extends HttpServlet {
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
		Set<Player> players=new HashSet<>();
		PrintWriter out=response.getWriter();
		
		
		
		Player p1=new Player(101,"Dhoni",50,3699,350,true);
		
	
		Player p2=new Player(102,"kohli",40,3000,130,false);
		
		Player p3=new Player(103,"YuvaRaj",42,3699,135,false);
		
		Player p4=new Player(104,"Dhawan",30,2000,75,false);
		
		Player p5=new Player(105,"HarbajnSingh",43,3012,80,false);
		
		Player p6=new Player(106,"Gowtham gambeer",52,3056,55,false);
		
		Player p7=new Player(107,"Sehwag",50,4000,37,false);
		
		Player p8=new Player(108,"Sachin",60,5000,95,false);
		
		Player p9=new Player(109,"Raydu",20,1234,15,false);
		
		Player p10=new Player(110,"HardhikPandey",28,1236,67,false);
		Player p11=new Player(111,"Jadeja",29,2569,57,false);
		players.add(p11);
		players.add(p1);
		players.add(p2);
		players.add(p3);
		players.add(p4);
		players.add(p5);
		players.add(p6);
		players.add(p7);
		players.add(p8);
		players.add(p9);
		players.add(p10);
		
		//html code
		out.println("<html>");
		out.println("<body>");
		out.println("<table border='1' >");
		out.println("<tr>");
		out.println("<td>Id </td>");
		out.println("<td> Name </td>");
		out.println("<td>NoOfMatches </td>");
		out.println("<td> TotalRunsScored </td>");
		out.println("<td> No of Wickets </td>");
		out.println("<td>Bating Rating </td>");
		out.println("<td>Bowling Raying</td>");
		
		out.println("<td> Captin </td>");
	
		for (Player player2 : players) {
			out.println("<tr>");
			out.println("<td>"+player2.getPlayerId()+"</td>");
			out.println("<td>"+player2.getPlayerName()+"</td>");
			out.println("<td>"+player2.getNoOfMatches()+"</td>");
			out.println("<td>"+player2.getTotalRunsScored()+"</td>");
			out.println("<td>"+player2.getNoOfWickets()+"</td>");
			out.println("<td>"+player2.getBatingRating()+"</td>");
			out.println("<td>"+player2.getBowlingRating()+"</td>");
			out.println("<td>"+player2.isCaptain()+"</td>");
			out.println("</tr>");
		}

		out.println("</table >");
		out.println("</body>");
		out.println("</html>");
		
	}
}
