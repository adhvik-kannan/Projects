package jrJava.practice5;

import java.awt.Color;
import java.awt.Graphics;

import resources.DrawingBoard;

public class HowToDrawThingsOnScreen {

	public static void main(String[] args) {
		
		// First, create a window(JFrame/JPanel) on the screen. 
		DrawingBoard board = new DrawingBoard(200, 50, 800, 600);
		
		// You ask DrawingBoard to give you a drawing surface --> board.getCanvas();
		// What it will give to you is a tool (Graphics g) can use to draw things on that surface. 
		// This tool (g) can be used again and again. 
		Graphics g = board.getCanvas();
		
		// board.clear() will clear the surface. (wipe out) 
		board.clear();
	
		g.setColor(Color.BLUE); // It will keep using this color until you change the color. 
		
		g.drawRect(200, 150, 400, 300);
		
		// Will show what you did on the surface to the screen
		board.repaint();
	}

}
