package jrJava.tree_1;

public class Node<T> {

	public int id; // sorting key
	public double value;

	public Node<T> leftChild;
	public Node<T> rightChild;

	public Node(int id, double value) {
		this.id = id;
		this.value = value;
	}

	public String toString() {
		return "{" + id + ", " + value + "}";
	}
}
