package jrJava.tetris_step_3_rotation_mirror;

import java.awt.Color;
import java.awt.Graphics;
import resources.DrawingBoard;
import resources.Timer;

public class Coordinator {

	public static void main(String[] args) {
		
		DrawingBoard board = new DrawingBoard(200, 0, 500, 700);
		Graphics g = board.getCanvas();
		Timer timer = new Timer();
		
		//TetrisObject tObj = new Cross(240, 180, Color.GREEN); 
		//TetrisObject tObj = new Bar(240, 180, Color.GREEN); 
		TetrisObject tObj = new LongBar(240, 180, Color.GREEN); 
		//TetrisObject tObj = new LShape(240, 180, Color.GREEN); 
		//TetrisObject tObj = new BlockShape(240, 180, Color.GREEN); 
		//TetrisObject tObj = new UShape(240, 180, Color.GREEN); 
		//TetrisObject tObj = new OddShape(240, 180, Color.GREEN);

		board.getJFrame().addKeyListener(tObj); 
		
		int count = 0;
		while(true) {
			count++;
			if(count%30==0) tObj.moveDown();
			
			board.clear();
			tObj.draw(g); 
			board.repaint(); 
			
			timer.pause(30); 
		} 
	}

}







