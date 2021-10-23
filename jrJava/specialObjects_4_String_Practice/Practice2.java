package jrJava.specialObjects_4_String_Practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Practice2 {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner s = new Scanner(new File("jrJava/specialObjects_4_string_Practice/HarryPotter.txt"));

		String line, token;
		StringTokenizer st;
		int count = 0;
		while(s.hasNextLine()) {
			line = s.nextLine();

			st = new StringTokenizer(line, " ,;\".:"); // "
			while(st.hasMoreTokens()) {
				token = st.nextToken();
				//if(token.length()<10) continue;
				if(token.indexOf("pp")<0) continue; 
				System.out.println(token);
				count++;
			}
			//System.out.println(line);
		}
		System.out.println("count=" + count);

	}

}
