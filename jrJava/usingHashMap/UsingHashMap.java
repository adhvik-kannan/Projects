package jrJava.usingHashMap;

import java.util.*;

public class UsingHashMap {

	public static void main(String[] args) {

		Map<String, Integer> grades = new HashMap<String, Integer>();

		// put(... , ...)
		Integer replaced = grades.put("English", 89);
		// System.out.println(replaced);
		grades.put("Math", 97);
		grades.put("Java", 100);
		grades.put("Biology", 90);
		grades.put("PE", 77);

		Integer value = grades.put("Java", 110);
		// System.out.println(value);
		grades.put("History", null);
		grades.put(null, 88);
		grades.put(null, null);
		// System.out.println(grades);

		// get(...)
		Integer value1 = grades.get("Java");
		// System.out.println(value1);
		// System.out.println(grades.get(null));

		// keySet()
		Set<String> keys = grades.keySet();
		Iterator<String> iter = keys.iterator();
		// Iterator<String> iter = grades.keySet().iterator();
		String each;
		Integer eachValue;
		while (iter.hasNext()) {
			each = iter.next();
			eachValue = grades.get(each);
			System.out.println(each + "-" + eachValue);
		}
	}

}
