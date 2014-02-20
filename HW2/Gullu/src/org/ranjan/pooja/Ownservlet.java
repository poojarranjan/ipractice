package org.ranjan.pooja;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ownservlet extends HttpServlet
{
	
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		{
		response.setContentType("text/html");
		String userName = request.getParameter("user");
		response.getWriter().println("Bhag saale "+userName+ "!!!");
		}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		response.setContentType("text/html");
		String userName = request.getParameter("user");
		response.getWriter().println("Bhag saale "+userName+ "!!! from Post Method");
	}
}
