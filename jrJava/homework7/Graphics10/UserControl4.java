package jrJava.homework7.Graphics10;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;

import resources.DrawingBoard;

public class UserControl4 {

	public static void main(String[] args) {
		

		DrawingBoard board = new DrawingBoard(50, 50, 1400, 1400);
		Graphics g = board.getCanvas();
		Scanner scanner = new Scanner(System.in);
		
		int x = 300;
		int y = 300;
		int z = 200;
		
		board.clear();
		g.setColor(Color.GREEN);
		g.fillOval(x, y, 300, 300);
		board.repaint();
		
		int command;
		int i;
		for(i=1; i<=100; i++){
			
			System.out.println("Enter the command, 1(brighter), 2(darker):");
			command = scanner.nextInt();
			Color myColor = new Color(0,z,0);
			
			if(command==1) {
				z += 2;
			}
			else if(command==2) {
				z -= 2;
			}
			
			
			board.clear();
			g.setColor(myColor);
			g.fillOval(x, y, 300, 300);
			board.repaint();
			
		}
		
	}

}
