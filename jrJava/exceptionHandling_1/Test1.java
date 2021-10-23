package jrJava.exceptionHandling_1;

public class Test1 {

	public static void main(String[] args) {

		int[] a = { 4, 5, 1, 8, 3 };

		methodA(a, 6);

		System.out.println("My job is done!");
	}

	/*
	 * public static void methodA(int[] values, int index) { try {
	 * System.out.println(values[index]); } catch(Exception e) {
	 * System.out.println("I am catch block."); }
	 * 
	 * System.out.println("reached the end of methodA()."); }
	 */

	public static void methodA(int[] values, int index) {

		if (index < 0 || index > values.length - 1) {
			System.out.println("Bad index!");
			return;
		}

		System.out.println(values[index]);

	}
}
