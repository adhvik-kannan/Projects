package jrJava.homework7.forLoopPractice1;

public class Problem4_3 {

	public static void main(String[] args) {
		
		//double n = 1;
		//double i;
		//for(i=2; i<26; i=(int)(2*(n+1))*Math.pow((-1), n++)) {
			//System.out.print(i + ", ");
		//}
		//System.out.print(-28);
		int i;
		for(i=1; i<=13; i++){
			if(i%2 == 0) {
				System.out.print(-2*i + ", ");
			}
			else {
				System.out.print(2*i + ", ");
			}
		}
		System.out.print(-28);

	}

}