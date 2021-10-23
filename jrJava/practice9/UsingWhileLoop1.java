package jrJava.practice9;

public class UsingWhileLoop1 {

	public static void main(String[] args) {

		// 1*1 + 2*2 + 3*3 + ... + 10*10

		// If we do this by using a for-loop;
		/*
		 * int sum = 0; int i; for(i=1; i<=10; i++) { sum += i*i; }
		 * System.out.println("sum = " + sum);
		 */

		// If we do the same thing using a while loop;
		int sum = 0;

		int i;
		i = 1;
		while (i <= 10) {
			sum += i * i;
			i++;
		}
		System.out.println("sum = " + sum);
	}

}
