package jrJava.homework3;

import java.util.Scanner;

public class PerimeterOfCircle {

	public static void main(String[] args) {

		System.out.println("Type in the radius");
		Scanner scanner = new Scanner(System.in);
		int r = scanner.nextInt();
		double perimeter = 2 * Math.PI * r;
		System.out.println("The perimeter is " + perimeter + ".");

	}

}
