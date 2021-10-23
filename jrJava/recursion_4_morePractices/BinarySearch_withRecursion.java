package jrJava.recursion_4_morePractices;

public class BinarySearch_withRecursion {

	public static void main(String[] args) {
		int[] data = { 2, 3, 5, 8, 11, 19, 22, 25, 33, 34, 35, 41, 44, 44, 44, 67, 71, 77, 81, 85, 90, 95 };
		System.out.println(search(data, 44, 0, data.length - 1));
	}

	public static int search(int[] data, int searchKey, int low, int high) {
		if (low > high)
			return -1;

		int mid = (low + high) / 2;
		if (searchKey == data[mid])
			return mid;
		else if (searchKey > data[mid])
			return search(data, searchKey, mid + 1, high);
		else
			return search(data, searchKey, low, mid - 1);

	}
}
