package jrJava.multi_threading_4;

public class Transaction implements Runnable {

	private BankA bankA;
	private BankB bankB;

	public Transaction(BankA bankA, BankB bankB) {
		super();
		this.bankA = bankA;
		this.bankB = bankB;
	}

	public void run() {
		transferAll();
	}

	public void transferAll() {
		double amount = bankA.getBalance();
		bankA.withdraw(amount, bankB);

	}
}
