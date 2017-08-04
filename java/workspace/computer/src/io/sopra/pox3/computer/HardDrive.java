package io.sopra.pox3.computer;

public class HardDrive {
	
	int capacity;
	
	public void init() {	
		System.out.println("Démarrage disque "+capacity+" Go");
		
	}
	
	public void read() {
		System.out.println("Lecture disque dur");
	}
	
	public void off() {
		System.out.println("Extinction disque "+capacity+" Go");
		
	}

	public HardDrive(int capacity) {
		this.capacity = capacity;
	}
	

}
