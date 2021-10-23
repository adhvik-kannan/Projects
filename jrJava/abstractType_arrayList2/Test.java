package jrJava.abstractType_arrayList2;

public class Test {

	public static void main(String[] args) {

		MyArrayList list = new MyArrayList();
		list.add("aaa");
		list.add("222");
		list.add("ccc");

		AnotherObject.doTheJob(list, 1);

	}

}
