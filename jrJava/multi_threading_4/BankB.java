package jrJava.multi_threading_4;

public class BankB {

	private double balance = 0;

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		System.out.println("I am being deposited $" + amount);
		balance += amount;
	}
}
