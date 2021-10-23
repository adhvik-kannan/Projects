package jrJava.nestedClass1;

import java.awt.Color;

import javax.swing.*;

public class StockTradeGUI {

	private JFrame frame;
	private JPanel panel;
	private JButton button;
	private JTextField textField;

	public StockTradeGUI() {
		frame = new JFrame();
		frame.setBounds(200, 100, 300, 400);
		frame.setTitle("Stock Trade");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		button = new JButton("Buy Stock");
		button.setBounds(50, 100, 120, 20);
		panel.add(button);

		textField = new JTextField();
		textField.setBounds(50, 200, 200, 20);
		panel.add(textField);

		BuyAgent agent = new BuyAgent();
		agent.setButton(button);
		agent.setTextField(textField);
		button.addActionListener(agent);
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		new StockTradeGUI();

	}

}
