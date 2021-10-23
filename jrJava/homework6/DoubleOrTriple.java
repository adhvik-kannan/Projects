package jrJava.homework6;

import java.util.Scanner;

public class DoubleOrTriple {

	public static void main(String[] args) {

		System.out.println("Type in a number.");
		Scanner scanner = new Scanner(System.in);
		double number = scanner.nextDouble();

		if (number > 50) {
			number = number * 3;
		} else if (number > 100) {
			number = number * 2;
		}
		System.out.println("The new number is " + number + ".");
	}

}
