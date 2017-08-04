package com.sopra.pox3.base.object.encapsulation;

import java.util.List;

import com.sopra.pox3.base.object.People;

public class King {
	
	String name;

	public King(String name) {
		super();
		this.name = name;
	}
	
	public void commandAll(List<People> allPeople){
		allPeople.stream().forEach(this::command);
		
	}
	
	protected void command(People p){
		System.out.println(" Hey, "+p.getName()+" : do stuff");
	}
	

}
