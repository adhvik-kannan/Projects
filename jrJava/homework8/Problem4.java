package jrJava.homework8;

public class Problem4 {

	public static void main(String[] args) {

		int i, j;

		// A)
		for (i = 0; i <= 9; i++) {
			for (j = 0; j <= 9; j++) {
				if (j <= i) {
					System.out.print(0 + " ");
				} else {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
		/*
		 * // B) for(i=0; i<=9; i++) { for(j=0; j<=9; j++) { if(j<=i) {
		 * System.out.print(0 + " "); } else { System.out.print(j-i + " "); } }
		 * System.out.println(); }
		 * 
		 * // C) for(i=0; i<=9; i++) { for(j=0; j<=9; j++) { if(j==i) {
		 * System.out.print(1 + " "); } else { System.out.print(0 + " "); } }
		 * System.out.println(); }
		 * 
		 * // D) for(i=0; i<=9; i++) { for(j=0; j<=9; j++) { if((j+i)%2 == 0) {
		 * System.out.print(0 + " "); } else { System.out.print(1 + " "); } }
		 * System.out.println(); }
		 */

	}

}
