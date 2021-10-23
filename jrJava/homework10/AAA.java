package jrJava.homework10;

public class AAA {

	public static void main(String[] args) {

		// 1)
		int c = 3;
		System.out.println(2 * BBB.mA(c));

		/*
		 * // 2) int c = 3; System.out.println(mA(c));
		 * 
		 * // 3) if(mB(1)>0) { System.out.println(mA(2)); }
		 * 
		 * // 4) int i; for(i=1; i<=3; i++) { if(mB(i) >= 5) {
		 * System.out.println(mA(i)); } }
		 */
	}

	// 1)
	public static int mA(int a) {
		System.out.println("Hi");
		return a * a;
	}
	/*
	 * // 2) public static int mA(int a) { System.out.println("Hi"); return
	 * BBB.mA(a-1); }
	 * 
	 * // 3) public static int mA(int a) { System.out.println("Hi"); return
	 * BBB.mA(a-1); } public static int mB(int a) { System.out.println("Hello");
	 * return 2*a+1; }
	 * 
	 * // 4) public static int mA(int a) { System.out.println("Hi"); return
	 * BBB.mA(a-1); } public static int mB(int a) { System.out.println("Hello");
	 * return 2*a+1; }
	 */
}
