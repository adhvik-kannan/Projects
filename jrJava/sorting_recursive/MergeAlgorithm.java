package jrJava.sorting_recursive;

public class MergeAlgorithm {

	public static void main(String[] args) {

		int[] a = {9, 11, 17, 25, 31, 45, 61, 75};
		int[] b = {7, 8, 15, 16, 25, 30};
		int[] merged = merge(a, b);
		Utility.print(merged);

	}
	
	public static int[] merge(int[] a, int[] b) {

		int i=0, j=0, k=0;
		int[] c = new int[a.length+b.length];

		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) c[k++] = a[i++];
			else c[k++] = b[j++];
		}
		while(i<a.length) c[k++] = a[i++];
		while(j<b.length) c[k++] = b[j++];
		return c;

	}
	
	/*
	public static int[] merge(int[] a, int[] b) {

		int i=0, j=0, k=0;
		int[] c = new int[a.length+b.length];

		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) {
				c[k] = a[i];
				k++;
				i++;
			}
			else{
				c[k] = b[j];
				k++;
				j++;
			}
		}
		while(i<a.length) {
			c[k] = a[i];
			k++;
			i++;
		}
		while(j<b.length) {
			c[k] = b[j];
			k++;
			j++;
		}
		return c;


	}
	 */	
	




}
