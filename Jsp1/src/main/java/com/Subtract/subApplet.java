package com.Subtract;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class subApplet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i - j;
		System.out.println("The result is : " + k);
		PrintWriter out = res.getWriter();
		out.println("The result is : " + k);
		
		// session management
		
		req.setAttribute("ke", k);
		
		RequestDispatcher rd = req.getRequestDispatcher("sq");
		rd.forward(req, res);
		}
}
