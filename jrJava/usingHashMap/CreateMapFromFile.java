package jrJava.usingHashMap;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CreateMapFromFile {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(new File("jrJava/usingHashMap/data.txt"));
		String line = s.nextLine();
		Map<String, Integer> map = createMap(line);
		System.out.println(map);
	}

	private static Map<String, Integer> createMap(String line) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		StringTokenizer st = new StringTokenizer(line, ",");
		String token;
		int equalSignPos;
		String key;
		Integer value;
		while (st.hasMoreTokens()) {
			token = st.nextToken();
			equalSignPos = token.indexOf('=');
			key = token.substring(0, equalSignPos).trim();
			value = Integer.parseInt(token.substring(equalSignPos + 1).trim());
			map.put(key, value);
		}
		return map;
	}
}
