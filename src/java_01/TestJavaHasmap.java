package java_01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class TestJavaHasmap {

	public static void main(String[] args) {

		ArrayList liste = new ArrayList();
		HashMap listeClassee = new HashMap();
		TestJavaEtudiant etudiant = new TestJavaEtudiant();

		liste.add("coucou");
		liste.add("hello");
		liste.add("jeudi");

		listeClassee.put("1", "janvier");
		listeClassee.put("2", "février");
		listeClassee.put(4, etudiant);
		listeClassee.put("3", 23);

		System.out.println(liste.toString().toUpperCase());
		System.out.println(listeClassee.get("3"));
		System.out.println(listeClassee.get("2"));
		System.out.println(listeClassee.get("1"));

		if (listeClassee.get("2") != null)
			listeClassee.remove("2");
		System.out.println("------------------- BOUCLES CLASSIQUES -----------------");

		System.out.println(liste.toString().toUpperCase());
		System.out.println(listeClassee.get("3"));
		if (listeClassee.get("2") != null)
			System.out.println(listeClassee.get("2"));
		System.out.println(listeClassee.get("1"));

		System.out.println("------------------- ITERATOR -----------------");
		for (Iterator iterator = liste.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}

		Collection c = listeClassee.values();
		for (Iterator iterator = c.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}

	}

}
