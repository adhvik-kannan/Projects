package jrJava.practice2;

import java.util.Scanner;

public class CostCalculator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double priceOfPen;
		int numberOfPens;
		double priceOfPencil;
		int numberOfPencils;

		double costOfPens, costOfPencils, totalCost; // We can declare multiple variables in the same statement as long
														// as they are all the same type.

		System.out.println("We can calculate your stationary total cost.");
		System.out.println();

		System.out.println("What's the price of a pen? (Type in as a decimal number)");
		priceOfPen = scanner.nextDouble(); // We expect a decimal input coming from the keyboard.
		System.out.println("How many pens are you buying? (Type in as an integer number");
		numberOfPens = scanner.nextInt(); // We expect an integer input coming from the keyboard.

		System.out.println("What's the price of a pencil? (Type in as a decimal number)");
		priceOfPencil = scanner.nextDouble(); // We expect a decimal input coming from the keyboard.
		System.out.println("How many pencils are you buying? (Type in as an integer number");
		numberOfPencils = scanner.nextInt(); // We expect an integer input coming from the keyboard.

		costOfPens = priceOfPen * numberOfPens;
		costOfPencils = priceOfPencil * numberOfPencils;
		totalCost = costOfPens + costOfPencils;

		System.out.println("It will cost $" + costOfPens + " for pens and $" + costOfPencils + " for pencils.");
		System.out.println("So it will cost total $" + totalCost + ".");

	}

}
