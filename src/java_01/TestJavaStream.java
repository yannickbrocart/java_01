package java_01;

import java.util.ArrayList;

public class TestJavaStream {

	public static void main(String[] args) {

		ArrayList<TestJavaEtudiant> listeEtudiants = new ArrayList<TestJavaEtudiant>();
		listeEtudiants.add(new TestJavaEtudiant());
		listeEtudiants.add(new TestJavaEtudiant());
		listeEtudiants.add(new TestJavaEtudiant());

		listeEtudiants.stream().sorted();
		System.out.println(listeEtudiants);

	}

}
