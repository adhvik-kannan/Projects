package jrJava.abstractType_4_generics;

public class Test {

	public static void main(String[] args) {
		
		MapStorage<String, Integer> map =
		new MapStorage<String, Integer>();

		map.put("aaa", 45);
		
		String data1 = map.getKey();
		Integer data2 = map.getValue();
	}

}
 