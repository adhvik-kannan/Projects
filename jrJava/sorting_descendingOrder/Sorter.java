package jrJava.sorting_descendingOrder;

import jrJava.sorting_insertion.Utility;

public class Sorter {
	
	public static void main(String[] args) {

		// int[] data = {55, 49, 11, 9, 71, 88, 93, 77, 99, 80, 61};
		int[] data = Utility.createArry(1000);

		Utility.print(data);
		long startTime = System.currentTimeMillis();

		insertionSort(data);

		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
		Utility.print(data);
	}

	public static void bubbleSort(int[] values) {
		int i, temp; 
		boolean sorted = false;;
		
		while(!sorted) {
			sorted = true; 
			for(i=0; i<values.length-1; i++) {
				if(values[i]<values[i+1]) {
					temp = values[i];
					values[i] = values[i+1];
					values[i+1] = temp;
					sorted = false;
				}
			}
		}
	}
	
	public static void selectionSort(int[] values) {
		int maxIndex, temp, j;
		for(int i=0; i<values.length-1; i++) {
			maxIndex = i;
			for(j=i+1; j<values.length; j++) {
				if(values[j]>values[maxIndex]) maxIndex = j;
			}
			temp = values[i];
			values[i] = values[maxIndex];
			values[maxIndex] = temp;
		}
	}
	
	public static void insertionSort(int[] data) {

		int temp, i, j;
		for(i=1; i<=data.length-1; i++) {
			temp = data[i];
			for(j=i-1; j>=0; j--) {
				if(data[j]<temp) data[j+1] = data[j];
				else break;
			}
			data[j+1] = temp;
		}

	}


}
