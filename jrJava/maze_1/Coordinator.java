package jrJava.maze_1;

import java.awt.Graphics;

import resources.DrawingBoard;

public class Coordinator {

	public static void main(String[] args) {

		DrawingBoard board = new DrawingBoard(200, 0, 600, 600);
		Graphics g = board.getCanvas();

		Mouse mouse = new Mouse(525, 25, 5, 0, 1);
		board.getJFrame().addKeyListener(mouse);

		Mouse enemyMouse = new Mouse(25, 25, 5, 1, 0);
		new Thread(mouse).start();

		while (true) {
			board.clear();
			mouse.draw(g);
			enemyMouse.draw(g);
			board.repaint();

			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
			}
		}
	}

}
