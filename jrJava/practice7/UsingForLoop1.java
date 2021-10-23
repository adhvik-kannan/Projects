package jrJava.practice7;

public class UsingForLoop1 {

	public static void main(String[] args) {

		// Let's predict what will be printed out on console.

		int i;
		for (i = 1; i <= 5; i++) {
			System.out.println("current i=" + i);
		}
		System.out.println("I am out of the loop and i=" + i);
		System.out.println();

		for (i = 3; i < 9; i += 3) {
			System.out.println("current i=" + i);
		}
		System.out.println("I am out of the loop and i=" + i);
		System.out.println();

		for (i = -1; i <= 6; i += 2) {
			System.out.println("current i=" + i);
		}
		System.out.println("I am out of the loop and i=" + i);
		System.out.println();

		int j;
		for (j = 10; j >= 5; j--) {
			System.out.println("current j=" + j);
		}
		System.out.println("I am out of the loop and j=" + j);
		System.out.println();

		double myMoney;
		for (myMoney = 1.25; myMoney < 2; myMoney += 0.1) {
			System.out.println("current myMoney=" + myMoney);

		}
		System.out.println("I am out of the loop and myMoney=" + myMoney);
		System.out.println();

	}

}
