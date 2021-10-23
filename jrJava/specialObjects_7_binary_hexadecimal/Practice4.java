package jrJava.specialObjects_7_binary_hexadecimal;

public class Practice4 {

	public static void main(String[] args) {
		
		// MAX_VALUE + 1 --> MIN_VALUE
		System.out.println(Integer.MAX_VALUE + 1 == Integer.MIN_VALUE);
		
		// Careful!
		int a = 2056056209;
		int b = a + 280012456;
		System.out.println(b);
		
		// a + ~a + 1 = 0 --> -a = ~a + 1
		System.out.println(a + ~a + 1);

	}

}
