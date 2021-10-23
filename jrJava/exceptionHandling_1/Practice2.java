package jrJava.exceptionHandling_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {

		doWork(100, "diary");

	}

	public static void doWork(int duration, String path) throws FileNotFoundException, InterruptedException {
		Thread.sleep(duration); // InterruptedException
		Scanner s = new Scanner(new File(path)); // FileNotFoundException, IOException
	}

}
