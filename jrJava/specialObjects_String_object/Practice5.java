package jrJava.specialObjects_String_object;

public class Practice5 {

	// replaceAll(regExp, seq);
	public static void main(String[] args) {

		String exp = "tim1 tom2 tam3 tum4";

		System.out.println(exp.replaceAll("t[ao]m", "abc"));
		System.out.println(exp.replaceAll("t[a-j]m", "abc"));

		System.out.println(exp.replaceAll("m[23]", "MMM"));
		System.out.println(exp.replaceAll("m[0-9]", "MMM"));
		System.out.println(exp.replaceAll("m[^23]", "MMM"));

		String exp2 = "tim1 tac2 toe3 tum4";
		System.out.println(exp2.replaceAll("t[iau][mce][1-4] ", "tommy "));

		String exp3 = "I   had  a      great lunch.";
		System.out.println(exp3.replaceAll(" +", " "));
		System.out.println(exp3.replaceAll("  * ", " "));

	}

}
