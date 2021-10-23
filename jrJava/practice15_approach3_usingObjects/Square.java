package jrJava.practice15_approach3_usingObjects;

import java.awt.Color;
import java.awt.Graphics;
import resources.DrawingBoard;

public class Square {
	
	public DrawingBoard board;
	public Color color;
	public int x, y, side;	
	public int dx, dy;
	
	public Square() { }
	
	public Square(DrawingBoard board, Color color, int x, int y, int side, int dx, int dy) {
		
		this.board = board;
		this.color = color;
		this.x = x;
		this.y= y;
		this.side = side;
		this.dx = dx;
		this.dy = dy;
	}
	public void draw() {
		
		Graphics g = board.getCanvas();
		g.setColor(color);
		g.drawRect(x, y, side, side);
		board.repaint();
	}
	
	public void move() {
		x += dx;
		y += dy;
	}
	
	
}
