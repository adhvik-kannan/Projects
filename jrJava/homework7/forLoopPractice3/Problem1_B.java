package jrJava.homework7.forLoopPractice3;

public class Problem1_B {

	public static void main(String[] args) {

		int sum = 0;
		int i;
		for (i = 10; i > 7; i--) {
			System.out.println("i = " + i);
			sum = sum + i * (i - 1);
		}
		/*
		 * PREDICTION: The value of i will be printed out 3 times. i=10 i=9 i=8
		 */

	}

}
