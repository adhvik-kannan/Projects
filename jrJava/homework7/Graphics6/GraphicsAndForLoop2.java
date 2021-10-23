package jrJava.homework7.Graphics6;

import java.awt.Color;
import java.awt.Graphics;
import resources.DrawingBoard;
import resources.Timer;

public class GraphicsAndForLoop2 {

	public static void main(String[] args) {
		
		DrawingBoard board = new DrawingBoard(50, 50, 1800, 1600);
		Graphics g = board.getCanvas();
		Timer timer = new Timer();
		
		board.clear();
		
		int x = 100;
		int y = 100;
		int radius = 300;
		int startAngle = -150;
		int angle = 300;
		int change = 20;
		
		int i;
		for(i=1; i<1000; i++) {
			
			board.clear();
			g.setColor(Color.BLUE);
			g.fillArc(x, x, radius*2, radius*2, startAngle, angle);
			g.setColor(Color.WHITE);
			g.fillOval(x+radius, y+60, 50, 50);
			startAngle -= change;
			angle += 2*change;
			change = -change;
			board.repaint();
			timer.pause(500);
			
			
		}

	}

}
