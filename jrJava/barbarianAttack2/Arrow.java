package jrJava.barbarianAttack2;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Arrow {

	private double x, y, vx, vy, length;
	private static double gravity = 0.4;
	private boolean isCollided;
	private static Image eImage;
	private static int eWidth, eHeight;

	static {
		eImage = new ImageIcon(Coordinator.R_PATH + "explosion.png").getImage();
		eWidth = eImage.getWidth(null);
		eHeight = eImage.getHeight(null);
	}

	public Arrow(double x, double y, double vx, double vy, double length) {
		super();
		this.x = x;
		this.y = y;
		this.vx = vx;
		this.vy = vy;
		this.length = length;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void move() {
		for (int i = 0; i < 10; i++) {
			x += vx / 10;
			y += vy / 10;
			vy += gravity / 10;

			if (BarbarianManager.isHit(this)) {
				isCollided = true;
			}
			// check collision occurs. break out of for-loop.
			// if(x<100 || y>500) ArrowManager.remove(this);
		}
	}

	public void draw(Graphics2D g) {
		g.setColor(Color.BLACK);
		double hyp = Math.sqrt(vx * vx + vy * vy);
		g.drawLine((int) x, (int) y, (int) (x + length * vx / hyp), (int) (y + length * vy / hyp));

		if (isCollided) {
			g.drawImage(eImage, (int) x - eWidth / 2, (int) y - eHeight / 2, null);
			ArrowManager.remove(this);
		}
	}

}
