package io.sopra.pox3.jeucartes;

import java.util.ArrayList;
import java.util.List;

public class JeuApp {

	public static void main(String[] args) {
//		Joueur j1 = new Joueur("Charly");
//		Joueur j2 = new Joueur("Bob");
		
//		Partie partie = new Partie();
		
		List<Joueur> gagnants = new ArrayList<>();
		int countj1=0;
		int countj2=0;
		int countegalité=0;
		for (int i=0;i<50;){
			Joueur j1 = new Joueur("Charly");
			Joueur j2 = new Joueur("Bob");
			
			Partie partieTest = new Partie();
			if (partieTest.deroulerPartie(j1, j2)==j1){
				countj1++;
			}else if (partieTest.deroulerPartie(j1, j2)==j2){
				countj2++;
			}else{
				countegalité++;
			}
			gagnants.add(partieTest.deroulerPartie(j1, j2));
			
			
		}
		System.out.println(countj1+" "+countj2+" "+countegalité);
		//Joueur gagnant = partie.deroulerPartie(j1, j2);
		
		//System.out.println(gagnant.name+" a gagné !");
	}

}
