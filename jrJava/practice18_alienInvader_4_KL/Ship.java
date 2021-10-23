package jrJava.practice18_alienInvader_4_KL;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ship implements KeyListener {

	public int x, y; // top-center
	public Color color = Color.RED;
	public int eachHeight = 20;
	public int topWidth = 4, middleWidth = 20, bottomWidth = 60;

	public Ship(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void shootTorpedo() {
		Coordinator.torpedo = new Torpedo(x, y - Torpedo.height, 7);
	}

	public void keyPressed(KeyEvent e) {
		// System.out.println("Someone pressed a key.");
		// char typed = e.getKeyChar();
		// System.out.println(typed);
		int typed = e.getKeyCode();
		if (typed == KeyEvent.VK_LEFT) {
			x -= 5;
		} else if (typed == KeyEvent.VK_RIGHT) {
			x += 5;
		} else if (typed == KeyEvent.VK_SPACE) {
			shootTorpedo();
		}
	}

	public void keyTyped(KeyEvent e) {
		// System.out.println("Someone typed a key.");
	}

	public void keyReleased(KeyEvent e) {
		// System.out.println("Someone released a key.");
	}

	public boolean isHit(Alien alien) {
		if (isHit(alien.x, alien.y, Alien.size, Alien.size)) {
			Coordinator.gameOver = true;
			return true;
		}
		return false;
	}

	public boolean isHit(Missile missile) {
		if (isHit(missile.x, missile.y, Missile.width, Missile.height)) {
			Coordinator.gameOver = true;
			return true;
		}
		return false;
	}

	public boolean isHit(int xB, int yB, int w, int h) {
		return xB >= x - topWidth / 2 - w / 2 && xB <= x + topWidth / 2 + w / 2 && yB >= y + 0 * eachHeight
				&& yB <= y + 1 * eachHeight + h
				|| xB >= x - middleWidth / 2 - w / 2 && xB <= x + middleWidth / 2 + w / 2 && yB >= y + 1 * eachHeight
						&& yB <= y + 2 * eachHeight + h
				|| xB >= x - bottomWidth / 2 - w / 2 && xB <= x + bottomWidth / 2 + w / 2 && yB >= y + 2 * eachHeight
						&& yB <= y + 3 * eachHeight + h;
	}

	public void draw(Graphics g) {
		g.setColor(color);
		g.drawRect(x - topWidth / 2, y, topWidth, eachHeight);
		g.drawRect(x - middleWidth / 2, y + eachHeight, middleWidth, eachHeight);
		g.drawRect(x - bottomWidth / 2, y + 2 * eachHeight, bottomWidth, eachHeight);

	}

}
