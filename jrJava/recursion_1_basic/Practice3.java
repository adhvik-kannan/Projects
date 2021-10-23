package jrJava.recursion_1_basic;

public class Practice3 {

	private static int f;

	public static void main(String[] args) {
		mm(0);
		System.out.println(f);

	}

	public static void mm(int a) {
		a++;
		f += 2;
		System.out.println("Welcome a=" + a);
		if (a >= 3)
			return;
		int b = 100;
		mm(a);
		int c = 555;
		System.out.println("Good bye a=" + a);
	}

}
