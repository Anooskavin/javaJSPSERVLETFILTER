package com.akg;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/add") 
public class AddServlet extends HttpServlet
 
{
	public void doPost(HttpServletRequest req,HttpServletResponse res ) throws IOException

	{
		 
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		PrintWriter out= res.getWriter();
		out.println("Result is "+ k );
	}
	public void doGet(HttpServletRequest req,HttpServletResponse res ) throws IOException, ServletException

	{
		
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		
		Cookie  cookie= new Cookie("k",k+"");
		res.addCookie(cookie);
		
//		HttpSession session = req.getSession();
//		session.setAttribute("k",k); //Session
//		k=k*k;
//		PrintWriter out= res.getWriter();
//		out.println("Result is "+ k );
		
//		req.setAttribute("k",k);
		
//		res.sendRedirect("sq?k="+k);
		
		res.sendRedirect("sq");
		
//		RequestDispatcher
//		RequestDispatcher rd=req.getRequestDispatcher("sq");
//		rd.forward(req,res);
		
	}
}
