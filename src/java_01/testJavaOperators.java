package java_01;

public class testJavaOperators {

	public static void main(String[] args) {

		int a = 10, b = 055, c = 0x2d, e = 3;
		float calc_1 = 0, calc_2 = 0, d = 2.56F;
		a = a + b;
		calc_1 = a * (b + c / d) % e;
		calc_2 = a * b + c / d % e;
		System.out.println(a + b + c + d + e);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		System.out.println("e = " + e);
		System.out.println("calc_1 = " + (int) calc_1);
		System.out.println("calc_2 = " + (float) calc_2);
	}

}
