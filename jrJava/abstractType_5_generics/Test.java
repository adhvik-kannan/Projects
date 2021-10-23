package jrJava.abstractType_5_generics;

public class Test {

	public static void main(String[] args) {
		
		StatDataStructure<Integer> ds = new StatDataStructure<Integer>();
		
		Integer[] data = {2, 8, 3, 6, 11, 7, 15, 1, 25};
		
		ds.setData(data);
		
		System.out.println(ds.min());
		System.out.println(ds.average()); 
		
	}

}
