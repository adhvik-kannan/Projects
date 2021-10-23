package jrJava.abstractType_arrayList;

public class Test2 {

	public static MyArrayList list = new MyArrayList();

	public static void main(String[] args) {

		list.add(new Ball(1, 1));
		list.add(new Ball(2, 2));
		list.add(new Ball(3, 3));
		list.add(new Ball(4, 4));

		System.out.println(list);

		ObjectSomewhereElse.doTheJob();

		System.out.println(list);
	}

}
