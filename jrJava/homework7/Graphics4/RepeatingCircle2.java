package jrJava.homework7.Graphics4;

import java.awt.Color;
import java.awt.Graphics;
import resources.DrawingBoard;

public class RepeatingCircle2 {

	public static void main(String[] args) {
		
		DrawingBoard board = new DrawingBoard(0, 0, 2400, 2000);
		Graphics g = board.getCanvas();
		
		board.clear();
		
		int x = 600;
		int y = 100;
		int i;
		for(i=1; i<8; i++) {
			
			x+= 140;
			y+= 110;
					
			g.setColor(Color.RED);
			g.fillOval(x, y, 140, 140);
			
			board.repaint();
		}

	}

}
