package jrJava.tree_1;

public class Test {

	public static void main(String[] args) {

		Tree<Integer> tree = new Tree<Integer>();

		tree.insert(10);
		tree.insert(5);
		tree.insert(17);
		tree.insert(3);
		tree.insert(8);
		tree.insert(12);
		tree.insert(19);
		tree.insert(1);
		tree.insert(4);
		tree.insert(7);
		tree.insert(9);
		tree.insert(11);
		tree.insert(15);
		tree.insert(18);
		tree.insert(20);

		tree.traverseTopToBottom();

		System.out.println(tree.sum());
	}

}
