package java_01;

public class TestJavaGestionCursus {

	public static void main(String[] args) {

		TestJavaCursus cursus = new TestJavaCursus();
		System.out.println("------------------ RECAPITULATIF ------------------ ");
		cursus.afficheLesEtudiants();
		cursus.classeLesEtudiantsParMoyenne();
		System.out.println("------------------- CLASSEMENT ------------------- ");
		cursus.afficheLesEtudiants();
	}
}