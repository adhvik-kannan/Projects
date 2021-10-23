package jrJava.shortestPath_1;

import java.util.ArrayList;

public class MapNode {

	private String label;
	private double x, y;
	private boolean visited;

	private ArrayList<Edge> edges;
	private ArrayList<MapNode> neighbors;

	public MapNode(String label, double x, double y) {
		this.label = label;
		this.x = x;
		this.y = y;

		edges = new ArrayList<Edge>();
		neighbors = new ArrayList<MapNode>();
	}

	public ArrayList<Edge> getEdges() {
		return edges;
	}

	public ArrayList<MapNode> getNeighbors() {
		return neighbors;
	}

	public String getLabel() {
		return label;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void addEdge(Edge edge) {
		edges.add(edge);
	}

	public void addNeighbor(MapNode neighbor) {
		neighbors.add(neighbor);
	}

	public int hashCode() {
		return label.hashCode();
	}

	public boolean equals(Object o) {
		MapNode other = (MapNode) o;
		return label.equals(other.label);
	}

	public String toString() {
		// return "[" + label + ", " + x + ", " + y + "]";
		return label;
	}
}
