package jrJava.homework7.Graphics10;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;

import resources.DrawingBoard;

public class UserControl2 {

	public static void main(String[] args) {
		

		DrawingBoard board = new DrawingBoard(50, 50, 1400, 1400);
		Graphics g = board.getCanvas();
		Scanner scanner = new Scanner(System.in);
		
		int x = 300;
		int y = 300;
		int r = 50;
		
		board.clear();
		g.setColor(Color.GREEN);
		g.fillOval(x, y, 2*r, 2*r);
		board.repaint();
		
		int command;
		int i;
		for(i=1; i<=100; i++){
			
			System.out.println("Enter the command, 1(growing), 2(shrinking):");
			command = scanner.nextInt();
			
			if(command==1) {
				r += 5;
			}
			else if(command==2) {
				r -= 5;
			}
			
			board.clear();
			g.setColor(Color.ORANGE);
			g.fillOval(x, y, 2*r, 2*r);
			board.repaint();
		}

	}

}
