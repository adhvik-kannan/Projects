package jrJava.recursion_1_basic;

public class Practice4 {

	public static void main(String[] args) {
		mmm(0, 100);
	}
	
	public static void mmm(int a, int b) {
		
		if(a>=100) return;
		
		a++;
		int c = a + b;
		System.out.println(a+ ", " + c);
		
		
		mmm(a,b);
		mmm(a+1, b-1);
	}

}
