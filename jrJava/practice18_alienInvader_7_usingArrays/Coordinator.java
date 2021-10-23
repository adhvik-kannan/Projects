package jrJava.practice18_alienInvader_7_usingArrays;

import java.awt.Color;
import java.awt.Graphics;
import resources.DrawingBoard;
import resources.Timer;

public class Coordinator {

	public static boolean gameOver;

	public static Alien[] aliens;
	public static Missile missile;
	public static Torpedo[] torpedoes;
	public static Ship ship;

	public static Color[] colors = { Color.RED, Color.BLUE, Color.GREEN, Color.CYAN, Color.ORANGE, Color.PINK,
			Color.MAGENTA, new Color(50, 200, 200) };

	public static Color[] eyeColors = { Color.BLACK, Color.GRAY, Color.LIGHT_GRAY };

	public static void main(String[] args) {

		DrawingBoard board = new DrawingBoard(200, 0, 600, 700);
		Graphics g = board.getCanvas();
		Timer timer = new Timer();

		ship = new Ship(200, 600);

		board.addMouseMotionListener(ship);
		board.getJFrame().addKeyListener(ship);

		torpedoes = new Torpedo[100];
		aliens = new Alien[100];

		while (!gameOver) {

			board.clear();

			ship.draw(g);

			createAlien();

			if (missile != null) {
				missile.move();
				missile.draw(g);
			}

			moveAliens();
			drawAliens(g);

			moveTorpedoes();
			drawTorpedoes(g);

			board.repaint();
			timer.pause(50);
		}
	}

	public static void createAlien() {
		if (Math.random() > 0.05)
			return;

		int x = (int) (Math.random() * 601);
		int vx = (int) (Math.random() * 7) - 3;
		int vy = (int) (Math.random() * 5) + 3;
		Color bodyColor = colors[(int) (Math.random() * colors.length)];
		Color eyeColor = eyeColors[(int) (Math.random() * eyeColors.length)];

		Alien alien = new Alien(x, 0, bodyColor, eyeColor, vx, vy);
		boolean shouldContinue = true;
		for (int i = 0; i < aliens.length && shouldContinue; i++) {
			if (aliens[i] == null) {
				aliens[i] = alien;
				shouldContinue = false;
			}
		}
	}

	public static void moveAliens() {
		for (int i = 0; i < aliens.length; i++) {
			if (aliens[i] != null)
				aliens[i].move();
		}
	}

	public static void drawAliens(Graphics g) {
		for (int i = 0; i < aliens.length; i++) {
			if (aliens[i] != null)
				aliens[i].draw(g);
		}
	}

	public static boolean isAlienHit(Torpedo torpedo) {
		for (int i = 0; i < aliens.length; i++) {
			if (aliens[i] != null) {
				if (aliens[i].isHit(torpedo))
					return true;
			}
		}
		return false;
	}

	public static void removeAlien(Alien alien) {
		boolean shouldContinue = true;
		for (int i = 0; i < aliens.length && shouldContinue; i++) {
			if (aliens[i] == alien) {
				aliens[i] = null;
				shouldContinue = false;
			}
		}
	}

	public static void addTorpedo(Torpedo torpedo) {
		boolean shouldContinue = true;
		for (int i = 0; i < torpedoes.length && shouldContinue; i++) {
			if (torpedoes[i] == null) {
				torpedoes[i] = torpedo;
				shouldContinue = false;
			}
		}
	}

	public static void moveTorpedoes() {
		for (int i = 0; i < torpedoes.length; i++) {
			if (torpedoes[i] != null)
				torpedoes[i].move();
		}
	}

	public static void drawTorpedoes(Graphics g) {
		for (int i = 0; i < torpedoes.length; i++) {
			if (torpedoes[i] != null)
				torpedoes[i].draw(g);
		}
	}

	public static void removeTorpedo(Torpedo torpedo) {
		boolean shouldContinue = true;
		for (int i = 0; i < torpedoes.length && shouldContinue; i++) {
			if (torpedoes[i] == torpedo) {
				torpedoes[i] = null;
				shouldContinue = false;
			}
		}
	}

}
