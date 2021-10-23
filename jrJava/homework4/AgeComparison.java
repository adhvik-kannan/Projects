package jrJava.homework4;

import java.util.Scanner;

public class AgeComparison {

	public static void main(String[] args) {
		
		System.out.println("What is your age?");
		
		Scanner scanner = new Scanner(System.in);
		int yourAge = scanner.nextInt();
		
		System.out.println("What is your friend's age?");
		int friendsAge = scanner.nextInt();
		int difference = Math.abs(yourAge - friendsAge);
		
		if(yourAge > friendsAge) {
			System.out.println("You are older by " + difference + " years.");
		}
		if(friendsAge > yourAge) {
			System.out.println("Your friend is older by " + difference + " years.");
		}

	}

}
