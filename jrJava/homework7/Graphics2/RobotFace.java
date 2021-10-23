package jrJava.homework7.Graphics2;

import java.awt.Color;
import java.awt.Graphics;

import resources.DrawingBoard;

public class RobotFace {

	public static void main(String[] args) {

		DrawingBoard board = new DrawingBoard(300, 50, 900, 600);
		Graphics g = board.getCanvas();

		board.clear();

		g.setColor(Color.BLACK);
		g.drawOval(350, 50, 250, 250);

		Color myColor = new Color(200, 175, 175);
		g.setColor(myColor);
		g.fillOval(400, 100, 50, 50);
		g.fillOval(500, 100, 50, 50);

		g.setColor(Color.PINK);
		g.fillRect(450, 150, 50, 50);

		g.setColor(Color.RED);
		g.drawArc(400, 200, 150, 60, 180, 180);

		board.repaint();

	}

}
