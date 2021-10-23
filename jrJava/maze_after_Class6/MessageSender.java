package jrJava.maze_after_Class6;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class MessageSender {

	private PrintWriter pw;

	public MessageSender(OutputStream os) {
		pw = new PrintWriter(os);
	}

	public void send(String msg) {
		pw.println(msg);
		pw.flush();
	}

}
