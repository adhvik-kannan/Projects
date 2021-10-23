package jrJava.specialObjects_7_binary_hexadecimal;

public class Practice3 {

	public static void main(String[] args) {
		
		printFullBinary(Integer.MAX_VALUE);
		printFullBinary(Integer.MAX_VALUE-1);
		System.out.println("...");
		printFullBinary(3);
		printFullBinary(2);
		printFullBinary(1);
		printFullBinary(0);
		printFullBinary(-1);
		printFullBinary(-2);
		printFullBinary(-3);
		System.out.println("...");
		printFullBinary(Integer.MIN_VALUE+1);
		printFullBinary(Integer.MIN_VALUE);
	}
	
	public static void printFullBinary(int value) {
		String binaryString = Integer.toBinaryString(value);
		for(int i=0; i<32-binaryString.length(); i++) {
			System.out.print('0');
		}
		System.out.println(binaryString);
	}

}
