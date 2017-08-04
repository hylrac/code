package io.sopra.pox3.music;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MusiqueApp {

	public static void main(String[] args) throws Exception {
		Bibliotheque biblio = new Bibliotheque();
		Chanson chanson1 = new Chanson("Over the rainbow", 5);
		List<Chanson> listChansons = new ArrayList<>();
		listChansons.add(chanson1);
		Disque disque = new Disque("Youhou", "000", listChansons);
		biblio.ajouterDisque(disque);
		Chanson chanson2 = new Chanson("Highway to hell", 5);
		List<Chanson> listChansons2 = new ArrayList<>();
		listChansons2.add(chanson2);
		Disque disque2 = new Disque("Youhiha", "001", listChansons2);
		biblio.ajouterDisque(disque2);

		try {
			FileWriter fw = new FileWriter("import.txt");
			fw.write("Coucou disque 1 du fichier\n101\n2\nSuper chanson 1\n5\nSuper chanson 2\n6\n");
			fw.close();

		} catch (FileNotFoundException e) {
			System.out.println("Fichier introuvable sa mère");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		int result = 0;
		while (result != 8) {
			result = Saisie.saisieInt("\nQue voulez vous faire ?\n\n" + "1.Liste disques          5.Ajouter disque\n"
					+ "2.Détail disque          6.Importer les disques depuis un fichier\n"
					+ "3.Recherche chanson      7.Sauvegarder la bibliotheque dans un fichier\n"
					+ "4.Retirer disque         8.Quitter\n");

			switch (result) {
			case 1: {
				System.out.println("Liste disques :\n");
				if (biblio.disques.isEmpty()) {
					System.out.println("Liste vide\n");
				} else {
					for (Disque disqueTest : biblio.disques) {
						System.out.println(disqueTest.getNom());
						System.out.println(disqueTest.getCodeBarre());

					}

				}
				break;
			}
			case 2: {
				System.out.println("Détail disque :\n");
				String codeBarre = Saisie.saisie("Code barre du disque ? \n");
				int count = 0;
				for (Disque disqueTest : biblio.disques) {
					count++;
					if (disqueTest.getCodeBarre().equals(codeBarre)) {
						System.out.println("Nom du disque : " + disqueTest.getNom() + "\n");
						System.out.println("Code barre : " + disqueTest.getCodeBarre() + "\n");
						System.out.println("Liste chansons :\n");
						for (Chanson chanson : disqueTest.getChansons()) {
							System.out.println(chanson.getNom() + "\n");
						}
					}

				}
				if (count == 0)
					System.out.println("Disque introuvable \n");
				break;

			}

			case 3: {
				String nomChanson = Saisie.saisie("Nom chanson ? \n");
				int count = 0;
				for (Disque disqueTest : biblio.disques) {
					for (Chanson chanson : disqueTest.getChansons()) {
						if (chanson.getNom().toUpperCase().contains(nomChanson.toUpperCase())) {
							count++;
							System.out.println(chanson.getNom() + " se trouve dans le disque " + disqueTest.getNom());
						}
					}
				}
				if (count == 0)
					System.out.println("Chanson introuvable \n");
				break;
			}

			case 4: {

				if (biblio.disques.isEmpty()) {
					System.out.println("La bibliothèque est vide");
				} else {

					String codeBarre = Saisie.saisie("Code barre ? \n");
					for (Disque disqueTest : biblio.disques) {
						if (disqueTest.getCodeBarre().equals(codeBarre)) {
							System.out.print("Disque trouvé ");
							biblio.retirerDisque(codeBarre);

						}
					}
				}

				break;
			}

			case 5: {
				String titre = Saisie.saisie("Nom du disque ? \n");
				String codeBarre = Saisie.saisie("Code barre du disque ? \n");
				int nbChansons = Saisie.saisieInt("Nombre de chansons ? \n");
				List<Chanson> listChansonsTest = new ArrayList<>();
				for (int i = 0; i < nbChansons; i++) {
					String nomChanson = Saisie.saisie("Nom de la chanson numéro " + (i + 1) + " ? \n");
					int duree = Saisie.saisieInt("Durée de la chanson numéro " + (i + 1) + " ? \n");
					Chanson chanson = new Chanson(nomChanson, duree);
					listChansonsTest.add(chanson);

				}
				Disque disqueTest = new Disque(titre, codeBarre, listChansonsTest);
				biblio.ajouterDisque(disqueTest);
				break;

			}

			case 6: {
				File test = new File("test");
				// System.out.println(test.getAbsolutePath());
				File test2 = test.getAbsoluteFile().getParentFile();
				// System.out.println(test2.getAbsolutePath());

				for (File fileTest : test2.listFiles()) {
					System.out.println(fileTest.getName());
				}

				String nomFichier = Saisie.saisie("\nNom du fichier ? \n");
				File fileImport = new File(nomFichier);
				if (fileImport.exists()) {
					FileReader fileReader = new FileReader(fileImport);
					BufferedReader br = new BufferedReader(fileReader);
					try {
						while (true) {
							String nomLu = br.readLine();
							if (nomLu == null) {
								break;
							}
							String codeBarreLu = br.readLine();

							int nombreChansonsLu = Integer.parseInt(br.readLine());
							List<Chanson> listeChansonsLu = new ArrayList<>();
							for (int i = 0; i < nombreChansonsLu; i++) {
								listeChansonsLu.add(new Chanson(br.readLine(), Integer.parseInt(br.readLine())));
							}

							biblio.ajouterDisque(new Disque(nomLu, codeBarreLu, listeChansonsLu));
						}

					} catch (Exception e) {
						System.out.println("Fin du fichier\n");
						
					}

					br.close();
				} else {
					System.out.println("Fichier inexistant sa mère\n");
				}

			}

			case 7: {
				FileWriter fw = new FileWriter("Sauvegarde.txt");

				try {

					for (Disque disqueEcrit : biblio.disques) {
						fw.write(disqueEcrit.getNom() + "\n");
						fw.write(disqueEcrit.getCodeBarre() + "\n");
						for (Chanson chansonEcrite : disqueEcrit.getChansons()) {
							fw.write(chansonEcrite.getNom() + "\n");
						}
						fw.write("\n");
					}

				} catch (Exception e) {
					System.out.println("Intercepté : " + "Fichier introuvable sa mère");
				}

				fw.close();

			}

			case 8:
				break;

			default:
				System.out.println("Commande non reconnue\n");
			}

		}
		System.out.println("Au revoir");

	}

}
