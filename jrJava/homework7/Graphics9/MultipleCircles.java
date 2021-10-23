package jrJava.homework7.Graphics9;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;
import resources.DrawingBoard;
import resources.Timer;

public class MultipleCircles {

	public static void main(String[] args) {

		DrawingBoard board = new DrawingBoard(0, 0, 1800, 1600);
		Graphics g = board.getCanvas();
		Timer timer = new Timer();
		Scanner scanner = new Scanner(System.in);

		int x = 0;
		int y = 0;

		int i;
		for (i = 1; i <= 10; i++) {
			System.out.println("Enter an x-coordinate:");
			x = scanner.nextInt();
			System.out.println("Enter a y-coordinate:");
			y = scanner.nextInt();

			g.setColor(Color.GREEN);
			g.fillOval(x, y, 200, 200);
			board.repaint();
		}

	}

}
