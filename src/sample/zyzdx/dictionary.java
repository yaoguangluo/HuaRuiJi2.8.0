package sample.zyzdx;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class dictionary{	
	public List<String> dic_list;
	public Map<String,Object> dic_map;
	public Map<String,Object> dic_gn;
	public Map<String,Object> dic_lcbx;
	public Map<String,Object> dic_zhfx;
	public Map<String,Object> dic_lcyy;
	public Map<String,Object> dic_zhjb;
	public List<String> txtToList() throws IOException{
		List<String> dic_list = new ArrayList<>();
		List<String> TEMP_list = new ArrayList<>();
		InputStream in = getClass().getResourceAsStream("z.txt");
		BufferedReader cReader = new BufferedReader(new InputStreamReader(in, "UTF-8"));  
		String ctempString = null; 
		while ((ctempString = cReader.readLine()) != null) {  
			if(!ctempString.replace(" ","").equals(""))
				TEMP_list.add(ctempString);
		}
		cReader.close();
		for(int i = 0; i < TEMP_list.size(); i++) {
			dic_list.add(TEMP_list.get(i));
			if(TEMP_list.get(i).contains("[临床表现]")) {
				if(!TEMP_list.get(i-1).contains("[概念]")) {
					dic_list.add(dic_list.size()-1, "[概念]");
				}	
			}	
		}	
		
		in = getClass().getResourceAsStream("shl.txt");
		cReader = new BufferedReader(new InputStreamReader(in, "GBK"));  
		ctempString = null; 
		while ((ctempString = cReader.readLine()) != null) {  
			if(!ctempString.replace(" ","").equals(""))
				dic_list.add(ctempString);
		}
		cReader.close();	
		return dic_list;
	}
	
	public Map<String, Object> listToMap(List<String> dic_list) throws IOException{
		Map<String, Object> dic_map = new ConcurrentHashMap<String, Object>();
		for(int i = 0; i < dic_list.size(); i++) {
			if(dic_list.get(i).contains("[概念]")) {
				String med_name =dic_list.get(i-1);
				String med_text = "" + med_name;
				int j = i;				
				while(j+2 < dic_list.size() && (!dic_list.get(j+2).contains("[概念]"))) {
					med_text += dic_list.get(j);
					j+=1;
				}
				dic_map.put(med_name, med_text.replace("\\s+", " "));
			}
			
			if(dic_list.get(i).contains("[原文]")) {
				String med_name ="伤寒论:" + dic_list.get(i+1);
				String med_text = "" + med_name;
				int j = i;				
				while(j+1 < dic_list.size() && (!dic_list.get(j+1).contains("[原文]"))) {
					med_text += dic_list.get(j);
					j+=1;
				}
				dic_map.put(med_name, med_text.replace("\\s+", " "));
			}
		}
		return dic_map;
	}

	public Map<String, Object> mapToMap_zhjb(Map<String, Object> dic_map) {
		Map<String,Object> dic_zhjb = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0; i<copy.size(); i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name).toString().replace("\n", "");	
			Pattern p = Pattern.compile("证候鉴别(.*?)$"); 
			Matcher m = p.matcher(med_text); 
			String temp ="";
			if (m.find()) {
				temp="["+m.group(0);
			}
			dic_zhjb.put(med_name.replaceAll("\\s*", "").replace("〔","").replace("〕",":") , temp.replaceAll("\\s*", "").replace("〔","").replace("〕",":") );
		}
		return dic_zhjb;
	}

	public Map<String, Object> mapToMap_lcyy(Map<String, Object> dic_map) {
		Map<String,Object> dic_lcyy = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name).toString().replace("\n", "");	
			Pattern p = Pattern.compile("临床意义(.*?)证侯鉴别"); 

			Pattern p1 = Pattern.compile("临床意义(.*?)$"); 
			Matcher m = p.matcher(med_text); 
			Matcher m1 = p1.matcher(med_text); 
			String temp ="";
			if (m.find()) {
				temp="["+m.group(0);
				temp=temp.replace("[证侯鉴别", ".");
			}else if (m1.find()) {
				temp="["+m1.group(0);
			}
			
			dic_lcyy.put(med_name.replaceAll("\\s*", "").replace("〔","").replace("〕",":") , temp.replaceAll("\\s*", "").replace("〔","").replace("〕",":") );
		}
		
		return dic_lcyy;
	}

	public Map<String, Object> mapToMap_zhfx(Map<String, Object> dic_map) {
		Map<String,Object> dic_zhfx = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name).toString().replace("\n", "");	
			Pattern p = Pattern.compile("证候分析(.*?)临床意义"); 
			Pattern p1 = Pattern.compile("证候分析(.*?)证候鉴别"); 
			Pattern p2 = Pattern.compile("证候分析(.*?)$"); 
			Pattern p3 = Pattern.compile("评析(.*?)$"); 
			
			Matcher m = p.matcher(med_text); 
			Matcher m1 = p1.matcher(med_text); 
			Matcher m2 = p2.matcher(med_text); 
			Matcher m3 = p3.matcher(med_text); 
			String temp ="";
			if (m.find()) {
				temp="["+m.group(0);
				temp=temp.replace("[临床意义", ".");
			}else if (m1.find()) {
				temp="["+m1.group(0);
				temp=temp.replace("[证侯鉴别", ".");
			}else if (m2.find()) {
				temp=m2.group(0);
			}else if (m3.find()) {
				temp="["+m3.group(0);
				temp=temp.replace("[评析]", ".");
			}
			
			dic_zhfx.put(med_name.replaceAll("\\s*", "").replace("〔","").replace("〕",":") , temp.replaceAll("\\s*", "").replace("〔","").replace("〕",":") );
		}
		
		return dic_zhfx;
	}

	public Map<String, Object> mapToMap_lcbx(Map<String, Object> dic_map) {
		Map<String,Object> dic_lcbx = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name).toString().replace("\n", "");	
			Pattern p = Pattern.compile("临床表现(.*?)临床意义"); 
			Pattern p1 = Pattern.compile("临床表现(.*?)证候分析"); 
			Pattern p2 = Pattern.compile("临床表现(.*?)证侯鉴别"); 
			Pattern p3 = Pattern.compile("临床表现(.*?)$"); 
			Pattern p4 = Pattern.compile("注释(.*?)译文"); 
			Pattern p5 = Pattern.compile("注释(.*?)$"); 
			
			Matcher m = p.matcher(med_text); 
			Matcher m1 = p1.matcher(med_text); 
			Matcher m2 = p2.matcher(med_text); 
			Matcher m3 = p3.matcher(med_text); 
			Matcher m4 = p4.matcher(med_text); 
			Matcher m5 = p5.matcher(med_text); 
			String temp ="";
			if (m.find()) {
				temp = "[" + m.group(0);
				temp = temp.replace("[临床意义", ".");
			}else if (m1.find()) {
				temp = "[" + m1.group(0);
				temp = temp.replace("[证候分析", ".");
			}else if (m2.find()) {
				temp = "[" + m2.group(0);
				temp = temp.replace("[证侯鉴别", ".");
			}else if (m3.find()) {
				temp = "[" + m3.group(0);
			}else if (m4.find()) {
				temp = "[" + m4.group(0);
				temp = temp.replace("[注释]", ".");
			}else if (m5.find()) {
				temp = "[" + m5.group(0);
			}
			dic_lcbx.put(med_name.replaceAll("\\s*", "").replace("〔","").replace("〕",":") , temp.replaceAll("\\s*", "").replace("〔","").replace("〕",":") );
		}
		
		return dic_lcbx;
	}

	public Map<String, Object> mapToMap_gn(Map<String, Object> dic_map) {
		Map<String,Object> dic_li = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i = 0; i < copy.size(); i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name).toString().replace("\n", "");	
			Pattern p = Pattern.compile("概念(.*?)临床表现"); 
			Pattern p1 = Pattern.compile("译文(.*?)评析"); 
			Pattern p2 = Pattern.compile("译文(.*?)$"); 
			Matcher m = p.matcher(med_text); 
			Matcher m1 = p1.matcher(med_text); 
			Matcher m2 = p2.matcher(med_text); 
			String temp = "";
			if (m.find()) {
				temp = "[" + m.group(0);
				temp = temp.replace("[临床表现", ".");
			}else if (m1.find()) {
				temp = "[" + m1.group(0);
				temp = temp.replace("[译文]", ".");
			}else if (m2.find()) {
				temp = "[" + m2.group(0);
			}
			dic_li.put(med_name.replaceAll("\\s*", "").replace("〔","").replace("〕",":") , temp.replaceAll("\\s*", "").replace("〔","").replace("〕",":") );
		}
		return dic_li;
	}
}