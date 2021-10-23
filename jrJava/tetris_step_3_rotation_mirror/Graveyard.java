package jrJava.tetris_step_3_rotation_mirror;

public class Graveyard {

	public static final int X_LEFT;
	public static final int Y_TOP;
	public static final int X_RIGHT;
	public static final int Y_BOTTOM;
	
	private static int cols;
	private static int rows;
	
	static {
		cols = 20;
		rows = 30;
		X_LEFT = 40;
		Y_TOP = 40;
		X_RIGHT = X_LEFT + cols*Block.SIZE;
		Y_BOTTOM = Y_TOP + rows*Block.SIZE;
	}
	
	
}
