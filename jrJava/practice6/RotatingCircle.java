package jrJava.practice6;

import java.awt.Color;
import java.awt.Graphics;
import resources.DrawingBoard;
import resources.Timer;

public class RotatingCircle {


	public static void main(String[] args) {

		DrawingBoard board = new DrawingBoard(50, 50, 800, 600);
		Graphics g = board.getCanvas();
		Timer timer = new Timer();

		int x = 400;
		int y = 300;
		int radius = 100;
		int startAngle = 0;
		
		int i;
		for(i=1; i<=300; i++){
			
			startAngle += 10;
			radius++;
			
			board.clear();
			g.setColor(Color.BLUE);
			g.fillArc(x-radius, y-radius, 2*radius, 2*radius, startAngle, 30);
			g.drawOval(x-radius, y-radius, 2*radius, 2*radius);
			board.repaint();
			timer.pause(5);
		}

	}

}
