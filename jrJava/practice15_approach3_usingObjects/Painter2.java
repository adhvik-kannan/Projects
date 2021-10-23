package jrJava.practice15_approach3_usingObjects;

import java.awt.Color;
import resources.DrawingBoard;

public class Painter2 {

	public static void main(String[] args) {

		DrawingBoard board = new DrawingBoard(200, 0, 600, 600);

		Circle c1 = new Circle(board, Color.RED, 150, 250, 120, 5, 3);

		System.out.println(c1);
	}

}
