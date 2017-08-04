package com.sopra.pox3.base.object;

public class People {

	String name;
	int age;
	static int maxAge = 120;

	public People(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	int birthday() {
		if (age < 120) {
			int increment = 1;
			return this.age + increment;

		}

		return -1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
