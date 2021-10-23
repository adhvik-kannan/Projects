package jrJava.practice1;

import java.util.Scanner;

public class UsingScanner {

	public static void main(String[] args) {
		
		int value1;
		int value2;
		
		// Prompt a message "Type in the money in your pocket:" on the console. 
		System.out.println("Type in the money in your pocket:");
		
		// Creates "Scanner" that will scan signal coming from keyboard (System.in)
		Scanner scanner  = new Scanner(System.in);
		
		value1 = scanner.nextInt(); // it will wait, wait, and wait till something comes along. Then, it will grab it as an integer. 

		value2 = value1*10;
		
		System.out.println("Now you have $" + value2 + " in your pocket.");
	}

}
