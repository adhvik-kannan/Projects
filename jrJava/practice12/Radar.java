package jrJava.practice12;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;

import resources.DrawingBoard;
import resources.Timer;

public class Radar {

	// Job: It will animate one revolution of radar screen.
	public static void displayRadar(DrawingBoard board, Timer timer, int radius, int xC, int yC) {
		Graphics g = board.getCanvas();

		int i;
		for (i = 1; i <= 360; i++) {
			board.clear();
			drawGradientArc(g, radius, xC, yC, i);
			g.setColor(Color.DARK_GRAY);
			g.drawOval(xC - radius, yC - radius, 2 * radius, 2 * radius);
			board.repaint();

			if (i == 90 || i == 270) {
				Toolkit.getDefaultToolkit().beep();
			}
			timer.pause(10);
		}
	}

	public static void drawGradientArc(Graphics g, int radius, int xC, int yC, int angle) {

		int startAngle = angle;
		int arcAngle = 40;
		int colorIncrement = 255 / 40;
		int i;
		for (i = 1; i <= 40; i++) {

			startAngle++;
			arcAngle--;

			Color color = new Color(255 - colorIncrement * i, 255, 255 - colorIncrement * i);
			g.setColor(color);
			g.fillArc(xC - radius, yC - radius, 2 * radius, 2 * radius, startAngle, arcAngle);
		}

	}

}
