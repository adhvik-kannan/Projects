package jrJava.practice1;

public class UsingInt2 {

	public static void main(String[] args) {
		
		// Initialization: something gets stored in the variable (storage) for the first time
		
		int priceOfPen = 6; // declaration and initialization happens in the same statement. 
		int numberOfPens = 10; 
		
		int priceOfPencil; 
		int numberOfPencils;
		
		priceOfPencil = 2; // Initialization
		numberOfPencils = 15;
		
		priceOfPencil = 3; // Not an initialization, just an assignment
		
		// declaration and initialization 
		int totalCost = (priceOfPen * numberOfPens) + (priceOfPencil * numberOfPencils); 
		
		System.out.println("Total cost is $" + totalCost + ".");
	}

}
