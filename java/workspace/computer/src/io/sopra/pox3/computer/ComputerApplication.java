package io.sopra.pox3.computer;

public class ComputerApplication {

	public static void main(String[] args) {
		HardDrive tabDiscs[]={new HardDrive(100),new HardDrive(1000)};
		Ram ram = new Ram(25);
		
		Computer computer = new Computer("ROG10", ram, tabDiscs);
		computer.init();
		computer.off();

	}

}
