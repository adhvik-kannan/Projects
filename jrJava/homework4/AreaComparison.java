package jrJava.homework4;

import java.util.Scanner;

public class AreaComparison {

	public static void main(String[] args) {

		System.out.println("What is the radius of the circle?");

		Scanner scanner = new Scanner(System.in);
		double radius = scanner.nextDouble();

		System.out.println("What is the width of the rectangle?");
		double width = scanner.nextDouble();

		System.out.println("What is the height of the rectangle");
		double height = scanner.nextDouble();

		double areaOfCircle = Math.PI * Math.pow(radius, 2);
		double areaOfRectangle = width * height;

		double difference = Math.abs(areaOfCircle - areaOfRectangle);
		if (areaOfCircle > areaOfRectangle) {
			System.out.println("The circle is greater by " + difference + " units squared.");
		}
		if (areaOfRectangle > areaOfCircle) {
			System.out.println("The rectangle is greater by " + difference + " units squared.");
		}
		if (areaOfCircle == areaOfRectangle) {
			System.out.println("The circle and rectangle have the same area.");
		}

	}

}
