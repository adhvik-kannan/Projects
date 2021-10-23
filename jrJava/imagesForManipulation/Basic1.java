package jrJava.imagesForManipulation;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Basic1 {

	public static void main(String[] args) throws IOException {

		BufferedImage bImage = new BufferedImage(600, 400, BufferedImage.TYPE_INT_ARGB);

		// bImage.setRGB(3, 1, 0xff00ff00); // bImage.setRBG(3, 1,
		// 0b11111111000000001111111100000000);
		int i, j, green, red;
		for (i = 0; i < bImage.getWidth(); i++) {
			for (j = 0; j < bImage.getHeight(); j++) {
				green = i / 3;
				red = j / 2;
				bImage.setRGB(i, j, 0xff000000 | (green << 8) | (red << 16));
			}
		}
		ImageIO.write(bImage, "png", new File("jrJava/imagesForManipulation/test1.png"));
	}

}
