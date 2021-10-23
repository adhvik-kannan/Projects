package jrJava.abstractType_6_generics;

public class Sorter {

	private int i;
	private Comparable[] values;

	public Sorter() {
		i = 0;
		values = new Comparable[3];
	}

	public void add(Comparable each) {
		values[i++] = each;
	}

	public void print() {
		for (int i = 0; i < values.length; i++)
			System.out.println(values[i]);
	}

	public void sort() {
		int minIndex, j;
		Comparable temp;
		for (int i = 0; i < values.length - 1; i++) {
			minIndex = i;
			for (j = i + 1; j < values.length; j++) {
				if (values[j].compareTo(values[minIndex]) < 0)
					minIndex = j;
			}
			temp = values[i];
			values[i] = values[minIndex];
			values[minIndex] = temp;
		}
	}
}
