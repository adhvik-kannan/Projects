package jrJava.homework4;

import java.util.Scanner;

public class RobinHood {

	public static void main(String[] args) {
		
		System.out.println("How much money do you have?");
		
		Scanner scanner = new Scanner(System.in);
		double money = scanner.nextDouble();
		
		if(money<100) {
			money = money*2;
		}
		else {
			money=money/2;
		}
		System.out.println("You now have $" + money + ".");

	}

}
