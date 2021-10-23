package jrJava.homework4;

import java.util.Scanner;

public class MaxFinder {

	public static void main(String[] args) {
		
		System.out.println("What is the first number?");
		
		Scanner scanner = new Scanner(System.in);
		double firstNumber = scanner.nextDouble();
		double maximum = firstNumber;
		
		System.out.println("What is the second number?");
		double secondNumber = scanner.nextDouble();
		if(secondNumber>maximum) {
			maximum = secondNumber;
		}

		System.out.println("What is the third number?");
		double thirdNumber = scanner.nextDouble();
		if(thirdNumber>maximum) {
			maximum = thirdNumber;
		}
		System.out.println("What is the fourth number?");
		double fourthNumber = scanner.nextDouble();	
		if(fourthNumber>maximum) {
			maximum = fourthNumber;
		}
		System.out.println(maximum + " is the greatest.");

	}

}
