package io.sopra.pox3.jeucartes;

import java.util.ArrayList;
import java.util.List;

public class Joueur {
	List<Carte> main = new ArrayList<>();
	String name;
	int nombreCartes=main.size();
	
	
	
	public Joueur(String name) {
		this.name = name;
	}



	public Carte donneCarte() {
		Carte carte = main.get(0);
		main.remove(0);
		return carte;
	}
	
	public void prendCarte(Carte carte) {
		this.main.add(carte);
	}
	
	public void prendCartes(List<Carte> listeCartes) {
		this.main.addAll(listeCartes);
	}
	
	
	
	public int getNombreCartes() {
		this.nombreCartes=this.main.size();
		return this.nombreCartes;
		
	}
	
}
