package jrJava.bits_and_bytes;

public class Practice5 {

	public static void main(String[] args) {

		int a = 0b01101011;
		int b = a >> 3;
		int c = a << 3;

		printBinary(a);
		printBinary(c);
	}

	public static void printBinary(int value) {
		String binaryString = Integer.toBinaryString(value);
		for (int i = 0; i < 32 - binaryString.length(); i++)
			System.out.print('0');
		System.out.println(binaryString);
	}

}
