package jrJava.specialObjects_4_String_Practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

import resources.SoundPlayer;

public class Practice5 {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner s = new Scanner(new File("jrJava/specialObjects_4_string_Practice/employee.txt"));
		PrintWriter pw = new PrintWriter("jrJava/specialObjects_4_string_Practice/employee2.txt");
		String line, token;
		StringTokenizer st;
		StringBuilder sb;
		String fName, lName, id, title, empYear, salary, dobYY, dobMM, dobDD, gender;

		while (s.hasNextLine()) {
			line = s.nextLine();
			if (line.trim().length() == 0)
				continue;

			st = new StringTokenizer(line, " ");
			fName = st.nextToken();
			lName = st.nextToken();
			id = st.nextToken();
			title = st.nextToken();
			empYear = st.nextToken();
			salary = st.nextToken();
			dobYY = st.nextToken();
			dobMM = st.nextToken();
			dobDD = st.nextToken();
			gender = st.nextToken();

			int dobYYNumber = Integer.parseInt(dobYY);
			if (dobYYNumber < 1980)
				continue;

			sb = new StringBuilder();
			sb.append(fName);
			sb.append(" ");
			sb.append(lName);
			sb.append(" ");
			sb.append(id);
			sb.append(" ");
			sb.append(title);
			sb.append(" ");
			sb.append(empYear);
			sb.append(" ");
			sb.append(salary);
			sb.append(" ");
			sb.append(dobYY);
			sb.append(" ");
			sb.append(dobMM);
			sb.append(" ");
			sb.append(dobDD);
			sb.append(" ");
			sb.append(gender);
			sb.append(" ");

			pw.println(sb.toString());
		}

		pw.flush();
		pw.close();
	}

}
