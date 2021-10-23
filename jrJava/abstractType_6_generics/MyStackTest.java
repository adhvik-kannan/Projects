package jrJava.abstractType_6_generics;

public class MyStackTest {

	public static void main(String[] args) {
		
		MyStack<String> s = new MyStack<String>(5);
		
		s.push("aaa");
		//s.push(45);
		s.push("bbb");
		s.push("ccc");
		s.push("ddd");
		
		while(!s.isEmpty()) {
			String each = s.pop();
			System.out.println(each);
		}

	}

}
