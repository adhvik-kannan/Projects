package jrJava.practice8;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		int i, j;
		/*
		for(i=2; i<=9; i++) {
			for(j=2; j<=9; j++) {;
				System.out.println(i + " x " + j + " = " + i*j);
			}
			System.out.println();
		}
		*/
		
		
		// Avoid the duplicate entries.
		for(i=2; i<=9; i++) {
			for(j=i; j<=9; j++) {;
				System.out.println(i + " x " + j + " = " + i*j);
			}
			System.out.println();
		}

	}

}
