package jrJava.homework3;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		
		System.out.println("Type in the radius");
		
		Scanner scanner = new Scanner(System.in);
		int r = scanner.nextInt();
		double area = Math.PI*Math.pow(r, 2);
		
		System.out.println("The area is " + area + ".");

	}

}
