package io.sopra.pox3.exoconnexion;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/chatroom.html")
public class ChatRoomServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Outils.initListChatRooms(req, resp);
		ChatRoom chatRoom = Donnees.listChatRooms.get(0);
		req.setAttribute("messages", chatRoom.messages);
		Outils.vueChatRoom(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Outils.initListChatRooms(req, resp);
		ChatRoom chatRoom = Donnees.listChatRooms.get(0);
		String text = req.getParameter("text");
		if (text.equals("ClearEverything")){
			chatRoom.messages.clear();
		} else {
			chatRoom .messages.add(new Message(new Date(), Outils.getConnectedUser(req), text));
			
		}
		resp.sendRedirect("chatroom.html");
	}
	
}
