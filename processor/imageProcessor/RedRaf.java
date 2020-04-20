package imageProcessor;
public class RedRaf{
	public int[][] smallToNormal(int r[][],int s, int b) {
		int[][] out = new int[r.length][r[0].length];
		for(int i = 0; i < r.length; i++) {
			for(int j = 0; j < r[0].length; j++) {
				if(r[i][j] >= s && r[i][j] <= b) {
					out[i][j] = 255;	
				}else {
					out[i][j] = 0;
				}
			}
		}
		return out;
	}
}