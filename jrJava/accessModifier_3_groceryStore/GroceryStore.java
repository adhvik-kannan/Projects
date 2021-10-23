package jrJava.accessModifier_3_groceryStore;

public class GroceryStore {

	// public double priceOfApple = 1.20;
	// public int appleInventory = 14000;

	private double priceOfApple = 1.20;
	private int appleInventory = 14000;

	public GroceryStore() {
	}

	public double getPriceOfApple(int CID) {
		if (CID == 415)
			return 0.8 * priceOfApple;
		else if (CID == 941)
			return 10 * priceOfApple;

		if (appleInventory >= 10000)
			return priceOfApple;
		else if (appleInventory >= 1000)
			return 1.5 * priceOfApple;
		else if (appleInventory >= 100)
			return 2.5 * priceOfApple;
		else if (appleInventory >= 10)
			return 5 * priceOfApple;
		else
			return 99.99;
	}

	public void placeOrder() {
		// trasancation will happen.
	}
}
