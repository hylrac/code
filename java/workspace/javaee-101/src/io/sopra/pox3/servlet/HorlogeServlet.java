package io.sopra.pox3.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HorlogeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Date d = new Date();
		resp.setContentType("text/html");
		resp.getWriter().print("<html><head></head><body>Il est : " + d.getHours() + " h et " + d.getMinutes() + " min"
				+ "</body></html>");
		
	}
}
