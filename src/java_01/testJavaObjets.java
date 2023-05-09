package java_01;

import java.util.Scanner;

public class testJavaObjets {

	public static void main(String[] args) {

		Scanner lectureClavier = new Scanner(System.in);
		testJavaClasseA A = new testJavaClasseA();
		testJavaClasseA B = new testJavaClasseA(49, 49);
		testJavaHeritage H1 = new testJavaHeritage();
		testJavaHeritage H2 = new testJavaHeritage(37, 37, 12, "blue");

		System.out.println("Le cercle A à pour coordonnées x = " + A.getPosX() + " et y =" + A.getPosY()
				+ " et pour rayon " + A.getRayon());
		System.out.println("Le cercle B à pour coordonnées x = " + B.getPosX() + " et y =" + B.getPosY()
				+ " et pour rayon " + B.getRayon());

		A.setPos(20, 20);
		B.setPos(15, 15);
		B.setRayon(120);
		System.out.println("Le cercle A à pour coordonnées x = " + A.getPosX() + " et y =" + A.getPosY()
				+ " et pour rayon " + A.getRayon());
		System.out.println("Le cercle B à pour coordonnées x = " + B.getPosX() + " et y =" + B.getPosY()
				+ " et pour rayon " + B.getRayon());

		A.inverserRayons(B);
		System.out.println("");
		System.out.println("Inversion des rayons : ");
		System.out.println("");

		System.out.println("Le cercle A à pour coordonnées x = " + A.getPosX() + " et y =" + A.getPosY()
				+ " et pour rayon " + A.getRayon());
		System.out.println("Le cercle B à pour coordonnées x = " + B.getPosX() + " et y =" + B.getPosY()
				+ " et pour rayon " + B.getRayon());

		B.setRayon(1010);
		System.out.println("Le cercle A à pour coordonnées x = " + A.getPosX() + " et y =" + A.getPosY()
				+ " et pour rayon " + A.getRayon());
		System.out.println("Le cercle B à pour coordonnées x = " + B.getPosX() + " et y =" + B.getPosY()
				+ " et pour rayon " + B.getRayon());

		System.out.println("");
		System.out.println("Héritage : ");
		System.out.println("");

		System.out.println("Le cercle A à pour coordonnées x = " + H1.getPosX() + " et y =" + H1.getPosY()
				+ " et pour rayon " + H1.getRayon());
		System.out.println("Le cercle B à pour coordonnées x = " + H2.getPosX() + " et y =" + H2.getPosY()
				+ " et pour rayon " + H2.getRayon());

	}

}
