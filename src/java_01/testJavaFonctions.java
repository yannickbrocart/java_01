package java_01;

import java.util.Scanner;

public class testJavaFonctions {

	static int valeurR;
	static double valeurP;

	public static void main(String[] args) {
		try (Scanner lectureClavier = new Scanner(System.in)) {
			System.out.println("Entrez un rayon : ");
			valeurR = lectureClavier.nextInt();
		}
		System.out.println("Le périmètre est de " + périmètre(valeurR));
		périmètre2();
		System.out.println("Le périmètre est de " + valeurP);
	}

	public static double périmètre(int r) {
		double p;
		p = Math.PI * r * 2;
		return p;
	}

	public static void périmètre2() {
		valeurP = Math.PI * valeurR * 2;
	}
}
