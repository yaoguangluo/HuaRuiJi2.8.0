package sample.fqz;
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
		TEMP_list.add("傅青主女科歌括-清-傅山.txt");
		TEMP_list.add("保婴撮要-明-薛铠.txt");
		TEMP_list.add("保幼新编-清-卢光履.txt");
		TEMP_list.add("慈幼便览-清-佚名.txt");
		TEMP_list.add("儿科萃精--陈守真.txt");
		TEMP_list.add("妇科百辩-明-庄履严.txt");
		TEMP_list.add("妇科秘书--.txt");
		TEMP_list.add("妇科玉尺-清-沈金鳌.txt");
		TEMP_list.add("妇人良方集要-宋-陈自明.txt");
		TEMP_list.add("傅青主女科-明-傅山.txt"); 
		TEMP_list.add("傅青主男科重编考释-明-傅山.txt"); 
		return TEMP_list;
	}
	
	public Map<String, String> listNameToMap(List<String> dic_list) throws IOException{
		Map<String, String> dic_map = new ConcurrentHashMap<String, String>();
		for(int i = 0; i < dic_list.size(); i++) {
			String para = "";
			String name = dic_list.get(i).toString();
			InputStream in = getClass().getResourceAsStream(name);
			BufferedReader cReader;
			if(name.equalsIgnoreCase("保婴撮要-明-薛铠.txt") || name.equalsIgnoreCase("慈幼便览-清-佚名.txt")|| name.equalsIgnoreCase("傅青主女科歌括-清-傅山.txt")) {
				 cReader= new BufferedReader(new InputStreamReader(in, "UTF-16"));  
			}else {
				 cReader= new BufferedReader(new InputStreamReader(in, "GBK"));  
			}
			String ctempString= null; 
			int index= 0;
			while ((ctempString= cReader.readLine())!= null) {  
				if(!ctempString.replace(" ", "").equals("")) {
					para+= ctempString;
					if(ctempString.replace(" ", "").contains("^^")) {	
						dic_map.put(name+(index++), para.replace("\\s+", " "));
						para= "";
					}
				}
			}
			cReader.close();
		}
		return dic_map;
	}
}