package jrJava.accessModifier_1_package2;

import jrJava.accessModifier_1_package1.A;

public class XYZ {

	public static void main(String[] args) {

		A aaa = new A();

		// System.out.println(aaa.a1);
		// System.out.println(aaa.a2); // package
		System.out.println(aaa.a3);
		// System.out.println(aaa.a4); // protected

		// aaa.mA1();
		// aaa.mA2(); // package
		aaa.mA3();
		// aaa.mA4(); // protected

	}

}
