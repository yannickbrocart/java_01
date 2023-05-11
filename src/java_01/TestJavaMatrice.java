package java_01;

public class TestJavaMatrice {

	public static void main(String[] args) {

		int[][] tableau = new int[7][7];
		int milieu = tableau[0].length / 2;

		for (int i = 0; i < tableau.length; i++) {
			for (int j = 0; j < tableau[0].length; j++) {
				if (j == milieu || i == milieu || i == j)
					tableau[i][j] = 1;
			}
		}

		for (int i = 0; i < tableau.length; i++) {
			for (int j = 0; j < tableau[0].length; j++) {
				System.out.print(tableau[i][j] + "  ");
			}
			System.out.print('\n');
		}
	}

}
