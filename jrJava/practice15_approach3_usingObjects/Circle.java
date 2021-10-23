package jrJava.practice15_approach3_usingObjects;

import java.awt.Color;
import java.awt.Graphics;
import resources.DrawingBoard;

public class Circle {

	public DrawingBoard board;
	public Color color;
	public int x, y, radius;
	public int dx, dy;

	public Circle() {
	}

	public Circle(DrawingBoard board, Color color, int x, int y, int radius, int dx, int dy) {

		System.out.println(this);
		this.board = board;
		this.color = color;
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.dx = dx;
		this.dy = dy;
	}

	public void draw() {

		Graphics g = board.getCanvas();
		g.setColor(color);
		g.drawOval(x - radius, y - radius, 2 * radius, 2 * radius);
		board.repaint();
	}

	public void move() {
		x += dx;
		y += dy;
	}

}
