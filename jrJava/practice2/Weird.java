package jrJava.practice2;

public class Weird {

	public static void main(String[] args) {

		int value1 = 5;
		int value2 = 6;

		double average1 = (value1 + value2) / 2; // int/int
		System.out.println("average1 = " + average1);

		double average2 = (value1 + value2) / 2.0; // int/double
		System.out.println("average2 = " + average2);

		// This is actually quite important topic. We will address this in a few weeks.
		// For now, we will remember this: int-int operation, such as int/int, the
		// result will be also an integer.
		// But, int-double operation, such as int/double, the result will be a double.

	}

}
