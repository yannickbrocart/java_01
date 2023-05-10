package java_01;

import java.util.Scanner;

public class TestJavaCursus {
	private TestJavaEtudiant[] liste;

	public TestJavaCursus() {
		Scanner lectureClavier = new Scanner(System.in);
		System.out.println("Combien d'étudiants ? ");
		int nbrEtudiants = lectureClavier.nextInt();
		liste = new TestJavaEtudiant[nbrEtudiants];
		for (TestJavaEtudiant etudiant : liste) {
			etudiant = new TestJavaEtudiant();
		}
	}

	public void afficheTabDeClasseATrier() {
		for (TestJavaEtudiant etudiant : liste)
			etudiant.afficheEtudiant();
	}
}
