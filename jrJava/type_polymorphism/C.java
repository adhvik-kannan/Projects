package jrJava.type_polymorphism;

public class C extends B {

	public int f = 30;

	public void mC() {
		System.out.println("C's mC()");
	}

	// public void mA() {
	// System.out.println("C's mA()");
	// }

	public void m() {
		System.out.println("C's m()");
		super.m();
	}
}
