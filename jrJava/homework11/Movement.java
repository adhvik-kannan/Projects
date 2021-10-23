package jrJava.homework11;

import java.awt.Color;
import java.awt.Graphics;

import resources.DrawingBoard;
import resources.Timer;

public class Movement {

	public static boolean go;

	public static void main(String[] args) {

		DrawingBoard board = new DrawingBoard(200, 0, 600, 600);
		Graphics g = board.getCanvas();
		Timer timer = new Timer();
		Ball[] ball = new Ball[2];
		
		ball[0] = new Ball(100, 200, 30, Color.RED);
		ball[1] = new Ball(400, 400, 50, Color.GREEN);
		
		board.getJFrame().addKeyListener(ball[0]);
		board.addMouseListener(ball[1]);
		
		while(go==false) {
			board.clear();
			
			ball[0].circle(g);
			ball[1].circle(g);
			
			board.repaint();
			timer.pause(10);
		}
	}

}
