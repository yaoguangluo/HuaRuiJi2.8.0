package sample.cecil;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Map;
public class dictionary{	
	public List<String> dic_list;
	public Map<String, String> dic_map;
	public List<String> txtToListName() throws IOException{
		List<String> TEMP_list = new ArrayList<>();
		TEMP_list.add("HarrisonsPrinciplesofInternalMedicine-18ed1.txt");
		TEMP_list.add("HarrisonsPrinciplesofInternalMedicine-18ed2.txt");
		TEMP_list.add("HarrisonsPrinciplesofInternalMedicine-18ed3.txt");
		TEMP_list.add("HarrisonsPrinciplesofInternalMedicine-18ed4.txt");
		TEMP_list.add("HarrisonsPrinciplesofInternalMedicine-18ed5.txt");
		TEMP_list.add("HarrisonsPrinciplesofInternalMedicine-18ed6.txt");
		TEMP_list.add("HarrisonsPrinciplesofInternalMedicine-18ed7.txt");
		TEMP_list.add("HarrisonsPrinciplesofInternalMedicine-18ed8.txt");
		TEMP_list.add("HarrisonsPrinciplesofInternalMedicine-18ed9.txt");
		TEMP_list.add("HarrisonsPrinciplesofInternalMedicine-18ed10.txt");
		TEMP_list.add("HarrisonsPrinciplesofInternalMedicine-18ed11.txt");
		TEMP_list.add("HarrisonsPrinciplesofInternalMedicine-18ed12.txt");
		TEMP_list.add("HarrisonsPrinciplesofInternalMedicine-18ed13.txt");
		TEMP_list.add("HarrisonsPrinciplesofInternalMedicine-18ed14.txt");
		TEMP_list.add("HarrisonsPrinciplesofInternalMedicine-18ed15.txt");
		TEMP_list.add("HarrisonsPrinciplesofInternalMedicine-18ed16.txt");
		TEMP_list.add("HarrisonsPrinciplesofInternalMedicine-18ed17.txt");
		return TEMP_list;
	}
	
	public Map<String, String> listNameToMap(List<String> dic_list) throws IOException{
		Map<String, String> dic_map = new ConcurrentHashMap<String, String>();
		for(int i = 0; i < dic_list.size(); i++) {
			String para = "";
			String name = dic_list.get(i).toString();
			InputStream in = getClass().getResourceAsStream(name);
			BufferedReader cReader;
			cReader = new BufferedReader(new InputStreamReader(in, "GBK"));  
			String ctempString = null; 
			int index = 0;
			while ((ctempString = cReader.readLine()) != null) {  
				if(!ctempString.replace(" ", "").equals("")) {
					para += " "+ctempString;
					if(ctempString.contains("^^")) {
						dic_map.put(name+(index++)+para.substring(0,30), para.replace("\\s+", " ").toLowerCase());
						para="";
					}
				}
			}
			cReader.close();
		}
		return dic_map;
	}
}