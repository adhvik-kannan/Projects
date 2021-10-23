package jrJava.homework4;

import java.util.Scanner;

public class MaxSelector {

	public static void main(String[] args) {
		
		System.out.println("What is the first number?");
		
		Scanner scanner = new Scanner(System.in);
		double firstNumber = scanner.nextDouble();
		
		System.out.println("What is the second number?");
		double secondNumber = scanner.nextDouble();
		
		if(firstNumber>secondNumber) {
			System.out.println(firstNumber + " is greater.");
		}
		if(secondNumber>firstNumber) {
			System.out.println(secondNumber + " is greater.");
		}
		if(firstNumber==secondNumber) {
			System.out.println("The numbers are equal.");
		}
	}

}
