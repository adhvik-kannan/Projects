package jrJava.homework7.Graphics3;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;

import resources.DrawingBoard;

public class CircleByUser1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter x-coordinate of the circle's center:");
		int x = scanner.nextInt();

		System.out.println("Enter the y-coordinate of the circle's center:");
		int y = scanner.nextInt();

		System.out.println("Enter radius of the circle");
		int r = scanner.nextInt();

		DrawingBoard board = new DrawingBoard(300, 50, 900, 600);
		Graphics g = board.getCanvas();

		board.clear();

		g.setColor(Color.BLACK);
		g.drawArc(x - r, y - r, 2 * r, 2 * r, 0, 360);
		g.fillOval(x, y, 5, 5);
		g.drawString("(" + x + "," + y + ")", x - 50, y);
		g.drawLine(x, y, x + r, y);
		g.drawString(" radius = " + r, x + r, y);

		board.repaint();

	}

}
