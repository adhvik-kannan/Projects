package jrJava.homework7.forLoopPractice3;

public class Problem1_C {

	public static void main(String[] args) {

		int sum = 0;
		int i;
		for (i = 1; i < 5; i++) {
			System.out.println("i = " + i);
			sum += i * i;
		}
		System.out.println("sum = " + sum);
		/*
		 * PREDICTION: i=1 i-2 i=3 i=4 sum=30
		 */

	}

}
