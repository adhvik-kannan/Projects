package jrJava.multi_threading_7_twoWayNetworking;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class MessageSender {

	private PrintWriter pw;
	private Scanner scanner;
	
	public MessageSender(OutputStream os) {
		pw = new PrintWriter(os);
		scanner = new Scanner(System.in);
	}
	
	
	public void send() {
		String msg;
		System.out.println("Begin to type, followed by Enter-key:");
		while(true) {
			msg = scanner.nextLine();
			pw.println(msg);
			pw.flush();
		}
	}
	
}








