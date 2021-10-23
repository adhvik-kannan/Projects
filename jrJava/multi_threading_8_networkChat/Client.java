package jrJava.multi_threading_8_networkChat;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

	public static void main(String[] args) throws Exception {
		
		GUI gui = new GUI("Client");
		
		Socket s = new Socket("localhost", 5454);

		InputStream is = s.getInputStream();
		OutputStream os = s.getOutputStream();
		
		MessageSender sender = new MessageSender(os);
		MessageReceiver receiver = new MessageReceiver(is);
		
		gui.setMessageSender(sender);
		receiver.setGUI(gui);
		
		new Thread(receiver).start();
	}

}