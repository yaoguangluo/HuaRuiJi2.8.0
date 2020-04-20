package org.deta.tinos.array;
public class ArrayValidation{
	//以后 validation大体包括 check和fix， 2个部分。
	public static boolean arrayIntCheck(int[] array
			, int min, int max) {	
		for(int i= 0; i< array.length; i++) {
			if(array[i]> max|| array[i]< min) {
				return false;
			}
		}
		return true;
	}

	public static int[] arrayIntFix(int[] array
			, int min, int max) {	
		for(int i= 0; i< array.length; i++) {
			if(array[i]> max) {
				array[i]= max;
			}
			if(array[i]< min) {
				array[i]= min;
			}
		}
		return array;
	}

	public static boolean arrayLongCheck(long[] array
			, long min, long max) {	
		for(int i= 0; i< array.length; i++) {
			if(array[i]> max|| array[i]< min) {
				return false;
			}
		}
		return true;
	}

	public static long[] arrayLongFix(long[] array
			, long min, long max) {	
		for(int i= 0; i< array.length; i++) {
			if(array[i]> max) {
				array[i]= max;
			}
			if(array[i]< min) {
				array[i]= min;
			}
		}
		return array;
	}

	public static boolean arrayDoubleCheck(double[] array
			, double min, double max) {	
		for(int i= 0; i< array.length; i++) {
			if(array[i]> max|| array[i]< min) {
				return false;
			}
		}
		return true;
	}

	public static double[] arrayDoubleFix(double[] array
			, double min, double max) {	
		for(int i= 0; i< array.length; i++) {
			if(array[i]> max) {
				array[i]= max;
			}
			if(array[i]< min) {
				array[i]= min;
			}
		}
		return array;
	}

	public static boolean arrayFloatCheck(float[] array
			, float min, float max) {	
		for(int i= 0; i< array.length; i++) {
			if(array[i]> max|| array[i]< min) {
				return false;
			}
		}
		return true;
	}

	public static float[] arrayFloatFix(float[] array
			, float min, float max) {	
		for(int i= 0; i< array.length; i++) {
			if(array[i]> max) {
				array[i]= max;
			}
			if(array[i]< min) {
				array[i]= min;
			}
		}
		return array;
	}
}