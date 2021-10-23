package jrJava.homework7.forLoopPractice3;

public class Problem2_A {

	public static void main(String[] args) {

		int sum = 0;

		int i;
		for (i = 1; i >= 5; i++) { // 1 is not greater than 5, so the boolean expression is false and the for-loop
									// does not get executed.
			sum = sum + i * i;
		}
		System.out.println(sum);

	}

}
