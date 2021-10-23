package jrJava.recursion_4_morePractices;

public class HanoiTower {

	public static void main(String[] args) {
		moveDisks(25, 'A', 'C', 'B');
	}
	
	public static void moveDisks(int N, char from, char to, char stage) {
		
		if(N==1) {
			System.out.println("Move Disk " + N + " from " + from + " to " + to + ".");
			return;
		}
		
		// Needs to move (N-1) disks from 'from' to 'stage'.
		moveDisks(N-1, from, stage, to);
		// Move the N-th disk from 'from' to 'to'.
		System.out.println("Move Disk " + N + " from " + from + " to " + to + ".");
		// Needs to move (N-1) disks from 'stage' to 'to'.
		moveDisks(N-1, stage, to, from);
	}

}
