package com.session1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class myServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
		out.print("hi <br>");
		
		ServletContext ctx = getServletContext();
		String nam = ctx.getInitParameter("name");
		String phone = ctx.getInitParameter("phone");
		out.println("My name is :  " +nam+"  my phone is "+phone);
	}
}
