package jrJava.practice18_alienInvader_5_ML_MML;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Ship implements MouseListener, MouseMotionListener {

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

	public void mouseClicked(MouseEvent e) {
		// System.out.println("It got clicked.");
	}

	public void mousePressed(MouseEvent e) {
		// System.out.println("It got pressed.");
		int mX = e.getX();
		int mY = e.getY();
		// System.out.println(mX + ", " + mY);

		if (mX >= x - bottomWidth / 2 && mX <= x + bottomWidth / 2 && mY >= y + 2 * eachHeight
				&& mY <= y + 3 * eachHeight) {
			shootTorpedo();
		}
	}

	public void mouseReleased(MouseEvent e) {
		// System.out.println("It got released.");
	}

	public void mouseEntered(MouseEvent e) {
		// System.out.println("It got entered.");
	}

	public void mouseExited(MouseEvent e) {
		// System.out.println("It got exited.");
	}

	public void mouseDragged(MouseEvent e) {
		x = e.getX();
	}

	public void mouseMoved(MouseEvent e) {

	}

}
