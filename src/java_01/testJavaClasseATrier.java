package java_01;

import java.util.Scanner;

public class testJavaClasseATrier {

	private String nom, prenom;
	private double[] notes, moyenne;
	Scanner lectureClavier = new Scanner(System.in);

	public testJavaClasseATrier() {
		System.out.print("Entrez un nom : ");
		nom = lectureClavier.next();
		System.out.print("Entrez un prénom : ");
		prenom = lectureClavier.next();
		System.out.println("Combien de notes ? ");
		int nbrNotes = lectureClavier.nextInt();
		notes = new double[nbrNotes];
		for (int i = 0; i < nbrNotes; i++) {
			System.out.println("Entrez la note n° " + (i + 1) + " : ");
			notes[i] = lectureClavier.nextDouble();
		}
		System.out.print("Les notes sont ");
		for (int i = 0; i < nbrNotes; i++) {
			System.out.print(notes[i] + ", ");
		}
	}

}
