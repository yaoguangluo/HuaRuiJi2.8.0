package org.tinos.deta.probability;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Percentage{
	public static List<Double> getPercentListByOuterKey(List<Double> list, double key){
		List<Double> output= new ArrayList<>();
		Iterator<Double> iterator= list.iterator();
		while(iterator.hasNext()) {
			output.add(iterator.next()* key);
		}
		return output;
	}
	
	public static double[] getPercentArrayByOuterKey(double[] array, double key){
		double[] output= new double[array.length];
		for(int i= 0; i< array.length; i++) {
			output[i]= array[i]* key;
		}
		return output;
	}
	
	public static double[] getEachPercentSetOfArray(double[] array) {
		double[] output= new double[array.length];
		double sum= 0;
		for(int i= 0; i< array.length; i++) {
			sum+= array[i];
		}
		for(int i= 0; i< array.length; i++) {
			output[i]= array[i]/ sum;
		}
		return output;
	}
	
	public static double[][] getPercentArrayByOuterKey(double[][] array, double key){
		double[][] output= new double[array.length][array[0].length];
		for(int i= 0; i< array.length; i++) {
			for(int j= 0; j< array[0].length; j++) {
				output[i][j]= array[i][j]* key;
			}
		}
		return output;
	}
	
	public static double[][] getEachPercentSetOfArray(double[][] array) {
		double[][] output= new double[array.length][array[0].length];
		double sum= 0;
		for(int i= 0; i< array.length; i++) {
			for(int j= 0; j< array[0].length; j++) {
				sum+= array[i][j];
			}
		}
		for(int i= 0; i< array.length; i++) {
			for(int j= 0; j< array[0].length; j++) {
				output[i][j]= array[i][j]/ sum;
			}
		}
		return output;
	}
}