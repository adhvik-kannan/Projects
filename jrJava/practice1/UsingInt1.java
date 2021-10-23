package jrJava.practice1;

public class UsingInt1 {

	// variable means 'storage space'.
	// '=' is an assignment operator --> store whatever on the right hand side into
	// the variable (storage space).
	public static void main(String[] args) {

		// declaration statements --> we like to create variables (storage space).
		int priceOfPen = 6; // 'int' will make Java create the storage space to store an integer value.
							// Assignment statements
		int numberOfPens = 10;
		int priceOfPencil = 2;
		int numberOfPencils = 15;
		int totalCost = (priceOfPen * numberOfPens) + (priceOfPencil * numberOfPencils); // When Java sees a variable
																							// name, it will go to the
																							// storage space (variable)
																							// and read the value in
																							// there and copy.
		// But if it sees a variable on the LHS, it will store something into that
		// storage space (variable) (write).

		System.out.println("Total cost is $" + totalCost);

		// priceOfPen + priceOfPencil = 8; Wrong! On the LHS, only one variable (storage
		// space) name can show up.
		// 15 = numberOfPens; Wrong! On the LHS, only one variable (storage space) name
		// can show up.
	}

}
