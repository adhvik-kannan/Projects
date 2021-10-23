package jrJava.branchingStatements;

public class UsingBreak {

	public static void main(String[] args) {

		// break statement: we can use it in loop or switch.

		int sum1 = 0;
		for (int i = 1; i <= 100; i++) {

			sum1 += i * i;
			if (sum1 > 200000)
				break;
			System.out.println(i);
		}

		System.out.println(sum1);

		int sum2 = 0;
		boolean shouldContinue = true;
		for (int i = 1; i <= 100 && shouldContinue; i++) {

			sum2 += i * i;
			if (sum2 > 200000)
				shouldContinue = false;
			System.out.println(i);
		}

		System.out.println(sum2);

	}

}
