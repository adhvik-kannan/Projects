package jrJava.specialObject_1_io;

import java.io.PrintWriter;

public class WriteToFiles_2 {

	public static void main(String[] args) throws Exception {
		
		Thing thing = new Thing(123, "Tommy");
		
		PrintWriter pw = new PrintWriter("jrJava/specialObject_1_io/output2.txt");
		
		pw.print(thing); // pw.print(thing.toString());
		
		
		pw.flush();
		pw.close();
		
	}
	
}
