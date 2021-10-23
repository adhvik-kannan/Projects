package jrJava.recursion_2_practices;

public class Practice3_Factorial {

	public static void main(String[] args) {
		System.out.println(factorial(10));
	}

	public static int factorial(int n) {
		if (n == 1)
			return 1;
		return factorial(n - 1) * n;
		// return -1;
	}

}
