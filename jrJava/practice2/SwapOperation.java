package jrJava.practice2;

public class SwapOperation {

	public static void main(String[] args) {

		int value1 = 10;
		int value2 = 15;

		// This is wrong!
		// value2 = value1; // The original value in value2 will be overwritten (we will
		// lose it).
		// value1 = value2;

		int temp = value2; // We need to use another storage space of same type. We need to safely store
							// that away before it gets overwritten.
		value2 = value1;
		value1 = temp;

		System.out.println("value1 =  " + value1 + ", value2 = " + value2);

	}

}
