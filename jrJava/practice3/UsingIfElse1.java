package jrJava.practice3;

import java.util.Scanner;

public class UsingIfElse1 {

	public static void main(String[] args) {
		
		int age;
		double allowance = 20.0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("How old are you? Enter an integer.");
		age = scanner.nextInt();
		
		// If the user is older than or equal to 14, we will give $10 more.
		// But if the user is younger than 14, we will take away $10. 
		
		// Can we use two separate, independent if-blocks?
		if(age>=14) {
			allowance += 10.0; // allowance = allowance + 10.0;
			System.out.println("Lucky you! You got $10 more.");
		}
		
		// The following is a separate and independent if-block. 
		if(age<14) { // Even if the first one is true, it will still evaluate this condition.
			allowance -= 10.0; // allowance = allowance - 10.0;
			System.out.println("Too bad! You got $10 less.");
		}
		
		System.out.println("Your allowance will be $" + allowance + ".");
		
	}

}
