package jrJava.shortestPath_5_DFT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Graph {

	private HashMap<String, Node> map;

	public Graph() {

		map = new HashMap<String, Node>(20);

		Scanner s = null;
		try {
			s = new Scanner(new File("jrJava/shortestPath_2_BFT/nodes.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		String each;
		while (s.hasNext()) {
			each = s.next();
			map.put(each, new Node(each)); // ???
		}

		s.close();

		try {
			s = new Scanner(new File("jrJava/shortestPath_2_BFT/edges.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		String node1, node2;
		while (s.hasNext()) {
			node1 = s.next();
			node2 = s.next();

			map.get(node1).addEdge(new Edge(node1, node2));
			;
			map.get(node1).addNeighbor(map.get(node2));

			map.get(node2).addEdge(new Edge(node2, node1));
			map.get(node2).addNeighbor(map.get(node1));

		}

		s.close();

		Iterator<String> iter = map.keySet().iterator();
		while (iter.hasNext()) {
			map.get(iter.next()).printAll();
		}
		System.out.println();
	}

	Stack stack;

	public void DFT(String label) {
		stack = new Stack();
		stack.push(map.get(label));
		DFT();
	}

	private void DFT() {

		Node node;
		ArrayList<Node> neighbors;
		int i;
		while (!stack.isEmpty()) {
			node = stack.pop();
			if (node.visited())
				continue;
			System.out.println("Visited " + node);
			node.setVisited();

			neighbors = node.getNeighbors();
			for (i = neighbors.size() - 1; i >= 0; i--) {
				stack.push(neighbors.get(i));
			}
		}
	}

	private class Stack {

		private Link first;

		public boolean isEmpty() {
			return first == null;
		}

		public void push(Node node) {
			Link toInsert = new Link(node);
			toInsert.next = first;
			first = toInsert;
		}

		public Node pop() {
			if (isEmpty())
				throw new NoSuchElementException("Cannot remove.");
			Link temp = first;
			first = first.next;
			return temp.node;
		}

		private class Link {
			private Link next;
			private Node node;

			public Link(Node node) {
				this.node = node;
			}

			public String toString() {
				return node.toString();
			}
		}
	}

	public static void main(String[] args) {
		Graph graph = new Graph();
		graph.DFT("A");
	}

}
