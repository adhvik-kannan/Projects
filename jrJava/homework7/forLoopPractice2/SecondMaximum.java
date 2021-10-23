package jrJava.homework7.forLoopPractice2;

import java.util.Scanner;

public class SecondMaximum {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int x = 0;
		int maximum = 0;
		int secondMaximum = 0;
		int i;
		for (i = 1; i <= 10; i++) {
			System.out.println("Enter an integer:");
			x = scanner.nextInt();
			if (x > maximum || i == 1) {
				secondMaximum = maximum;
				maximum = x;

			}

		}

		System.out.println("2nd Maximum = " + secondMaximum);

	}

}
