package jrJava.multi_threading_7_twoWayNetworking;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class SimpleServer {

	public static void main(String[] args) throws Exception {
		
		ServerSocket ss = new ServerSocket(5454);
		Socket s = ss.accept();
		
		InputStream is = s.getInputStream();
		OutputStream os = s.getOutputStream();
		
		MessageSender sender = new MessageSender(os);
		MessageReceiver receiver = new MessageReceiver(is);
		
		System.out.println("Server:");
		
		new Thread(receiver).start();
		sender.send();
		//receiver.receive();
	}

}







