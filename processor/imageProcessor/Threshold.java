package imageProcessor;
public class Threshold {
	public int[][]  Processor (int[][] g, int Td){
		int[][] out= new int[g.length][g[0].length];
		for (int i = 0; i < g[0].length; ++i) {
			for (int j = 0; j < g.length; ++j) {
				if( g[j][i]> Td){		
					out[j][i]= 255;
				}
			}
		}
		return out;
	}

	public int[][] ProcessorSection(int[][] g, int Ts, int Td) {
		int[][] out= new int[g.length][g[0].length];
		for (int i= 0; i< g[0].length; ++i) {
			for (int j= 0; j< g.length; ++j) {
				if(g[j][i]> Td){		
					out[j][i]= 255;
				}else {
					if(g[j][i]> Ts){		
						out[j][i]= 128;
					}
				}
			}
		}
		return out;
	}
}