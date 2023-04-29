package java_01;

public class testJavaConditions {

	public static void main(String[] args) {

		int a = 0, b = 5, c = 2, d = 10;
		char lettre_1 = 'c', lettre_2 = 'b';

		if (a != b) {
			System.out.println("a est différent de b");
			if (a != c) {
				System.out.println("a est différent de c");
			}
		} else
			System.out.println("a est égal à b");
		if (lettre_1 >= lettre_2 || lettre_1 == lettre_2 && !(lettre_1 <= lettre_2))
			System.out.println(lettre_1 + " n'est pas plus petit que " + lettre_2);
	}
}
