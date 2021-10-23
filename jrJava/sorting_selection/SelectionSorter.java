package jrJava.sorting_selection;

public class SelectionSorter {

	public static void main(String[] args) {

		// int[] data = {55, 49, 11, 9, 71, 88, 93, 77, 99, 80, 61};
		int[] data = Utility.createArry(1000);

		Utility.print(data);
		long startTime = System.currentTimeMillis();

		sort(data);

		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
		Utility.print(data);
	}

	// Performance:
	// 1. {17, 11, 8, 6, 5, 2}, how many comparisons? 5 + 4 + 3 +2 + 1 --> 15
	// 2. {2, 5, 6, 8, 11, 17}, how many comparisons? 5 + 4 + 3 +2 + 1 --> 15
	// 3. There are no best-case or worst-case scenarios. They are all the same.
	// 4. If the size of the array is n, how many comparisons? (n-1) + (n-2) + ... +
	// 1
	// --> n(n-1)/2 --> ~n*n/2 --> O(n^2)

	public static void sort(int[] values) {

		int minIndex, temp, j;

		// We shrink window size by one index at a time. Window range [0, len-1] -->
		// [len-2, len-1].
		// In each window, we find (select) the minIndex (index at which the min is
		// stored).
		// Then we swap that with the first element in the window.
		// After that, we exclued the first element by shrinking the window.

		// We use 'i' to indicate the starting index of the shrinking window.

		for (int i = 0; i < values.length - 1; i++) {
			// window: [i, len-1]
			minIndex = i;
			for (j = i + 1; j < values.length; j++) {
				if (values[j] < values[minIndex])
					minIndex = j;
			}
			temp = values[i];
			values[i] = values[minIndex];
			values[minIndex] = temp;
		}
	}

	/*
	 * public static void sort(int[] values) {
	 * 
	 * // window: [0, len-1] int minIndex = 0; for(int j=1; j<values.length; j++) {
	 * if(values[j]<values[minIndex]) minIndex = j; } int temp = values[0];
	 * values[0] = values[minIndex]; values[minIndex] = temp;
	 * 
	 * // window: [1, len-1] minIndex = 1; for(int j=2; j<values.length; j++) {
	 * if(values[j]<values[minIndex]) minIndex = j; } temp = values[1]; values[1] =
	 * values[minIndex]; values[minIndex] = temp;
	 * 
	 * // window: [2, len-1] minIndex = 2; for(int j=3; j<values.length; j++) {
	 * if(values[j]<values[minIndex]) minIndex = j; } temp = values[2]; values[2] =
	 * values[minIndex]; values[minIndex] = temp;
	 * 
	 * // ...
	 * 
	 * // window: [len-2, len-1] minIndex = values.length-2; for(int
	 * j=values.length-1; j<values.length; j++) { if(values[j]<values[minIndex])
	 * minIndex = j; } temp = values[values.length-2]; values[values.length-2] =
	 * values[minIndex]; values[minIndex] = temp; }
	 */
}
