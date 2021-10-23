package jrJava.practice15_approach2;

import java.awt.Color;
import resources.DrawingBoard;

public class Painter {

	public static void main(String[] args) {
		
		DrawingBoard board = new DrawingBoard(200, 0, 600, 600);
		
		Circle.board = board;
		Circle.color = Color.RED;
		Circle.x = 300;
		Circle.y = 100;
		Circle.radius = 80;
		Circle.dx = 7;
		Circle.dy = 3;
		
		Square.board = board;
		Square.color = Color.BLUE;
		Square.x = 400;
		Square.y = 400;
		Square.side = 140;
		Square.dx = -25;
		Square.dy = -10;
		
		Circle.draw();
		Square.draw();
		
		Circle.move();
		Square.move();
		Circle.draw();
		Square.draw();
		
		Circle.move();
		Square.move();
		Circle.draw();
		Square.draw();
		
		Circle.move();
		Square.move();
		Circle.draw();
		Square.draw();
	}

}
