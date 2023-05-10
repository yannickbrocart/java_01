package java_01;

import java.io.IOException;

public class TestJavaLoops {

	public static void main(String[] args) throws IOException {

		int compteur = 3, cible = 1;
		do {
			System.out.println("dans do-while Compteur est égal à " + compteur++);

		} while (compteur <= cible);

		compteur = 3;
		while (compteur <= cible) {
			System.out.println("dans while Compteur est égal à " + compteur++);
		}

		char Car = '\0';
		String Mot = "";
		while (Car != '\n') {
			Car = (char) System.in.read();
			Mot += Car;
		}
		System.out.print(Mot);
	}
}
