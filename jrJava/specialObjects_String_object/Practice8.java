package jrJava.specialObjects_String_object;

public class Practice8 {

	// valueOf(...)
	
	public static void main(String[] args) {
		
		int aaa = 341;
		double bbb = 3.1415;
		boolean ccc = true;
		
		// We want to create Strings that contain primitive type data,
		// "341", "3.1415", "true".
		
		String str1 = String.valueOf(aaa);
		String str2 = String.valueOf(bbb);
		String str3 = String.valueOf(ccc);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

	}

}
