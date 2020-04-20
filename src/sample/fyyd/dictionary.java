package sample.fyyd;
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
		TEMP_list.add("黄帝内经.txt");
		TEMP_list.add("景岳全书.txt");
		TEMP_list.add("房中补益-唐-孙思邈.txt");
		TEMP_list.add("脉经.txt");
		TEMP_list.add("八十一难经-汉-扁鹊.txt");
		TEMP_list.add("中藏经.txt");
		TEMP_list.add("金匮要略.txt");
		return TEMP_list;
	}
	
	public Map<String, String> listNameToMap(List<String> dic_list) throws IOException{
		Map<String, String> dic_map = new ConcurrentHashMap<String, String>();
		for(int i = 0; i < dic_list.size(); i++) {
			String para = "";
			String name = dic_list.get(i).toString();
			InputStream in = getClass().getResourceAsStream(name);
			BufferedReader cReader;
			if(name.equalsIgnoreCase("保婴撮要-明-薛铠.txt") || name.equalsIgnoreCase("慈幼便览-清-佚名.txt")) {
				 cReader = new BufferedReader(new InputStreamReader(in, "UTF-16"));  
			}else {
				 cReader = new BufferedReader(new InputStreamReader(in, "GBK"));  
			}
			String ctempString = null; 
			int index = 0;
			while ((ctempString = cReader.readLine()) != null) {  
				if(!ctempString.replace(" ", "").equals("")) {
					para += ctempString;
					if(ctempString.replace(" ", "").contains("^^")) {	
						dic_map.put(name+(index++), para.replace("\\s+", " "));
						para="";
					}
				}
			}
			cReader.close();
		}
		return dic_map;
	}
}