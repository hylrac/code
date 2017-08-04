package io.sopra.pox3.file;

import java.io.File;

public class FichierRecursif {
	public void parcoursRep(String path) {
		
		File file = new File(path);
		System.out.println(path);
		File[] files = file.listFiles();
		if (files!=null){
			
			for (File fileTest : files){
				String pathTemp = fileTest.getAbsolutePath();
				
				parcoursRep(pathTemp);
				
			}
		}else{
			
			System.out.println("Pas de fichier ici");
			
		}
		
	}

}
