package jrJava.maze_4_withPrizes;

import java.awt.Graphics;
import java.awt.Image;

public class Prize {

	private Image image;
	private int score;
	private int x, y, w, h;
	
	
	public Prize(String line) {
		
	}
	
	
	public void draw(Graphics g) {
		g.drawImage(image, x-w/2, y-h/2, null);
	}
	
	
}
