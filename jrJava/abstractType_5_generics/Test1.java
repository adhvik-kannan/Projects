package jrJava.abstractType_5_generics;

public class Test1 {

	public static void main(String[] args) {
		
		StatDataStructure<Integer> ds = new StatDataStructure<Integer>();

		Integer[] data = {12, 5, 1, 6, 11, 36, 25};
		
		ds.setData(data);
		
		System.out.println(ds.getData(2));
		System.out.println(ds.min());
		System.out.println(ds.average());
		
		//StatDataStructure<String> ds2 = new StatDataStructure<String>();
		
	}
 
} 
