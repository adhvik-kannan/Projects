package jrJava.practice4;

import java.util.Scanner;

public class BooleanType {

	public static void main(String[] args) {
		
		//boolean aaa;  // declaration
		//aaa = true;   // initialization
		//aaa = 50<25;
		//System.out.println("the value stored in variable aaa is "+ aaa);
		
		//boolean aaa = 50>25; // declaration and initialization in the same statement
		
		boolean isRich;
		
		double moneyInThePocket;
		Scanner scanner = new Scanner(System.in);
		System.out.println("How much money do you have in your pocket?");
		moneyInThePocket = scanner.nextDouble();
		
		isRich = moneyInThePocket>=100;
		
		System.out.println("Our verdict: Do we think you are rich? Our answer is " + isRich + ".");
	}

}
