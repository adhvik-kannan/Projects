package jrJava.homework7.forLoopPractice1;

public class Problem3 {

	public static void main(String[] args) {
		
		//int i;
		//for(i=11; i>=1; i--){
		 //System.out.println(i);
		//}
		
		//PREDICTION: 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1
		
		int sum = 0;
		int i;
		for(i=5; i>=(-10); i--) {
			sum += i;
		}
		System.out.println("The sum is " + sum);

	}

}
