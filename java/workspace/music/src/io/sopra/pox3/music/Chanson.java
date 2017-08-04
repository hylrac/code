package io.sopra.pox3.music;

public class Chanson {
	
	private String nom;
	private int duree;
	
	public Chanson(String nom, int duree) {
		this.nom = nom;
		this.duree = duree;
	}

	public String getNom() {
		return nom;
	}


	public int getDuree() {
		return duree;
	}



}
