package imageProcessor;
public class filter{
	public int[][] ProcessorHeart(int[][] rp1, int distance, int scale) {
		int mask[][]= new int[rp1.length][rp1[0].length];	
		for(int i= distance/2; i< rp1.length-distance/2; i++) {
			for(int j= distance/2; j< rp1[0].length-distance/2; j++) {	
				for(int p= i- distance/2; p< i+ distance/2; p++) {
					for(int q= j- distance/2; q< j+ distance/2; q++) {
						mask[i][j]+= rp1[p][q];			
					}
				}
			}
		}
		return mask;
	}

	public int[][] ProcessorModel(int[][] rp1, int[][] yanjing) {
		yanjing= new int[][] {
			 {4,4,4,4,4,5,5,5,5,5,5,5,5,5,4,4,4,4},
			 {4,4,4,5,5,5,5,5,5,5,5,5,5,5,5,4,4,4},
			 {4,4,5,5,5,2,2,2,2,2,2,2,2,5,5,5,4,4},
			 {4,3,3,3,2,2,2,2,2,1,2,2,2,2,5,5,5,4},
			 {3,3,3,2,2,2,2,2,1,1,1,2,2,2,2,5,5,5},
			 {3,3,3,2,2,2,2,1,1,1,1,1,2,2,2,5,5,5},
			 {4,3,3,2,2,2,2,2,1,1,1,2,2,2,2,3,3,3},
			 {4,3,3,3,2,2,2,2,2,1,2,2,2,2,5,5,5,4},
			 {4,4,3,3,3,3,2,2,2,2,2,2,2,5,5,5,4,4},
			 {4,4,4,3,3,3,3,3,2,2,5,5,5,5,5,4,4,4},
			 {4,4,4,4,4,4,3,3,3,3,3,5,5,5,4,4,4,4},
			 };
		int w= rp1.length;
		int h= rp1[0].length;
		int hy= yanjing.length;
		int wy= yanjing[0].length;
		int[][] output= new int[w][h];
		for(int i= 0; i< w; i++) {
			for(int j= 0; j< h; j++) {
				int find1=0;
				int find2=0;
				int find3=0;
				int find4=0;
				int find5=0;
				int find6=0;
				int find7=0;
				int find8=0;
				int find9=0;
				int find10=0;
				int find11=0;
				int find12=0;
				int find13=0;
				int find14=0;
				int find15=0;
				int find16=0;
				int find17=0;
				int find18=0;
				int find19=0;
				int find20=0;
				if(i+wy<w-1&& j+hy< h-1) {
					for(int p=0;p<wy;p++) {
						for(int q=0; q<hy; q++) {
							try {
								if(rp1[i+p][j+q]!=0&& yanjing[q][p]==1) {
									find1++;
								}
								if(rp1[i+p][j+q]==0&& yanjing[q][p]==2) {
									find2++;
								}
								if(rp1[i+p][j+q]==68&& yanjing[q][p]==3) {
									find3++;
								}
								if(rp1[i+p][j+q]==0&& yanjing[q][p]==4) {
									find4++;
								}
								if(rp1[i+p][j+q]==255&& yanjing[q][p]==5) {
									find5++;
								}
								if(rp1[i+p][j+q]==0&& yanjing[q][p]==1) {
								find6++;
							}
							if(rp1[i+p][j+q]!=0&& yanjing[q][p]==2) {
								find7++;
							}
							if(rp1[i+p][j+q]!=68&& yanjing[q][p]==3) {
								find8++;
							}
							if(rp1[i+p][j+q]!=0&& yanjing[q][p]==4) {
								find9++;
							}
							if(rp1[i+p][j+q]!=255&& yanjing[q][p]==5) {
								find10++;
							}
							if(rp1[i+p][j+q]==68&& yanjing[q][p]==1) {
								find11++;
							}
							if(rp1[i+p][j+q]==68&& yanjing[q][p]==2) {
								find12++;
							}
							if(rp1[i+p][j+q]==0&& yanjing[q][p]==3) {
								find13++;
							}
							if(rp1[i+p][j+q]==68&& yanjing[q][p]==4) {
								find14++;
							}
							if(rp1[i+p][j+q]==0&& yanjing[q][p]==5) {
								find15++;
							}
							if(rp1[i+p][j+q]==255&& yanjing[q][p]==1) {
								find16++;
							}
							if(rp1[i+p][j+q]==255&& yanjing[q][p]==2) {
								find17++;
							}
							if(rp1[i+p][j+q]==255&& yanjing[q][p]==3) {
								find18++;
							}
							if(rp1[i+p][j+q]==255&& yanjing[q][p]==4) {
								find19++;
							}
							if(rp1[i+p][j+q]==68&& yanjing[q][p]==5) {
								find20++;
							}
							}catch(Exception e){
							}
						}
					}
				}
				//30, 60, 30, 80
				if(find1>=0&&find2>=0&&find3>=0&&find4>=0&&find5>=0
						) {		
					if(find6>=0&&find7>=0&&find8>=0&&find9>=0&&find10>=0&&
							find11>=0&&find12>=0&&find13>=0&&find14>=0&&find15>=0&&
							find16>=0&&find17>=0&&find18>=0&&find19>=0&&find20>=0
							) {		
						if(find11>=0&&find12>=0&&find13>=0&&find14>=0&&find15>=0&&
								find16>=0&&find17>=0&&find18>=0&&find19>=0&&find20>=0
								) {		
							if(find16>=0&&find17>=0&&find18>=0&&find19>=0&&find20>=0
									) {		
								for(int m= 0; m< wy; m++) {
									for(int n= 0; n< hy; n++) {
										try {
											output[i+ m][j+ n]= 255;	
										}catch(Exception e) {
										}
									}
								}
							}//59
						}//59
					}//59
				}//59
			}
		}
		return output;
	}
	
//	public Map<Double, ArrayList<Position2D>> Processor(int[][] rp1, int distance) {
//		Map<Double, ArrayList<Position2D>> map= new HashMap<>();
//		int mask[][]= new int[rp1.length][rp1[0].length];	
//		for(int i= 1; i< rp1.length-1; i++) {
//			for(int j= 1; j< rp1[0].length-1; j++) {
//				mask[i][j]=
//			}
//		}
//		return map;
//	}
//
//	private void findGroup(List<Position2D> list, int[][] rp1, int[][] mask, int i, int j) {
//		Position2D position2D= new Position2D();
//		position2D.setX(i);
//		position2D.setY(j);
//		list.add(position2D);
//		mask[i][j]= 1;
//		if(i< 1||i> rp1.length- 1||j< 1||j>rp1[0].length- 1) {
//			return;
//		}
//		if(0== mask[i][j+ 1]) {
//			findGroup(list, rp1, mask, i, j);	
//		}
//		if(0== mask[i][j- 1]) {
//			findGroup(list, rp1, mask, i, j);
//		}
//		if(0== mask[i+ 1][j]) {
//			findGroup(list, rp1, mask, i, j);
//		}
//		if(0== mask[i- 1][j]) {
//			findGroup(list, rp1, mask, i, j);
//		}
//	}
}
