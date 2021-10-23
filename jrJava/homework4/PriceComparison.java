package jrJava.homework4;

import java.util.Scanner;

public class PriceComparison {

	public static void main(String[] args) {

		System.out.println("What is the price of a pencil?");

		Scanner scanner = new Scanner(System.in);
		double priceOfPencil = scanner.nextDouble();

		System.out.println("What is the price of a pen?");
		double priceOfPen = scanner.nextDouble();
		double difference = Math.abs(priceOfPencil - priceOfPen);

		if (priceOfPencil > priceOfPen) {
			System.out.println("The pencil costs $" + difference + " more than the pen.");
		}
		if (priceOfPen > priceOfPencil) {
			System.out.println("The pen costs $" + difference + " more than the pencil");
		}

	}

}
