package jrJava.homework7.Graphics10;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;

import resources.DrawingBoard;

public class UserControl3 {

	public static void main(String[] args) {
		

		DrawingBoard board = new DrawingBoard(50, 50, 1400, 1400);
		Graphics g = board.getCanvas();
		Scanner scanner = new Scanner(System.in);
		
		int x = 150;
		int y = 150;
		int angle = 90;
		
		board.clear();
		g.setColor(Color.PINK);
		g.fillArc(x, y, 200, 200, 30, angle);
		board.repaint();
		
		int command;
		int i;
		for(i=1; i<=100; i++){
			
			System.out.println("Enter the command, 1(growing), 2(shrinking):");
			command = scanner.nextInt();
			
			if(command==1) {
				angle += 5;
			}
			else if(command==2) {
				angle -= 5;
			}
			
			board.clear();
			g.setColor(Color.PINK);
			g.fillArc(x, y, 200, 200, 30, angle);
			board.repaint();
		}

	}

}
