package jrJava.usingHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class UsingHashMap2 {

	public static void main(String[] args) {
		Map<String, Integer> grades = new HashMap<String, Integer>();

		grades.put("English", 90);
		grades.put("Math", 90);
		grades.put("Java", 80);
		grades.put("Biology", 90);
		grades.put("PE", 90);
		grades.put("Java", 90);
		grades.put("History", null);

		System.out.println(getGPA(grades));
	}

	private static double getGPA(Map<String, Integer> map) {
		Iterator<String> iter = map.keySet().iterator();
		double sum = 0;
		int count = 0;
		Integer score;
		while (iter.hasNext()) {
			score = map.get(iter.next());
			if (score != null) {
				sum += score;
				count++;
			}
		}
		return sum / count;
	}

}
