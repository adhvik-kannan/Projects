package jrJava.homework6;

import java.util.Scanner;

public class CanBuy {

	public static void main(String[] args) {

		System.out.println("How much money do you have?");
		Scanner scanner = new Scanner(System.in);
		double money = scanner.nextDouble();
		
		if(money>2000) {
			System.out.println("You can buy a car!");
		}
		else if(money>=700) {
			System.out.println("You can buy a laptop!");
		}
		else {
			System.out.println("You can't buy anything!");
		}

	}

}
