package org.deta.tinos.matrix;
public class MatrixSwap{
	public static Object[][] matrixInclineSwap(Object[][] objects){
		Object[][] output= new Object[objects[0].length][objects.length];
		for(int i= 0; i< objects.length; i++) {
			for(int j= 0; j< objects[0].length; j++) {
				output[j][i]= objects[i][j];
			}
		}
		return output;
	}

	public static Object[][] matrixPostSwap(Object[][] objects){
		Object[][] output= new Object[objects.length][objects[0].length];
		for(int i= 0; i< objects.length; i++) {
			for(int j= 0; j< objects[0].length; j++) {
				output[i][objects[0].length- j]= objects[i][j];
			}
		}
		return output;
	}

	public static Object[][] matrixInSwap(Object[][] objects){
		Object[][] output= new Object[objects.length][objects[0].length];
		for(int i= 0; i< objects.length; i++) {
			for(int j= 0; j< objects[0].length; j++) {
				output[objects.length- i][j]= objects[i][j];
			}
		}
		return output;
	}	

	public static Object[][] matrixReverseSwap(Object[][] objects){
		Object[][] output= new Object[objects.length][objects[0].length];
		for(int i= 0; i< objects.length; i++) {
			for(int j= 0; j< objects[0].length; j++) {
				output[objects.length- i][objects[0].length- j]= objects[i][j];
			}
		}
		return output;
	}	
	
	public static Object[] matrixToArray(Object[][] objects){
		Object[] output= new Object[objects.length* objects[0].length];
		for(int i= 0; i< objects.length; i++) {
			for(int j= 0; j< objects[0].length; j++) {
				output[i* objects.length+ j]= objects[i][j];
			}
		}
		return output;
	}
}