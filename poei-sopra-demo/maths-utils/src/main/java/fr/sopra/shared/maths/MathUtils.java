package fr.sopra.shared.maths;

public class MathUtils {

	public int factorielle(int n) {
		if (n < 1) {
			return 1;
		} else {
			return n * factorielle(n - 1);
		}
	}
}
