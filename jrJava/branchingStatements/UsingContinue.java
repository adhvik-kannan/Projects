package jrJava.branchingStatements;

public class UsingContinue {

	public static void main(String[] args) {

		// continue statement: use in loop.

		int sum1 = 0;
		for (int i = 1; i <= 100; i++) {

			if (i == 50)
				continue;
			sum1 += i * i;
			System.out.println(i);
		}

		System.out.println(sum1);

		int sum2 = 0;
		for (int i = 1; i <= 100; i++) {

			if (i != 50) {
				sum2 += i * i;
				System.out.println(i);
			}
		}

		System.out.println(sum2);

	}

}
