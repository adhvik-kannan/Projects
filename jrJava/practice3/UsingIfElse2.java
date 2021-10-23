package jrJava.practice3;

import java.util.Scanner;

public class UsingIfElse2 {

	// IF we compare this with the previous "UsingIfElse1.java",
	// It appears that they deliver the same thing.
	// Inside though, there is a small difference.

	public static void main(String[] args) {

		int age;
		double allowance = 20.0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("How old are you? Enter an integer.");
		age = scanner.nextInt();

		// If the user is older than or equal to 14, we will give $10 more.
		// But if the user is younger than 14, we will take away $10.

		// Can we use the if-else block?
		if (age >= 14) {
			allowance += 10.0; // allowance = allowance + 10.0;
			System.out.println("Lucky you! You got $10 more.");
		} else { // If the first one is true, it will not even come here.
			allowance -= 10.0; // allowance = allowance - 10.0;
			System.out.println("Too bad! You got $10 less.");
		}

		System.out.println("Your allowance will be $" + allowance + ".");

	}

}
