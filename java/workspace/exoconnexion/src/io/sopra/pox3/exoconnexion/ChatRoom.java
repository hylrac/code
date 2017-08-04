package io.sopra.pox3.exoconnexion;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
	public String name;
	public User createur;
	
	public List<Message> messages = new ArrayList<>();

	public ChatRoom(String name, User createur) {
		this.name = name;
		this.createur = createur;
	}

	public String getName() {
		return name;
	}


	public User getCreateur() {
		return createur;
	}


	
	
	
	
	
}
