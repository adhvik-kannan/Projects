package jrJava.homework6;

import java.util.Scanner;

public class DetermineEducation {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Type in your age.");
		int age = scanner.nextInt();

		if (age < 4) {
			System.out.println("You are in preschool.");
		} else if (age < 10) {
			System.out.println("You are in elementary school.");
		} else if (age < 14) {
			System.out.println("You are in middle school.");
		} else if (age < 19) {
			System.out.println("You are in high school.");
		} else {
			System.out.println("You are in college.");
		}

	}

}
