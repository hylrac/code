package com.sopra.pox3.base.madagascar;

public class Penguin extends Bird implements CanSlide, Comparable<Penguin> {

	public Penguin(String name, Integer speed) {
		this(name);
		this.speed = speed;

	}

	public Penguin(String name) {
		if (name.isEmpty()) {
			throw new IllegalArgumentException("Empty name for Pinguin");
		}
		this.name = name;
	}

	public void slide() {
		System.out.println("Yahou ! " + speed + " km/h !");

	}

	@Override
	public int compareTo(Penguin other) {
		return this.name.compareTo(other.name);
	}

	@Override
	public String toString() {
		return name;
	}

}
