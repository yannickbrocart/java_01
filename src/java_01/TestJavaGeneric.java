package java_01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class TestJavaGeneric {

	public static void main(String[] args) {

		ArrayList<TestJavaEtudiant> liste = new ArrayList<TestJavaEtudiant>();
		HashMap<Integer, TestJavaEtudiant> listeClassee = new HashMap<Integer, TestJavaEtudiant>();
		TestJavaEtudiant etudiant1 = new TestJavaEtudiant();
		TestJavaEtudiant etudiant2 = new TestJavaEtudiant();

		liste.add(etudiant1);
		liste.add(etudiant2);
		liste.add(etudiant2);
		liste.remove(0);
		listeClassee.put(1, etudiant1);
		listeClassee.put(2, etudiant2);
		Collection<TestJavaEtudiant> c = listeClassee.values();

		System.out.println("--------------");
		for (TestJavaEtudiant e : liste)
			e.afficheUnEtudiant();
		System.out.println("--------------");
		for (TestJavaEtudiant e : c) {
			e.afficheUnEtudiant();
		}

	}

}
