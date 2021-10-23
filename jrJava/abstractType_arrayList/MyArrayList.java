package jrJava.abstractType_arrayList;

public class MyArrayList {

	// get(i); will get the reference at index i.
	// add(r); will add at the end.
	// add(i, r); will insert the 'r' so that its index will be 'i'.
	// remove(i); will remove and return the reference at index i.
	// remove(r); will search and find the 'r', and remove it.
	// size(); will report the current number of references.

	private Ball[] elements;
	private int lastElementIndex;

	public MyArrayList() {
		elements = new Ball[5];
		lastElementIndex = -1;
	}

	public MyArrayList(int size) {
		elements = new Ball[size];
		lastElementIndex = -1;
	}

	public int size() {
		return lastElementIndex + 1;
	}

	public Ball get(int index) {
		if (index < 0 || index > lastElementIndex)
			throw new IndexOutOfBoundsException();
		return elements[index];
	}

	public void add(Ball ref) {

		add(lastElementIndex + 1, ref);
		/*
		 * if(lastElementIndex==elements.length-1) { Ball[] elements2 = new
		 * Ball[elements.length*2]; for(int i=0; i<=lastElementIndex; i++) elements2[i]
		 * = elements[i]; elements = elements2; } elements[lastElementIndex+1] = ref;
		 * lastElementIndex++;
		 */
	}

	public void add(int index, Ball ref) {
		if (index < 0 || index > lastElementIndex + 1)
			throw new IndexOutOfBoundsException();
		if (lastElementIndex == elements.length - 1) {
			Ball[] elements2 = new Ball[elements.length * 2];
			for (int i = 0; i <= lastElementIndex; i++)
				elements2[i] = elements[i];
			elements = elements2;
		}

		for (int i = lastElementIndex; i >= index; i--)
			elements[i + 1] = elements[i];
		elements[index] = ref;
		lastElementIndex++;
	}

	public Ball remove(int index) {
		if (index < 0 || index > lastElementIndex)
			throw new IndexOutOfBoundsException();

		Ball temp = elements[index];
		for (int i = index; i < lastElementIndex; i++)
			elements[i] = elements[i + 1];
		lastElementIndex--;
		return temp;
	}

	public boolean remove(Ball ref) {

		for (int i = 0; i <= lastElementIndex; i++) {
			if (elements[i].equals(ref)) {
				remove(i);
				return true;
			}
		}
		return false;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= lastElementIndex; i++) {
			sb.append(elements[i]);
			if (i != lastElementIndex)
				sb.append("->");
		}
		return sb.toString();
	}

	// only for the development purpose. We will delete this later.
	public void spillTheGut() {
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] != null)
				System.out.print(elements[i]);
			else
				System.out.print("[null]");
		}
		System.out.println();
	}

}
