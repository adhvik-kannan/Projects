package jrJava.specialObjects_3_textPocessing;

public class Practice1 {

	// Basic tokenizing
	
	public static void main(String[] args) {

		String exp = "Sir has an amazing personality. He must be very popular whever he goes.";
		
		int pos1;
		int pos2 = -1;
		String token;

		while(true) {
			pos1 = pos2 + 1;
			pos2 = exp.indexOf(' ', pos1);
			
			if(pos2==-1) {
				token = exp.substring(pos1);
				System.out.println(token);
				break;
			}
			
			token = exp.substring(pos1, pos2);
			System.out.println(token);
		}
		
	}

}
