package abstractType_stack;

public class Test {

	public static void main(String[] args) {

		MyStack stack = new MyStack(5);

		stack.push("AAA");
		stack.push("BBB");
		stack.push("CCC");
		stack.push("DDD");

		// while(!stack.isEmpty()) {
		// System.out.println(stack.pop());
		// }

		retrieveAll(stack);

	}

	public static void retrieveAll(MyStack stack) {
		MyStack s = new MyStack(10);
		while (!stack.isEmpty()) {
			s.push(stack.pop());

		}
		while (!s.isEmpty()) {
			System.out.println(s.pop());
		}
	}

}
