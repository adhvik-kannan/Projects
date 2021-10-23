package jrJava.practice18_alienInvader_1;

import java.awt.Color;
import java.awt.Graphics;

public class Missile {

	public int x, y; // bottom-center
	public static int width, height;
	public static Color color;
	public int vy;

	static {
		width = 4;
		height = 10;
		color = Color.RED;
	}

	public Missile(int x, int y, int vy) {
		this.x = x;
		this.y = y;
		this.vy = vy;
	}

	public void move() {
		y += vy;
	}

	public void draw(Graphics g) {
		g.setColor(color);
		g.drawRect(x - width / 2, y - height, width, height);
	}

}
