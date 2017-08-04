package io.sopra.pox3.music;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {

	// private static final Exception DisqueDejaPresentException = null;
	String nom;
	List<Disque> disques = new ArrayList<>();
	
	

	public void setDisques(List<Disque> disques) {
		this.disques = disques;
	}

	public void ajouterDisque(Disque disque) {
		int count = 0;

		for (Disque disqueTest : disques) {
			if (disqueTest.getNom() == disque.getNom()) {
				count++;
			}
		}

		if (count == 0) {
			disques.add(disque);
		} else {
			System.out.println("Erreur disque déja présent");
		}

	}

	public boolean retirerDisque(String codeBarre) {
		boolean result = false;
		List<Disque> listeTemp=new ArrayList<>();
		
		for (int i=0; i<disques.size();i++) {
			if (disques.get(i).getCodeBarre().equals(codeBarre)) {
				result = true;
			}else{
				listeTemp.add(disques.get(i));
			}
		}
		if (result){
			System.out.println("Disque retiré\n");
		}else{
			System.out.println("Disque non trouvé\n");
		}
		
		this.setDisques(listeTemp);
		return result;
	}

	public int getNbDisques() {
		int count = 0;
		for (int i = 0; i < disques.size(); i++) {
			
			count++;
		}

		return count;
	}

	public Disque getDisque(String codeBarre) {
		Disque disque = new Disque();
		for (Disque disqueTest : disques) {
			if (disqueTest.getCodeBarre() == codeBarre) {
				disque = disqueTest;
			}
		}
		return disque;
	}

	public List<Disque> rechercherDisques(String recherche) {
		List<Disque> listRecherche = new ArrayList<>();
		for (Disque disqueTest : disques) {
			if (disqueTest.getNom().toUpperCase() == recherche.toUpperCase()) {
				listRecherche.add(disqueTest);
			}
		}
		return listRecherche;
	}

	public List<Chanson> rechercherChansons(String recherche) {
		List<Chanson> listRecherche = new ArrayList<>();
		for (Disque disqueTest : disques) {
			for (Chanson chansonTest : disqueTest.getChansons()) {
				if (chansonTest.getNom().toUpperCase() == recherche.toUpperCase()) {
					listRecherche.add(chansonTest);
				}
			}
		}
		return listRecherche;
	}

}
