package jrJava.barbarianAttack1;

import java.awt.Graphics2D;

public class ArrowManager {

	private static MyArrayList<Arrow> arrows = new MyArrayList<Arrow>();

	public static void add(Arrow arrow) {
		arrows.add(arrow);
	}

	public static void remove(Arrow arrow) {
		arrows.remove(arrow);
	}

	public static void move() {
		Arrow each;
		for (int i = arrows.size() - 1; i >= 0; i--) {
			each = arrows.get(i);
			each.move();

			// if(each.getX()<100 || each.getY()>600) {
			// arrows.remove(i);
			// i--;
			// }
		}
	}

	public static void draw(Graphics2D g) {
		Arrow each;
		for (int i = 0; i < arrows.size(); i++) {
			each = arrows.get(i);
			each.draw(g);
		}
	}
}
