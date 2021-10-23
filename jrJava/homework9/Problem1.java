package jrJava.homework9;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		
		System.out.println(max(10, 9, 57));
		System.out.println(max(4,5,6));
		System.out.println(min(9,9,57));
		System.out.println(min(4,5,6));
		System.out.println(average(10,9,57));
		System.out.println(average(1,2,3));
		Scanner scanner = new Scanner(System.in);
		System.out.println(sum(scanner, 2));
		System.out.println(sum(scanner, 15));
		System.out.println(sum1(scanner));
		System.out.println(maximumAndCount(scanner));
	}
	
	// A)
	public static int max(int value1, int value2, int value3) {
		int max = value1;
		if(value2>max) {
			max = value2;
		}
		if(value3>max) {
			max = value3;
		}
		return max;
	}
	// B)
	public static double min(double value1, double value2, double value3) {
		double min = value1;
		if(value2<min) {
			min = value2;
		}
		if(value3<min) {
			min = value3;
		}
		return min;
	}
	// C)
	public static double average(int value1, int value2, int value3) {
		double average = (value1+value2+value3)/3.0;
		return average;
	}
	// D)
	public static double sum(Scanner scanner, int numberOfData) {
		double sum = 0;
		int i;
		for(i=1; i<=numberOfData; i++) {
			System.out.println("Enter an integer:");
			int x = scanner.nextInt();
			sum += x;
		}
		return sum;
	}
	// E)
	public static double sum1(Scanner scanner) {
		double sum = 0;
		double x = 0;
		while(x>=0) {
			System.out.println("Enter an integer:");
			x = scanner.nextInt();
			sum += x;
		}
		return sum;
	}
	// F)
	public static double maximumAndCount(Scanner scanner) {
		double data = 0;
		int count = -1;
		double max = 0.;
		while(data>=0) {
			count++;
			if(data>=max) {
				max = data;
			}
			System.out.println("Enter an integer (To stop, enter '-1'):");
			data = scanner.nextDouble();
			
		}
		System.out.println("Total " + count + " of data entered.");
		return max;
	}
	

}
