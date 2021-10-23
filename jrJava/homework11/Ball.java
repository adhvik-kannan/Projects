package jrJava.homework11;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ball implements KeyListener, MouseListener {

	public Color color;
	public int radius;
	public int x;
	public int y;

	public Ball(int x, int y, int radius, Color color) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.color = color;
	}

	public void circle(Graphics g) {
		g.setColor(color);
		g.fillOval(x - radius, y - radius, 2 * radius, 2 * radius);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		int typed = e.getKeyCode();
		if (typed == KeyEvent.VK_LEFT) {
			x -= 10;
		} else if (typed == KeyEvent.VK_RIGHT) {
			x += 10;
		} else if (typed == KeyEvent.VK_UP) {
			y -= 10;
		} else if (typed == KeyEvent.VK_DOWN) {
			y += 10;
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		int mX = e.getX();
		int mY = e.getY();
		if (mX > x && mY < y) {
			x += 10;
			y -= 10;
		} else if (mX < x && mY < y) {
			x -= 10;
			y -= 10;
		} else if (mX > x && mY > y) {
			x += 10;
			y += 10;
		} else if (mX < x && mY > y) {
			x -= 10;
			y += 10;
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
