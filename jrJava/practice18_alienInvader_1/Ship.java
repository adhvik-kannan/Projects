package jrJava.practice18_alienInvader_1;

import java.awt.Color;
import java.awt.Graphics;

public class Ship {

	public int x, y; // top-center
	public Color color = Color.RED;
	public int eachHeight = 20;
	public int topWidth = 4, middleWidth = 20, bottomWidth = 60;
	public int vx = 4; // delete.

	public Ship(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// delete
	public void move() {
		x += vx;
		if (x >= 400 && x < 400 + vx) {
			shootTorpedo();
		}
	}

	public void shootTorpedo() {
		Coordinator.torpedo = new Torpedo(x, y - Torpedo.height, 7);
	}

	public void draw(Graphics g) {
		g.setColor(color);
		g.drawRect(x - topWidth / 2, y, topWidth, eachHeight);
		g.drawRect(x - middleWidth / 2, y + eachHeight, middleWidth, eachHeight);
		g.drawRect(x - bottomWidth / 2, y + 2 * eachHeight, bottomWidth, eachHeight);

	}

}
