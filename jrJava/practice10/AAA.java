package jrJava.practice10;

public class AAA {

	public static void main(String[] args) {

		System.out.println("I am about to call a method.");
		BBB.saySomething();
		System.out.println("I am back.");
		
		sayAnother();  // AAA.sayAnother();
		System.out.println("I am back again.");
	}
	
	
	public static void sayAnother() {
		
		System.out.println("Another");
	}
	
	

}
