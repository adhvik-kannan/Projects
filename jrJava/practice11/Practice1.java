package jrJava.practice11;

public class Practice1 {

	public static void main(String[] args) {

		int maximum = findMax(15, 57, 34);
		System.out.println(maximum);

		System.out.println(findMax(3, 8, 5));
	}

	public static int findMax(int value1, int value2, int value3) {
		int max = value1;

		if (value2 > max) {
			max = value2;
		}

		if (value3 > max) {
			max = value3;
		}

		return max;
	}

}
