package jrJava.imagesForManipulation;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Practice {

	public static void main(String[] args) throws IOException {

		BufferedImage bImage = new BufferedImage(500, 500, BufferedImage.TYPE_INT_ARGB); 
		
		int xC = 250, yC = 250;
		double dist, radius = 100;
		int i, j;
		for(i=0; i<bImage.getWidth(); i++) {
			for(j=0; j<bImage.getHeight(); j++) {
				dist = Math.sqrt((i-xC)*(i-xC)+ (j-yC)*(j-yC));
				//if(dist<=radius) bImage.setRGB(i, j, 0xffff0000);
				//else bImage.setRGB(i, j, 0xffffffff);
				
				if(dist<radius) bImage.setRGB(i, j, 0xffff0000);
				else if(dist<radius+1) {
					double delta = dist - radius;
					int green = (int)(255*delta);
					int blue = (int)(255*delta);
					bImage.setRGB(i, j, 0xffff0000 | (green<<8) | blue);
				}
			}
		}
		ImageIO.write(bImage, "png", new File("jrJava/imagesForManipulation/test2.png"));
	}

}
