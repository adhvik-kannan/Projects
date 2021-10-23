package jrJava.inheritance_2_type;

public class Test {

	public static void main(String[] args) {
		
		B bbb1 = new B();
		bbb1.mB();
		System.out.println(bbb1.b);
		
		A bbb2 = new B();
		bbb2.mA();
		System.out.println(bbb2.a);
		
		//bbb2.mB(); 
		//System.out.println(bbb2.b);
		
		C ccc1 = new C();
		ccc1.mC();
		System.out.println(ccc1.c);
		
		A ccc2 = new C();
		//ccc2.mC();
		//ccc2.mB();
		ccc2.mA();
		
		Object ccc3 = new C();
		ccc3.toString();
		
	}

}



