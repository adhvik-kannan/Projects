package jrJava.specialObjects_6_wrapperClass;

public class Practice1 {

	public static void main(String[] args) {
		
		Integer a1 = new Integer(231);
		Integer a2 = 231; // auto-boxing
		int a3 = a1.intValue();
		int a4 = a1; // auto-unboxing
		
		Double d1 = new Double(3.1415);
		Double d2 =  3.1415; // auto-boxing
		double d3 = d1.intValue();
		double d4 = d1; // auto-unboxing
		
		//
		// Wrapper classes also have many useful static methods.
		//
		
		// 351 --> "351" : String.valueOf(351);
		// "351" --> 351 : Integer.parseInt("351");
		
		String s1 = "111";
		String s2 = "222";
		System.out.println(s1 + s2);
		System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2));
		
		String s3 = "3.14";
		String s4 = "1.11";
		System.out.println(s3 + s4);
		System.out.println(Double.parseDouble(s3) + Double.parseDouble(s4));

	}

}
