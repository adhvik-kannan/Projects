package jrJava.specialObjects_3_textPocessing;

public class Practice2 {

	// Basic String building.

	public static void main(String[] args) {

		String str1 = "breakfast";
		String str2 = " ";
		String str3 = "lunch";
		String str4 = " ";
		String str5 = "dinner";

		// We want to combine these into one big string: "breakfast lunch dinner"

		String combined1 = str1.concat(str2).concat(str3).concat(str4).concat(str5);
		System.out.println(combined1);

		String combined2 = str1 + str2 + str3 + str4 + str5;
		System.out.println(combined2);

		String combined3 = str1 + 132;
		String combined4 = str1 + String.valueOf(132);
		String combined5 = str1.concat(String.valueOf(132));
		System.out.println(combined5);

		System.out.println(3.1 + 4.4 + "Hello");
		System.out.println(3.1 + "Hello" + 4.4);

	}

}
