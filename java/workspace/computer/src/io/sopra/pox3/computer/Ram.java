package io.sopra.pox3.computer;

public class Ram {
	
	int capacity;
	
	public void init() {	
		System.out.println("Initialisation m�moire "+capacity+" Go");
		
	}
	
	public void off() {
		System.out.println("Extinction m�moire vive");
		
	}

	public Ram(int capacity) {
		this.capacity = capacity;
	}
	
	

}
