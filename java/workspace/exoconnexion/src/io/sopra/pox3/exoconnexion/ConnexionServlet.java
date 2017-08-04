package io.sopra.pox3.exoconnexion;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConnexionServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String message = "Veuillez indiquer votre nom et prénom.";
		genererFormulaire(req, resp, message);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		String p1 = req.getParameter(Constantes.NOM_PARAMETRE_NOM);
		String p2 = req.getParameter(Constantes.NOM_PARAMETRE_PRENOM);

		if (p1 == null || p2== null || p1.isEmpty() || p2.isEmpty()) {
			genererFormulaire(req, resp, "Réessayez");
			return;
		}
		User user = new User(p1, p2);
		Outils.setConnectedUser(user, req);
		
		req.getSession().setAttribute(Constantes.CLE_SESSION_NOM_UTILISATEUR, p1);
		req.getSession().setAttribute(Constantes.CLE_SESSION_PRENOM_UTILISATEUR, p2);
		resp.sendRedirect("accueil.html");

		

	}

	protected void genererFormulaire(HttpServletRequest req, HttpServletResponse resp, String message) throws IOException, ServletException {
		resp.setContentType("text/html");
		req.setAttribute("message", message);
		req.getRequestDispatcher( "/WEB-INF/connexion.jsp" ).forward( req, resp);
		
	}
}
