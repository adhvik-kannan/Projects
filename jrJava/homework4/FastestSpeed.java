package jrJava.homework4;

import java.util.Scanner;

public class FastestSpeed {

	public static void main(String[] args) {
		
		System.out.println("What is the first distance in miles?");
		
		Scanner scanner = new Scanner(System.in);
		double firstDistance = scanner.nextDouble();
		System.out.println("What is the first time in minutes?");
		double firstTime = scanner.nextDouble();
		double firstSpeed = firstDistance/firstTime;
		double maxSpeed = firstSpeed;
				
		System.out.println("What is the second distance in miles?");
		double secondDistance = scanner.nextDouble();
		System.out.println("What is the second time in minutes");
		double secondTime = scanner.nextDouble();
		double secondSpeed = secondDistance/secondTime;
		if(secondSpeed>maxSpeed) {
			maxSpeed=secondSpeed;
		}
		
		System.out.println("What is the third distance in miles?");
		double thirdDistance = scanner.nextDouble();
		System.out.println("What is the third time in minutes?");
		double thirdTime = scanner.nextDouble();
		double thirdSpeed = thirdDistance/thirdTime;
		if(thirdSpeed>maxSpeed) {
			maxSpeed=thirdSpeed;
		}
		
		System.out.println("The fastest speed is " + maxSpeed + ".");

	}

}
