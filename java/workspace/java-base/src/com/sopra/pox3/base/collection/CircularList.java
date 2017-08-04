package com.sopra.pox3.base.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CircularList<E> extends ArrayList<E> implements Iterator<E>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int position;

	public E next() {

		if (position == this.size()) {
			this.position = 0;
		}
		E result = this.get(position);
		position++;

		return result;
	}
	
	@Override
	public Iterator<E> iterator() {
		return this;
	}
	
	@Override
	public boolean hasNext(){
		return true;
	}

}
