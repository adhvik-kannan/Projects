package jrJava.specialObjects_4_String_Practice;

public class Practice1 {

	public static void main(String[] args) {

		int aaa = 241;
		String text1 = String.valueOf(aaa);
		System.out.println(text1);

		String data = "3831";
		int number = Integer.parseInt(data);
		System.out.println(number);

		// System.out.println(aaa===data);
		// System.out.println(aaa.equals(data));

		double bbb = 3.1415;
		String text2 = String.valueOf(bbb);
		System.out.println(bbb);

		String data2 = "3.1415";
		double number2 = Double.parseDouble(data2);

	}

}
