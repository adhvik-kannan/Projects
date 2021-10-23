package jrJava.homework7.forLoopPractice2;

import java.util.Scanner;

public class Maximum {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int x = 0;
		int maximum = 0;
		int i;
		for (i = 1; i <= 10; i++) {
			System.out.println("Enter an integer:");
			x = scanner.nextInt();
			if (x > maximum) {
				maximum = x;
			}
		}

		System.out.println("Maximum = " + maximum);

	}

}
