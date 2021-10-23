package jrJava.homework7.Graphics4;

import java.awt.Color;
import java.awt.Graphics;
import resources.DrawingBoard;

public class RepeatingCircle4 {

	public static void main(String[] args) {
		
		DrawingBoard board = new DrawingBoard(0, 0, 2400, 2000);
		Graphics g = board.getCanvas();
		
		board.clear();
		
		int x = 200;
		int y = 200;
		int r = 100;
		int i;
		for(i=1; i<7; i++) {
			
			g.setColor(Color.BLUE);
			g.drawOval(x-r, y-r, 2*r, 2*r);
			r+=10;
			
			board.repaint();
		}
		
		
	}

}
