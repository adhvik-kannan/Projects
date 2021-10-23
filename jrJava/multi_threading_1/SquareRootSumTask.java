package jrJava.multi_threading_1;

public class SquareRootSumTask implements Runnable
{
	private int begin, end;
	
	public SquareRootSumTask(int begin, int end) {
		super();
		this.begin = begin;
		this.end = end;
	}

	public void doTask()
	{
		double sum = 0;
		for(int i = begin; i<=end; i++)
		{
			sum += Math.sqrt(i);
			System.out.println("SquareRootSumTask: sum = " + sum + 
					" TID: " + Thread.currentThread().getId());
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
		}
	}

	public void run() 
	{
		doTask();
	}
}
