package jrJava.practice15_approach3_usingObjects;

import java.awt.Color;
import resources.DrawingBoard;

public class Painter {

	public static void main(String[] args) {

		DrawingBoard board = new DrawingBoard(200, 0, 600, 600);
		
		playWithSquares(board);
		
		Circle c1 = new Circle(board, Color.RED, 150, 250, 120, 5, 3);
		Circle c2 = new Circle(board, Color.GREEN, 400, 300, 70, -2, -2);
		Circle c3 = new Circle(board, Color.BLUE, 600, 150, 150, -4, 2);
	
		//c2 = null;
		c3 = c2;

		for(int i=1; i<=10; i++) {
			c1.draw();
			c1.move();
			c2.draw();
			c2.move();
			c3.draw();
			c3.move();
		}

	}
	
	
	public static void playWithSquares(DrawingBoard board) {
		
		Square s1 = new Square(board, Color.CYAN, 400, 100, 100, 7, 4);
		Square s2 = new Square(board, Color.ORANGE, 500, 350, 150, -10, -5);
		
		for(int i=0; i<=20; i++) {
			s1.draw();
			s1.move();
			s2.draw();
			s2.move();
		}
	}
	

}
