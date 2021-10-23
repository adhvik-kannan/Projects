package jrJava.array_1;

public class Practice4 {

	public static void main(String[] args) {
		
		double[] aaa = new double[5];
		aaa[1] = 10.0;
		aaa[2] = 30.3;
		
		doubler(aaa);
		
		for(int i=0; i<aaa.length; i++) {
			System.out.println(aaa[i]);
		}
	}
	
	public static void doubler(double[] bbb) {
		for(int i=0; i<bbb.length; i++) {
			bbb[i] = 2*bbb[i];
		}
	}

}
