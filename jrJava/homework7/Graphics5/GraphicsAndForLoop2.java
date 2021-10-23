package jrJava.homework7.Graphics5;

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
		int y = 300;
		int r = 100;

		int i;
		for (i = 1; i < 101; i++) {

			x += 5;
			r += 2;

			board.clear();
			g.setColor(Color.GREEN);
			g.fillOval(x, y, 2 * r, 2 * r);
			board.repaint();
			timer.pause(10);

		}

	}

}
