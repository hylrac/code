package io.sopra.pox3.exoconnexion;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DecoServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getSession().invalidate();
		String url = req.getHeader("Referer");
		if (url==null){
			resp.sendRedirect("accueil.html");
			
		} else {
			resp.sendRedirect(url);
		}
	}
}
