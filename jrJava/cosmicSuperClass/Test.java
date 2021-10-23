package jrJava.cosmicSuperClass;

public class Test {

	public static void main(String[] args) {
		
		AAA ref1 = new BBB(1, 2, 3, 4);
		//ref1.mB();
		
		Object ref2 = new BBB(1, 2, 3, 4);
		//ref2.mA();
		
		System.out.println(ref1.getClass());
		System.out.println(ref2.getClass());

	}

}
