package sample;
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
public class Dictionary{	
	public List<String> dic_list;
	public Map<String,Object> dic_map;
	public Map<String,Object> dic_li;
	public Map<String,Object> dic_hai;
	public Map<String,Object> dic_xz;
	public Map<String,Object> dic_xw;
	public Map<String,Object> dic_jm;
	public Map<String,Object> dic_ya;
	public Map<String,Object> dic_cy;
	public Map<String,Object> dic_cj;
	public Map<String,Object> dic_jj;
	public Map<String,Object> dic_zf;
	public List<String> txtToList() throws IOException{
		List<String> dic_list= new ArrayList<>();
		InputStream in= getClass().getResourceAsStream("bcqj.txt");
		BufferedReader cReader= new BufferedReader(new InputStreamReader(in));  
		String ctempString= null; 
		while ((ctempString= cReader.readLine()) != null) {  
			if(!ctempString.replace(" ","").equals(""))
				dic_list.add(ctempString);
		}
		cReader.close();
		return dic_list;
	}
	
	@SuppressWarnings("unused")
	public Map<String, Object> listToMap(List<String> dic_list) throws IOException{
		Map<String, Object> dic_map = new ConcurrentHashMap<String, Object>();
		for(int i = 0; i < dic_list.size(); i++) {
			if(dic_list.get(i).contains("摘要")) {
				if(i+3 < dic_list.size()) {
					String med_name = dic_list.get(i+3).replace("[中药名称]", "");
					String med_text = "";
					int j = i+2;				
					while(++j < dic_list.size() && !dic_list.get(j).contains("摘要")) {
						med_text += "\n" + dic_list.get(j);
					}
					dic_map.put(med_name.replaceAll(" ", "").replace("〔","").replace("〕",":"), med_text+"〕〕");
				}
			}
		}
		return dic_map;
	}
	
	public Map<String, Object> mapToMap_yw(Map<String, Object> dic_map) {
		Map<String,Object> dic_yw = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name.trim()).toString().replace("\n", "");	
			Pattern p=Pattern.compile("笔记原文(.*?)\\["); 
			Matcher m = p.matcher(med_text); 
			String temp = "";
			if (m.find()) {
				temp=m.group(0);
				temp=temp.replace("笔记原文]", "").replace("[", ".");
			}
			if(!dic_yw.containsKey(med_name.replaceAll("\\s*", "").replace("〔","").replace("〕",":"))) {
				dic_yw.put(med_name.replaceAll("\\s*", "").replace("〔","").replace("〕",":")
						, temp.replaceAll("\\s*", "").replace("〔","").replace("〕",":"));
			}
		}
		return dic_yw;
	}
	
	public Map<String, Object> mapToMap_li(Map<String, Object> dic_map) {
		Map<String,Object> dic_li = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name.trim()).toString().replace("\n", "");	
			Pattern p=Pattern.compile("功效(.*?)\\["); 
			Matcher m = p.matcher(med_text); 
			String temp = "";
			if (m.find()) {
				temp=m.group(0);
				temp=temp.replace("功效]", "").replace("[", ".");
			}
			if(!dic_li.containsKey(med_name.replaceAll("\\s*", "").replace("〔","").replace("〕",":"))) {
				dic_li.put(med_name.replaceAll("\\s*", "").replace("〔","").replace("〕",":")
						, temp.replaceAll("\\s*", "").replace("〔","").replace("〕",":"));
			}
		}
		return dic_li;
	}
	@SuppressWarnings("unused")
	public Map<String, Object> mapToMap_hai(Map<String, Object> dic_map) {
		Map<String,Object> dic_hai = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());	
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name.trim()).toString().replace("\n", "");	
			Pattern p=Pattern.compile("风险规避(.*?)\\["); 
			Matcher m = p.matcher(med_text); 
			String temp = "";
			if (m.find()) {
				temp=m.group(0);
				temp=temp.replace("风险规避]", "").replace("[", "");
			}
			if(!dic_hai.containsKey(med_name.replaceAll("\\s*", "").replace("〔","").replace("〕",":"))) {
				dic_hai.put(med_name.replaceAll("\\s*", "").replace("〔","").replace("〕",":")
						, temp.replaceAll("\\s*", "").replace("〔","").replace("〕",":"));
				
			}
		}
		return dic_hai;
	}
	
	public Map<String, Object> mapToMap_xz(Map<String, Object> dic_map) {
		Map<String,Object> dic_xz = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name.trim()).toString().replace("\n", "");	
			Pattern p=Pattern.compile("中医馆药理(.*?)\\["); 
			Matcher m = p.matcher(med_text); 
			String temp = "";
			if (m.find()) {
				temp=m.group(0);
				temp=temp.replace("中医馆药理]", "").replace("[", "");
			}
			if(!dic_xz.containsKey(med_name.replaceAll("\\s*", "").replace("〔", "").replace("〕",":"))) {
				dic_xz.put(med_name.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":")
						, temp.replaceAll("\\s*", "").replace("〔","").replace("〕",":"));
			}
		}
		return dic_xz;
	}

	public Map<String, Object> mapToMap_zf(Map<String, Object> dic_map) {
		Map<String,Object> dic_zf = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name).toString().replace("\n", "");	
			Pattern p=Pattern.compile("搭配(.*?)\\["); 
			Matcher m = p.matcher(med_text); 
			String temp = "";
			if (m.find()) {
				temp=m.group(0);
				temp=temp.replace("搭配]", "").replace("[", "");
			}
			dic_zf.put(med_name.replaceAll("\\s*", "").replace("〔","").replace("〕",":")
					, temp.replaceAll("\\s*", "").replace("〔","").replace("〕",":"));
		}
		return dic_zf;
	}
	
	public Map<String, Object> mapToMap_cj(Map<String, Object> dic_map) {
		Map<String,Object> dic_cj = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name).toString().replace("\n", "");	
			Pattern p=Pattern.compile("常见药(.*?)药小节完"); 
			Matcher m = p.matcher(med_text); 
			String temp = "";
			if (m.find()) {
				temp=m.group(0).replace("常见药]", "");
			}
			dic_cj.put(med_name.replaceAll("\\s*", "").replace("〔","").replace("〕",":")
					, temp.replaceAll("\\s*", "").replace("〔","").replace("〕",":"));
		}
		return dic_cj;
	}
	

	public Map<String, Object> mapToMap_jj(Map<String, Object> dic_map) {
		Map<String,Object> dic_jj = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name).toString().replace("\n", "");	
			Pattern p=Pattern.compile("经解(.*?)\\["); 
			Matcher m = p.matcher(med_text); 
			String temp = "";
			if (m.find()) {
				temp=m.group(0);
				temp=temp.replace("经解]", "").replace("[", "");
			}
			dic_jj.put(med_name.replaceAll("\\s*", "").replace("〔","").replace("〕",":")
					, temp.replaceAll("\\s*", "").replace("〔","").replace("〕",":"));
		}
		return dic_jj;
	}

	public Map<String, Object> mapToMap_cy(Map<String, Object> dic_map) {
		Map<String,Object> dic_cy = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name).toString().replace("\n", "");	
			Pattern p=Pattern.compile("崇源(.*?)\\["); 
			Matcher m = p.matcher(med_text); 
			String temp = "";
			if (m.find()) {
				temp=m.group(0);
				temp=temp.replace("崇源]", "").replace("[", "");
			}
			dic_cy.put(med_name.replaceAll("\\s*", "").replace("〔","").replace("〕",":")
					, temp.replaceAll("\\s*", "").replace("〔","").replace("〕",":"));
		}
		return dic_cy;
	}

	public Map<String, Object> mapToMap_ya(Map<String, Object> dic_map) {
		Map<String,Object> dic_ya = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name).toString().replace("\n", "");	
			Pattern p=Pattern.compile("愚按(.*?)\\["); 
			Matcher m = p.matcher(med_text); 
			String temp = "";
			if (m.find()) {
				temp=m.group(0);
				temp=temp.replace("愚按]", "").replace("[", "");
			}
			dic_ya.put(med_name.replaceAll("\\s*", "").replace("〔","").replace("〕",":")
					, temp.replaceAll("\\s*", "").replace("〔","").replace("〕",":"));
		}
		return dic_ya;
	}

	public Map<String, Object> mapToMap_jm(Map<String, Object> dic_map) {
		Map<String,Object> dic_jm = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name).toString().replace("\n", "");	
			Pattern p=Pattern.compile("经脉/经络(.*?)\\["); 
			Matcher m = p.matcher(med_text); 
			String temp = "";
			if (m.find()) {
				temp=m.group(0);
				temp=temp.replace("经脉/经络]", "").replace("[", "");
			}
			dic_jm.put(med_name.replaceAll("\\s*", "").replace("〔","").replace("〕",":")
					, temp.replaceAll("\\s*", "").replace("〔","").replace("〕",":"));
		}
		return dic_jm;
	}

	public Map<String, Object> mapToMap_xw(Map<String, Object> dic_map) {
		Map<String,Object> dic_xw = new java.util.concurrent.ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name).toString().replace("\n", "");	
			Pattern p=Pattern.compile("性味(.*?)\\["); 
			Matcher m = p.matcher(med_text); 
			String temp = "";
			if (m.find()) {
				temp=m.group(0);
				temp=temp.replace("性味]", "").replace("[", "");
			}
			if(!dic_xw.containsKey(med_name.replaceAll("\\s*", "").replace("〔","").replace("〕",":"))) {
				dic_xw.put(med_name.replaceAll("\\s*", "").replace("〔","").replace("〕",":")
						, temp.replace("经络", "").replaceAll("\\s*", "").replace("〔","").replace("〕",":"));
				
			}
		}
		return dic_xw;
	}

	public Map<String, Object> mapToMap_yl(Map<String, Object> dic_map, Map<String, Object> dic_xw,
			Map<String, Object> dic_li, Map<String, Object> dic_xz, Map<String, Object> dic_jm) throws IOException {
		Map<String,Object> dic_yl = new java.util.concurrent.ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name).toString().replace("\n", "");	
			Pattern p=Pattern.compile("用量/克, 别名，其他，备注(.*?)\\["); 
			Matcher m = p.matcher(med_text); 
			String temp = "";
			if (m.find()) {
				temp=m.group(0);
				temp=temp.replace("用量/克, 别名，其他，备注]", "").replace("[", "");
			}
			if(!dic_yl.containsKey(med_name.replaceAll("\\s*", "").replace("〔","").replace("〕",":"))) {
				dic_yl.put(med_name.replaceAll("\\s*", "").replace("〔","").replace("〕",":")
						, temp.replace("经络", "").replaceAll("\\s*", "").replace("〔","").replace("〕",":"));
				
			}
		}
		return dic_yl;	
	}	
}