package jrJava.homework6;

import java.util.Scanner;

public class DetermineGrade {

	public static void main(String[] args) {
		
		System.out.println("Type in your percent grade.");
		Scanner scanner = new Scanner(System.in);
		double grade = scanner.nextDouble();
		
		if(grade>=90) {
			System.out.println("You got an A!");
		}
		else if(grade>=80) {
			System.out.println("You got a B!");
		}
		else if(grade>=70) {
			System.out.println("You got a C!");
		}
		else if(grade>=60) {
			System.out.println("You got a D!");
		}
		else
			System.out.println("You got an F!");

	}

}
