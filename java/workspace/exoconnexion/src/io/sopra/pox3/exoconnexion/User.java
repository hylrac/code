package io.sopra.pox3.exoconnexion;

public class User {
	
	private String nom;
	private String prenom;
	
	public User(String nom, String prenom) {
		this.nom = nom.toUpperCase().charAt(0)+nom.substring(1);
		this.prenom = prenom.toUpperCase().charAt(0)+prenom.substring(1);
		
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	@Override
	public String toString() {
		return prenom + " " + nom;
	}
	
	
	
	

}
