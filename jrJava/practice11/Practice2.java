package jrJava.practice11;

public class Practice2 {

	public static void main(String[] args) {

		System.out.println(sum(5, 20, 3));
		System.out.println(sum(1, 10, 1));
		System.out.println(sum(100, 1000, 3));
		System.out.println(sum(555, 5555, 5));
	}

	public static int sum(int begin, int end, int increment) {

		int sum = 0;
		int i;
		for (i = begin; i <= end; i += increment) {
			sum += i;
		}

		return sum;
	}

}
