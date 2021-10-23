package jrJava.practice14_fields;

public class AAA {

	public static int abc = 100;
	public static boolean def;
	
	
	public static void main(String[] args) {
		int aaaa = 10;
		abc = 20;
		def = true;
		
		mA();
		BBB.mA(aaaa, abc);
		BBB.mB(0.1);
		
		System.out.println(def);
		BBB.mC();
	}
	
	public static void mA() {
		abc++;
		def = !def;
	}
	
}
