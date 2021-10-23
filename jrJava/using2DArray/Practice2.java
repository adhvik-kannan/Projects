package jrJava.using2DArray;

public class Practice2 {

	// Initialization
	public static void main(String[] args) {
		
		int[] a = {1, 2, 3};
		//int[] b1;
		//b1 = {1, 2, 3}
		
		int[] a2 = new int[] {1, 2, 3};
		int[] b2;
		b2 = new int[] {1, 2, 3};
		
		// Initialization of 2D arrays.
		
		int[] c1 = {1, 2, 3};
		int[] c2 = {4, 5, 6, 7};
		int[] c3 = {11, 12, 13};
		int[] c4 = {21, 22, 23, 24, 25};
		
		int[][] d1 = {c1, c2, c3, c4};
		int[][] d2; 
		d2 = new int[][] {c1, c2, c3, c4};
		
		int[][] e1 = {{1, 2, 3}, {4, 5, 6, 7}, {11, 12, 13}, {21, 22, 23, 24, 25}};
		int[][] e2;
		e2 = new int[][] {{1, 2, 3}, {4, 5, 6, 7}, {11, 12, 13}, {21, 22, 23, 24, 25}};
	}

}
