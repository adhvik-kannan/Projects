package jrJava.practice3;

import java.util.Scanner;

public class NestingBlockStructure {

	public static void main(String[] args) {

		int x;
		int y;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the x-coordinate of the point in integer.");
		x = scanner.nextInt();
		System.out.println("Enter the y-coordinate of the point in integer.");
		y = scanner.nextInt();

		if (x >= 0) {

			if (y >= 0) {
				System.out.println("Your point is in Q1.");
			} else {
				System.out.println("Your point is in Q4.");
			}
		} else {

			if (y >= 0) {
				System.out.println("Your point is in Q2.");
			} else {
				System.out.println("Your point is in Q3.");
			}

		}
	}

}
