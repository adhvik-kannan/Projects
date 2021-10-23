package jrJava.sorting_recursive;

public class MergeSorting {

	public static void main(String[] args) {
		int[] data = Utility.createArray(1000);

		Utility.print(data);
		sort(data, 0, data.length - 1, new int[data.length]);
		Utility.print(data);

	}

	public static void sort(int[] data) {
		sort(data, 0, data.length - 1, new int[data.length]);
	}

	public static void sort(int[] data, int low, int high, int[] temp) {
		if (low >= high)
			return;
		int mid = (low + high) / 2;
		sort(data, low, mid, temp);
		sort(data, mid + 1, high, temp);

		for (int i = low; i <= high; i++)
			temp[i] = data[i];

		int i = low, j = mid + 1, k = low;

		while (i <= mid && j <= high) {
			if (temp[i] < temp[j])
				data[k++] = temp[i++];
			else
				data[k++] = temp[j++];
		}
		while (i <= mid)
			data[k++] = temp[i++];
		// while(j<=high) data[k++] = temp[j++]; // We don't need this. It already has
		// the data.
	}

}
