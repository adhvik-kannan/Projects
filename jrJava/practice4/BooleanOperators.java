package jrJava.practice4;

public class BooleanOperators {

	public static void main(String[] args) {

		// !(NOT) operator:

		int x = 10;
		boolean a = x > 5;
		// boolean b = !a;
		boolean b = !(x > 5);
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		// &&(AND) operator:

		// boolean c = true && false;
		int y = 25;
		boolean c = y > 20 && y < 30;
		System.out.println("c = " + c);
		boolean d = y < 50 && y != 10 && !(y == 20);
		System.out.println("d = " + d);

		// ||(OR) operator:
		int z = 50;
		boolean e = z > 0 || z > 100 || z < -100;
		System.out.println("e = " + e);
		boolean f = z == 10 || z != 10;
		System.out.println("f = " + f);
	}

}
