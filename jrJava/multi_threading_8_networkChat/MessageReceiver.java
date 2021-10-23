package jrJava.multi_threading_8_networkChat;

import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MessageReceiver implements Runnable {

	private GUI gui;
	private Scanner scanner;
	
	public MessageReceiver(InputStream is) {
		scanner = new Scanner(is);
	}
	
	public void setGUI(GUI gui) { this.gui = gui; }
	
	public void run() {
		try {
			receive();
		} catch (Exception e) { }
	}
	
	public void receive() throws NoSuchElementException {
		String msg;
		while(true) {
			msg = scanner.nextLine();
			gui.addMessage(msg);
		}
	}
}
