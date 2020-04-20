package sort;
import sortProcessor.Quick_6D_luoyaoguang_Sort;
public class Quick6DLYGWithStringSwap extends Quick_6D_luoyaoguang_Sort{
	public int[] sort(int[]a, String[]sa) {
		quick2d(a, 0, a.length - 1, sa);
		return a;
	}

	private void quick2d(int[] a, int lp, int rp, String[] sa) {
		if(lp < rp){
			int c = rp-lp+1;	 
			if(c<7){
				int j;
				for(int i = 1+lp; i<lp+c; i++){
					j = i;
					while(j >= 1 + lp){
						if(a[j] < a[j - 1]){
							int temp = a[j];
							a[j] = a[j-1];
							a[j-1] = temp;
							String stemp = String.valueOf(sa[j]);
							sa[j] = String.valueOf(sa[j - 1]);
							sa[j-1] = String.valueOf(stemp);
						}
						j--;
					}	
				}	
				return;
			} 
			int pos = partition(a,lp,rp,sa);
			quick2d(a,lp,pos-1,sa);
			quick2d(a,pos+1,rp,sa);
		}
	}

	private int partition(int[] a, int lp, int rp, String[] sa) {
		int x,lp1,rp1,temp;x = a[lp];rp1 = rp;lp1 = lp;int y = a[rp];
		x = (x <= y) ? x : y;
		while(lp1<rp1){
			while((a[lp1] <= x)&&(lp1 < rp1)) {
				lp1++;
			} 
			while(a[rp1] > x) {
				rp1--;
			} 
			if(lp1 < rp1){
				temp = a[rp1];
				a[rp1] = a[lp1];
				a[lp1] = temp;
				String stemp = String.valueOf(sa[rp1]);
				sa[rp1] = String.valueOf(sa[lp1]);
				sa[lp1] = String.valueOf(stemp);
			}
		}
		a[lp]=a[rp1];
		a[rp1]=x;
		return rp1;
	}
}