package jrJava.sorting_recursive;

public class QuickSorting {

	public static void main(String[] args) {

		int[] data = Utility.createArray(1000);// {21, 14, 32, 19, 25, 7, 11, 43, 17, 22, 20, 9, 10};
		Utility.print(data);
		sort(data, 0, data.length - 1);
		Utility.print(data);

	}

	public static void sort(int[] data, int low, int high) {
		if (low >= high)
			return;

		int pivot = data[(low + high) / 2]; // data[high]; // data[low];
		// 1. perform partition (break into two groups)
		int i = low, j = high, temp;
		while (i <= j) {

			while (data[i] < pivot)
				i++;
			while (data[j] > pivot)
				j--;

			if (i <= j) {
				temp = data[i];
				data[i] = data[j];
				data[j] = temp;
				i++;
				j--;
			}
		}
		// 2. delegate each of small partitioned ones to next method stack. (task
		// management--> recursion).
		sort(data, low, j);
		sort(data, i, high);
	}

}
