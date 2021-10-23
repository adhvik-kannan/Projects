package jrJava.practice13_scope;

public class Practice2 {

	public static void main(String[] args) {
		
		/*
		int a = 10;
		if(true){
			int a =4; // cannot do this!
			System.out.println(a);
		}
		 */
		
		/*
		if(true){
			int a = 4;
		}
		int a = 10; // This is fine. The previous one in the block will get destroyed
					// before the thread gets here.
		 */
		
		/*
		int i;
		for(i=1; i<=10; i++){
			// code
		}
		
		int i; // cannot do this. The first 'i' is still visible.
		for(i=11; i<=100; i++){
			// code
		}
		*/
		
		/*
		for(i=1; i<=10; i++){
			// code
		}
		
		for(i=11; i<=100; i++){ // This is fine. The previous 'i' got destroyed.
			// code
		}
		 */

	}

}
