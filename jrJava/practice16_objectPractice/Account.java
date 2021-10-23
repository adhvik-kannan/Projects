package jrJava.practice16_objectPractice;

public class Account {

	public double balance = 100.0;
	public double interestRate = 0.05; // annual

	public Account() {
	}

	public Account(double balance) {
		this.balance = balance;
	}

	public Account(double balance, double interestRate) {
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public void deposit(double deposit) {
		balance += deposit;
	}

	public void withdraw(double withdraw) {
		balance -= withdraw;
	}

	public double getBalance() {
		return balance;
	}

	public void calculateInterest(int numOfMonths) {
		double monthly = interestRate / 12;
		for (int i = 1; i <= numOfMonths; i++) {
			balance = balance * (1 + monthly);
		}
	}

}
