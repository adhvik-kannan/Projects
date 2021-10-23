package jrJava.sorting_multipleCriteria;

import jrJava.sorting_insertion.Utility;

public class Sorter {
	
	public static void main(String[] args) {

		// int[] data = {55, 49, 11, 9, 71, 88, 93, 77, 99, 80, 61};
		int[] data = Utility.createArry(1000);

		Utility.print(data);
		long startTime = System.currentTimeMillis();

		//bubbleSort(data);
		//selectionSort(data);
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
				if(values[i]%2==0  && values[i+1]%2==1 || values[i]%2==values[i+1]%2 && values[i]>values[i+1]) {//<values[i+1]) {
					temp = values[i];
					values[i] = values[i+1];
					values[i+1] = temp;
					sorted = false;
				}
			}
		}
	}
	
	public static void selectionSort(int[] values) {
		int index, temp, j;
		for(int i=0; i<values.length-1; i++) {
			index = i;
			for(j=i+1; j<values.length; j++) {
				if(values[index]%2==0  && values[j]%2==1 || values[j]%2==values[index]%2 && values[j]<values[index]) index = j;
			}
			temp = values[i];
			values[i] = values[index];
			values[index] = temp;
		}
	}
	
	public static void insertionSort(int[] data) {

		int temp, i, j;
		for(i=1; i<data.length-1; i++) {
			temp = data[i];
			for(j=i-1; j>=0; j--) {
				if(data[j]%2==0  && temp%2==1 || temp%2==data[j]%2 && data[j]>temp) data[j+1] = data[j];
				else break;
			}
			data[j+1] = temp;
		}

	}


}
