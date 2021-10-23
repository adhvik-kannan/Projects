package jrJava.accessModifier_3_groceryStore;

public class Customer {

	public static void main(String[] args) {

		GroceryStore store = new GroceryStore();

		// double price = store.priceOfApple;
		// int invenory = store.appleInventory;

		// store.priceOfApple = -1.00;

		double price = store.getPriceOfApple(451);
		store.placeOrder();

	}

}
