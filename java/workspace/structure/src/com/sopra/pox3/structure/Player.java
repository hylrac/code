package com.sopra.pox3.structure;

public class Player implements Comparable<Player> {
	String name;

	@Override
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Player o) {
		return name.compareTo(o.name);
	}
}
