package com.session1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		int k = Integer.parseInt(req.getParameter("k"));
//		HttpSession session = req.getSession();
//		session.removeAttribute("k");
//		int k = (int) session.getAttribute("k");
		Cookie cookies[] = req.getCookies();
		int k=0;
		for(Cookie c : cookies) {
			if (c.getName().equals("k")) {
			
				k = Integer.parseInt(c.getValue());
			}
		}			
		k = k * k;
		PrintWriter out = res.getWriter();
		out.println("The square is " + k);
	}
}
