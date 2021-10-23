package jrJava.maze_2_network;

import java.awt.Graphics;

import resources.DrawingBoard;

public class Coordinator {

	public static void main(String[] args) {

		DrawingBoard board = new DrawingBoard(200, 0, 600, 600);
		Graphics g = board.getCanvas();

		Mouse mouse = new Mouse(25, 25, 5, 1, 0);
		board.getJFrame().addKeyListener(mouse);
		new Thread(mouse).start();

		while (true) {
			board.clear();
			mouse.draw(g);
			board.repaint();

			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
			}
		}
	}

}
