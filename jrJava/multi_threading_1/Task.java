package jrJava.multi_threading_1;

public class Task {

	public static void main(String[] args) {
		SquareSumTask[] sst = new SquareSumTask[100];
		SquareRootSumTask[] srst = new SquareRootSumTask[100];
		Thread[] threads = new Thread[200];

		for (int i = 0; i < 100; i++) {
			sst[i] = new SquareSumTask(i + 1, i + 10);
			srst[i] = new SquareRootSumTask(i + 1, i + 10);
			threads[i] = new Thread(sst[i]);
			threads[i + 100] = new Thread(srst[i]);
		}

		// code
		// code

		// t2.start(); //t2.run makes main thread go there.
		// t3.start();

		// sst.doTask();
		// srst.doTask();

		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
		}

		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += 1;
			System.out.println("Task: sum = " + sum + " TID: " + Thread.currentThread().getId());
			;

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
	}
}
