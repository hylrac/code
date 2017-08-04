package com.sopra.pox3.base.inheritance;

import java.util.Arrays;
import java.util.List;

public class CovariantApplication {
	
	public static void main(String[] args){
		Halobacterium b1 = new Halobacterium();
		Halobacterium b2 = new Halobacterium();
		Halobacterium b3 = new Halobacterium();
		Halobacterium[] bactos = {b1,b2,b3};
		Cat cat = new Cat();
		LivingStuff[] stuffs = {cat,b1,b2};
		
		System.out.println(Arrays.toString(bactos));
		System.out.println(Arrays.toString(stuffs));
		
		stuffs = bactos;
		stuffs[0]=cat;
		
		System.out.println(Arrays.toString(stuffs));
	}

}

class Cat implements LivingStuff{

	@Override
	public List<LivingStuff> multiply() {
		// TODO Auto-generated method stub
		return null;
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
