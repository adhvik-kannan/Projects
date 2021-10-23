package jrJava.sorting_insertion;

public class InsertionSorter {

	public static void main(String[] args) {

		// int[] data = {55, 49, 11, 9, 71, 88, 93, 77, 99, 80, 61};
		int[] data = Utility.createArry(1000);

		Utility.print(data);
		long startTime = System.currentTimeMillis();

		sort(data);

		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
		Utility.print(data);
	}
	
	// Performance:
	// 1. {17, 11, 8, 6, 5, 2}, how many comparisons? 1 + 2 + 3 + 4 + 5 --> 15 (worst-case)
	// 2. {2, 5, 6, 8, 11, 17}, how many comparisons? 1 + 1 + 1 + 1 + 1 --> 5  (best-case)
	// 3. If the size of the array is n, how many comparisons?
	// 	  best-case: (n-1) --> ~n --> O(n)
	// 	  worst-case: 1 + 2 + ... + (n-1) --> n(n-1)/2 --> n*n/2 --> O(n^2)

	public static void sort(int[] data) {

		int temp, i, j;

		// 'i' indicates the last index of the window.
		// Window: [0, i]
		// We will increase the window by increasing the 'i', i=1->2->3->...->length-1.
		// WE will make all data in the window in sorted order.
		for(i=1; i<data.length-1; i++) {
			
			// As window size increases, it will bring in a new data into the window.
			// The last element in the window is the new data and is probably in the wrong spot.
			//We use the insertion algorithm to find where the new data should be inserted
			
			temp = data[i];
			for(j=i-1; j>=0; j--) {
				if(data[j]>temp) data[j+1] = data[j];
				else break;
			}

			// Being here means:
				// 1. It found the insertion point (found a data that is less than or equal to the new data). In that case, the insertion point will be data[j+1].
				// 2. It could not find a data that is less than or equal to the new data and used up all data and gets out of the  for-loop. (it will come out with j=-1). In that case, the new data should be inserted at data[0]. 
			// The following statement will handle both cases. 
			data[j+1] = temp;
		}

	}
}