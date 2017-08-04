package io.sopra.pox3.exoconnexion;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ChatServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Outils.initListChatRooms(req, resp);
		int position = Integer.parseInt(Constantes.POSITION_CHAT);
		if ((String) req.getParameter("position") != null) {
			position = Integer.parseInt((String) req.getParameter("position"));
			req.getSession().setAttribute(Constantes.POSITION_CHAT, ((String) req.getParameter("position")));
		}

		req.setAttribute("messages", Donnees.listChatRooms.get(position).messages);

		genererFormulaire(req, resp, position, "Ecrivez quelque chose");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String text = req.getParameter("text");
		System.out.println(text);
		int position = Integer.parseInt(Constantes.POSITION_CHAT);
		System.out.println(position);
		Outils.initListChatRooms(req, resp);
		if (text.equals("ClearEverything")) {
			Donnees.listChatRooms.get(position).messages.clear();
		} else {
			User user = Outils.getConnectedUser(req);
			if (user != null) {
				Donnees.listChatRooms.get(position).messages.add(new Message(new Date(), user, text));

			}

		}
		resp.sendRedirect("chat.html");
	}

	protected void genererFormulaire(HttpServletRequest req, HttpServletResponse resp, int position, String message)
			throws IOException, ServletException {
		req.setAttribute("message", message);
		req.setAttribute("position", position);
		req.getRequestDispatcher("/WEB-INF/formulaire.jsp").forward(req, resp);

	}
}
