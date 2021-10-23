package jrJava.shortestPath_4_BFT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
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
		while(s.hasNext()) {
			each = s.next();
			map.put(each, new Node(each)); // ???
		}

		s.close();

		try {
			s = new Scanner(new File("jrJava/shortestPath_2_BFT/edges	.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		String node1, node2;
		while(s.hasNext()) {
			node1 = s.next();
			node2 = s.next();

			map.get(node1).addEdge(new Edge(node1, node2));;
			map.get(node1).addNeighbor(map.get(node2));

			map.get(node2).addEdge(new Edge(node2, node1));
			map.get(node2).addNeighbor(map.get(node1));


		}

		s.close();

		Iterator<String> iter = map.keySet().iterator();
		while(iter.hasNext()) {
			map.get(iter.next()).printAll();
		}
		System.out.println();
	}

	private Queue queue;
	public void BFT(String label) {
		queue = new Queue(20);
		queue.enqueue(map.get(label));
		BFT();
	}

	private void BFT() {
		Node node;
		ArrayList<Node> neighbors;
		int i;
		while(!queue.isEmpty()) {
			node = queue.dequeue();
			if(node.visited()) continue;

			System.out.println("visited " + node);
			node.setVisited();

			neighbors = node.getNeighbors();
			for(i=0; i<neighbors.size(); i++) {
				queue.enqueue(neighbors.get(i));
			}
		}
	}

	private class Queue {

		private Node[] elements;
		private int front, rear, size;

		public Queue(int size) {
			elements = new Node[size];
			front = -1;
			rear = 0;
			this.size = 0;
		}

		public void enqueue(Node node) {
			if(size==elements.length) throw new IndexOutOfBoundsException();
			front++;
			if(front==elements.length) front = 0;
			elements[front] = node;
			size++;	
		}

		public Node dequeue() {
			if(isEmpty()) throw new IndexOutOfBoundsException();
			Node temp = elements[rear];
			elements[rear] = null; // Not necessary	
			rear++;
			if(rear==elements.length) rear = 0;
			size--;
			return temp;
		}
		
		public boolean isEmpty() {
			return size==0;
		}

	}
	public static void main(String[] args) {
		Graph graph = new Graph();
		graph.BFT("A");
	}

}
