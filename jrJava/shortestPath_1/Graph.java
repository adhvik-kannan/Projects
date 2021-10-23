package jrJava.shortestPath_1;


import java.awt.Graphics;
import java.io.FileNotFoundException;
import java.util.List;

public class Graph {

	private MapNodeManager mapNodeManager;
	
	public Graph(){
		GraphicsBoard board = new GraphicsBoard(800, 800);
		Graphics g = board.getCanvas();
		
		mapNodeManager = new MapNodeManager();
		try {
			mapNodeManager.parseMapNodes("jrJava/shortestPath_1/mapNodes.txt");
			mapNodeManager.parseEdges("jrJava/shortestPath_1/edges.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		mapNodeManager.drawEdges(g);
		mapNodeManager.drawMapNodes(g);
		board.repaint();
	}
	
	
	public List<String> searchShortestPath(String start, String end){
		
		
		return null;
	}
	
}
