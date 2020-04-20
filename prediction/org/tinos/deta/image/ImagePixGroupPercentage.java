package org.tinos.deta.image;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.tinos.deta.demension.Position2D;

public class ImagePixGroupPercentage{
	//思想：统计与概率论
	//作者：罗瑶光
	//目的：用于像素 筛选， 过滤 和 主要成分 分析。
	//这个函数用于求指定像素在图片中的像素占比。
	public static double getPixPercentByDeterPix(int[][] imagePix, int scaleRBG){
		double output= 0;
		for(int i=0; i<imagePix.length; i++) {
			for(int j=0; j<imagePix[0].length; j++) {
				if(scaleRBG== imagePix[i][j]) {
					output++;
				}
			}
		}
		return output/(imagePix.length* imagePix[0].length);
	}
	
	//这个函数用于Fissile函数执行切裂后的相同像素团 精度筛选部分 在 相关团中的簇数量占比。
	public static double getClusterPercentByDeterPixGroup(Map<Double, List<Position2D>> imagePix, int scaleSUM){
		double output= 0;
		Iterator<Double> iterator= imagePix.keySet().iterator();
		while(iterator.hasNext()) {
			List<Position2D> list= imagePix.get(iterator.next());
			if(list.size()> scaleSUM) {
				output++;
			}
		}
		return output/ imagePix.size();
	}
	
	//这个函数用于Fissile函数执行切裂后的相同像素团 精度筛选部分 在 相关团中的像素占比。
	public static double getPixPercentByDeterPixGroup(Map<Double, List<Position2D>> imagePix, int scaleSUM){
		double output= 0;
		double sum= 0;
		Iterator<Double> iterator= imagePix.keySet().iterator();
		while(iterator.hasNext()) {
			 List<Position2D> list= imagePix.get(iterator.next());
			 if(list.size()> scaleSUM) {
				 output+= list.size();
			 }
			 sum+= list.size();	 
		}
		return output/ sum;
	}
}