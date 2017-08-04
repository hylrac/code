package io.sopra.pox3.computer;

public class Ram {
	
	int capacity;
	
	public void init() {	
		System.out.println("Initialisation mémoire "+capacity+" Go");
		
	}
	
	public void off() {
		System.out.println("Extinction mémoire vive");
		
	}

	public Ram(int capacity) {
		this.capacity = capacity;
	}
	
	

}
