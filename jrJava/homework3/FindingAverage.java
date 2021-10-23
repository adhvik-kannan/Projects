package jrJava.homework3;

import java.util.Scanner;

public class FindingAverage {

	public static void main(String[] args) {

		System.out.println("Type in the first number");

		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();

		System.out.println("Type in the second number");

		int y = scanner.nextInt();
		double average = (x + y) * 0.5;

		System.out.println("The average is " + average + ".");

	}

}
