package jrJava.homework7.Graphics1;

import java.awt.Color;
import java.awt.Graphics;

import resources.DrawingBoard;

public class XYAxis {

	public static void main(String[] args) {
		
		DrawingBoard board = new DrawingBoard(0, 0, 800, 600);
		Graphics g = board.getCanvas();
		
		board.clear();
		
		g.setColor(Color.BLACK);
		g.drawLine(100, 300, 700, 300);
		g.drawLine(400, 100, 400, 500);
		
		board.repaint();
		
	}

}
