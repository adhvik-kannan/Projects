package jrJava.specialObjects_String_object;

public class Practice6 {

	// substring(begin, end) -> [being, end-1] (* The char at 'end' will not be
	// included.)
	// substring(begin) -> [begin, rest of the text]
	public static void main(String[] args) {

		String exp = "I love you, Sir!";

		String piece1 = exp.substring(7, 10);
		System.out.println(piece1);

		// String piece2 = exp.substring(7, 16);
		// String piece2 = exp.substring(7, exp.length());
		String piece2 = exp.substring(7);
		System.out.println(piece2);

	}

}
