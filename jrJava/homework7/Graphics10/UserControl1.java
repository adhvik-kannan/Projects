package jrJava.homework7.Graphics10;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;

import resources.DrawingBoard;

public class UserControl1 {

	public static void main(String[] args) {
		

		DrawingBoard board = new DrawingBoard(50, 50, 1400, 1400);
		Graphics g = board.getCanvas();
		Scanner scanner = new Scanner(System.in);
		
		int x = 300;
		int y = 300;
		
		board.clear();
		g.setColor(Color.GREEN);
		g.fillOval(x, y, 100, 100);
		board.repaint();
		
		int command;
		int i;
		for(i=1; i<=100; i++){
			
			System.out.println("Enter the command, 1(left), 2(right), 3(up), 4(down):");
			command = scanner.nextInt();
			
			if(command==1) {
				x -= 5;
			}
			else if(command==2) {
				x += 5;
			}
			else if(command==3) {
				y -= 5;
			}
			else if(command==4) {
				y += 5;
			}
			
			
			board.clear();
			g.setColor(Color.GREEN);
			g.fillOval(x, y, 100, 100);
			board.repaint();
		}

	}

}
