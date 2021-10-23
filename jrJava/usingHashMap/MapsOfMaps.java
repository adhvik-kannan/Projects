package jrJava.usingHashMap;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MapsOfMaps {

	public static void main(String[] args) throws Exception {

		Scanner s = new Scanner(new File("jrJava/usingHashMap/testResults.txt"));

		Map<Integer, Map<String, Integer>> masterMap;
		masterMap = createMap(s);
		System.out.println(masterMap);
	}

	public static Map<Integer, Map<String, Integer>> createMap(Scanner s) {
		Map<Integer, Map<String, Integer>> map = new HashMap<Integer, Map<String, Integer>>();

		Map<String, Integer> valueMap;
		while (s.hasNextLine()) {
			valueMap = createMap(s.nextLine());
			map.put(valueMap.get("ID"), valueMap);
		}

		return map;
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
