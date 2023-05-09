package java_01;

public class testJavaHeritage extends testJavaClasseA implements testJavaInterface {

	protected String color;

	public testJavaHeritage() {
		super();
		color = "green";
	}

	public testJavaHeritage(int posX, int posY, int rayon, String color) {
		super(posX, posY);
		this.rayon = rayon;
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void reductionDeTaille(int div) {
		this.rayon /= div;

	}

	@Override
	public void deplacementVertical(int dep) {
		this.posX += dep;

	}

	@Override
	public void deplacementHorizontal(int dep) {
		this.posY += dep;

	}

	@Override
	public int augmentationTaille() {
		return 6;
	}

}
