package jrJava.specialObjects_3_textPocessing;

import jrJava.specialObjects_String_object.Thing;

public class Practice4 {

	// StringBuilder

	public static void main(String[] args) {

		String str1 = "good breakfast";
		String str2 = "horrible lunch";
		String str3 = "great dinner";

		Thing thing = new Thing(10, "Hello");

		//String combined = str1 + " " + 352 + " " + str2 + " " + 3.1415 + " " + str3 + " " + true;
		//System.out.println(combined);

		StringBuilder sb = new StringBuilder();

		sb.append(str1);
		sb.append(" ");
		sb.append(352); // String.valueOf(352)
		sb.append(" ");
		sb.append(str2);
		sb.append(" ");
		sb.append(3.1415); // String.valueOf(3.1415)
		sb.append(" ");
		sb.append(str3);
		sb.append(" ");
		sb.append(true); // String.valueOf(true)
		sb.append(" ");
		sb.append(thing); // thing.toString();

		String combined = sb.toString();
		System.out.println(combined);

		// -----------------------------------------------

		// "100 101 102 ... 150"

		StringBuilder sb2 = new StringBuilder();

		for(int i=100; i<=150; i++) {
			sb2.append(i);
			if(i!=150) {
				sb2.append(" ");
			}
		}
		String data = sb2.toString();
		System.out.println(data);

	}

}
