package jrJava.exceptionHandling_1;

public class Practice1 {

	public static void main(String[] args) {

		System.out.println("point 1");

		String text = "hello";	
		int[] a = {3, 5, 1};
		String quantity = "3a5";
		methodA(text, a, quantity);

		System.out.println("point 2");

	}

	public static void methodA(String word, int[] values, String dataString) {
		System.out.println("point 3");
		try {
			//throw new NullPointerException();
			int length = word.length();
			System.out.println(length);
			System.out.println(values[3]);
			int number = Integer.parseInt(dataString);
			System.out.println(number);
		}
		catch(NullPointerException re) {
			System.out.println("null-pointer problem.");
		}
		catch(IndexOutOfBoundsException | NumberFormatException ioobe_nfe) {
			System.out.println("number format problem or index problem.");
			throw ioobe_nfe;
		}
		catch(Exception re) {
			System.out.println("just a problem.");
		}
		System.out.println("point 4");

	}

/*
	sin^2(2x)/x^2
	sinx/x = 1
	sin(2x)*sin(2x)/x*x
	(sin(2x)/x)*(sin(2x)/x)
	2*2 = 4
	*/
}
