package java_01;

public class testJavaClasseA {

	private int posX, posY;
	private int rayon = 15;
	static int compteur = 0;

	public void setPos(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
		compteur += 1;
	}

	public void setRayon(int rayon) {
		this.rayon = rayon;
	}

	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}

	public int getRayon() {
		return rayon;
	}

	public int getCompteur() {
		return compteur;
	}
}
