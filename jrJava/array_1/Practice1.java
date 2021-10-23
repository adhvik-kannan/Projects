package jrJava.array_1;

public class Practice1 {

	public static void main(String[] args) {

		// We want to create an array that can hold 100 int-type data in it.
		// Also, we want to save its (array's) address (reference) in a local variable
		// named 'values'.

		// int[] values = new int[100];
		int size = 200;
		int[] values = new int[size / 2];

		// We want to create an array that can hold 750 double-type data in it.
		// Also, we want to save its (array's) address (reference) in a local variable
		// named 'balances'.

		double[] balances = new double[750];

		// We want to create an array that can hold 10000000 boolean-type data in it.
		// Also, we want to save its (array's) address (reference) in a local variable
		// named 'areHappy'.

		boolean[] areHappy = new boolean[10000000];

		// We are planning to create 500 Ball objects.
		// Before we do that, we will first prepare the storage spaces to hold their
		// addresses (references).
		// Also, we want to save its (array's) address in a local variable named
		// 'balls'.

		Ball[] balls = new Ball[500];

	}

}
