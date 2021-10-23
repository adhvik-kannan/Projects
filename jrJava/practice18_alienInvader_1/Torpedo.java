package jrJava.practice18_alienInvader_1;

import java.awt.Color;
import java.awt.Graphics;

public class Torpedo {
	
	public int x, y; // top center
	public static int width, height;
	public static Color color;
	public int vy;
	
	static {
		width = 4;
		height = 12;
		color = Color.BLUE;
	}
	
	public Torpedo(int x, int y, int vy) {
		this.x = x;
		this.y = y;
		this.vy = vy;
		if(this.vy>0) this.vy = -this.vy;
	}
	
	public void move() {
		y += vy;
	}
	
	public void draw(Graphics g) {
		g.setColor(color);
		g.drawRect(x-width/2, y, width, height);
	}
	

}
