package io.sopra.pox3.jeucartes;

public enum Couleur {
	PIQUE(1),COEUR(2),CARREAU(3),TREFLE(4);
	
	int value;

	
	private Couleur(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public static Couleur getByValue(int value){
		for (Couleur color : values()){
			if (color.getValue() == value){
				return color;
			}
		}
		throw new IllegalArgumentException("Can't find color for :"+value);
	}
	
	
	
}
