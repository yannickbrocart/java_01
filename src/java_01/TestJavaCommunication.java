package java_01;

import java.util.Scanner;

public class TestJavaCommunication {

	public static void main(String[] args) {

		int a = 5, b = 25, c = 7;
		boolean booleanLu;
		int intLu;
		char charLu;
		String stringLue;
		String ligneLue;

		System.out.println("a = " + a);
		System.out.println(b + " est la valeur de b");
		System.out.println("c est égal à " + c);
		System.out.println(a + " + " + b + " est égal à " + (a + b));

		Scanner lectureClavier = new Scanner(System.in);

		System.out.print("Entrez un boolean : ");
		booleanLu = lectureClavier.nextBoolean();
		System.out.println("boolean lu = " + booleanLu);

		System.out.print("Entrez un integer : ");
		intLu = lectureClavier.nextInt();
		System.out.println("integer lu = " + intLu);

		System.out.print("Entrez un caractère : ");
		charLu = lectureClavier.next().charAt(0);
		System.out.println("charactère lu = " + charLu);

		System.out.print("Entrez une chaîne : ");
		stringLue = lectureClavier.next();
		System.out.println("Chaîne lue = " + stringLue);

		lectureClavier.nextLine(); // Consume newline left-over

		System.out.print("Entrez une ligne : ");
		ligneLue = lectureClavier.nextLine();
		System.out.println("Ligne lue = " + ligneLue);

		lectureClavier.close();
	}

}
