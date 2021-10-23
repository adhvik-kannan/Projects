package jrJava.multi_threading_6_network;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SimpleSever {

	public static void main(String[] args) throws IOException {

		ServerSocket ss = new ServerSocket(5454);
		Socket s = ss.accept();

		InputStream is = s.getInputStream();
		Scanner scanner = new Scanner(is);

		String line = scanner.nextLine();
		System.out.println("Server: " + line);
		is.close();
		ss.close();
		scanner.close();
	}

}
