package jrJava.practice13_scope;

public class Practice1 {

	public static void main(String[] args) {

		int a = 10;
		boolean b = true;

		if (b) {
			double c = 0.1;
			System.out.println(a + ", " + b + ", " + c);
		}

		System.out.println(a + ", " + b);
	}

	public static int sum(int begin, int end, int increment) {

		int sum = 0;
		int cubic;
		int i;
		for (i = begin; i <= end; i += increment) {
			cubic = i * i * i; // int cubic = i*i*i;
			sum += cubic;
		}
		return sum;
	}

	public static int sum2(int begin, int end, int increment) {

		int sum = 0;
		int cubic;

		for (int i = begin; i <= end; i += increment) {
			cubic = i * i * i; // int cubic = i*i*i;
			sum += cubic;
		}

		return sum;
	}
}
