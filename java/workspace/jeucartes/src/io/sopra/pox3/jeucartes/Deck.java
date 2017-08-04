package io.sopra.pox3.jeucartes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	List<Carte> liste = new ArrayList<>();
	
	public void genere52() {
		List<Carte> listCartes = new ArrayList<>();
		for (int i = 2;i<15;i++){
			for (int j=1;j<5;j++){
				Couleur couleur = Couleur.getByValue(j);
				Carte carte = new Carte(couleur, i);
				listCartes.add(carte);
			}
		}
		Collections.shuffle(listCartes);
		this.liste=listCartes;
	}
	
	public void genere32() {
		List<Carte> listCartes = new ArrayList<>();
		for (int i = 7;i<15;i++){
			for (int j=1;j<5;j++){
				Couleur couleur = Couleur.getByValue(j);
				Carte carte = new Carte(couleur, i);
				listCartes.add(carte);
			}
		}
		Collections.shuffle(listCartes);
		this.liste=listCartes;
	}
	

}
