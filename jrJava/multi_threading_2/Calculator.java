package jrJava.multi_threading_2;

public class Calculator {
	int sum;

	public void calculateSum() throws InterruptedException {

		for (int i = 0; i <= 10; i++) {
			sum += i;
			System.out.println("Sum=" + sum + " TID: " + Thread.currentThread().getId());

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
	}
}
