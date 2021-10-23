package jrJava.homework6;

import java.util.Scanner;

public class DetermineQuadrant {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type in the x.");
		int x = scanner.nextInt();
		
		System.out.println("Type in the y.");
		int y = scanner.nextInt();
		
		if(x==0 && y==0) {
			System.out.println("The point is on the origin.");
		}
		else if(x==0) {
			System.out.println("The point is on the x-axis.");
		}
		else if(y==0){
			System.out.println("The point is on the y-axis.");
		}
		else if(x>0 && y>0) {
			System.out.println("The point is in Quadrant I.");
		}
		else if(x<0 && y>0) {
			System.out.println("The point is in Quadrant II.");
		}
		else if(x<0 && y<0) {
			System.out.println("The point is in Quadrant III");
		}
		else {
			System.out.println("The point is in Quadrant IV.");
		}

	}

}
