package com.sopra.pox3.base.collection.primes;

import java.util.Iterator;

public class IntegerIterableApplication {

	public static void main(String[] args) {
		IntegerIterable iterable = new IntegerIterable();
		Iterator<Integer> it = iterable.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		PrimeIterable primes = new PrimeIterable();
		for (Integer p : primes){
			System.out.println(p);
		}
	}

}
