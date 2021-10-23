package jrJava.maze_2_network;

import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MessageReceiver implements Runnable {

	private Scanner scanner;
	private Mouse enemyMouse;
	
	public MessageReceiver(InputStream is) {
		scanner = new Scanner(is);
	}
		
	public void setEnemyMouse(Mouse enemyMouse) {
		this.enemyMouse = enemyMouse;
	}
	
	public void run() {
		try {
			receive();
		} catch (Exception e) { }
	}
	
	public void receive() throws NoSuchElementException {
		String msg;
		while(true) {
			msg = scanner.nextLine();
			enemyMouse.receiveData(msg);
		}
	}
}
