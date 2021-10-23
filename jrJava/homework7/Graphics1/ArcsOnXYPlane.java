package jrJava.homework7.Graphics1;

import java.awt.Color;
import java.awt.Graphics;

import resources.DrawingBoard;

public class ArcsOnXYPlane {

	public static void main(String[] args) {
		DrawingBoard board = new DrawingBoard(300, 50, 900, 600);
		Graphics g = board.getCanvas();

		board.clear();

		g.setColor(Color.BLACK);
		g.drawLine(100, 300, 700, 300);
		g.drawLine(400, 100, 400, 500);

		g.drawString("x", 725, 300);
		g.drawString("y", 400, 75);
		g.drawString("0", 390, 315);

		g.drawLine(690, 290, 700, 300);
		g.drawLine(700, 300, 690, 310);

		g.drawLine(390, 110, 400, 100);
		g.drawLine(400, 100, 410, 110);

		g.setColor(Color.BLUE);
		g.drawArc(300, 200, 200, 200, 0, 270);

		g.setColor(Color.GREEN);
		g.drawArc(310, 210, 180, 180, 0, 180);

		g.setColor(Color.RED);
		g.drawArc(320, 220, 160, 160, 0, 90);

		board.repaint();

	}

}
