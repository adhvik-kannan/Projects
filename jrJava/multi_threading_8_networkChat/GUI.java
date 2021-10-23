package jrJava.multi_threading_8_networkChat;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI implements ActionListener {

	private JFrame frame;
	private JPanel panel;
	private JScrollPane displayPane, typingPane;
	private JTextArea displayArea, typingArea;
	private JButton send;

	private MessageSender sender;

	public GUI(String text) {

		frame = new JFrame(text);
		if (text.startsWith("S"))
			frame.setBounds(600, 50, 380, 550);
		else
			frame.setBounds(100, 50, 380, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		frame.add(panel);

		displayPane = new JScrollPane();
		displayPane.setBounds(30, 20, 300, 200);
		panel.add(displayPane);
		displayArea = new JTextArea();
		displayPane.setViewportView(displayArea);

		typingPane = new JScrollPane();
		typingPane.setBounds(30, 240, 300, 200);
		panel.add(typingPane);
		typingArea = new JTextArea();
		typingPane.setViewportView(typingArea);

		send = new JButton("Send");
		send.setBounds(260, 460, 70, 20);
		send.addActionListener(this);
		panel.add(send);

		frame.setVisible(true);
	}

	public void setMessageSender(MessageSender sender) {
		this.sender = sender;
	}

	public void addMessage(String msg) {
		displayArea.setText(displayArea.getText() + "\n" + msg);
	}

	public void actionPerformed(ActionEvent e) {
		String msg = typingArea.getText();
		sender.send(msg);
		addMessage(msg);
		typingArea.setText("");
	}
}
