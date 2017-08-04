package com.sopra.pox3.base.inheritance;

public class MultipleCellular extends Eucaria {

	String cells = "[ ~ ~ ~ ~ ]";
	int count;

	public MultipleCellular(int count) {
		super();
		this.count = count;
	}

	
	String getCells() {
		return cells;
	}

	@Override
	String getCell() {
		return cells;
	}

}
