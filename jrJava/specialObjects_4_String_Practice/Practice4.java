package jrJava.specialObjects_4_String_Practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Practice4 {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner s = new Scanner(new File("jrJava/specialObjects_4_string_Practice/HarryPotter.txt"));

		String line, token;
		StringTokenizer st;
		int count = 0;
		while(s.hasNextLine()) {
			line = s.nextLine();
			line = line.replace("Harry", "Adhvik");
			System.out.println(line);
		}

	}

}
