package fr.sopra;

import fr.sopra.shared.maths.MathUtils;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		MathUtils mathutils = new MathUtils();
		System.out.println("Hello World!\nFactorielle de 7 faut : " + mathutils.factorielle(7));
	}
}
