package jrJava.abstractType_6_generics;

public class MyQueueTest {

	public static void main(String[] args) {
		MyQueue<Integer> q = new MyQueue<Integer>(5);

		// q.enqueue("aaa");
		q.enqueue(45);
		q.enqueue(55);
		q.enqueue(60);
		q.enqueue(65);

		while (!q.isEmpty()) {
			Integer each = q.dequeue();
			System.out.println(each);
		}

	}

}
