package demoFilter;

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

 
public class Myservlet extends HttpServlet{
	
	
	public void doGet(HttpServletRequest request,HttpServletResponse response ) throws IOException, ServletException

	{
		PrintWriter out=response.getWriter();
		
		int id  = Integer.parseInt(request.getParameter("id"));
		String name  = request.getParameter("name");
		out.println("Welcome "+ name);
		
	}


}
