package jrJava.homework7.Graphics7;

import java.awt.Color;
import java.awt.Graphics;
import resources.DrawingBoard;
import resources.Timer;

public class CircleBouncing2 {

	public static void main(String[] args) {
		
		DrawingBoard board = new DrawingBoard(50, 50, 1800, 1600);
		Graphics g = board.getCanvas();
		Timer timer = new Timer();

		int x = 100;
		int y = 220;
		int change1 = 5;
		int change2 = -6;
		
		int i;
		for(i=1; i<1000; i++) {
			
			board.clear();
			g.setColor(Color.BLACK);
			g.drawRect(100, 100, 300, 300);
			g.setColor(Color.BLUE);
			g.fillOval(x, y, 50, 50);
			board.repaint();
			timer.pause(50);
			
			
			if(x<=99 || x>=400) {
				change1 = -change1;
			}

			if(y<=100 || y>=400) {

				change2 = -change2;
			}
			
			x += change1;
			y += change2;
			
			
			
		}

	}

}
