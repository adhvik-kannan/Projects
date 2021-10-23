package jrJava.specialObjects_String_object;

public class Practice1 {

	public static void main(String[] args) {
		
		// String breaks a few rules of Java.
		
		String name1 = "Harry"; // literal string. way to do
		String name2 = new String("Harry"); // creates two copies. Copy constructor
		
		// Immutable
		String name = "harry";
		String corrected = name.replace('h', 'H'); // it creates a whole new String object.
		
		// Literal string will not be garbage collected.
		String friend1 = "Harry";
		friend1 = "Ron"; // The "Harry" string object will not be garabge collected.
		String friend2 = "Harry"; // The first "Harry" reference will be returned.

	}

}
