package abstractClass_1;

public class Test {

	public static void main(String[] args) {

		Object ref1 = new Object();

		// A ref2 = new A(); // abstract class
		// B ref3 = new B(); // abstract class

		A ref4 = new C();

		A[] aS = new A[3];
		aS[0] = new C();
		aS[1] = new C();
		aS[2] = new C();
	}

}
