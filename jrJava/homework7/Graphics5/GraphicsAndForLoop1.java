package jrJava.homework7.Graphics5;

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
		
		int x = 100;
		
		int i;
		for(i=1; i<=100; i++) {
			
			x+=5;
			
			board.clear();
			g.setColor(Color.GREEN);
			g.fillOval(x, 300, 200, 200);
			board.repaint();
			timer.pause(10);
			
			
		}

	}

}
