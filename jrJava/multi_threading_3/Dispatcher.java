package jrJava.multi_threading_3;

public class Dispatcher {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();

		Task[] tasks = new Task[20];

		Thread[] threads = new Thread[20];
		for (int i = 0; i < threads.length; i++) {
			tasks[i] = new Task();
			tasks[i].setCalculator(calculator, i % 2);
			threads[i] = new Thread(tasks[i]);
			threads[i].start();
		}

	}

}
