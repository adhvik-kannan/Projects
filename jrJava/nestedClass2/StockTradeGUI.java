package jrJava.nestedClass2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class StockTradeGUI implements ActionListener {

	private JFrame frame;
	private JPanel panel;
	private JButton button;
	private JTextField textField;

	// business logic fields;
	// business logic methods;

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

		frame.setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			processBuyTransaction();
			// Report back that "Purchased 1000 PopEyes stocks".
			textField.setText("Purchased 100 PopEyes stocks");

		}
	}

	private void processBuyTransaction() {
		// business logic
	}

	public static void main(String[] args) {
		new StockTradeGUI();

	}

}
