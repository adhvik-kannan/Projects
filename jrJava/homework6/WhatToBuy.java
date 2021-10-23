package jrJava.homework6;

import java.util.Scanner;

public class WhatToBuy {

	public static void main(String[] args) {

		System.out.println("How much money do you have?");
		Scanner scanner = new Scanner(System.in);
		double money = scanner.nextDouble();

		if (money > 10000) {
			System.out.println("Do you want a car (1) or a house (2)?");
			int option1 = scanner.nextInt();
			if (option1 == 1) {
				System.out.println("A car costs $30,000.");
			} else {
				System.out.println("A house costs $1,000,000.");
			}
		} else {
			System.out.println("Do you want a laptop (1) or a phone (2)?");
			int option1 = scanner.nextInt();
			if (option1 == 1) {
				System.out.println("A laptop costs $1,000.");
			} else {
				System.out.println("A phone costs $700.");
			}
		}

	}

}
