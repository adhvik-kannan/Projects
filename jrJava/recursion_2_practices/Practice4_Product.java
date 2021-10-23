package jrJava.recursion_2_practices;

public class Practice4_Product {

	public static void main(String[] args) {
		
		System.out.println(product(4,5));
	}
	
	// (begin)*(begin+1)*(begin+2)*...*(end)
	public static int product(int begin, int end) {
		if(begin==end) return begin;
		int mid = (begin + end)/2;
		return product(begin, mid)*product(mid+1, end);
		//return -1;
	}

}
