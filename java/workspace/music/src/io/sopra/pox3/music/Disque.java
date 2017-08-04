package io.sopra.pox3.music;

import java.util.List;

public class Disque {
	
	private String nom;
	private String codeBarre;
	private List<Chanson> chansons;
	
	public Disque(String nom, String codeBarre, List<Chanson> chansons) {
		this.nom = nom;
		this.codeBarre = codeBarre;
		this.chansons = chansons;
	}
	
	public Disque() {
	}

	public String getNom() {
		return nom;
	}
	public String getCodeBarre() {
		return codeBarre;
	}
	public List<Chanson> getChansons() {
		return chansons;
	}
	
	

}
