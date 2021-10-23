package jrJava.homework3;

import java.util.Scanner;

public class TripleANumber {

	public static void main(String[] args) {

		System.out.println("Type in a number.");

		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int triple = number * 3;

		System.out.println("The number tripled is " + triple + ".");

	}

}
