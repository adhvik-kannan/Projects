package jrJava.practice15_usingThis;

public class PQR {
	
	public static int aaa;
	public static boolean bbbb;
	
	
	public static void  mmA(/*int paa, boolean pbbb*/int aaa, boolean bbbb) {
		PQR.aaa = aaa; //aaa = paa;
		PQR.bbbb = bbbb; //bbbb = pbbb;
	}
	
	public static double mmB(/*int paa*/ int aaa) {
		return 0.5*(PQR.aaa + aaa);//return 0.5*(aaa + paa);
	}

}
