package jrJava.practice3;

import java.util.Scanner;

public class UsingElseIf {

	public static void main(String[] args) {
		
		int score;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("What was your math score of today's test?");
		score = scanner.nextInt();
		
		/*
		if(score>=95) {
			System.out.println("Excellent! We are very proud of you.");
		}
		if(score>=90) {
			System.out.println("Very good! But, we believe you can do better. Perhaps next time.");
		}
		if(score>=80) {
			System.out.println("Oh oh! Do you need some help?");
		}
		if(score>=70) {
			System.out.println("You brought shame to our family. Go to your room!");
		}
		if(score>=60) {
			System.out.println("YOU @!#&@* STUPID (!@#@#)");
		}
		*/
		
		// The above code is done incorrectly.
		// Our intention was only one of the blocks get executed.
		// However, since all if-blocks are separate and independent,
		// regardless of previous blocks, the if-condition of each of the blocks 
		// will get get evaluated. So it is possible that more than one block gets executed. 
		// In an extreme case, such as score==100, all blocks will get executed. 
		
		// If we want to make sure only one of the blocks get executed,
		// we can use the 'else if' block like the following:
		
		/*
		if(score>=95) {
			System.out.println("Excellent! We are very proud of you.");
		}
		else if(score>=90) {
			System.out.println("Very good! But, we believe you can do better. Perhaps next time.");
		}
		else if(score>=80) {
			System.out.println("Oh oh! Do you need some help?");
		}
		else if(score>=70) {
			System.out.println("You brought shame to our family. Go to your room!");
		}
		else if(score>=60) {
			System.out.println("YOU @!#&@* STUPID (!@#@#)");
		}
		*/
		
		// The 'else if(...)' is a combination of 'else' and another 'if'. 
		// If we use the 'else if' like above, it will only go to the next 'else if' if the previous one was false.
		// This will make sure only one of the blocks will get executed. 
		
		
		
		// Additionally, if we also guarantee that at least one of the blocks get executed,
		// we can make the whole structure end with 'else' block. 
		
		if(score>=95) {
			System.out.println("Excellent! We are very proud of you.");
		}
		else if(score>=90) {
			System.out.println("Very good! But, we believe you can do better. Perhaps next time.");
		}
		else if(score>=80) {
			System.out.println("Oh oh! Do you need some help?");
		}
		else if(score>=70) {
			System.out.println("You brought shame to our family. Go to your room!");
		}
		else {
			System.out.println("YOU @!#&@* STUPID (!@#@#)");
		}
		
		
	}

}
