package jrJava.homework4;

import java.util.Scanner;

public class OverallCostComparison {

	public static void main(String[] args) {

		System.out.println("How many pencils do you have?");

		Scanner scanner = new Scanner(System.in);
		int numberOfPencils = scanner.nextInt();

		System.out.println("What is the cost of each pencil?");
		double priceOfPencil = scanner.nextDouble();

		System.out.println("How many pens do you have?");
		int numberOfPens = scanner.nextInt();

		System.out.println("What is the cost of each pen?");
		double priceOfPen = scanner.nextDouble();

		double totalCostOfPencils = numberOfPencils * priceOfPencil;
		double totalCostOfPens = numberOfPens * priceOfPen;

		double difference = Math.abs(totalCostOfPencils - totalCostOfPens);

		if (totalCostOfPencils > totalCostOfPens) {
			System.out.println("The pencils cost $" + difference + " more than the pens.");
		}
		if (totalCostOfPens > totalCostOfPencils) {
			System.out.println("The pens cost $" + difference + " more than the pencils.");
		}
	}

}
