package org.tinos.deta.ratio;
public class IncrementRatio{
	public static double findTotalIncrementRatioWithScale(double value, double times, double scale) {
		double input= value;
		for(double i= 0; i< times; i++) {
			value*= scale;
		}
		return (value- input)/ input;
	}
	
	public static double findMeanIncrementRatioWithScale(double value, double times, double scale) {
		double input= value;
		for(double i= 0; i< times; i++) {
			value*= scale;
		}
		return (value- input)/ times;
	}
}