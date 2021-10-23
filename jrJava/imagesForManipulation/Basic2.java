package jrJava.imagesForManipulation;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Basic2 {

	public static void main(String[] args) throws IOException {
		
		BufferedImage bImage = ImageIO.read(new File("jrJava/imagesForManipulation/darthVader.png"));
		BufferedImage empty = new BufferedImage(bImage.getWidth(), bImage.getHeight(), BufferedImage.TYPE_INT_ARGB);
		int i, j;
		for(i=0; i<bImage.getWidth(); i++) {
			for(j=0; j<bImage.getHeight(); j++) {
				
				if((i+j)%2==0) {
					empty.setRGB(i, j, bImage.getRGB(i, j));
				}
				else {
					empty.setRGB(i,  j, 0xff00ffff);
				}
			}
		}
		
		ImageIO.write(empty, "png", new File("jrJava/imagesForManipulation/darthVader2.png"));
		
	}

}
