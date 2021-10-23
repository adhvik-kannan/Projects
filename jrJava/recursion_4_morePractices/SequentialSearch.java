package jrJava.recursion_4_morePractices;

public class SequentialSearch {

	public static void main(String[] args) {

		int[] aaa = { 34, 78, 11, 7, 45, 61, 77, 93, 99, 41, 22, 15, 5, 16, 39, 44, 78, 81 };
		System.out.println(search(aaa, 14));
	}

	public static int search(int[] data, int searchKey) {
		for (int i = 0; i < data.length; i++) {
			if (searchKey == data[i])
				return i;
		}
		return -1;
	}

}
