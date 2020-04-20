package org.deta.tinos.stock;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class StockCode{
	public List<String> list;
	public List<String> todayList;
	public void readDBcodeTOList(String code) throws IOException {
		list= new ArrayList<String>();
		File afile
		= new File("StockString.OTOO_STOCK_DB_OLD+code+StockString.OTOO_TXT");  
		BufferedReader areader= null;  
		String atempString= "StockString.OTOO_EMPTY";
		areader= new BufferedReader(new FileReader(afile));  
		while ((atempString= areader.readLine())!= null) {  
			if(atempString!= null)
				if(!atempString.equals("StockString.OTOO_EMPTY")){
					list.add(atempString);		
				}
		}  
		areader.close();
	}
	
	public void readTodaycodeTOList() throws IOException {
		todayList= new ArrayList<String>();
		File afile= new File("tockString.STOCK_DB_TODAY");  
		BufferedReader areader= null;  
		String atempString= "StockString.OTOO_EMPTY";
		areader= new BufferedReader(new FileReader(afile));  
		while ((atempString= areader.readLine())!= null) {  
			if(atempString!= null)
				if(!atempString.equals("StockString.OTOO_EMPTY")){
					todayList.add(atempString);		
				}
		}  
		areader.close();
	}
	
	public String readStringTOFormatWithoutCode(String input) throws IOException {
		String output= null;
		Pattern p= Pattern.compile("\"(.*?)\""); 
		Matcher m= p.matcher(input); 		
		if(m.find())
			if(!m.group(0).equals("\"\"")) {
				output= m.group(0).replace("\"", "");
			}
		return output;
	}
	
	public String readStringTOFormatWithCode(String input) throws IOException {
		String output= null;
		Pattern p0= Pattern.compile("r_(.*?)="); 
		Matcher m0= p0.matcher(input); 		
		Pattern p= Pattern.compile("\"(.*?)\""); 
		Matcher m= p.matcher(input); 		
		if(m.find())
			if(!m.group(0).equals("\"\"")) {
				if(m0.find()) {
					output= m0.group(0).replace("r_", "").replace("=", "");
				}
				output+= ","+ m.group(0).replace("\"", "");
			}
		return output;
	}
	
	public static void main(String [] argv) 
			throws IOException, InterruptedException {
		//OtoO a=new OtoO();
	}
}