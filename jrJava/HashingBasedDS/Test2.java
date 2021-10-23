package jrJava.HashingBasedDS;

public class Test2 {

	public static void main(String[] args) {

		HashMap<Thing, String> map = new HashMap<Thing, String>(5);
		map.put(new Thing(5, 55, 555), "A555");
		map.put(new Thing(10, 1010, 101010), "A101010");
		map.put(new Thing(12, 1212, 121212), "A121212");
		map.put(new Thing(7, 77, 777), "A777");
		map.put(new Thing(2, 22, 222), "A222");
		map.put(new Thing(17, 1717, 171717), "A171717");
		map.put(new Thing(13, 1313, 131313), "A131313");
		map.put(new Thing(3, 33, 333), "A333");
		map.put(new Thing(8, 88, 888), "A888");

		// System.out.println(map.get(new Thing(2)));
		map.display();
		System.out.println("\n\n");
		String kickedOut = map.put(new Thing(2, 2222, 222222), "A222222");
		System.out.println(kickedOut);
		System.out.println("\n\n");
		map.display();

	}

}
