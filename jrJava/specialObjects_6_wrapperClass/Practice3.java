package jrJava.specialObjects_6_wrapperClass;

public class Practice3 {

	// Auto-boxing, Auto-unboxing

	public static void main(String[] args) {

		// Auto-boxing: Whenever and wherever it needs a wrapper class object,
		// but what it sees it a primitive type data, it will automatically create
		// a wrapper class object.

		Integer a1 = 115;
		// Integer a1 = new Integer(115);
		Double b1 = 3.1415;
		Boolean c1 = true;

		// Auto un-boxing (deboxing): Whenever and wherever it needs a primitive type
		// data,
		// but what it sees is a wrapper class objects, it will automatically extract
		// out
		// the primitive type data.

		int a2 = a1; // int a2 = a1.intValue();
		double b2 = b1; // double b2 = b1.doubleValue();
		boolean c2 = c1; // boolean c2 = c1.booleanValue();
	}

}
