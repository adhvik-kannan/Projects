package jrJava.practice14_fields;

public class BBB {

	public static int abc;
	public static double pqrs = 0.01;

	public static void mA(int abc, int bb) {
		BBB.abc = abc;
		int x = abc * bb;
		pqrs = (abc + bb) / 2.0;
	}

	public static void mB(double aa) {
		abc++;
		pqrs = abc + aa;
	}

	public static void mC() {
		System.out.println(abc);
		System.out.println(pqrs);
	}
}
