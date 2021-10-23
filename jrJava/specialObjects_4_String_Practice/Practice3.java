package jrJava.specialObjects_4_String_Practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Practice3 {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner s = new Scanner(new File("jrJava/specialObjects_4_string_Practice/HarryPotter.txt"));

		String line, token;
		StringTokenizer st;
		int count = 0, pos1, pos2;
		while(s.hasNextLine()) {
			line = s.nextLine();

			st = new StringTokenizer(line, " ,;\".:"); // "
			while(st.hasMoreTokens()) {
				token = st.nextToken();
				pos1 = token.indexOf('s');
				if(pos1<0) continue;
				
				pos2= token.indexOf('p', pos1+1);
				if(pos2<0) continue;
				
 				System.out.println(token);
				count++;
			}
			//System.out.println(line);
		}
		System.out.println("count=" + count);

	}

}
