package jrJava.practice3;

import java.util.Scanner;

public class UsingIfElse4 {

	public static void main(String[] args) {

		double allowance;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("What's your current allowance? Enter a decimal.");
		allowance = scanner.nextDouble();
		
		// If the allowance is greater than $20, we will take away $10.
		//But if the allowance is less than or equal to $20, will give $10 more. 
		
		// What if we use if-else blocks?
		if(allowance>20) {
			allowance -= 10.0;
		}
		else {
			allowance += 10.0;
		}
		
		// If we use if-else blocks,
		// It will guarantees that only one of the two blocks will get executed. 
		// Also, at least one of the two blocks will get executed. 
		
		System.out.println("Now, your allowance is $" + allowance + ".");

	}

}
