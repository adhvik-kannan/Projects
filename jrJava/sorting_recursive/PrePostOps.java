package jrJava.sorting_recursive;

public class PrePostOps {

	public static void main(String[] args) {

		int x = 10;
		System.out.println(x++);

		x = 10;
		System.out.println(++x);

		x = 10;
		int y = x++ + ++x;
		System.out.println(y);

		x = 10;
		x = x++;
		System.out.println(x);

		x = 10;
		x = ++x + x++;
		System.out.println(x);

		x = 10;
		x = x++ + x++ + x++;
		System.out.println(x);

		x = 10;
		x = ++x + ++x + ++x;
		System.out.println(x);

		x = 10;
		System.out.println(sum(x++, x++, x++));

		x = 10;
		System.out.println(sum(++x, ++x, ++x));

	}

	public static int sum(int a, int b, int c) {
		return a + b + c;
	}

}
