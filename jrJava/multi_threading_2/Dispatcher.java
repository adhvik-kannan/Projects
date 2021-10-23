package jrJava.multi_threading_2;

public class Dispatcher {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();

		Task1 task1 = new Task1();
		Task1 task2 = new Task1();

		task1.setCalculator(calculator);
		task2.setCalculator(calculator);

		Thread thread1 = new Thread(task1);
		Thread thread2 = new Thread(task2);

		thread1.start();
		thread2.start();
	}
}
