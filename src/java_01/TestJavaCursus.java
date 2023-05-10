package java_01;

import java.util.Scanner;

public class TestJavaCursus {
	private TestJavaEtudiant[] liste;

	public TestJavaCursus() {
		Scanner lectureClavier = new Scanner(System.in);
		System.out.println("Combien d'étudiants ? ");
		int nbrEtudiants = lectureClavier.nextInt();
		liste = new TestJavaEtudiant[nbrEtudiants];
		for (int etudiant = 0; etudiant < liste.length; etudiant++)
			liste[etudiant] = new TestJavaEtudiant();
	}

	public void afficheLesEtudiants() {
		for (TestJavaEtudiant e : liste) {
			e.afficheUnEtudiant();
		}
	}

	public void classeLesEtudiantsParMoyenne() {
		int indexDuPlusPetit = 0;
		TestJavaEtudiant etudiantTmp;
		for (int index = 0; index < liste.length; index++) {
			indexDuPlusPetit = ouEstLePlusPetit(index);
			etudiantTmp = liste[index];
			liste[index] = liste[indexDuPlusPetit];
			liste[indexDuPlusPetit] = etudiantTmp;
		}
	}

	private int ouEstLePlusPetit(int debut) {
		int lePlusPetit = debut;
		for (int index = debut + 1; index < liste.length; index++) {
			if (liste[index].quelleMoyenne() < liste[lePlusPetit].quelleMoyenne())
				lePlusPetit = index;
		}
		return lePlusPetit;
	}
}
