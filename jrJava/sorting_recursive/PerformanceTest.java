package jrJava.sorting_recursive;

import jrJava.sorting_selection.SelectionSorter;

public class PerformanceTest {

	public static void main(String[] args) {
		
		int[] data1 = Utility.createArray(1000000);
		int[] data2 = Utility.copy(data1);
		
		long s1 = System.currentTimeMillis();
		MergeSorting.sort(data1);
		long e1 = System.currentTimeMillis();
		System.out.println(e1-s1);
		
		long s2 = System.currentTimeMillis();
		SelectionSorter.sort(data2);
		long e2 = System.currentTimeMillis();
		System.out.println(e2-s2);

	}

}
