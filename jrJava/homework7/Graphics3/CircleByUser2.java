package jrJava.homework7.Graphics3;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;

import resources.DrawingBoard;

public class CircleByUser2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter x-coordinate of the circle's center:");
		int x = scanner.nextInt();
		
		System.out.println("Enter the y-coordinate of the circle's center:");
		int y = scanner.nextInt();
		
		System.out.println("Enter radius of the circle");
		int r = scanner.nextInt();
		
		System.out.println("Choose the color (type in '1' for red, '2' for green, '3' for blue, '4' for yellow");
		int option = scanner.nextInt();
		
		DrawingBoard board = new DrawingBoard(300, 50, 900, 600);
		Graphics g = board.getCanvas();
		
		board.clear();
		
		if(option==1) {
			g.setColor(Color.RED);
			g.fillArc(x-r, y-r, 2*r, 2*r, 0, 360);
		}
		else if(option==2) {
			g.setColor(Color.GREEN);
			g.fillArc(x-r, y-r, 2*r, 2*r, 0, 360);
		}
		else if(option==3) {
			g.setColor(Color.BLUE);
			g.fillArc(x-r, y-r, 2*r, 2*r, 0, 360);
		}
		else if(option==4){
			g.setColor(Color.YELLOW);
			g.fillArc(x-r, y-r, 2*r, 2*r, 0, 360);
		}
		
		g.setColor(Color.BLACK);
		g.fillOval(x, y, 5, 5);
		g.drawString("("+x+","+y+")", x-50, y);
		g.drawLine(x, y, x+r, y);		
		g.drawString(" radius = "+r, x+r, y);
		
		board.repaint();
		


	}

}
