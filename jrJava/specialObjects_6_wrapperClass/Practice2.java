package jrJava.specialObjects_6_wrapperClass;

public class Practice2 {

	public static void main(String[] args) {
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		int a = 45018;
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toHexString(a));
		
		System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
		System.out.println(Integer.toHexString(Integer.MAX_VALUE));
		
		System.out.println();
		for(int i=0; i<=15; i++) {
			System.out.println(Integer.toBinaryString(i));
		}
		
		int a1 = 2000000000;
		while(true) {
			a1++;
			System.out.println(a1);
		}
		

	}

}
