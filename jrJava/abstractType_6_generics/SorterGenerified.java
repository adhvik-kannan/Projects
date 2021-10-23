package jrJava.abstractType_6_generics;

public class SorterGenerified<E extends Comparable<E>> {

	private int i;
	private E[] values;

	public SorterGenerified() {
		i = 0;
		values = (E[]) new Comparable[3];
	}

	public void add(E each) {
		values[i++] = each;
	}

	public void print() {
		for (int i = 0; i < values.length; i++)
			System.out.println(values[i]);
	}

	public void sort() {
		int minIndex, j;
		E temp;
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
