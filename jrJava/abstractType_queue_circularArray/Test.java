package jrJava.abstractType_queue_circularArray;

public class Test {

	public static void main(String[] args) {

		MyQueue q = new MyQueue(8);
		q.printAll();
		q.enqueue("AAAA");
		q.printAll();
		q.enqueue("BBBB");
		q.printAll();

		q.enqueue("CCCC");
		q.enqueue("DDDD");
		q.enqueue("EEEE");
		q.enqueue("FFFF");
		q.enqueue("GGGG");
		q.enqueue("HHHH");
		q.printAll();

		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		q.printAll();

		q.enqueue("IIII");
		q.printAll();
	}
}
