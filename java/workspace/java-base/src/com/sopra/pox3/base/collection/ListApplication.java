package com.sopra.pox3.base.collection;

import com.sopra.pox3.base.madagascar.Penguin;

public class ListApplication {

	public static void main(String[] args) {
		new ListApplication().init();

	}

	void init(){
		
		Penguin rico = new Penguin("Rico");
		Penguin skipper = new Penguin("Skipper");
		Penguin privat = new Penguin("Private");
		Penguin kowalsky = new Penguin("Kowalsky");
		Penguin tux = new Penguin("Tux", 98);
		
		PenguinsTeam penguinsTeam = new PenguinsTeam(rico, skipper, privat,kowalsky, tux);
		
		
		System.out.println(penguinsTeam.next());
		System.out.println(penguinsTeam.next());		
		System.out.println(penguinsTeam.next());		
		System.out.println(penguinsTeam.next());		
		System.out.println(penguinsTeam.next());
		System.out.println(penguinsTeam.next());		
		System.out.println(penguinsTeam.next());		
		System.out.println(penguinsTeam.next());	
		

	}
}
