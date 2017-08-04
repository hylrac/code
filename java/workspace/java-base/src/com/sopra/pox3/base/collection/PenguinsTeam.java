package com.sopra.pox3.base.collection;

import com.sopra.pox3.base.madagascar.Penguin;

public class PenguinsTeam {

	static int count = 0;

	CircularList<Penguin> penguinsList = new CircularList<>();

	public PenguinsTeam(Penguin... penguinsTab) {

		for (Penguin element : penguinsTab) {
			penguinsList.add(element);
		}

	}

	int position;
	
	
	Penguin next(){
		return this.penguinsList.next();
		
	}



	public CircularList<Penguin> getPenguinsList() {
	 	return penguinsList;
	}
	
	

}
