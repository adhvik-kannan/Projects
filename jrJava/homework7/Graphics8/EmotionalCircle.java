package jrJava.homework7.Graphics8;

import java.awt.Color;
import java.awt.Graphics;
import resources.DrawingBoard;
import resources.Timer;

public class EmotionalCircle {

	public static void main(String[] args) {

		DrawingBoard board = new DrawingBoard(0, 0, 1800, 1000);
		Graphics g = board.getCanvas();
		Timer timer = new Timer();

		int iter = 500;
		int disp = 3;
		int i = -1;
		int x = 900;
		int y = 500;
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
			int change1 = (int) (Math.random() * 2 * disp - disp);
			int change2 = (int) (Math.random() * 2 * disp - disp);
			int changeColor1 = (int) (Math.random() * 256);
			int changeColor2 = (int) (Math.random() * 256);
			int changeColor3 = (int) (Math.random() * 256);
			x = x + change1;
			y = y + change2;
			Color myColor = new Color(changeColor1, changeColor2, changeColor3);

			board.clear();
			g.setColor(myColor);
			g.fillOval(x, y, 100, 100);
			if (debug) {
				g.setColor(Color.BLACK);
				g.drawString("" + x, 700, 600);
				g.drawString("" + y, 700, 620);
				g.drawString("" + i, 700, 640);
			}
			board.repaint();
			timer.pause(1000);

		}
	}

}
