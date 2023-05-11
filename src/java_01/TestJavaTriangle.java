package java_01;

import java.util.Scanner;

public class TestJavaTriangle {

	public static void main(String[] args) {

		Scanner lectureClavier = new Scanner(System.in);
		System.out.println("Entrez un nombre de lignes pour le triangle : ");
		int nbrLignes = lectureClavier.nextInt();
		int nbrColonnes = 2 * nbrLignes - 1;
		int[][] triangle = new int[nbrLignes][nbrColonnes];
		int milieu = triangle[0].length / 2;

		for (int i = 0; i < nbrLignes; i++) {
			for (int j = -i; j <= i; j++) {
				triangle[i][milieu - j] = 1;
			}
		}

		for (int i = 0; i < nbrLignes; i++) {
			for (int j = 0; j < nbrColonnes; j++) {
				switch (triangle[i][j]) {
				case 1: {
					System.out.print("*");
					break;
				}
				default:
					System.out.print(" ");
				}
			}
			System.out.print('\r');
		}

	}

}
