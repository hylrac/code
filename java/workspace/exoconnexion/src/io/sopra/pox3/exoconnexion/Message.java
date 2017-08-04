package io.sopra.pox3.exoconnexion;

import java.util.Date;

public class Message {
	private Date date;
	private User user;
	private String text;
	
	public Message(Date date, User user, String text) {
		this.date = date;
		this.user = user;
		this.text = text;
	}
	
	public Date getDate() {
		return date;
	}
	public User getUser() {
		return user;
	}
	public String getText() {
		return text;
	}
	
	
	

}
