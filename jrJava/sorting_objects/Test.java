package jrJava.sorting_objects;

public class Test {

	public static void main(String[] args) {
		Ball[] balls = Utility.loadBallsFromFile("jrJava/sorting_objects/balls.txt");
		Utility.print(balls);
		// sort(balls);
		sort(balls, 0, balls.length - 1);
		Utility.print(balls);
	}

	public static void sort(Ball[] data, int low, int high) {
		if (low >= high)
			return;

		Ball pivot = data[(low + high) / 2];
		int i = low, j = high;
		Ball temp;
		while (i <= j) {
			while (data[i].getRadius() < pivot.getRadius())
				i++;
			while (data[j].getRadius() > pivot.getRadius())
				j--;

			if (i <= j) {
				temp = data[i];
				data[i] = data[j];
				data[j] = temp;
				i++;
				j--;
			}
		}
		sort(data, low, j);
		sort(data, i, high);
	}

	/*
	 * public static void sort(Object[] values) { int i; Object temp; boolean sorted
	 * = false; while(!sorted) { sorted = true; for(i=0; i<values.length-1; i++) {
	 * if(values[i].greaterThan(values[i+1])) { temp = values[i]; values[i] =
	 * values[i+1]; values[i+1] = temp; sorted = false; } }
	 * 
	 * } }
	 */

}
