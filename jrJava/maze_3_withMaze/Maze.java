package jrJava.maze_3_withMaze;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Maze {

	private BufferedImage maze;

	public Maze() {
		try {
			maze = ImageIO.read(new File("jrJava/maze_imagesAndSounds/maze.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void draw(Graphics g) {
		g.drawImage(maze, 0, 0, null);
	}

	public boolean hitWall(int x, int y) {

		int alpha = (maze.getRGB(x, y) >> 24) & 0xFF;

		return alpha > 100;
	}

}
