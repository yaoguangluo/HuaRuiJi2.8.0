package org.deta.tinos.array;
import java.io.IOException;

import timeProcessor.TimeCheck;
//import parserProcessor.timeCheck;
public class Demo extends Thread{
	public static void main(String args[]) throws IOException, InterruptedException{
        //init array
        double []array=arrayInit(); 
//        double []array1= array.clone();
        double []array2= new double[8];
        array2[0]=array[0];
        array2[1]=array[1];
        array2[2]=array[2];
        array2[3]=array[3];
        array2[4]=array[4];
        array2[5]=array[5];
        array2[6]=array[6];
        array2[7]=array[7];
        System.out.println(" ");
        System.out.println("罗瑶光小高峰过滤快速排序4代：");
        TimeCheck imeCheck2= new TimeCheck();
        imeCheck2.begin();
        array2= new LYG4DWithDoubleQuickSort4D().sort(array, 7);
        imeCheck2.end();
        imeCheck2.duration();
       // print(array);
	}
	
	@SuppressWarnings("unused")
	private static void print(double[] a) {
		int count=0;
		for(int i=0;i<a.length-1;i++){
			//System.out.println(a[i]);
			//if(a[i]>a[i+1]){
			//	count++;
				System.out.println(a[i]);
			//}
		}
		System.out.println(count);
	}

	private static double[] arrayInit() {
		double[] array=new double[5119];
	//	java.util.Random r= new java.util.Random(); 
		for(int i=5119,j=0;i>0;i--,j++){
			//array[j]= r.nextInt();
			array[j]= j%8;
			//System.out.println(array[j]);
		}
		// TODO Auto-generated method stub
		return array;
	}
}