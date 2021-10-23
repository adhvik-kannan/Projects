package jrJava.homework7.Graphics7;

import java.awt.Color;
import java.awt.Graphics;
import resources.DrawingBoard;
import resources.Timer;

public class CircleBouncing1 {

	public static void main(String[] args) {

		DrawingBoard board = new DrawingBoard(50, 50, 800, 600);
		Graphics g = board.getCanvas();
		Timer timer = new Timer();

		int x = 100;
		int change = 5;

		int i;
		for (i = 1; i < 1000; i++) {

			if (x <= 99 || x >= 500) {
				change = -change;
			}

			x = x + change;

			board.clear();
			g.setColor(Color.RED);
			g.fillOval(x, 300, 100, 100);
			board.repaint();
			timer.pause(50);

		}
	}

}
