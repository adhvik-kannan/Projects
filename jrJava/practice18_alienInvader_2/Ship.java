package jrJava.practice18_alienInvader_2;

import java.awt.Color;
import java.awt.Graphics;

public class Ship {

	public int x, y; // top-center
	public Color color = Color.RED;
	public int eachHeight = 20;
	public int topWidth = 4, middleWidth = 20, bottomWidth = 60;
	public int vx =4; // delete.
	
	public Ship(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// delete
	public void move() {
		x += vx;
		if(x>=350) x = 350;
		if(x>=320 && x<320+vx) {
			shootTorpedo();
		}
	}
	
	public void shootTorpedo() {
		Coordinator.torpedo = new Torpedo(x, y-Torpedo.height, 7);
	}
	
	public boolean isHit(Alien alien) {
		if(isHit(alien.x, alien.y, Alien.size, Alien.size)) {
			Coordinator.gameOver = true;
			return true;
		}
		return false;
	}
	
	public boolean isHit(Missile missile) {
		if(isHit(missile.x, missile.y, Missile.width, Missile.height)) {
			Coordinator.gameOver = true;
			return true;
		}
		return false;
	}
	
	
	public boolean isHit(int xB, int yB, int w, int h) {
		return xB>=x-topWidth/2-w/2 && xB<=x+topWidth/2+w/2 && yB>=y+0*eachHeight && yB<=y+1*eachHeight+h || 
		xB>=x-middleWidth/2-w/2 && xB<=x+middleWidth/2+w/2 && yB>=y+1*eachHeight && yB<=y+2*eachHeight+h || 
		xB>=x-bottomWidth/2-w/2 && xB<=x+bottomWidth/2+w/2 && yB>=y+2*eachHeight && yB<=y+3*eachHeight+h;
	}
	public void draw(Graphics g) {
		g.setColor(color);
		g.drawRect(x-topWidth/2, y, topWidth, eachHeight);
		g.drawRect(x-middleWidth/2, y+eachHeight, middleWidth, eachHeight);
		g.drawRect(x-bottomWidth/2, y+2*eachHeight, bottomWidth, eachHeight);
		
	}
	
}
