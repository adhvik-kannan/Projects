package jrJava.bits_and_bytes;

public class Practice1 {

	public static void main(String[] args) {

		// for(int i=0; i<50; i++) {
		// printBinary(i);
		// }

		printBinary(Integer.MAX_VALUE);
		System.out.println("  ...");
		printBinary(2);
		printBinary(1);
		printBinary(0);
		printBinary(-1);
		printBinary(-2);
		System.out.println("  ...");
		printBinary(Integer.MIN_VALUE);

		System.out.println();
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);

		System.out.println(Integer.toHexString(16345));

		System.out.println(Integer.toHexString(0b01110011101010100111100001011011));
		System.out.println(Integer.toHexString(-1));
	}

	public static void printBinary(int value) {
		String binaryString = Integer.toBinaryString(value);
		for (int i = 0; i < 32 - binaryString.length(); i++)
			System.out.print('0');
		System.out.println(binaryString);
	}
}
