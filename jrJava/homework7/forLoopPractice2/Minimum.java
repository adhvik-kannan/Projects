package jrJava.homework7.forLoopPractice2;

import java.util.Scanner;

public class Minimum {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
			
		int x = 0;
		int minimum = 0;
		int i;
		for(i=1; i<=10; i++) {
			System.out.println("Enter an integer:");
			x = scanner.nextInt();
			if(x<minimum || i==1) {
				minimum = x;
			}
			
		}

		System.out.println("Minimum = " + minimum);


	}

}
