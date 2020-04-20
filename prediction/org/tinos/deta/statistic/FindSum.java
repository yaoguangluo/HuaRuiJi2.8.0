package org.tinos.deta.statistic;
import java.util.Iterator;
import java.util.List;
public class FindSum{
	public static double findSumOfDoubleArray(double[] input) {
		double output= 0;
		for(int i= 0; i< input.length; i++) {
			output+= input[i];
		}
		return output;
	}
	
	public static Double[] findSumOfTwoDoubleArray(Double[] origin, Double[] input) {
		Double[] output= new Double[origin.length];
		for(int i= 0; i< input.length; i++) {
			output[i]= origin[i]+ input[i];
		}
		return output;
	}
	
	public static Double[][] findSumOfTwoDoubleArray2D(Double[][] origin, Double[][] input) {
		Double[][] output= new Double[origin.length][origin[0].length];
		for(int i= 0; i< input.length; i++) {
			for(int j= 0; j< input[0].length; j++) {
				output[i][j]= origin[i][j]+ input[i][j];
			}
		}
		return output;
	}
	
	public static double findSumOfDoubleMatrix2D(double[][] input) {
		double output= 0;
		for(int i= 0; i< input.length;i++) {
			for(int j= 0; j< input[0].length;j++) {
				output+= input[i][j];
			}
		}
		return output;
	}
	
	public static double[] findRowSumOfDoubleMatrix2D(double[][] input) {
		double[] output= new double[input[0].length];
		for(int i= 0; i< input.length; i++) {
			for(int j= 0; j< input[0].length; j++) {
				output[j]+= input[i][j];
			}
		}
		return output;
	}
	
	public static double[] findCulumnSumOfDoubleMatrix2D(double[][] input) {
		double[] output= new double[input.length];
		for(int i= 0; i< input.length; i++) {
			for(int j= 0; j< input[0].length; j++) {
				output[i]+= input[i][j];
			}
		}
		return output;
	}
	
	public static double findSumOfDoubleMatrix3D(double[][][] input) {
		double output= 0;
		for(int i= 0; i< input.length; i++) {
			for(int j= 0; j< input[0].length; j++) {
				for(int k= 0; k< input[0][0].length; k++) {
					output+= input[i][j][k];
				}
			}
		}
		return output;
	}
	
	public static double findSumOfDoubleList(List<Double> input) {
		double output= 0;
		Iterator<Double> iterator= input.iterator();
		while(iterator.hasNext()) {
			output+= iterator.next();
		}
		return output;
	}
	
	public static Double[] findSumOfMartrix1DList(List<Double[]> input) {
		Double[] output= new Double[input.get(0).length];
		Iterator<Double[]> iterator= input.iterator();
		while(iterator.hasNext()) {
			Double[] table= iterator.next();
			output= findSumOfTwoDoubleArray(output, table);
		}
		return output;
	}
	
	public static Double[][] findSumOfMartrix2DList(List<Double[][]> input) {
		Double[][] output= new Double[input.get(0).length][input.get(0)[0].length];
		Iterator<Double[][]> iterator= input.iterator();
		while(iterator.hasNext()) {
			Double[][] table= iterator.next();
			output= findSumOfTwoDoubleArray2D(output, table);
		}
		return output;
	}
}