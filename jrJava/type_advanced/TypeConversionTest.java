package jrJava.type_advanced;

public class TypeConversionTest {

	public static void main(String[] args) {
		
		// up-casting: follow arrows. always true, automatic
		/*
		E ref1 = null;
		B ref2 = ref1;
		A ref3 = ref1;
		I ref4 = ref1; // they can access the 9 methods of CSC and mi().
		Object ref5 = ref1;
		*/
		/*
		// down-casting: follow the opposite direction of the arrows. It's all based on 'possibility'.
		A ref1 = new A();
		//B ref2 = (B) ref1; // compile time okay. run-time not okay.
		
		A ref3 = new E();
		B ref4 = (B) ref3; // compile time okay. run-time okay.
		
		A ref5 = null;
		B ref6 = (B) ref5;
		*/
		
		// side-ways:
		C ref1 = null;
		//B ref2 = (B) ref1; // impossible. compile time not okay.
		
		C ref11 = new C();
		A ref12 = ref11;
		B ref13 = (B) ref12; // compile time okay. run-time not okay.
		
		C ref21 = null;
		A ref22 = ref21;
		B ref23 = (B) ref22; // compile time okay. run-time okay (because it's null)
		
		// conversion: class to interface:
		A ref31 = new E();
		I ref32 = (I) ref31;
		
		C ref41 = new C();
		//I ref42 = (I) ref41; // Any object can be any interface type. Possible.. Not okay at run-time.
		
		I ref51 = new B();
		A ref52 = (A) ref51;
	}

}
