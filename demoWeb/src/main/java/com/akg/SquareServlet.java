package com.akg;

import java.io.IOException;
import java.io.PrintWriter;

import org.apache.tomcat.util.http.parser.Cookie;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/sq")
public class SquareServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res ) throws IOException
	{
//		int k=(int) req.getAttribute("k"); //URL Rewriting
//		PrintWriter out=res.getWriter();
//		out.println(" Result is "+(k*k));
		int k=0;
		jakarta.servlet.http.Cookie[] cookies= req.getCookies();
		for(jakarta.servlet.http.Cookie c: cookies)
		{
			if(c.getName().equals("k")) {
				 k=Integer.parseInt(c.getValue());
			}
		}
//		k=k*k;
		
		
		
		
		PrintWriter out=res.getWriter();
		out.println("<html><body bgcolor='cyan'> ");
		out.println(" Result is "+(k*k)); 
		out.print("DOne by ");
		out.println("</body></html>");
		
		ServletContext cont= getServletContext();
		String s= cont.getInitParameter("name");
		out.print(s);
		
//		HttpSession Session = req.getSession(); // essionS
//		int k=(int) Session.getAttribute("k");
//		PrintWriter out=res.getWriter();
//		out.println(" Result is "+(k*k)); 
//		Session.removeAttribute("k");
		
		
		
		System.out.println("From Sq");
		
		
	}
}
