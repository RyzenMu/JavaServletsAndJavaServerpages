package com.Pack.add3Numbers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class addServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = Integer.parseInt(req.getParameter("num3"));
		int l = i + j + k;
		System.out.println("The sum is : "+ l);
		PrintWriter out = res.getWriter();
		out.println("The sum is :" + l);
		
	}
}
