package jrJava.specialObjects_3_textPocessing;

import java.util.StringTokenizer;

public class Practice3 {

	// StringTokenizer

	public static void main(String[] args) {

		String exp = "   {(Sir)} has    an,:; amazing    personality.     He must  ,,,   be very :popular: whever he goes.";

		StringTokenizer st = new StringTokenizer(exp, " (){}.,;:"); 

		String token;

		while(st.hasMoreTokens()) {
			token = st.nextToken();
			System.out.println(token);
		}
		
		// -------------------------------------------------
		
		String exp2 = "Good breakfast;Horrible lunch:great dinner";
		
		StringTokenizer st2 = new StringTokenizer(exp2, ";:");
		
		while(st2.hasMoreTokens()) {
			token = st2.nextToken();
			System.out.println(token);
		}
		
		// ----------------------------------------------------
		
		String data = "3.56, 4.44, 7.01, 9.93, 1.11, 4.61, 7.77";
		
		StringTokenizer st3 = new StringTokenizer(data, " ,");
		
		while(st3.hasMoreTokens()) {
			token = st3.nextToken();
			System.out.println(token);
		}
	}

}
