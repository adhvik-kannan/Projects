package jrJava.homework4;

import java.util.Scanner;

public class FasterSpeed {

	public static void main(String[] args) {
		
		System.out.println("What is your distance in miles?");
		
		Scanner scanner = new Scanner(System.in);
		double distance = scanner.nextDouble();
		
		System.out.println("What is your time in minutes?");
		double time = scanner.nextDouble();
		
		System.out.println("What is your friend's distance in miles?");
		double friendsDistance = scanner.nextDouble();
		
		System.out.println("What is your friend's time in minutes");
		double friendsTime = scanner.nextDouble();
		
		double yourSpeed = distance/time;
		double friendsSpeed = friendsDistance/friendsTime;
		
		double speedDifference = Math.abs(yourSpeed - friendsSpeed);
		
		if(yourSpeed>friendsSpeed) {
			System.out.println("You are faster by " + speedDifference + ".");
		}
		if(friendsSpeed>yourSpeed) {
			System.out.println("Your friend is faster by " + speedDifference + ".");
		}
		if(yourSpeed==friendsSpeed) {
			System.out.println("You both have the same speed.");
		}
	}

}
