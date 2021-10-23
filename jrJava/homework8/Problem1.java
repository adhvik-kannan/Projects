package jrJava.homework8;

public class Problem1 {

	public static void main(String[] args) {
		
		
		
		int i, j;
		
		// A)
		for(i=1; i<=5; i++) {
			for(j=1; j<=i; j++) {
				System.out.println("(" + i + ", " + j + ")");
			}
		}
		System.out.println();

		// B)
		for(i=1; i<=5; i++) {
			for(j=1; j<i; j++) {
				System.out.println("(" + i + ", " + j + ")");
			}
		}
		System.out.println();
		
		// C)
		for(i=1; i<=5; i++) {
			for(j=6-i; j<=5; j++) {
				System.out.println("(" + i + ", " + j + ")");
			}
		}
		System.out.println();
		
		// D)
		for(i=1; i<=5; i++) {
			for(j=1; j<=6-i; j++) {
				System.out.println("(" + i + ", " + j + ")");
			}
		}
		System.out.println();
		
		// E)
		for(i=1; i<=5; i++) {
			for(j=i; j<=5; j++) {
				System.out.println("(" + i + ", " + j + ")");
			}
		}
		System.out.println();
		
		// F)
		for(i=1; i<=5; i++) {
			for(j=5; j>i; j--) {
				System.out.println("(" + i + ", " + j + ")");
			}
		}
		System.out.println();
		

	}

}
