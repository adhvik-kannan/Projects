package jrJava.recursion_4_morePractices;

public class Palindrome {

	public static void main(String[] args) {

		String sample = "racecar";
		System.out.println(isPalindrome(sample, 0, sample.length() - 1));
	}

	/*
	 * public static boolean isPalindrome(String text, int begin, int end) {
	 * if(text.charAt(begin)!=text.charAt(end)) return false; if(begin>=end) return
	 * true; return isPalindrome(text, begin+1, end-1);
	 * 
	 * }
	 */
	public static boolean isPalindrome(String text, int begin, int end) {
		// if(text.charAt(begin)!=text.charAt(end)) return false;
		if (begin >= end)
			return true;
		return text.charAt(begin) == text.charAt(end) && isPalindrome(text, begin + 1, end - 1);

	}

}
