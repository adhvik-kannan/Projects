package jrJava.homework8;

import java.awt.Color;
import java.awt.Graphics;

import resources.DrawingBoard;
import resources.Timer;

public class Problem2 {

	public static void main(String[] args) {

		DrawingBoard board = new DrawingBoard(100, 100, 700, 700);
		Graphics g = board.getCanvas();
		g.setColor(Color.CYAN);

		int i, j;

		// A)
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= i; j++) {
				g.fillRect(i * 100, j * 100, 100, 100);
			}
		}
		/*
		 * // B) for(i=1; i<=5; i++) { for(j=1; j<i; j++) { g.fillRect(i*100, j*100,
		 * 100, 100); } }
		 * 
		 * // C) for(i=1; i<=5; i++) { for(j=6-i; j<=5; j++) { g.fillRect(i*100, j*100,
		 * 100, 100); } }
		 * 
		 * // D) for(i=1; i<=5; i++) { for(j=1; j<=6-i; j++) { g.fillRect(i*100, j*100,
		 * 100, 100); } }
		 * 
		 * // E) for(i=1; i<=5; i++) { for(j=i; j<=5; j++) { g.fillRect(i*100, j*100,
		 * 100, 100); } }
		 * 
		 * // F) for(i=1; i<=5; i++) { for(j=5; j>i; j--) { g.fillRect(i*100, j*100,
		 * 100, 100); } }
		 */
		g.setColor(Color.BLACK);
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= 5; j++) {
				g.drawRect(i * 100, j * 100, 100, 100);
			}
		}
		board.repaint();

	}

}
