package java_01;

import java.util.Scanner;

public class TestJavaTab {

	public static void main(String[] args) {
		String[] monTableau = new String[5];
		Scanner lectureClavier = new Scanner(System.in);

		for (int i = 0; i < monTableau.length; i++) {
			System.out.println("Entrez un nom : ");
			monTableau[i] = lectureClavier.next();
		}
		for (int cell = 0; cell < monTableau.length; cell++) {
			System.out.print(monTableau[cell] + " - ");
		}

	}
}
