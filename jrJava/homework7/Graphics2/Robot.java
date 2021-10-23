package jrJava.homework7.Graphics2;

import java.awt.Color;
import java.awt.Graphics;

import resources.DrawingBoard;

public class Robot {

	public static void main(String[] args) {

		DrawingBoard board = new DrawingBoard(300, 50, 900, 600);
		Graphics g = board.getCanvas();

		board.clear();

		g.setColor(Color.LIGHT_GRAY);
		g.drawOval(400, 100, 100, 100);

		Color myColor = new Color(200, 175, 175);
		g.setColor(myColor);
		g.fillOval(420, 125, 25, 25);
		g.fillOval(460, 125, 25, 25);

		g.setColor(Color.ORANGE);
		g.fillRect(400, 200, 100, 150);

		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(370, 200, 25, 150);
		g.fillRect(505, 200, 150, 25);

		g.setColor(Color.BLUE);
		g.fillRect(400, 355, 45, 150);
		g.fillRect(455, 355, 45, 150);

		g.setColor(Color.BLACK);
		g.fillRect(370, 508, 75, 25);
		g.fillRect(455, 508, 75, 25);
		g.drawString("Hello!", 550, 150);

		board.repaint();
	}

}
