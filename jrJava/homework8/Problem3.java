package jrJava.homework8;

import java.awt.Color;
import java.awt.Graphics;

import resources.DrawingBoard;
import resources.Timer;

public class Problem3 {

	public static void main(String[] args) {
		
		DrawingBoard board = new DrawingBoard(100, 100, 700, 700);
		Graphics g = board.getCanvas();
		Timer timer = new Timer();
		
		int i, j;
		int x = 100;
		int y = 100;
		int r = 50;
		
		for(i=1; i<=20; i++) {
			
			for(j=1; j<100; j++) {
				x+= 5;
				board.clear();
				g.setColor(Color.RED);
				g.fillOval(x-r, y-r, 2*r, 2*r);
				board.repaint();
				timer.pause(20);
			}
			
			for(j=1; j<100; j++) {
				y+= 5;
				board.clear();
				g.setColor(Color.RED);
				g.fillOval(x-r, y-r, 2*r, 2*r);
				board.repaint();
				timer.pause(20);
			}
			
			for(j=1; j<100; j++) {
				x-= 5;
				board.clear();
				g.setColor(Color.RED);
				g.fillOval(x-r, y-r, 2*r, 2*r);
				board.repaint();
				timer.pause(20);
			}
			
			for(j=1; j<100; j++) {
				y-= 5;
				board.clear();
				g.setColor(Color.RED);
				g.fillOval(x-r, y-r, 2*r, 2*r);
				board.repaint();
				timer.pause(20);
			}
			
			
		}
		

	}

}
