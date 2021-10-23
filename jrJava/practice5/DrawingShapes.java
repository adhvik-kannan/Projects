package jrJava.practice5;

import java.awt.Color;
import java.awt.Graphics;

import resources.DrawingBoard;
public class DrawingShapes {

	public static void main(String[] args) {
		
		DrawingBoard board = new DrawingBoard(300, 50, 900, 600);
		Graphics g = board.getCanvas();
		
		board.clear();
		
		g.setColor(Color.BLUE);
		g.drawRect(100, 100, 200, 110);
		g.fillRect(100, 250, 100, 300);
		
		g.setColor(Color.RED);
		g.drawOval(250, 350, 300, 200);
		g.fillOval(350, 50, 250, 250);
		
		g.setColor(Color.GREEN);
		g.drawArc(610, 100, 200, 200, -30, 120);
		g.fillArc(610, 310, 200, 200, -150, 300);
		
		g.setColor(Color.BLACK);
		g.drawString("Hello there! I am Adhvik.", 400, 300);
		
		
		board.repaint();
	}

}
