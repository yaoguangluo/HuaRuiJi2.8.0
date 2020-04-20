package org.deta.tinos.string;
import java.io.UnsupportedEncodingException;
public class StringSwap{
	public static String[] stringToArray(String stopBy, String string){
		String[] strings= string.split(stopBy); 
		return strings;	
	}

	public static String stringToURIencode(String string, String encoding) throws UnsupportedEncodingException{
		return java.net.URLEncoder.encode(string, encoding);
	}
	
	@SuppressWarnings("deprecation")
	public static String stringToURIencode(String string) throws UnsupportedEncodingException{
		return java.net.URLEncoder.encode(string);
	}

	@SuppressWarnings("deprecation")
	public static String uRIencodeToURIdecode(String string){
		return java.net.URLDecoder.decode(string);
	}

	public static int[] stringToCharASCII(String string){
		int[] charASCII= new int[string.length()];
		for(int i= 0; i< string.length(); i++){
			charASCII[i]= string.charAt(i);
		}
		return charASCII;
	}

	public static String charsetSwap(String string, String inputCharset
			, String outputCharset)
					throws UnsupportedEncodingException{
		String output= new String(string.getBytes(inputCharset), outputCharset); 
		return output;
	}
}