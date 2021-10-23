	package jrJava.GUI_usingMouseListener;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class MyGUI /*implements KeyListener */{

	private static JFrame frame;
	private static MyPanel panel;
	private static MyButton button;


	public MyGUI() {
		frame = new JFrame("Extending component");
		frame.setBounds(200, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new MyPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		frame.add(panel);

		button = new MyButton();
		button.setBounds(250, 100, 150, 150);
		panel.add(button);


		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new MyGUI();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) { }

		while(true) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {}
			panel.moveCircle();
			button.moveCircle();
			panel.repaint();
		}
	}

}







