package jrJava.bezierCurves;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import resources.DrawingBoard;

public class BezierInJava {

	public static void main(String[] args) {

		DrawingBoard board = new DrawingBoard(800, 700);
		Graphics2D g = (Graphics2D) board.getCanvas();
		GeneralPath path = new GeneralPath();

		// path.moveTo(100.0, 100.0);
		// path.lineTo(200.0, 200.0);
		// path.lineTo(200.0, 300.0);

		path.moveTo(100.0, 100.0);
		path.quadTo(300.0, 50.0, 200.0, 200.0);
		path.lineTo(200.0, 300.0);
		path.curveTo(100.0, 300.0, 200.0, 100.0, 100.0, 100.0);

		path.moveTo(500, 300);
		path.curveTo(800, 100, 500, 500, 500, 600);

		g.setColor(Color.CYAN);
		g.fill(path);
		g.setColor(Color.BLUE);
		g.draw(path);

		board.repaint();
	}

}
