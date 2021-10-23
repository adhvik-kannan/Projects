package jrJava.array_1;

public class Practice3 {

	public static void main(String[] args) {

		double[] numbers = new double[20];

		// numbers[-1] = 3.1415;
		numbers[20] = 3.1415;

		for (int i = 0; i < 20; i++) {
			numbers[i] = 100.0 + i * 0.1;
			System.out.print(numbers[i] + " ");
		}
		System.out.println();

		System.out.println("Hello there!");

	}

}
