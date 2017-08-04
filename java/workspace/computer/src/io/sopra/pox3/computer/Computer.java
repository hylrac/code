package io.sopra.pox3.computer;

public class Computer {
	
	String model;
	Ram memoireVive;
	HardDrive tabDisc[];
	
	public Computer(String model, Ram memoireVive, HardDrive[] tabDisc) {
		this.model = model;
		this.memoireVive = memoireVive;
		this.tabDisc = tabDisc;
	}
	
	public void init() {
		System.out.println("L'ordinateur d�marre");
		this.memoireVive.init();
		System.out.println("D�marrage des disques durs");
		for (HardDrive discs : tabDisc){
			discs.init();
		}
		tabDisc[0].read();
		System.out.println("Ordinateur en service");
		
	}
	
	public void off() {
		System.out.println("Extinction disques durs");
		for (HardDrive discs : tabDisc) {
			discs.off();
		}
		System.out.println("Les disques sont �teints");
		memoireVive.off();
		System.out.println("Ordinateur �teint");
	}

}
