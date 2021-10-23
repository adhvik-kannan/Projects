package jrJava.homework7.forLoopPractice3;

public class Problem1_D {

	public static void main(String[] args) {
		
		int sum = 0;
		int i;
		for(i=1; i<7; i=i+2) {
			System.out.println("i = " + i);
			sum  += i*(i+1);
		}
		System.out.println("sum = " + sum);
		/* PREDICTION:
		 i=1
		 i=3
		 i=5
		 sum=44
		 */
	}

}
