package jrJava.specialObject_1_io;

import java.io.PrintWriter;

public class WriteToFiles_1 {

	public static void main(String[] args) throws Exception {

		PrintWriter pw = new PrintWriter("jrJava/specialObject_1_io/output1.txt");

		pw.print("Hello");
		pw.print(' ');
		pw.print(123);
		pw.print("   ");
		pw.print(3.1415);
		pw.print("  ");
		pw.println(true);

		pw.println("Hello" + ' ' + 123 + "   " + 3.1415 + "  " + true);

		pw.flush();
		pw.close();
	}

}
