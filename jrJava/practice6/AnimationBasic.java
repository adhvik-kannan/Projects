package jrJava.practice6;

import java.awt.Color;
import java.awt.Graphics;
import resources.DrawingBoard;
import resources.Timer;

public class AnimationBasic {

	public static void main(String[] args) {

		DrawingBoard board = new DrawingBoard(50, 50, 800, 600);
		Graphics g = board.getCanvas();
		Timer timer = new Timer();

		int x = 100;

		int i;
		for (i = 1; i <= 100; i++) {

			x += 5;

			board.clear();
			g.setColor(Color.RED);
			g.fillOval(x, 250, 100, 100);
			board.repaint();
			timer.pause(5);

		}

	}

}
