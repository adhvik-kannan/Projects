package jrJava.practice18_alienInvader_1;

import java.awt.Color;
import java.awt.Graphics;
import resources.DrawingBoard;
import resources.Timer;

public class Coordinator {

	public static Alien alien;
	public static Missile missile;
	public static Torpedo torpedo;
	public static Ship ship;

	public static void main(String[] args) {

		DrawingBoard board = new DrawingBoard(200, 0, 600, 700);
		Graphics g = board.getCanvas();
		Timer timer = new Timer();
		
		ship = new Ship(200, 600);
		alien = new Alien(300, 0, Color.GREEN, Color.BLACK, 2, 5);
		
		for(int i=1; i<=200; i++) {

			board.clear();
			
			ship.move();
			ship.draw(g);
			
			alien.move();
			alien.draw(g);

			if(missile!=null) {
				missile.move();
				missile.draw(g);
			}
			if(torpedo!=null) {
				torpedo.move();
				torpedo.draw(g);
			}
			board.repaint();
			timer.pause(10);
		}
	}

}
