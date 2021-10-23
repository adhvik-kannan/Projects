package jrJava.lineOfAction_2;

import java.awt.Graphics;

public class Coordinator {

	public static void main(String[] args) {

		MyDrawingBoard board = new MyDrawingBoard(500, 100, 500, 500);
		Graphics g = board.getBufferedG();

		Gameboard gameBoard = new Gameboard(g);

		board.addMouseListener(gameBoard);
		board.addMouseMotionListener(gameBoard);

		while(true) {
			board.clear();
			gameBoard.draw();
			board.repaint();
			
			try {
				Thread.sleep(15);
			} catch (InterruptedException e) {}
		}
	}


}
