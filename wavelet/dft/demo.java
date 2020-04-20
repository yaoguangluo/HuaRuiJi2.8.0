package dft;
public class demo
{
	final static double pi=3.14159265;
	final static int N=8;
	public static void main(String []args)
	{
		//made origen
		double []p=new double[8];
		double []f=new double[8];
		for(int n=0;n<8;n++)
		{
			p[n]=Math.sin(2*pi*n/N);
			System.out.println(":"+p[n]);
		}
		//dft 		
		for(int k=0;k<N;k++)
		{
			double r=0,i=0;
			for(int n=0;n<N;n++)
			{
				r=r+p[n]*Math.cos(2*pi*k*n/N);
				i=i+p[n]*Math.sin(2*pi*k*n/N);
			}
		//	System.out.println(":"+r+":"+i);
			f[k]=Math.sqrt(r*r+i*i);
			System.out.println("::"+f[k]);
		}
		//f[1]=0;  0   1   0    -1   0
		//idft     1   0   -1    0   1 
		for(int k=0;k<N;k++)
		{
			double r=0,i=0;
			for(int n=0;n<N;n++)
			{
				r=r+f[n]*Math.cos(2*pi*k*(n)/N);
				i=i+f[n]*Math.sin(2*pi*k*(n)/N);
			}
		//	System.out.println(":"+r+":"+i);
			p[k]=(r-i)/8;
			//System.out.println(":::"+p[k]);
		}
		
		
	}
}