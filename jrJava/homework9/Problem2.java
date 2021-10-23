package jrJava.homework9;

import java.awt.Color;
import java.awt.Graphics;
import resources.DrawingBoard;

public class Problem2 {

	public static void main(String[] args) {

		DrawingBoard board = new DrawingBoard(200, 0, 1700, 1700);
		Graphics g = board.getCanvas();
		board.clear();
		/*
		 * drawTriangle(g, 100, 0, 0, 50, 50, 150, 200, 25, 100); drawTriangle(g, 0,
		 * 100, 0, 200, 50, 300, 200, 250, 100); drawTriangle(g, 0, 0, 100, 500, 500,
		 * 650, 200, 650, 100); drawTriangle(g, 100, 100, 100, 50, 500, 150, 600, 25,
		 * 650); drawPacMan(g, 100, 0, 0, 50, 10, 350, 350); drawPacMan(g, 0, 100, 0,
		 * 100, 60, 400, 100); drawPacMan(g, 0, 0, 100, 75, 40, 350, 500);
		 * 
		 * drawGrids(g, 255, 0, 0, 50, 50, 25, 10); drawGrids(g, 0, 255, 0, 500, 100,
		 * 15, 15);
		 */
		drawConcentricCircles(g, 255, 0, 0, 500, 500, 100, 10);
		drawConcentricCircles(g, 0, 255, 0, 1000, 1000, 40, 4);
		board.repaint();

	}

	// A)
	public static void drawTriangle(Graphics g, int red, int green, int blue, int x1, int y1, int x2, int y2, int x3,
			int y3) {
		Color color = new Color(red, green, blue);
		g.setColor(color);
		g.drawLine(x1, y1, x2, y2);
		g.drawLine(x3, y3, x1, y1);
		g.drawLine(x2, y2, x3, y3);
	}

	// B)
	public static void drawPacMan(Graphics g, int red, int green, int blue, int radius, int angle, int xC, int yC) {
		Color color = new Color(red, green, blue);
		g.setColor(color);
		g.fillArc(xC - radius, yC - radius, 2 * radius, 2 * radius, angle, 360 - angle);
		g.setColor(Color.BLACK);
		g.fillOval(xC - radius / 2, yC - radius / 2, 2 * (radius / 6), 2 * (radius / 6));
	}

	// C)
	public static void drawGrids(Graphics g, int red, int green, int blue, int x, int y, int increment,
			int numberOfLines) {
		int i, j;
		for (i = 0; i < numberOfLines; i++) {
			for (j = 0; j < numberOfLines; j++) {
				Color color = new Color(red, green, blue);
				g.setColor(color);
				g.drawRect(x + i * increment, y + j * increment, increment, increment);
				g.setColor(Color.BLACK);
				g.drawRect(50, 50, 100, 100);

			}
		}

	}

	// D)
	public static void drawConcentricCircles(Graphics g, int red, int green, int blue, int xC, int yC, int radius,
			int numberOfCircles) {
		double change = radius / (numberOfCircles - 1);
		int i;
		for (i = numberOfCircles; i > 0; i--) {
			Color color = new Color(red, green, blue);
			g.setColor(color);
			g.drawOval(xC - radius, yC - radius, 2 * radius, 2 * radius);
			radius -= change;
		}
		g.drawOval(xC - 2, yC - 2, 4, 4);
	}

}
