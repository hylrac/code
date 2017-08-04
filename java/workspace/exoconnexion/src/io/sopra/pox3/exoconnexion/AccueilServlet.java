package io.sopra.pox3.exoconnexion;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AccueilServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		User user = Outils.getConnectedUser(req);
		Outils.initListChatRooms(req, resp);
		if (user!=null){
			req.setAttribute("listChatRooms", Donnees.listChatRooms);
			req.setAttribute("user", user);
			Outils.vueWelcomeConnected(req, resp);
			
			
		} else {
			Outils.vueWelcomeNotConnected(req, resp);
			
		}
	}

}
