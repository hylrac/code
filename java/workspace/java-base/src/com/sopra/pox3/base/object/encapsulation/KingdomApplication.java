package com.sopra.pox3.base.object.encapsulation;

import com.sopra.pox3.base.object.People;

public class KingdomApplication {

	public static void main(String[] args) {

		King arthur = new King("Arthur");
		arthur.name = "Gentil Arthur";

		People peon = new People("Peon", 20);
		arthur.command(peon);
		
	}
}
