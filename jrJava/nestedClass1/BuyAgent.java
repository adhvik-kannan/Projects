package jrJava.nestedClass1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class BuyAgent implements ActionListener {

	// business logic fields;
	// business logic methods;

	private JButton button;
	private JTextField textField;
	private int count = 1000;

	public void setButton(JButton button) {
		this.button = button;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			processBuyTransaction();
			// Report back that "Purchased 1000 PopEyes stocks".
			textField.setText("Purchased" + count + " PopEyes stocks");
			count += 1000;
		}
	}

	private void processBuyTransaction() {
		// business logic
	}
}
