package jrJava.homework6;

import java.util.Scanner;

public class IdentifyShape {

	public static void main(String[] args) {

		System.out.println("Type in the number of sides your shape has.");
		Scanner scanner = new Scanner(System.in);
		int sides = scanner.nextInt();

		if (sides == 3) {
			System.out.println("It is a triangle!");
		} else if (sides == 4) {
			System.out.println("It is a rectangle!");
		} else if (sides == 5) {
			System.out.println("It is a pentagon!");
		} else if (sides == 6) {
			System.out.println("It is a hexagon!");
		} else {
			System.out.println("Invalid shape!");
		}

	}

}
