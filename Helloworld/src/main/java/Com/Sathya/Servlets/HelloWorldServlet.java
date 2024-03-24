package Com.Sathya.Servlets;

import java.io.IOException;


import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/eswari")
public class HelloWorldServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	

	PrintWriter writer=response.getWriter();
	writer.println("html");
	writer.println("<h1>This is sathya tech</h1>");
	writer.println("<h2>This is Adavance java</h2>");
	writer.println("<h3>welcome to sathya tech</h3>");
	writer.println("/html");
	}

}
