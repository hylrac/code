package io.sopra.pox3.jeucartes;

import java.util.ArrayList;
import java.util.List;

public class Partie {

	public Joueur deroulerPartie(Joueur j1, Joueur j2) {
		Deck deck = new Deck();
		deck.genere32();
		//System.out.println(deck.liste.size());
		boolean bool = true;
		for (Carte carte : deck.liste) {
			if (bool) {
				j1.prendCarte(carte);
				bool = false;
			} else {
				j2.prendCarte(carte);
				bool = true;
			}
		}

		//System.out.println(j1.getNombreCartes());
		//System.out.println(j2.getNombreCartes());

		List<Carte> session = new ArrayList<>();
		Carte cartej1;
		Carte cartej2;
		int compteTour = 0;
		Joueur gagnant = new Joueur("personne");

		while ((!j1.main.isEmpty()) && (!j2.main.isEmpty()) && (compteTour < 500)) {
			compteTour++;
			cartej1 = j1.donneCarte();
			cartej2 = j2.donneCarte();
			session.add(cartej1);
			session.add(cartej2);

			while (cartej1.valeur == cartej2.valeur) {

				if (!j1.main.isEmpty()) {
					cartej1 = j1.donneCarte();
					session.add(cartej1);
				}else{
					gagnant=j2;
				}
				if (!j2.main.isEmpty()){
				cartej2 = j2.donneCarte();
				session.add(cartej2);
				} else {
					gagnant=j1;
				}
				
				if (!j1.main.isEmpty()) {
					cartej1 = j1.donneCarte();
					session.add(cartej1);
				}else{
					gagnant=j2;
				}
				if (!j2.main.isEmpty()){
				cartej2 = j2.donneCarte();
				session.add(cartej2);
				} else {
					gagnant=j1;
				}
				
			}

			if (cartej1.valeur > cartej2.valeur) {
				j1.main.addAll(session);
//				System.out.println(j1.name + " gagne avec un " + cartej1.valeur + " face a " + cartej2.valeur
//						+ "\nReste en main joueur 1 : " + j1.getNombreCartes() + "\nReste en main joueur 2 : "
//						+ j2.getNombreCartes());
			} else {
				j2.main.addAll(session);
//				System.out.println(j2.name + " gagne avec un " + cartej2.valeur + " face a " + cartej1.valeur
//						+ "\nReste en main joueur 1 : " + j1.getNombreCartes() + "\nReste en main joueur 2 : "
//						+ j2.getNombreCartes());
			}
			session = new ArrayList<>();

		}

		if (j1.getNombreCartes() > j2.getNombreCartes()) {
			gagnant = j1;
			
			
		} else if (j1.getNombreCartes() < j2.getNombreCartes()) {
			gagnant = j2;
		} else {

			System.out.println("Egalité");
		}
		j1.main.clear();
		j2.main.clear();
		System.out.println(gagnant.name+" a gagné !");
		return gagnant;

	}
}
