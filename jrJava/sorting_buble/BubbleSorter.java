package jrJava.sorting_buble;

public class BubbleSorter {

	public static void main(String[] args) {

		// int[] data = {55, 49, 11, 9, 71, 88, 93, 77, 99, 80, 61};
		int[] data = Utility.createArry(1000000);

		//Utility.print(data);
		long startTime = System.currentTimeMillis();

		sort(data);

		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
		//Utility.print(data);
	}

	// 1. {2, 5, 6, 8, 11, 17} --> It still has to make one scan (confirmation scan).
	// 2. {17, 2, 5, 6, 8, 11} --> Will do 2 scans (one for sorting and one for confirmation).
	// 3. {5, 6, 8, 11, 17, 2} --> Will do 6 (five for sorting and one for confirmation).
	// 4. {17, 11, 8, 6, 5, 2} --> Will do 6 (five for sorting and one for confirmation).

	// 5. If the length of the array is 100, how many times will it perform the comparisons? 
	// 	  Best-Case-Scenario: ~100*1, Worst-Case-Scenario: ~100*100
	// 6. If the length of the array is 100, how many times will it perform the comparisons?
	//     Best-Case-Scenario: ~n*1 --> O(n),  Worst-Case-Scenario: ~n*~n --> O(n^2).
	public static void sort(int[] values) {

		int i, temp; // 'i' indicates the window start position. 'temp' is for swapping.
		boolean sorted = false;;

		while(!sorted) {

			// We scan the whole array. While scanning, we compare the two consecutive elements, values[i] and values[i+1].(Be careful: 'i' will have the range of [0, len-2] not [0, len-1] because of values[i+1].)
			// If the two elements are incorrect order, we swap them. 

			sorted = true; // Before you scan, you make an assumption that the whole array is already sorted.

			for(i=0; i<values.length-1; i++) {
				if(values[i]>values[i+1]) {
					temp = values[i];
					values[i] = values[i+1];
					values[i+1] = temp;
					// Being here means swapping happened. Meaning the assumption was wrong.
					sorted = false;
				}
			}
		}
	}

	
}
