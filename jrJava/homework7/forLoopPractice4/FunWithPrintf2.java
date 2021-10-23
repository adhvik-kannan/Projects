package jrJava.homework7.forLoopPractice4;

public class FunWithPrintf2 {

	public static void main(String[] args) {

		int i;
		for (i = 1; i < 10; i++) {
			System.out.printf("%" + (2 * i + 1) + "d \n", i);
		}
		for (i = 9; i >= 1; i--) {
			System.out.printf("%" + (2 * i + 1) + "d \n", i);
		}

	}

}
