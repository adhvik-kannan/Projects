package jrJava.imagesForManipulation;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Basic5 {

	public static void main(String[] args) throws IOException {

		BufferedImage bImage1 = ImageIO.read(new File("jrJava/imagesForManipulation/rTransformer.png"));
		BufferedImage bImage2 = ImageIO.read(new File("jrJava/imagesForManipulation/gTransformer.png"));

		BufferedImage empty = new BufferedImage(bImage1.getWidth(), bImage1.getHeight(), BufferedImage.TYPE_INT_ARGB);
		int i, j, color1, color2;
		int a, r, g, b;
		double w;
		for (i = 0; i < bImage1.getWidth(); i++) {
			for (j = 0; j < bImage1.getHeight(); j++) {
				color1 = bImage1.getRGB(i, j);
				color2 = bImage2.getRGB(i, j);

				w = (double) i / (bImage1.getWidth() - 1);
				a = (int) (getAlpha(color1) * w + getAlpha(color2) * (1 - w));
				r = (int) (getRed(color1) * w + getRed(color2) * (1 - w));
				g = (int) (getGreen(color1) * w + getGreen(color2) * (1 - w));
				b = (int) (getBlue(color1) * w + getBlue(color2) * (1 - w));

				empty.setRGB(i, j, getColor(a, r, g, b));
			}
		}

		ImageIO.write(empty, "png", new File("jrJava/imagesForManipulation/fusedTransformer.png"));

	}

	private static int getColor(int alpha, int red, int green, int blue) {
		return (alpha << 24) | (red << 16) | (green << 8) | blue;
	}

	private static int getAlpha(int color) {
		return (color >> 24) & 0xff;
	}

	private static int getRed(int color) {
		return (color >> 16) & 0xff;
	}

	private static int getGreen(int color) {
		return (color >> 8) & 0xff;
	}

	private static int getBlue(int color) {
		return color & 0xff;
	}
}
