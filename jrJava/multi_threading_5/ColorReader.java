package jrJava.multi_threading_5;

import java.awt.Color;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ColorReader implements Runnable {

	private Color color;
	private Scanner scanner;
	
	public ColorReader() {
		color = Color.BLUE;
		scanner = new Scanner(System.in);
	}
	public Color getColor() { return color; }
	
	public void run() {
		while(true) read();
	}
	
	public void read() {
		System.out.println("Enter red, green, blue");
		String line = scanner.nextLine();
		StringTokenizer st = new StringTokenizer(line, ", .;:");
		int red = Integer.parseInt(st.nextToken());
		int green = Integer.parseInt(st.nextToken());
		int blue = Integer.parseInt(st.nextToken());
		color = new Color(red, green, blue);
	}
	
}
