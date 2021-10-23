package jrJava.recursion_3_issueWithRecursion;

public class Practice1_Fibonacci {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		System.out.println(fibo(50));
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}

	public static long fibo(int n) {
		if (n == 1 || n == 2)
			return 1;
		return fibo(n - 1) + fibo(n - 2);
	}

}
