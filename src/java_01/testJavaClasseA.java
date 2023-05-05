package java_01;

public class testJavaClasseA {

	private int posX, posY;
	public static final int RayonDeBase = 15;
	private int rayon = RayonDeBase;
	static int compteur = 0;

	public testJavaClasseA() {
		posX = 50;
		posY = 50;
		rayon = RayonDeBase;
	}

	public testJavaClasseA(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
		rayon = RayonDeBase;
	}

	public void setPos(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
		compteur += 1;
	}

	public void setRayon(int rayon) {
		if (rayon > 0 && rayon < 600)
			this.rayon = rayon;
		else
			this.rayon = RayonDeBase;
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

	public void inverserRayons(testJavaClasseA objet2) {
		int tmpRayon = objet2.getRayon();
		objet2.setRayon(this.getRayon());
		this.setRayon(tmpRayon);
	}
}
