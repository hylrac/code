package com.sopra.pox3.base.madagascar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class Madagascar {
	
	public void sortByName(List<Penguin> list){
		
	}
	
	public void sortBySpeed(List<Penguin> list){
		
	}
	
	public static void main(String[] args){
		
		List<Penguin> listPinguins = new ArrayList<Penguin>();
		
		Penguin commandant = new Penguin("Commandant", 10);
		Penguin soldat = new Penguin("Soldat", 3);
		Penguin kowalski = new Penguin("Kowalski", 8);
		Penguin rico = new Penguin("Rico");
		//Pinguin test = new Pinguin("", 45);
		
		
		listPinguins.add(commandant);
		listPinguins.add(rico);
		listPinguins.add(kowalski);
		listPinguins.add(soldat);

		System.out.println(listPinguins);
		Collections.sort(listPinguins, new Comparator<Penguin>() {

			@Override
			public int compare(Penguin p1, Penguin p2) {

				return p1.speed.compareTo(p2.speed);
			}
		});
		Emperor napoleon = new Emperor("Napoleon");
		System.out.println(napoleon);
		napoleon.slide(rico);
		
		Emperor charlemagne = new Emperor("Charlemagne");
		charlemagne.slide(napoleon);
		
		System.out.println("=========XXXXX=========");
		Penguin p = napoleon;
		p.slide();
		
		

		
	}
	

}
