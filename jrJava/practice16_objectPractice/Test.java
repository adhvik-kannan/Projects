package jrJava.practice16_objectPractice;

public class Test {

	public static void main(String[] args) {
		
		Account harry = new Account();
		Account ron = new Account(500);
		Account hermione = new Account(1000, 0.07);
		
		harry.deposit(900);
		ron.deposit(500);
		ron.withdraw(999);
		
		harry.calculateInterest(12);
		ron.calculateInterest(12);
		hermione.calculateInterest(12);
		
		ron = null;
		//ron = new Account(1000);
		
		System.out.println("Harry: " + harry.getBalance());
		System.out.println("Ron: " + ron.getBalance());
		System.out.println("Hermione: " + hermione.getBalance());
	}

}
