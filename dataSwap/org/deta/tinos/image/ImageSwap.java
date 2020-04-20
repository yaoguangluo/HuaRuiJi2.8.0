package org.deta.tinos.image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.Image;
import java.awt.image.BufferedImage;
public class ImageSwap{
	public static void pixTableToFile(String pngOutputPath, int[][] pix
			, String fileType) throws IOException{
		BufferedImage bufferedImage= new BufferedImage(pix[0].length
				, pix.length, BufferedImage.TYPE_INT_RGB);
		for (int i= 0; i< bufferedImage.getHeight(); ++i) {
			for (int j= 0; j< bufferedImage.getWidth(); ++j) {
				bufferedImage.setRGB(j, i, (pix[i][j]<< 16)
						| (pix[i][j]<< 8)| (pix[i][j]));
			}
		}
		ImageIO.write(bufferedImage, fileType, new File(pngOutputPath));	
	}

	public static void pixRGBTableToFile(String pngOutputPath, int[][] pixRed
			, int[][] pixGreen, int[][] pixBlue, String fileType)
					throws IOException{
		BufferedImage bufferedImage= new BufferedImage(pixRed[0].length
				, pixRed.length, BufferedImage.TYPE_INT_RGB);
		for (int i= 0; i< bufferedImage.getHeight(); ++i) {
			for (int j= 0; j< bufferedImage.getWidth(); ++j) {
				bufferedImage.setRGB(j, i, (pixRed[i][j]<< 16)
						| (pixGreen[i][j]<< 8)| (pixBlue[i][j]));
			}
		}
		ImageIO.write(bufferedImage, fileType, new File(pngOutputPath));	
	}

	public static void bufferedImageToFile(String pngOutputPath
			, BufferedImage bufferedImage, String fileType) throws IOException{
		ImageIO.write(bufferedImage, fileType, new File(pngOutputPath));	
	}

	public static void imageToFile(String pngOutputPath, Image image
			, String fileType)throws IOException{
		ImageIO.write((BufferedImage)image, fileType, new File(pngOutputPath));	
	}	

	public static void bufferedImageToScaleImageFile(String pngOutputPath
			, BufferedImage bufferedImage, String fileType
			, int scale) throws IOException{
		bufferedImage= (BufferedImage)bufferedImage
				.getScaledInstance(bufferedImage.getWidth()
				, bufferedImage.getHeight(), scale);
		ImageIO.write(bufferedImage, fileType, new File(pngOutputPath));	
	}
}