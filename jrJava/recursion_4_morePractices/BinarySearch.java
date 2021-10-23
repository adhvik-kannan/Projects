package jrJava.recursion_4_morePractices;

public class BinarySearch {

	public static void main(String[] args) {
		int[] data = { 2, 3, 5, 8, 11, 19, 22, 25, 33, 34, 35, 41, 44, 44, 44, 67, 71, 77, 81, 85, 90, 95 };
		System.out.println(search(data, 44));
	}

	public static int search(int[] data, int searchKey) {

		int low = 0, high = data.length - 1, mid;
		while (low <= high) {
			mid = (low + high) / 2;
			if (searchKey == data[mid])
				return mid;
			else if (searchKey < data[mid])
				high = mid - 1;
			else
				low = mid + 1;
		}
		return -1;

	}
}
