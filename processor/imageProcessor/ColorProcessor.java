package imageProcessor;
public class ColorProcessor {
	public String Processor(int r,int g,int b){
		String output = "#";
		String rs = "" + Integer.toHexString(r & 0xff);
		if(rs.length()<2) {
			rs = "0" + rs;
		}
		
		String bs = "" + Integer.toHexString(b & 0xff);
		if(bs.length() < 2) {
			bs = "0" + bs;
		}
		
		String gs = "" + Integer.toHexString(g & 0xff);
		if(gs.length() < 2) {
			gs = "0" + gs;
		}
		
		output += rs + gs + bs;
		return output;
	}
}
