package jrJava.homework7.Graphics8;

import java.awt.Color;
import java.awt.Graphics;
import resources.DrawingBoard;
import resources.Timer;

public class ShakyCircle {

	public static void main(String[] args) {

		DrawingBoard board = new DrawingBoard(0, 0, 1800, 1600);
		Graphics g = board.getCanvas();
		Timer timer = new Timer();

		int iter = 500;
		int disp = 10;
		int i = -1;
		int x = 900;
		int y = 800;
		int originX = x;
		int originY = y;
		boolean debug = false;

		board.clear();
		g.setColor(Color.CYAN);
		g.fillOval(900, 800, 100, 100);
		if (debug) {
			g.setColor(Color.BLACK);
			g.drawString("" + x, 700, 600);
			g.drawString("" + y, 700, 620);
			g.drawString("" + i, 700, 640);
		}
		board.repaint();

		for (i = 1; i <= iter; i++) {
			int change = (int) (Math.random() * 2 * disp - disp);
			if (i % 2 == 0) {
				x = 900 + change;

			} else if (i % 2 == 1) {
				y = 800 + change;
			}

			board.clear();
			g.setColor(Color.CYAN);
			g.fillOval(x, y, 100, 100);
			if (debug) {
				g.setColor(Color.BLACK);
				g.drawString("" + x, 700, 600);
				g.drawString("" + y, 700, 620);
				g.drawString("" + i, 700, 640);
			}
			board.repaint();
			timer.pause(40);

			x = originX;
			y = originY;

			board.clear();
			g.setColor(Color.CYAN);
			g.fillOval(x, y, 100, 100);
			if (debug) {
				g.setColor(Color.BLACK);
				g.drawString("" + x, 700, 600);
				g.drawString("" + y, 700, 620);
				g.drawString("" + i, 700, 640);
			}
			board.repaint();
			timer.pause(40);

		}

	}

}
