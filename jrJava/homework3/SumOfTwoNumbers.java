package jrJava.homework3;

import java.util.Scanner;

public class SumOfTwoNumbers {

	public static void main(String[] args) {

		System.out.println("Type in the first number");

		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();

		System.out.println("Type in the second number");

		int y = scanner.nextInt();
		int sum = x + y;

		System.out.println("The sum of the two numbers is " + sum + ".");
	}

}
