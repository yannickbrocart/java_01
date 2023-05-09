package java_01;

public class testJavaHeritage extends testJavaClasseA {

	private String col;

	public testJavaHeritage() {
		super;
		col = "green";
	}

	public testJavaHeritage(int posX, int posY, int rayon, String col) {
		this.posX = posX;
		this.posY = posY;
		this.rayon = rayon;
		this.col = col;
	}

}
