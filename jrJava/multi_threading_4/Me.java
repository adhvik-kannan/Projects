package jrJava.multi_threading_4;

public class Me {

	public static void main(String[] args) {

		BankA bankA = new BankA();
		BankB bankB = new BankB();

		System.out.println(bankB.getBalance());

		Transaction tnx = new Transaction(bankA, bankB);

		for (int i = 0; i < 5; i++) {
			new Thread(tnx).start();
		}

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
		}

		System.out.println(bankB.getBalance());
	}

}
