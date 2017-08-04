package com.sopra.pox3.structure;

import java.util.TreeSet;

public class SetApplication {

	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<>();

		names.add("Jo");
		names.add("Job");
		names.add("John");
		names.add("Jord");
		names.add("Jo");
		names.add("Jeff");
		names.add("Jim");
		names.add("Jack");
		names.add("Jacky");
		names.add("Jojo");
		names.add("Jordi");

		System.out.println(names);

	}

}
