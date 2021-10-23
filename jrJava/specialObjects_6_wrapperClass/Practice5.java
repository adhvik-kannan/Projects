package jrJava.specialObjects_6_wrapperClass;

import java.util.ArrayList;
import java.util.Stack;

public class Practice5 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(115); // auto-boxing: list.add(new Integer(115));
		int b = list.get(0); // auto-unboxing: int b = list.get(0).intValue();
		
		Stack<Double> stack = new Stack<Double>();
		
		stack.push(3.14); // auto-boxing: stack.push(new Double(3.14));
		double c = stack.pop(); // auto-unboxing: double c = 	stack.pop().doubleValue();
	}

}
