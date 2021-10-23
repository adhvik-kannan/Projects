package jrJava.practice3;

import java.util.Scanner;

public class UsingIfElse3 {

	public static void main(String[] args) {

		double allowance;

		Scanner scanner = new Scanner(System.in);
		System.out.println("What's your current allowance? Enter a decimal.");
		allowance = scanner.nextDouble();

		// If the allowance is greater than $20, we will take away $10.
		// But if the allowance is less than or equal to $20, will give $10 more.

		// What if we use two separate and independent if-blocks.
		if (allowance > 20) {
			allowance -= 10.0;
		}

		if (allowance <= 20) {
			allowance += 10.0;
		}

		// It is dangerous. Both if-blocks can be executed.
		// FOr example, the allowance is 2, first block will get executed.
		// (Inside the first block, the value of allowance get changed.)
		// Because of thechanged value of allowance, the second if-block will also get
		// executed.

		System.out.println("Now, your allowance is $" + allowance + ".");
	}

}
