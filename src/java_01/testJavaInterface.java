package java_01;

public interface testJavaInterface {
	final int AUG = 3;

	public void reductionDeTaille(int div);

	public void deplacementVertical(int dep);

	public void deplacementHorizontal(int dep);

	default public int augmentationTaille() {
		return AUG;
	}

}
