package jrJava.homework7.forLoopPractice4;

import resources.Timer;

public class FunWithPrintf3 {

	public static void main(String[] args) {

		int i;
		int spaceAmount = 1;
		System.out.printf("%2d\n", 0);
		for (i = 0; i < 30; i++) {
			if (i >= 10 && i < 20) {
				spaceAmount -= 2;
			} else {
				spaceAmount += 2;
			}
			System.out.printf("%" + (spaceAmount + 1) + "d\n", 0);
		}

	}

}
