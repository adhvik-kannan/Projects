package jrJava.specialObjects_6_wrapperClass;

public class Practice4 {

	// auto-boxing and auto-unboxing
	
	public static void main(String[] args) {
		
		Integer a1 = 231; // auto-boxing
		int a2 = a1 + 111; // auto-unboxing --> a1.intValue() + 111
		Integer a3 = 123 + a1; // first, auto-unboxing then auto-boxing
		
		methodA(222); // auto-boxing --> methodA(new Integer(222));
		methodA(3.14); // auto-boxing --> methodA(new Double(3.14));
		
		int c1 = methodB(); // auto-unboxing --> methodB().intValue();
		double c2 = methodC(); // auto-unboxing --> methodC().doubleValue();
		
		Integer c3 = methodB() + 111; // auto-unboxing and boxing: new Integer(methodB().intValue() + 111);
	}

	public static void methodA(Integer a) {
		System.out.println(a + 111); // auto-unboxing --> a.intValue() + 111
	}
	
	public static void methodA(Double a) {
		System.out.println(a + 1.11); // auto-unboxing --> a.doubleValue() + 1.11
	}
	
	public static int methodB() {
		int a = 123;
		return a; // auto-boxing --> return new Integer(a)
	}
	
	public static Double methodC() {
		double a = 3.14;
		return a; // auto-boxing --> return new Double(a);
	}
	
	
}
	