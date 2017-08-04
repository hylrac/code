package com.sopra.pox3.base.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Halobacterium extends Archaea {

	@Override
	public List<? extends Halobacterium> multiply() {
		List<Halobacterium> children = new ArrayList<>();
		for (int i = 0; i < 25; i++) {
			children.add(new Halobacterium());
		}
		return children;
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub

	}

	@Override
	public void die() {
		// TODO Auto-generated method stub

	}

}
