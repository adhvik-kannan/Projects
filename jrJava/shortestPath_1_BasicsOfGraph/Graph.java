package jrJava.shortestPath_1_BasicsOfGraph;

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
			s = new Scanner(new File("jrJava/shortestPath_1_BasicsOfGraph/nodes.txt"));
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
			s = new Scanner(new File("jrJava/shortestPath_1_BasicsOfGraph/edges.txt"));
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
	
	public void rDFT(String label) {
		rDFT(map.get(label));
	}
	
	public void rDFT(Node node) {
		
		if(node.visited()) return;
		
		System.out.println(node + " visited.");
		node.setVisited();
		
		ArrayList<Node> neighbors = node.getNeighbors();
		for(int i=0; i<neighbors.size(); i++) {
			rDFT(neighbors.get(i));
		}
	}
	
	
	public static void main(String[] args) {
		Graph graph = new Graph();
		graph.rDFT("A");
	}

}
