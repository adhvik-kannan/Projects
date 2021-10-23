package jrJava.specialObjects_String_object;

public class Practice4 {

	// trim(), toUpperCase(), toLowerCase(), replace(seq1, seq2)
	
	public static void main(String[] args) {
		
		String exp1 = "  Harry  Potter ";
		String exp2 = exp1.trim();
		System.out.println(exp2);
		
		String exp3 = exp2.toUpperCase();
		String exp4 = exp2.toLowerCase();
		
		System.out.println(exp3);
		System.out.println(exp4);

		String exp = "Tim1 Tim2 Tim3 Tim4";
		System.out.println(exp.replace("Tim", "YY"));
		System.out.println(exp.replace('i', 'o'));
	}

}
