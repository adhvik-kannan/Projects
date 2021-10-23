package jrJava.homework7.Graphics6;

import java.awt.Color;
import java.awt.Graphics;
import resources.DrawingBoard;
import resources.Timer;

public class GraphicsAndForLoop1 {

	public static void main(String[] args) {
		
		DrawingBoard board = new DrawingBoard(50, 50, 1800, 1600);
		Graphics g = board.getCanvas();
		Timer timer = new Timer();
		
		board.clear();
		
		int angle = 10;
		
		int i;
		for(i=1; i<35; i++) {
			
			angle+=10;
			
			board.clear();
			g.setColor(Color.RED);
			g.drawArc(100, 100, 600, 600, 0, angle);
			board.repaint();
			timer.pause(10);
			
		}
		
	}

}
