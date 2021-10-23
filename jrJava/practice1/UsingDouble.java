package jrJava.practice1;

public class UsingDouble {

	public static void main(String[] args) {
		
		double priceOfPen = 6.5;
		int numberOfPens = 10;
		double priceOfPencil = 2.75;
		int numberOfPencils = 15; 
		
		double totalCost = (priceOfPen * numberOfPens) + (priceOfPencil * numberOfPencils);
		
		System.out.println("Total cost is $" + totalCost + ".");
	}

}
