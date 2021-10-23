package jrJava.homework7.Graphics4;

import java.awt.Color;
import java.awt.Graphics;
import resources.DrawingBoard;

public class RepeatingCircle1 {

	public static void main(String[] args) {
		
		DrawingBoard board = new DrawingBoard(0, 0, 1800, 1600);
		Graphics g = board.getCanvas();
		
		board.clear();
		
		int x = 50;
		int i;
		for(i=1; i<9; i++) {
			
			x += 140;
			g.setColor(Color.RED);
			g.fillOval(x, 100, 140, 140);
			
			board.repaint();

		}
		
	}

}
