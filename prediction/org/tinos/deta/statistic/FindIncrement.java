package org.tinos.deta.statistic;
public class FindIncrement{
	//得到关于等比精度的增量总值。
	public static double findTotalIncrementWithScale(double value, double times, double scale) {
		double input= value;
		for(double i= 0; i< times; i++) {
			value*= scale;
		}
		return value- input;
	}
	
	public static double findMeanIncrementWithScale(double value, double times, double scale) {
		double input= value;
		for(double i= 0; i< times; i++) {
			value*= scale;
		}
		return (value- input)/ times;
	}
}