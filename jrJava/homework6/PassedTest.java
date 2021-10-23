package jrJava.homework6;

import java.util.Scanner;

public class PassedTest {

	public static void main(String[] args) {
		
		System.out.println("What percentage score did you receive?");
		Scanner scanner = new Scanner(System.in);
		double score = scanner.nextDouble();
		if(score>=70) {
			System.out.println("You passed!");
		}
		else {
			System.out.println("You failed.");
		}

	}

}
