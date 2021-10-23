package jrJava.sorting_insertion;

public class Insertion {

	public static void main(String[] args) {

		int[] data = {5, 8, 11, 15, 19, 3};

		Utility.print(data);
		insert(data);
		Utility.print(data);

	}

	public static void insert(int[] data) {
		int temp;
		/*
		int i;
		int j;

		i = data.length-1;

		temp = data[i];
		for(j=i-1; j>=0; j--) {
			if(data[j]>temp) data[j+1] = data[j];
			else break;
		}
		
		data[j+1] = temp;
		*/
		for(int i=data.length-1; i>0; i--) {
			for(int j=i-1; j>=0; j--) {
				if(data[j]>data[i]) {
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
	}
	
}


