package java_01;

import java.util.Scanner;

public class TestJavaConditions {

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

		switch (a) {
		case 10:
			System.out.println(a + " est 10");
			break;
		case 20:
			System.out.println(a + " est 20");
			break;
		default:
			System.out.println(a + " est différent de 10 ou 20");
		}

	}
}
