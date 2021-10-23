package jrJava.homework7.forLoopPractice1;

public class Problem2 {

	public static void main(String[] args) {
		
		//int i;
		//for(i=1; i<=10; i+=2){
		 //System.out.println(i);
		//}
		
		// PREDICTION: 1,3,5,7,9
		
		int sum = 0;
		int i;
		for(i=1; i<=99; i+=2) {
			sum += i;
		}
		System.out.println("The sum is " + sum);

	}

}
