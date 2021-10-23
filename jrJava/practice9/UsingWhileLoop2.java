package jrJava.practice9;

public class UsingWhileLoop2 {

	public static void main(String[] args) {

		// Nesting for-loops;
		/*
		 * int i, j;
		 * 
		 * for(i=1; i<=5; i++) { for(j=1; j<=i; j++) { System.out.println(i + ", " + j);
		 * } }
		 */

		// Doing the same using Nesting while-loops;

		int i, j;

		i = 1;
		while (i <= 5) {
			j = 1;
			while (j <= i) {
				System.out.println(i + ", " + j);
				j++;
			}
			i++;
		}
	}

}
