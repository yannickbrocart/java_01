package java_01;

import java.util.Scanner;

public class testJavaObjets {

	public static void main(String[] args) {

		Scanner lectureClavier = new Scanner(System.in);
		testJavaClasseA A = new testJavaClasseA();
		testJavaClasseA B = new testJavaClasseA(49, 49);

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
	}

}
