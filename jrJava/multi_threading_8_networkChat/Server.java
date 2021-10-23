package jrJava.multi_threading_8_networkChat;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws Exception {

		GUI gui = new GUI("Server");

		ServerSocket ss = new ServerSocket(5454);
		Socket s = ss.accept();

		InputStream is = s.getInputStream();
		OutputStream os = s.getOutputStream();

		MessageSender sender = new MessageSender(os);
		MessageReceiver receiver = new MessageReceiver(is);

		gui.setMessageSender(sender);
		receiver.setGUI(gui);

		new Thread(receiver).start();
	}

}
