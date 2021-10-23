package jrJava.tree_1;

public class Test2 {

	public static void main(String[] args) {

		Tree<String> tree = new Tree<String>();

		tree.insert("mm");
		tree.insert("jj");
		tree.insert("pp");
		tree.insert("dd");
		tree.insert("nn");
		tree.insert("rr");
		tree.insert("cc");
		tree.insert("qq");
		tree.insert("ss");

		// tree.insert("aa");
		// tree.insert("bb");

		tree.traverseTopToBottom();

		int height = tree.getHeight();
		for (int i = 0; i <= height; i++) {
			tree.printNodesAtLevel(i);
		}
		// tree.doPreOrder();
		// tree.doInOrder();
		tree.doPostOrder();
	}

}
