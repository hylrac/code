package io.sopra.pox3.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetParamServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String p1 = req.getParameter("param1");
		String p2 = req.getParameter("param2");
		resp.setContentType("text/html");
		resp.getWriter().write(
				"<html><head></head><body>valeur param1 : " + p1 + " et valeur param2 : " + p2 + "</body></html>");

	}
}
