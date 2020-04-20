package org.deta.tinos.image;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.imageio.ImageIO;

public class ImageToList {
	//该函数用于股市等波形图片文件转换成数组。
	public static List<Integer> waveImageFileToArrayWithBlack(
			String FilePath) throws IOException {
		BufferedImage bufferedImage= ImageIO.read(new File(FilePath)); 
		List<Integer> output= new ArrayList<>();
		for (int i= 0; i< bufferedImage.getWidth(); ++i) {
			for (int j= 0; j< bufferedImage.getHeight(); ++j) {
				int color= bufferedImage.getRGB(i, j);
				color= color& 0Xff;
				if(0== color) {
					output.add(j);
				}
			}
		}
		return output;
	}
	//该函数用于股市等波形缓存转换成数组。
	public static List<Integer> waveImageToArrayWithBlack(
			BufferedImage bufferedImage) {
		List<Integer> output= new ArrayList<>();
		for (int i= 0; i< bufferedImage.getWidth(); ++i) {
			for (int j= 0; j< bufferedImage.getHeight(); ++j) {
				int color= bufferedImage.getRGB(i, j);
				color= color& 0Xff;
				if(0== color) {
					output.add(j);
				}
			}
		}
		return output;
	}
	//该函数用于股市等波形缓存转换成数组。根据特征颜色处理。
	public static List<Integer> waveImageToArrayWithColor(
			BufferedImage bufferedImage, int colorRange) {
		List<Integer> output= new ArrayList<>();
		for (int i= 0; i< bufferedImage.getWidth(); ++i) {
			for (int j= 0; j< bufferedImage.getHeight(); ++j) {
				int color= bufferedImage.getRGB(i, j);
				color= color& 0Xff;
				if(colorRange== color) {
					output.add(j);
				}
			}
		}
		return output;
	}
	//该函数用于股市等波形图片文件转换成数组。根据特征颜色处理。
	public static List<Integer> waveImageFileToArrayWithColor(
			String FilePath, int colorRange) throws IOException {
		BufferedImage bufferedImage= ImageIO.read(new File(FilePath)); 
		List<Integer> output= new ArrayList<>();
		for (int i= 0; i< bufferedImage.getWidth(); ++i) {
			for (int j= 0; j< bufferedImage.getHeight(); ++j) {
				int color= bufferedImage.getRGB(i, j);
				color= color& 0Xff;
				if(colorRange== color) {
					output.add(j);
				}
			}
		}
		return output;
	}
	//该函数用于股市等波形图片文件转换成相同颜色数组分类集合。
	public static HashMap<Integer, List<Integer>> waveImageFileToArrayMapWithBlack(
			String FilePath) throws IOException {
		HashMap<Integer, List<Integer>> output= new HashMap<>();
		BufferedImage bufferedImage= ImageIO.read(new File(FilePath)); 
		for (int i= 0; i< bufferedImage.getWidth(); ++i) {
			for (int j= 0; j< bufferedImage.getHeight(); ++j) {
				int color= bufferedImage.getRGB(i, j);
				color= color& 0Xff;
				List<Integer> pointRange;
				if(output.containsKey(color)) {
					pointRange= output.get(color);
				}else {
					pointRange= new ArrayList<>();;
				}
				pointRange.add(j);
				output.put(color, pointRange);
			}
		}
		return output;
	}
	//该函数用于股市等波形缓存转换成数组。
	public static HashMap<Integer, List<Integer>> waveImageToArrayMapWithBlack(
			BufferedImage bufferedImage) {
		HashMap<Integer, List<Integer>> output= new HashMap<>();
		for (int i= 0; i< bufferedImage.getWidth(); ++i) {
			for (int j= 0; j< bufferedImage.getHeight(); ++j) {
				int color= bufferedImage.getRGB(i, j);
				color= color& 0Xff;
				List<Integer> pointRange;
				if(output.containsKey(color)) {
					pointRange= output.get(color);
				}else {
					pointRange= new ArrayList<>();;
				}
				pointRange.add(j);
				output.put(color, pointRange);
			}
		}
		return output;
	}
	public static void main(String[] argv) throws IOException {
		List<Integer> out= ImageToList.waveImageFileToArrayWithBlack("D:\\detaoss\\DETA_FREE1.0.2\\src\\sample\\sc\\a.png");
		for(int i=0; i<out.size(); i++) {
			System.out.print(out.get(i)+" ");
		}
	}
}