package jrJava.multi_threading_3;

public class Task implements Runnable {

	private Calculator calculator;
	private int num;
	
	public void setCalculator(Calculator calculator, int num) {
		this.calculator = calculator;
		this.num = num;
	}
	
	public void run() {
		doTask();
	}
	
	public void doTask() {
		if(num==0) calculator.calculateSum();
		if(num==1) calculator.calculateSquareSum();
	}

}

