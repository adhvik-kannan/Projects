package jrJava.homework7.Graphics5;

import java.awt.Color;
import java.awt.Graphics;
import resources.DrawingBoard;
import resources.Timer;

public class GraphicsAndForLoop3 {

	public static void main(String[] args) {

		DrawingBoard board = new DrawingBoard(50, 50, 1800, 1600);
		Graphics g = board.getCanvas();
		Timer timer = new Timer();

		board.clear();

		int w = 100;

		int i;
		for (i = 1; i < 101; i++) {

			w += 5;

			board.clear();
			g.setColor(Color.RED);
			g.drawRect(100, 100, w, w);
			board.repaint();
			timer.pause(10);

		}

	}

}
