package jrJava.specialObjects_String_object;

public class Practice3 {

	// indexOf(str), indexOf(str, startIndex)
	// equals(str), equalsIgnoreCase(str).
	
	public static void main(String[] args) {
		
		String exp = "I love you.";
		int pos = exp.indexOf('v');
		System.out.println(pos);

		int pos2 = exp.indexOf('k');
		System.out.println(pos2);
		
		int pos3 = exp.indexOf("ove");
		System.out.println(pos3);
		
		int pos4 = exp.indexOf('o');
		System.out.println(pos4);
		
		pos4 = exp.indexOf('o', pos4+1);
		System.out.println(pos4);
		
		////////////////////////////
		// About equals(Object o);
		
		Thing t1 = new Thing(10, "Hello");
		Thing t2 = new Thing(10, "Hello");
		
		System.out.println(t1==t2); // Should not do this.
		
		System.out.println(t1.equals(t2)); // Should do it this way. But it will not work unless we override the equals() method.
		
		////////////////////////////
		
		String name1 = "Harry";
		String name2 = "Harry";
		// System.out.println(name1==name2); // Accident if true
		System.out.println(name1.equals(name2));
		
		String name3 = new String("Harry");
		// System.out.println(name1==name2;);
		System.out.println(name1.equals(name3));
		
		String name4 = "Hirry".replace('i', 'a');
		// System.out.println(name1==name4);
		System.out.println(name1.equals(name4));
	}

}
