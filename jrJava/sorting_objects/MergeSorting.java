package jrJava.sorting_objects;

public class MergeSorting {

	public static void sort(Comparable[] data) {
		sort(data, 0, data.length-1, new Comparable[data.length]);
	}
	
	public static void sort(Comparable[] data, int low, int high, Comparable[] temp) {
		if(low>=high) return;
		int mid = (low+high)/2;
		sort(data, low, mid, temp);
		sort(data, mid+1, high, temp);
		
		for(int i=low; i<=high; i++) temp[i] = data[i];
		
		int i=low, j=mid+1, k=low;

		while(i<=mid && j<=high) {
			if(temp[i].compareTo(temp[j])<0) data[k++] = temp[i++];
			else data[k++] = temp[j++];
		}
		while(i<=mid) data[k++] = temp[i++];
	}

}
