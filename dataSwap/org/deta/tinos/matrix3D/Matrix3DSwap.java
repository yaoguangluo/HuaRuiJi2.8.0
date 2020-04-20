package org.deta.tinos.matrix3D;
public class Matrix3DSwap{
	public static Object[][][] matrixShiftSwapXYZ(Object[][][] objects){
		Object[][][] output
		= new Object[objects[0][0].length][objects.length][objects[0].length];
		for(int i= 0; i< objects.length; i++) {
			for(int j= 0; j< objects[0].length; j++) {
				for(int k= 0; k< objects[0][0].length; k++) {
					output[k][i][j]= objects[i][j][k];
				}
			}
		}
		return output;
	}

	public static Object[][][] matrixInclineSwapXY(Object[][][] objects){
		Object[][][] output
		= new Object[objects[0].length][objects.length][objects[0][0].length];
		for(int i= 0; i< objects.length; i++) {
			for(int j= 0; j< objects[0].length; j++) {
				for(int k= 0; k< objects[0][0].length; k++) {
					output[j][i][k]= objects[i][j][k];
				}
			}
		}
		return output;
	}

	public static Object[][][] matrixInclineSwapXZ(Object[][][] objects){
		Object[][][] output
		= new Object[objects[0][0].length][objects[0].length][objects.length];
		for(int i= 0; i< objects.length; i++) {
			for(int j= 0; j< objects[0].length; j++) {
				for(int k= 0; k< objects[0][0].length; k++) {
					output[k][j][i]= objects[i][j][k];
				}
			}
		}
		return output;
	}

	public static Object[][][] matrixInclineSwapYZ(Object[][][] objects){
		Object[][][] output
		= new Object[objects.length][objects[0][0].length][objects[0].length];
		for(int i= 0; i< objects.length; i++) {
			for(int j= 0; j< objects[0].length; j++) {
				for(int k= 0; k< objects[0][0].length; k++) {
					output[i][k][j]= objects[i][j][k];
				}
			}
		}
		return output;
	}

	public static Object[][][] matrixReverseSwap(Object[][][] objects){
		Object[][][] output= new Object[objects.length][objects[0].length][];
		for(int i= 0; i< objects.length; i++) {
			for(int j= 0; j< objects[0].length; j++) {
				for(int k= 0; k< objects[0][0].length; k++) {
					output[objects.length- i][objects[0].length- j]
							[objects[0][0].length- k]= objects[i][j][k];
				}
			}
		}
		return output;
	}	

	public static Object[][][] matrixReverseSwapXY(Object[][][] objects){
		Object[][][] output= new Object[objects.length][objects[0].length][];
		for(int i= 0; i< objects.length; i++) {
			for(int j= 0; j< objects[0].length; j++) {
				for(int k= 0; k< objects[0][0].length; k++) {
					output[objects.length- i][objects[0].length- j][k]
							= objects[i][j][k];
				}
			}
		}
		return output;
	}	

	public static Object[][][] matrixReverseSwapXZ(Object[][][] objects){
		Object[][][] output= new Object[objects.length][objects[0].length][];
		for(int i= 0; i< objects.length; i++) {
			for(int j= 0; j< objects[0].length; j++) {
				for(int k= 0; k< objects[0][0].length; k++) {
					output[objects.length- i][j][objects[0][0].length- k]
							= objects[i][j][k];
				}
			}
		}
		return output;
	}	

	public static Object[][][] matrixReverseSwapYZ(Object[][][] objects){
		Object[][][] output= new Object[objects.length][objects[0].length][];
		for(int i= 0; i< objects.length; i++) {
			for(int j= 0; j< objects[0].length; j++) {
				for(int k= 0; k< objects[0][0].length; k++) {
					output[i][objects[0].length- j][objects[0][0].length- k]
							= objects[i][j][k];
				}
			}
		}
		return output;
	}	
	
	public static Object[] matrixToArray(Object[][][] objects){
		Object[] output= new Object[objects.length
		                            * objects[0].length* objects[0][0].length];
		for(int i= 0; i< objects.length; i++) {
			for(int j= 0; j< objects[0].length; j++) {
				for(int k= 0; k< objects[0][0].length; k++) {
					output[i* objects.length* objects[0].length
					       + j* objects[0].length+ k]= objects[i][j][k];
				}
			}
		}
		return output;
	}	
}