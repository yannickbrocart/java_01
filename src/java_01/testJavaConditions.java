package java_01;

import java.util.Scanner;

public class testJavaConditions {

	public static void main(String[] args) {

		int a, b, plusGrand;
		try (Scanner lectureClavier = new Scanner(System.in)) {
			System.out.println("Entrez une première valeur");
			a = lectureClavier.nextInt();
			System.out.println("Entrez une seconde valeur");
			b = lectureClavier.nextInt();
		}

		if (a > b)
			plusGrand = a;
		else
			plusGrand = b;

		System.out.println("Le plus grand chiffre est " + plusGrand);

	}
}
