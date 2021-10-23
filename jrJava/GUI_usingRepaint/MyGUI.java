package jrJava.GUI_usingRepaint;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class MyGUI implements MouseListener {

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
		button.addMouseListener(this);
		panel.add(button);

		frame.setVisible(true);
	}

	public void mousePressed(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();

		if (x < 75 && y < 75) {
			panel.useSingleColor(Color.RED);
			button.useSingleColor(Color.RED);
		} else if (x >= 75 && y < 75) {
			panel.useSingleColor(Color.GREEN);
			button.useSingleColor(Color.GREEN);
		} else if (x < 75 && y >= 75) {
			panel.useSingleColor(Color.BLUE);
			button.useSingleColor(Color.BLUE);
		} else if (x >= 75 && y >= 75) {
			panel.useSingleColor(null);
			button.useSingleColor(null);
		}
	}

	public void mouseClicked(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	public static void main(String[] args) {
		new MyGUI();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}

		while (true) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
			}
			panel.moveCircle();
			button.moveCircle();
			panel.repaint();
		}
	}

}
