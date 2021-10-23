package jrJava.tree4_tree_drawable;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Toolkit;

import javax.swing.*;

import jrJava.tree4_tree_drawable.Tree.Node;

public class DrawableTree<E extends Comparable<E>> extends Tree<E> {

	private int panelWidth, panelHeight;
	private int verticalGap = 100;
	private DrawingPanel panel;

	public void insert(E obj) {
		insert(new DrawableNode<E>(obj));
	}

	public void draw(int width, int height) {
		panelWidth = width;
		panelHeight = height;
		if(panel==null) panel = new DrawingPanel(width, height);
		panel.repaint();
	}

	private class DrawingPanel extends JPanel {

		private JFrame frame;
		private JScrollPane scrollPane;

		public DrawingPanel(int width, int height) {
			frame = new JFrame("Tree Graphics");
			int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
			int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
			frame.setBounds(0, 0, screenWidth, screenHeight);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			this.setPreferredSize(new Dimension(width, height));

			scrollPane = new JScrollPane();
			scrollPane.setViewportView(this);

			frame.add(scrollPane);

			frame.setVisible(true);
		}
		public void paintComponent(Graphics g) {
			((Graphics2D)g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			g.setColor(Color.WHITE);
			g.fillRect(0, 0, panelWidth, panelHeight);
			traverse(g, (DrawableNode<E>) root, null, true, 0);
		}
		private void traverse(Graphics g, DrawableNode<E> node, DrawableNode<E> parent, boolean isLeftMove, int level) {
			if(node==null) return;
			
			// condition the 'node' so that it can do draw(g).
			
			if(level==0) {
				node.x = panelWidth/2;
				node.y = verticalGap/2;
				node.parent = null;
			}
			else{
				if(isLeftMove) node.x = (int)(parent.x - panelWidth/4/Math.pow(2, level-1));
				else node.x = (int)(parent.x + panelWidth/4/Math.pow(2, level-1));
				node.y = parent.y + verticalGap;
				node.parent = parent;
			}
			
			traverse(g, (DrawableNode<E>) node.leftChild, node, true, level+1);
			traverse(g, (DrawableNode<E>) node.rightChild, node, false, level+1);
			node.draw(g);
			
		}

	}

	private static class DrawableNode<T> extends Node<T> {

		public int x;
		public int y;
		public static int radius = 20;
		public static Color nodeColor = Color.BLACK;
		public static Color lineColor = Color.LIGHT_GRAY;
		public static Color textColor = Color.WHITE;
		public static Font font = new Font("Times", Font.BOLD, 12);
		public DrawableNode<T> parent;

		public DrawableNode(T obj) {
			super(obj);
		}

		public void draw(Graphics g) {
			// draw the line to its parent
			if(parent!=null) {
				g.setColor(lineColor);
				g.drawLine(x, y, parent.x, parent.y);
			}
			// draw the circular node and text
			g.setColor(nodeColor);
			g.fillOval(x-radius, y-radius, 2*radius, 2*radius);
			g.setColor(textColor);
			g.setFont(font);
			g.drawString(obj.toString(), x-10, y+5);
		}
	}

}
