package jrJava.multi_threading_5;

import java.awt.Color;
import java.awt.Graphics;

import resources.DrawingBoard;

public class RotatingCircle {

	public static void main(String[] args) {

		DrawingBoard board = new DrawingBoard(200, 50, 600, 600);
		Graphics g = board.getCanvas();

		int radius = 1;
		int angle = 0;
		int arcSize = 30;

		ColorReader colorReader = new ColorReader();
		new Thread(colorReader).start();

		while (true) {

			angle += arcSize / 2;
			if (radius < 200)
				radius++;

			// colorReader.read();

			board.clear();
			g.setColor(colorReader.getColor());
			g.fillArc(300 - radius, 300 - radius, 2 * radius, 2 * radius, angle, arcSize);
			g.drawOval(300 - radius, 300 - radius, 2 * radius, 2 * radius);
			board.repaint();

			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
			}
		}
	}
}
