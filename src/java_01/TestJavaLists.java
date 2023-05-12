package java_01;

import java.util.ArrayList;

public class TestJavaLists {
	public static void main(String[] args) {

		ArrayList liste = new ArrayList();
		TestJavaEtudiant etudiant = new TestJavaEtudiant();

		for (int i = 0; i < 12; i++) {
			if (i % 2 == 0)
				liste.add(etudiant);
			else
				liste.add(etudiant.quelleMoyenne());
		}

		for (int i = 0; i < liste.size(); i++) {
			if (i % 2 == 0)
				System.out.println(liste.get(i).toString() + " ");
			else
				System.out.println(liste.get(i) + " ");
		}
	}
}
