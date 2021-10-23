package jrJava.tree4_tree_drawable;	

public class Tree<E extends Comparable<E>> {

	protected Node<E> root;

	public void insert(E obj) {
		 insert(new Node<E>(obj));
	}
	
	protected void insert(Node<E> node) {

		if(root==null) {
			root = node;
			return;
		}

		Node<E> current = root;
		Node<E> parent;

		while(true) {
			parent = current;
			if(node.obj.compareTo(current.obj)<0) {
				current = current.leftChild;
				if(current==null) {
					parent.leftChild = node;
					return;
				}
			}
			else {
				current = current.rightChild;
				if(current==null) {
					parent.rightChild = node;
					return;
				}
			}
		}
	}

	public E find(E obj) {
		if(root==null) return null;

		Node<E> current = root;

		while(current.obj.compareTo(obj)!=0) {
			if(obj.compareTo(current.obj)<0) current = current.leftChild;
			else current = current.rightChild;

			if(current==null) return null;
		}
		return current.obj;
	}

	public boolean delete(E obj) {

		Node<E> current = root;
		Node<E> parent = root;
		boolean isLeftChild = false; // Is current the leftChild of parent?

		while(current.obj.compareTo(obj)!=0) {

			parent = current;

			if(obj.compareTo(current.obj)<0) {
				current = current.leftChild;
				isLeftChild = true;
			}
			else {
				current = current.rightChild;
				isLeftChild = false;
			}

			if(current==null) return false;
		}

		// 'current' is the deleteNode. Let's delete it.

		// Case 1: deleteNode has no child.
		if(current.leftChild==null && current.rightChild==null) {
			if(current==root) root = null;
			else if(isLeftChild) parent.leftChild = null;
			else parent.rightChild = null;
		}
		// Case 2: deleteNode has only one child (left).
		else if(current.rightChild==null) {
			if(current==root) root = current.leftChild;
			if(isLeftChild) parent.leftChild = current.leftChild;
			else parent.rightChild = current.leftChild;
		}
		// Case 3: deleteNode has only one child (right).
		else if(current.leftChild==null) {
			if(current==root) root = current.rightChild;
			if(!isLeftChild) parent.rightChild = current.rightChild;
			else parent.leftChild = current.rightChild;
		}
		// Case 4: deleteNode has both children.
		else {
			Node successor = getSuccessor(current);
			if(current==root) root = successor;
			else if(isLeftChild) parent.leftChild = successor;
			else parent.rightChild = successor;

			successor.leftChild = current.leftChild;
		}
		return true;
	}

	private Node<E> getSuccessor(Node<E> deleteNode) {

		Node<E> current = deleteNode.rightChild;	
		Node<E> successor = deleteNode.rightChild;	
		Node<E> successorParent = deleteNode.rightChild;	

		while(current!=null) {
			successorParent = successor;
			successor = current;
			current = current.leftChild;
		}
		if(successor!=deleteNode.rightChild) {
			successorParent.leftChild = successor.rightChild;
			successor.rightChild = deleteNode.rightChild;
		}
		return successor;
	}
	
	
	

	protected static class Node <T> {

		public T obj;

		public Node<T> leftChild;
		public Node<T> rightChild;

		public Node(T obj) {
			this.obj = obj;
		}

		public String toString() {
			return "{" + obj + "}";
		}
	}
}
