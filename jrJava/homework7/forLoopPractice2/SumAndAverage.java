package jrJava.homework7.forLoopPractice2;

import java.util.Scanner;

public class SumAndAverage {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numlength = 10;
		double sum = 0;
		for(int x = 1; x<=numlength; x++) {
			System.out.println("Enter an integer:");
			sum += scanner.nextInt();
		}
		System.out.println("sum = " + sum);
		System.out.println("average = " + sum/numlength);

	}

}
