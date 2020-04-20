package waveProcessor;
public class DFT{
	public double cos[][];
	public double sin[][];
	public double coss[];
	public double sins[];
	double Pi = 3.1415926;
	public void init(int size) {
		cos=this.ft_cos(size);
		sin=this.ft_sin(size);
	}

	public double [] ft(double input[]) {
		double output[]= new double[input.length];	
//		double cos[][]=this.ft_cos(input.length);
//		double sin[][]=this.ft_sin(input.length);
		for(int k=0;k<input.length;k++){
			double r = 0, i = 0;
			for(int n=0;n<input.length;n++){
				r += input[n]*cos[k][n];
				i += input[n]*sin[k][n];
			}
			output[k] = Math.sqrt(r*r+i*i);
		}
		return output;
	}	
	
	public double [][] ft_cos(double size) {
		double cos[][]=new double[(int)size][(int)size];
		for(int k=0;k<size;k++){
			for(int n=0;n<size;n++){
				cos[k][n]=Math.cos(2 * Pi * k * n / size);
			}
		} 
		return cos;
	}

	public double [][] ft_sin(double size) {
		double sin[][]=new double[(int)size][(int)size];
		for(int k=0;k<size;k++){
			for(int n=0;n<size;n++){
				sin[k][n]=Math.sin(2 * Pi * k * n / size);
			}
		} 
		return sin;
	}	
}