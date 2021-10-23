package jrJava.linkedList1;

public class Test1 {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		/*
		System.out.println(list.size());
		
		list.insertAtBeginning(1, 1.1);
		list.insertAtBeginning(2, 2.2);
		list.insertAtBeginning(3, 3.3);
		
		System.out.println(list.size());
		list.printAll();
		list.insertAtEnd(4, 4.4);
		list.printAll();
		
		list.insertAtEnd(1, 1.1);
		list.insertAtEnd(2, 2.2);
		list.insertAtEnd(3, 3.3);
		
		
		while(!list.isEmpty()) {
			System.out.println(list.removeFirst());
		}
		
		list.insertAtEnd(1, 1.1);
		list.insertAtEnd(2, 2.2);
		list.insertAtEnd(3, 3.3);
		
		System.out.println(list.removeEnd());
		System.out.println(list.removeEnd());
		System.out.println(list.removeEnd());
		*/
		list.insert(7, 7.0);
		list.insert(4, 4.0);
		list.insert(2, 2.0);
		list.insert(5, 5.0);
		list.insert(3, 3.0);
		
		list.printAll();
		
		list.remove(3);
		
		list.printAll();
	}

}
