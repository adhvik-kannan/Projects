package jrJava.tetris_1;

import java.awt.Color;

public class Tee extends TetrisObject {

	public Tee(int x, int y, Color color) {
		super(x, y, color);
		formShape();

	}

	protected void formShape() {
		blocks = new Block[4];
		blocks[0] = new Block(-1, 0, color);
		blocks[1] = new Block(0, 0, color);
		blocks[2] = new Block(1, 0, color);
		blocks[3] = new Block(0, -1, color);

		updateBlocks();

	}

}
