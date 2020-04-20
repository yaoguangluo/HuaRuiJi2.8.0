package sortProcessor;
import java.io.IOException;
import timeProcessor.TimeCheck;
public class Demo extends Thread{
	public static void main(String args[]) throws IOException, InterruptedException{
        //init array
        int []array=arrayInit(); 	    
        TimeCheck check=new TimeCheck();  
	    /*
	    check.begin();
	   
        //sort
	    array=new BBSort().sort(array);
	    check.end();
	    print(array);
	    //*/
	    /*
	    check.begin();
	    array=new ShellSort().sort(array);
	    check.end();
	    print(array);
	    
	     
	     //*/
	    /*
	    check.begin();
	    array=new SelectionSort().sort(array);
	    check.end();
	    print(array);
	    //*/
	    
	    /*
	    check.begin();
	    array=new InsertionSort().sort(array,array.length);
	    check.end();
	    print(array);
	    //*/
	    
	   /*
	    check.begin();
	    array=new MergeSort().sort(array);
	    check.end();
	    print(array);
	   
	   //*/
	    /*
	    check.begin();
	    array=new Quick_1D_Sort().sort(array);
	    check.end();
	   // print(array);
	    
	    //*/
	    /*
	    check.begin();
	    array=new LinkSort().sort(array);
	    check.end();
	    
	    //print(array);
	    //*/
	    /*
	    check.begin();
	    array=new BTreeSort().sort(array);
	    check.end();
	    print(array);
	    //*/
	    
	    /*
	    check.begin();
	    array=new OTreeSort().sort(array);
	    check.end();
	    print(array);
	    //*/
	    /*
	    check.begin();
	    array=new Heap_2D_Sort().sort(array);
	    check.end();
	    
	   print(array);
	   // */
	   ///*
	    check.begin();
	    array=new Quick_6D_luoyaoguang_Sort().sort(array);
	   //array=new Quick_2D_Sort().sort(array);
	   check.end();
	   check.duration();
	  // print(array);
	    //*/
	    /*
	    check.begin();
	    //array=new Heap_2D_Sort().sort(array);
	    array=new Heap_2D_Sort().sort(array);
	    check.end();
	    //print(array);
	     */
	    /*
	    check.begin();
	    array=new OrderEvenSort().sort(array);
	    check.end();
	   print(array);
	   //*/
	    
	    /*
	    check.begin();
	    //array=new BinarySort().sort(array);
	  array=new Quick_6D_luoyaoguang_Sort().sort(array);
	   //array=new Quick_7D_Sort().sort(array);
	    check.end();
	   print(array);
	    //*/
	}
	
	@SuppressWarnings("unused")
	private static void print(int[] a) {
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}

	private static int[] arrayInit() {
		int[] array=new int[100000000];
		for(int i=0;i<100000000;i++){
			array[i]=(int)(Math.random()*10000000);
			//System.out.println(array[i]);
		}
//		array[0]=1;
//		array[1]=3;
//		array[2]=1;
//		array[3]=1;
//		array[4]=1;
//		array[5]=1;
//		array[6]=2;
//		array[7]=1;
//		
		
		
		
		// TODO Auto-generated method stub
		return array;
	}
}