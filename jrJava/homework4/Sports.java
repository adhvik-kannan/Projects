package jrJava.homework4;

import java.util.Scanner;

public class Sports {

	public static void main(String[] args) {

		System.out.println("Do you prefer indoor sports(1) or outdoor sports(2)?");

		Scanner scanner = new Scanner(System.in);
		int option1 = scanner.nextInt();

		if (option1 == 1) {
			System.out.println("Do you prefer basketball(1) or ping-pong(2)?");
			int indoorOption = scanner.nextInt();
			if (indoorOption == 1) {
				System.out.println("Meet in the gym at 10:00.");
			} else {
				System.out.println("Meet in the gym at 11:00.");
			}
		} else {
			System.out.println("Do you prefer soccer(1) or football(2)?");
			int outdoorOption = scanner.nextInt();
			if (outdoorOption == 1) {
				System.out.println("Meet on the field at 1:00.");
			} else {
				System.out.println("Meet on the field at 2:00.");
			}
		}

	}

}
