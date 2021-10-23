package jrJava.practice2;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		
		/*
		int myMoney = 20; // We expect the value stored in a variable can change constantly. 
		
		myMoney = myMoney + 1; // It reads from a storage space and adds 1 and then stores the increased value back into the space.
		myMoney = myMoney + 2; // It reads from a storage space and adds 2 and then stores the increased value back into the space.
		myMoney = myMoney + 3; // It reads from a storage space and adds 3 and then stores the increased value back into the space.
		System.out.println("myMoney = " + myMoney);
		
		myMoney = myMoney - 1; // It will decrease the value stored in the variable by 1.
		myMoney = myMoney - 2; // It will decrease the value stored in the variable by 2.
		myMoney = myMoney - 3; // It will decrease the value stored in the variable by 3.
		System.out.println("myMoney = " + myMoney);
		
		myMoney = myMoney*3; // The value stored in the variable will be tripled. 
		myMoney = myMoney*3; // The value stored in the variable will be tripled. 
		myMoney = myMoney*3; // The value stored in the variable will be tripled. 
		System.out.println("myMoney = " + myMoney);
		*/
		
		// We can do these using "compounded assignment operators". 
		int myMoney = 20; 
		
		myMoney += 1; //myMoney = myMoney + 1; 
		myMoney += 2; //myMoney = myMoney + 2; 
		myMoney += 3; //myMoney = myMoney + 3; 
		System.out.println("myMoney = " + myMoney);
		
		myMoney -= 1; //myMoney = myMoney - 1; 
		myMoney -= 2; //myMoney = myMoney - 2; 
		myMoney -= 3; //myMoney = myMoney - 3; 
		System.out.println("myMoney = " + myMoney);
		
		myMoney *= 3; //myMoney = myMoney*3; 
		myMoney *= 3; //myMoney = myMoney*3; 
		myMoney *= 3; //myMoney = myMoney*3; 
		System.out.println("myMoney = " + myMoney);
		
		// If we want the value in a storage space to increase/decrease only by 1, we can use increment/decrement operators. 
		myMoney++; //myMoney += 1; //myMoney = myMoney + 1; 
		myMoney--; //myMoney -= 1; //myMoney = myMoney - 1;
	}
	
}


