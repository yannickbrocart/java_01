package java_01;

import java.util.Scanner;

public class testJavaClasses {

	public static void main(String[] args) {

		Scanner lectureClavier = new Scanner(System.in);
		testJavaClasseA A = new testJavaClasseA();

		System.out.println("La position du cercle est : x = " + A.getPosX() + ", y = " + A.getPosY() + ".");
		System.out.println("Le nombre de modification de la position du cercle est " + A.getCompteur() + ".");
		A.setPos(10, 10);
		System.out.println("La position du cercle est : x = " + A.getPosX() + ", y = " + A.getPosY() + ".");
		System.out.println("Le rayon est de " + A.getRayon() + ".");
		A.setRayon(20);
		System.out.println("Le rayon est de " + A.getRayon() + ".");
		A.setRayon(30);
		A.setPos(20, 15);
		System.out.println("La position du cercle est : x = " + A.getPosX() + ", y = " + A.getPosY() + ".");
		System.out.println("Le rayon est de " + A.getRayon() + ".");
		System.out.println("Le nombre de modification de la position du cercle est " + A.getCompteur() + ".");
	}

}
