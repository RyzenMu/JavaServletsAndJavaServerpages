package com.Subtract;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int k = (int) req.getAttribute("ke");
		k = k*k;
		
		PrintWriter out = res.getWriter();
		out.println("<html><body bgcolor='yellow'>");
		out.println("This is the square page");
		out.println("The square of the number is :" + k);
		out.println("</body><html>");
		
	}
}
