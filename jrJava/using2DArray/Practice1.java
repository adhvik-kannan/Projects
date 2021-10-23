package jrJava.using2DArray;

public class Practice1 {

	public static void main(String[] args) {

		int[][] a = new int[4][];

		a[0] = new int[] {1, 2, 3};
		a[1] = new int[] {11, 12, 13, 14};
		a[2] = new int[] {21, 22, 23, 24};
		a[3] = new int[] {31, 32, 33, 34, 35};

		a[3][1] = 99;
		System.out.println(a[3][1]);


		System.out.println(a[0][0]);
		System.out.println(a[a.length-1][a[a.length-1].length-1]);

		printMaxMin(a);
	}

	public static void printMaxMin(int[][] data) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		if(data==null) return;
		int i, j;
		for(i=0; i<data.length; i++) {
			if(data[i]==null) continue;
			for(j=0; j<data[i].length; j++) {
				if(data[i][j]>max) max = data[i][j];
				if(data[i][j]<min) min = data[i][j];
			}
		}
		System.out.println("max:" + max);
		System.out.println("min:" + min);
	}
	
	public static void print(int[][] data) {
		if(data==null) return;
		int j, i;
		for(i=0; i<data.length; i++) {
			if(data[i]==null) {
				System.out.println("null");
				continue;
			}
			for(j=0; j<data[i].length; j++) {
				System.out.print(data[i][j] + " ");
			}
			System.out.println();
		}
	}
}
