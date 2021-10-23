package jrJava.homework7.Graphics5;

import java.awt.Color;
import java.awt.Graphics;
import resources.DrawingBoard;
import resources.Timer;

public class GraphicsAndForLoop4 {

	public static void main(String[] args) {

		DrawingBoard board = new DrawingBoard(50, 50, 1800, 1600);
		Graphics g = board.getCanvas();
		Timer timer = new Timer();

		board.clear();

		int w = 100;
		int change = 5;

		int i;
		for (i = 1; i < 200; i++) {

			w += change;

			board.clear();
			g.setColor(Color.RED);
			g.drawRect(100, 100, w, w);
			board.repaint();
			timer.pause(10);

			if (w <= 100 || w >= 500) {
				change = -change;
			}
		}

	}

}
