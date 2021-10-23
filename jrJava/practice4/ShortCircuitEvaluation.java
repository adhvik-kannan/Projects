package jrJava.practice4;

public class ShortCircuitEvaluation {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		boolean aaa = x>10 && (x<=20 || y!=10) && !(x+y>x-y);
		// In this case, it will stop at the first condition.
		// It will not even go to the second one since it already
		// knows the whole thing will be false. 
		
		if(x>10 && (x<=20 || y!=10) && !(x+y>x-y)) {
			// codes
		}
		
		
		boolean bbb = x-y<0 || x==10 && y!=10 || aaa;
		// In this case, it will stop at the first condition.
		// It will not even go to the second one since it already
		// knows the whole thing will be true. 
		
		if(x-y<0 || x==10 && y!=10 || aaa) {
			// codes
		}

	}

}
