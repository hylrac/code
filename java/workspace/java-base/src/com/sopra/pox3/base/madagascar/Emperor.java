package com.sopra.pox3.base.madagascar;

public class Emperor extends Penguin{

	public Emperor(String name) {
		super(name, 28);
	}
	
	@Override
	public void slide(){
		System.out.println("Yeaaah");
	}
	
	public void slide(Penguin p){
		System.out.println("Yeaaah "+p);
	}
	
	public void slide(Emperor p){
		System.out.println("Pas cool "+p);
	}

	





}
