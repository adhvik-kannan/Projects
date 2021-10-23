package jrJava.array_1;

public class Practice2 {

	public static void main(String[] args) {
		
		int[] values = new int[4];
		/*
		values[0] = 5;
		values[1] = 21;
		values[2] = 7;
		values[3] = 11;
		System.out.println(values[2]);
		*/
		
		int bbb = -1;
		values[bbb+1] = 5;
		values[bbb+2] = 21;
		values[bbb+3] = 7;
		values[bbb+4] = 11;
		
		//System.out.println(values[0]);
		//System.out.println(values[1]);
		//System.out.println(values[2]);
		//System.out.println(values[3]);
		
		for(int i=0; i<=3; i++) {
			System.out.println(values[i]);
		}
		
	}

}
