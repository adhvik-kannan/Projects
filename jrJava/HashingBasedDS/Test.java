package jrJava.HashingBasedDS;

public class Test {

	public static void main(String[] args) {

		HashSet<Thing> set = new HashSet<Thing>(5);

		set.add(new Thing(4, 2, 22222));
		set.add(new Thing(1, 2, 22222));
		set.add(new Thing(3, 3, 33333));
		set.add(new Thing(6, 6, 88888));
		set.add(new Thing(17, 7, 77777));
		set.add(new Thing(2, 1, 11111));
		set.add(new Thing(9, 9, 99999));
		set.add(new Thing(12, 6, 66666));
		set.add(new Thing(7, 4, 44444));
		set.add(new Thing(10, 5, 55555));
		set.add(new Thing(5, 9, 19191));
		set.display();
		System.out.println();
		set.add(new Thing(12, 12, 121212));
		set.display();

		// Thing searchKey = new Thing(7);
		// Thing found = set.get(searchKey);
		// System.out.println(found);
	}

}
