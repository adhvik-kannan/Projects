package jrJava.multi_threading_7_twoWayNetworking;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class SimpleClient {

	public static void main(String[] args) throws Exception {

		Socket s = new Socket("localhost", 5454);

		InputStream is = s.getInputStream();
		OutputStream os = s.getOutputStream();

		MessageSender sender = new MessageSender(os);
		MessageReceiver receiver = new MessageReceiver(is);

		System.out.println("Client:");

		new Thread(receiver).start();
		sender.send();
		// receiver.receive();
	}

}
