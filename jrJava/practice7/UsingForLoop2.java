package jrJava.practice7;

public class UsingForLoop2 {

	public static void main(String[] args) {

		int i;

		// What seems to be problem with the following?

		for (i = 1; i > 10; i++) {
			System.out.println(i);
		}

		for (i = 10; i <= 0; i--) {
			System.out.println(i);
		}

		for (i = 1; i < 10; i--) {
			System.out.println(i);
		}

		for (i = 10; i >= 0; i--) {
			System.out.println(i);
		}

	}

}
