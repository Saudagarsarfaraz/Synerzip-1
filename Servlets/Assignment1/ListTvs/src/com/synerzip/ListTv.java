package com.synerzip;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ListTv")
public class ListTv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ListTv() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("");
		out.println("List of Tvs<ol>");
		out.println("<li>Samsung</li>");
		out.println("<li>Sony</li>");
		out.println("<li>LG</li>");
		out.println("</ol></body></html>");
//		ArrayList<String> str = new ArrayList<String>();
//		str.add("Samsung");
//		str.add("Sony");
//		str.add("LG");
//		out.println(str);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
