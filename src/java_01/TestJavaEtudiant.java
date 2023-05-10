package java_01;

import java.util.Scanner;

public class TestJavaEtudiant {

	private String nom, prenom;
	private int nbrNotes;
	private double[] notes;
	private double moyenne;
	Scanner lectureClavier = new Scanner(System.in);

	public TestJavaEtudiant() {
		System.out.print("Entrez un nom : ");
		nom = lectureClavier.next();
		System.out.print("Entrez un prénom : ");
		prenom = lectureClavier.next();
		System.out.println("Combien de notes ? ");

		nbrNotes = lectureClavier.nextInt();
		notes = new double[nbrNotes];
		for (int i = 0; i < nbrNotes; i++) {
			System.out.println("Entrez la note n° " + (i + 1) + " : ");
			notes[i] = lectureClavier.nextDouble();
		}

		moyenne = calculMoyenne();
		afficheEtudiant();
	}

	public double calculMoyenne() {
		double resultat = 0.0;
		for (double i : notes)
			resultat += i;
		return resultat / nbrNotes;
	}

	public void afficheEtudiant() {
		System.out.println("L'étudiant se nomme " + nom + " " + prenom + ".");
		System.out.print("Ses notes sont ");
		for (double i : notes) {
			System.out.print(i + ", ");
		}
		System.out.print("et sa moyenne est de " + moyenne);
	}

	public double quelleMoyenne() {
		return moyenne;
	}

}
