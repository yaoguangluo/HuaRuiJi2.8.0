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
public class dictionaryOld{	
	public  List<String> dic_list;
	public  Map<String,Object> dic_map;
	public  Map<String,Object> dic_li;
	public  Map<String,Object> dic_hai;
	public  Map<String,Object> dic_xz;
	public  Map<String,Object> dic_xw;
	public  Map<String,Object> dic_jm;
	public  Map<String,Object> dic_ya;
	public  Map<String,Object> dic_cy;
	public  Map<String,Object> dic_cj;
	public  Map<String,Object> dic_jj;
	public  Map<String,Object> dic_zf;
	public List<String> txtToList() throws IOException{
		List<String> dic_list = new ArrayList<>();
		InputStream in = getClass().getResourceAsStream("c.txt");
		BufferedReader cReader = new BufferedReader(new InputStreamReader(in));  
		String ctempString = null; 
		while ((ctempString = cReader.readLine()) != null) {  
			if(!ctempString.replace(" ","").equals(""))
				dic_list.add(ctempString);
		}
		cReader.close();
		
		in = getClass().getResourceAsStream("本经疏证-清-邹谢.txt");
		cReader = new BufferedReader(new InputStreamReader(in));  
		ctempString = null; 
		while ((ctempString = cReader.readLine()) != null) {  
			if(!ctempString.replace(" ","").equals(""))
				dic_list.add(ctempString);
		}
		cReader.close();
		
		in = getClass().getResourceAsStream("食疗本草.txt");
		cReader = new BufferedReader(new InputStreamReader(in));  
		ctempString = null; 
		while ((ctempString = cReader.readLine()) != null) {  
			if(!ctempString.replace(" ","").equals(""))
				dic_list.add(ctempString);
		}
		cReader.close();
		return dic_list;
	}
	
	@SuppressWarnings("unused")
	public Map<String, Object> listToMap(List<String> dic_list) throws IOException{
		Map<String,Object> dic_map = new ConcurrentHashMap<String, Object>();
		for(int i = 0; i < dic_list.size(); i++) {
			if(dic_list.get(i).contains("摘要")) {
				String med_name = dic_list.get(i+1);
				String med_text = "";
				int j = i;				
				while(++j < dic_list.size() && !dic_list.get(j).contains("摘要")
						&&!dic_list.get(j).contains("^^")) {
					med_text += "\n"+dic_list.get(j);
				}
				dic_map.put(med_name.replaceAll(" ", "").replace("〔","").replace("〕",":")
						, med_text+"〕〕");
			}
			
			if(dic_list.get(i).contains("^^")) {
				String med_name = dic_list.get(i+1);
				String med_text = "";
				int j = i;				
				while(++j < dic_list.size() && !dic_list.get(j).contains("^^")
						&& !dic_list.get(j).contains("<篇名>")) {
					med_text += "\n"+dic_list.get(j);
				}
				if(!dic_map.containsKey(med_name.replaceAll(" ", "").replace("〔","")
						.replace("〕",":"))) {
					dic_map.put(med_name.replaceAll(" ", "").replace("〔","").replace("〕",":")
							, med_text+"〕〕");
				} 
			}
			if(dic_list.get(i).contains("<篇名>")) {
				String med_name = dic_list.get(i).replace("<篇名>", "");
				String med_text = "" + med_name;
				med_name=med_name.replaceAll("〈(.*?)〉", "").replaceAll("（(.*?)）", "");
				int j = i;				
				while(++j < dic_list.size() && !dic_list.get(j).contains("<篇名>")) {
					med_text += "\n"+dic_list.get(j);
				}
				if(!dic_map.containsKey(med_name.replaceAll(" ", "").replace("〔","")
						.replace("〕",":"))) {
					dic_map.put(med_name.replaceAll(" ", "").replace("〔","").replace("〕",":")
							, med_text+"〕〕");
				} 
			}
		}
		return dic_map;
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
			Pattern p=Pattern.compile("〔利〕(.*?)〔修治〕"); 
			Pattern p1=Pattern.compile("功专(.*?)恶"); 
			Pattern p2=Pattern.compile("功专(.*?)畏"); 
			Pattern p3=Pattern.compile("功专(.*?)反"); 
			Pattern p4=Pattern.compile("功专(.*?)卷"); 
			Pattern p7=Pattern.compile("功专(.*?)忌"); 
			Pattern p5=Pattern.compile("主(.*?)。"); 
			Pattern p6=Pattern.compile("内容(.*?)〕〕"); 
			Matcher m = p.matcher(med_text); 
			Matcher m4 = p4.matcher(med_text); 
			Matcher m5 = p5.matcher(med_text); 
			Matcher m6 = p6.matcher(med_text);
			Matcher m7 = p7.matcher(med_text); 
			String temp = "";
			if (m.find()) {
				temp=m.group(0);
				temp=temp.replace("〔修治〕", ".");
			}
			if(m4.find()){
				String deter=m4.group(0);
				deter=deter.replace("卷", ".");
				Matcher m1=p1.matcher(deter); 
				Matcher m2=p2.matcher(deter); 
				Matcher m3=p3.matcher(deter); 	
				if(m1.find()){
					temp+=m1.group(0);
					temp=temp.replace("恶", ".");
				}else if(m2.find()){
					temp+=m2.group(0);
					temp=temp.replace("畏", ".");
				}else if(m3.find()){
					temp+=m3.group(0);
					temp=temp.replace("反", ".");
				}else if(m7.find()){
					temp+=m7.group(0);
					temp=temp.replace("忌", ".");
				}else {
					temp+=deter;
				}
			}
			if(temp.equals("")) {
				if (m5.find()) {
					temp=m5.group(0);
				}
			}
			if(temp.equals("")) {
				if (m6.find()) {
					temp=m6.group(0);
				}
			}
			
			if(!dic_li.containsKey(med_name.replaceAll("\\s*", "").replace("〔","")
					.replace("〕",":"))) {
				dic_li.put(med_name.replaceAll("\\s*", "").replace("〔","")
						.replace("〕",":"), temp.replaceAll("\\s*", "").replace("〔","")
						.replace("〕",":"));
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
			if(med_name.contains("何首乌")) {
				int i22=0;
				i22+=1;
			}
			String med_text = dic_map.get(med_name.trim()).toString().replace("\n", "");	
			Pattern p=Pattern.compile("〔害〕(.*?)〔利〕"); 
			
			Pattern p1=Pattern.compile("恶(.*?)〔利〕"); 
			Pattern p2=Pattern.compile("畏(.*?)〔利〕"); 
			Pattern p3=Pattern.compile("反(.*?)〔利〕"); 
			Pattern p4=Pattern.compile("忌(.*?)〔利〕"); 
			Pattern p5=Pattern.compile("恶(.*?)卷"); 
			Pattern p6=Pattern.compile("畏(.*?)卷"); 
			Pattern p7=Pattern.compile("反(.*?)卷"); 
			Pattern p8=Pattern.compile("忌(.*?)卷"); 
			Pattern p9=Pattern.compile("恶(.*?)）"); 
			Matcher m=p.matcher(med_text); 
			Matcher m1=p1.matcher(med_text); 
			Matcher m2=p2.matcher(med_text); 
			Matcher m3=p3.matcher(med_text); 	
			Matcher m4=p4.matcher(med_text); 
			Matcher m5=p5.matcher(med_text);
			Matcher m6=p6.matcher(med_text); 
			Matcher m7=p7.matcher(med_text); 	
			Matcher m8=p8.matcher(med_text); 
			Matcher m9=p9.matcher(med_text); 
			
			String temp ="";
			if (m.find()) {
				temp=m.group(0);
				temp=temp.replace("〔利〕", ".");
			}
			if(m1.find()){
				String temp_s = m1.group(0);
				temp_s=temp_s.replace("〔利〕", ".");
				temp+=temp_s;
			}else if(m2.find()){
				String temp_s = m2.group(0);
				temp_s=temp_s.replace("〔利〕", ".");
				temp+=temp_s;
			}else if(m3.find()){
				String temp_s = m3.group(0);
				temp_s=temp_s.replace("〔利〕", ".");
				temp+=temp_s;
			}else if(m4.find()){
				String temp_s = m4.group(0);
				temp_s=temp_s.replace("〔利〕", ".");
				temp+=temp_s;
			}else if(m5.find()){
				String temp_s = m5.group(0);
				Pattern p55=Pattern.compile("恶(.*?)。"); 
				Matcher m55=p55.matcher(temp_s);
				if(m55.find()){
					temp += m55.group(0);
				}else {
					temp += temp_s.replace("卷", ".");
				}
			}else if(m6.find()){
				String temp_s = m6.group(0);
				Pattern p55=Pattern.compile("畏(.*?)。"); 
				Matcher m55=p55.matcher(temp_s);
				if(m55.find()){
					temp += m55.group(0);
				}else {
					temp += temp_s.replace("卷", ".");
				}
			}else if(m7.find()){
				String temp_s = m7.group(0);
				Pattern p55=Pattern.compile("反(.*?)。"); 
				Matcher m55=p55.matcher(temp_s);
				if(m55.find()){
					temp += m55.group(0);
				}else {
					temp += temp_s.replace("卷", ".");
				}
			}else if(m8.find()){
				String temp_s = m8.group(0);
				Pattern p55=Pattern.compile("忌(.*?)。"); 
				Matcher m55=p55.matcher(temp_s);
				if(m55.find()){
					temp += m55.group(0);
				}else {
					temp += temp_s.replace("卷", ".");
				}
			}else{
			}
			
			if(temp.equals("")) {
				if (m9.find()) {
					temp=m9.group(0);
				}
			}
			if(!dic_hai.containsKey(med_name.replaceAll("\\s*", "").replace("〔","")
					.replace("〕",":"))) {
				dic_hai.put(med_name.replaceAll("\\s*", "").replace("〔","")
						.replace("〕",":"), temp.replaceAll("\\s*", "").replace("〔","")
						.replace("〕",":"));
				
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
			Pattern p=Pattern.compile("〔修治〕(.*?)崇源"); 
			Matcher m=p.matcher(med_text); 
			Pattern p1=Pattern.compile("〔修治〕(.*?)经解"); 
			Matcher m1=p1.matcher(med_text); 
			Pattern p2=Pattern.compile("〔修治〕(.*?)卷"); 
			Matcher m2=p2.matcher(med_text);	
			Pattern p3=Pattern.compile("〔修治〕(.*?)〕〕"); 
			Matcher m3=p3.matcher(med_text);	
			
			Pattern p4=Pattern.compile("\\#\\#(.*?)〕〕"); 
			Matcher m4=p4.matcher(med_text);	
			
			String temp ="";
			if (m.find()) {
				temp=m.group(0);
				temp=temp.replace("崇源", ".");
			}else if(m1.find()){
				temp+=m1.group(0);
				temp=temp.replace("经解", ".");
			}else if(m2.find()){
				temp=m2.group(0);
			}else if(m3.find()){
				temp=m3.group(0);
			}else if (m4.find()) {
				temp=m4.group(0);
			}
			if(!dic_xz.containsKey(med_name.replaceAll("\\s*", "").replace("〔", "")
					.replace("〕",":"))) {
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
			Pattern p=Pattern.compile("制方(.*?)卷"); 
			//med_text.m.matches("/〔利〕*〔修治〕/");
			Matcher m=p.matcher(med_text); 		
			String temp ="";
			if (m.find()) {
				temp=m.group(0).replace("卷", "");
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
			Pattern p = Pattern.compile("常见药品(.*?)药品末尾");
			Matcher m = p.matcher(med_text); 		
			String temp = "";
			if (m.find()) {
				temp = m.group(0).replace("药品末尾", "");
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
			Pattern p=Pattern.compile("经解(.*?)$"); 
			Matcher m=p.matcher(med_text); 		
			String temp ="";
			if (m.find()) {
				temp=m.group(0);
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
			Pattern p=Pattern.compile("崇源(.*?)经解"); 
			Pattern p1=Pattern.compile("崇源(.*?)$"); 
			Matcher m=p.matcher(med_text); 
			Matcher m1=p1.matcher(med_text); 		
			String temp ="";
			if (m.find()) {
				temp=m.group(0);
				temp=temp.replace("经解", ".");
			}else if(m1.find()){
				temp+=m1.group(0);
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
			Pattern p=Pattern.compile("按(^：)(.*?)〔利〕"); 
			Pattern p1=Pattern.compile("愚按：(.*?)经解"); 
			Pattern p2=Pattern.compile("愚按：(.*?)$"); 
			Matcher m=p.matcher(med_text); 
			Matcher m1=p1.matcher(med_text); 
			Matcher m2=p2.matcher(med_text); 
			String temp ="";
			if (m.find()) {
				temp=m.group(0);
				temp=temp.replace("〔利〕", ".");
			}
			if(m1.find()){
				temp+=m1.group(0);
				temp=temp.replace("经解", ".");
			}else if(m2.find()){
				temp=m2.group(0);
				temp=temp.replace("摘要", ".");
			}else{
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
			Pattern p=Pattern.compile("入(.*?)经"); 
			Matcher m=p.matcher(med_text); 
			String temp ="";
			if (m.find()) {
				temp=m.group(0);
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
			Pattern p=Pattern.compile("味(.*?)入"); 
			Matcher m=p.matcher(med_text); 	
			Pattern p1=Pattern.compile("味(.*?)。"); 
			Matcher m1=p1.matcher(med_text); 
			Pattern p2=Pattern.compile("味(.*?)主"); 
			Matcher m2=p2.matcher(med_text); 
			
			Pattern p3=Pattern.compile("〈(.*?)〉"); 
			Matcher m3=p3.matcher(med_text.replace("<篇名>", "")); 
			
			String temp = "";
			if (m.find()) {
				temp = m.group(0).replace("入", "");
			}
			if (m1.find()) {
				temp = m1.group(0).replace("。", "");
			}
			if(temp.equals("")) {
				if (m2.find()) {
					temp = m2.group(0).replace("主", "");
				}
			}
			
			if(temp.equals("")) {
				if (m3.find()) {
					temp = m3.group(0);
				}
			}
			if(!dic_xw.containsKey(med_name.replaceAll("\\s*", "").replace("〔","")
					.replace("〕",":"))) {
				dic_xw.put(med_name.replaceAll("\\s*", "").replace("〔","").replace("〕",":")
						, temp.replace("经络", "").replaceAll("\\s*", "").replace("〔","")
						.replace("〕",":"));
				
			}
		}
		return dic_xw;
	}

	public Map<String, Object> mapToMap_yl(Map<String, Object> dic_map, Map<String, Object> dic_xw,
			Map<String, Object> dic_li, Map<String, Object> dic_xz
			, Map<String, Object> dic_jm) throws IOException {
		Map<String,Object> dic_yl = new java.util.concurrent.ConcurrentHashMap<String, Object>();
		InputStream in = getClass().getResourceAsStream("中药学第九版最全表格(含临床应用).txt"); 
		BufferedReader cReader = new BufferedReader(new InputStreamReader(in, "UTF-8"));  
		String ctempString = null; 
		String temp="";
		cReader.readLine();
		while ((ctempString = cReader.readLine()) != null) {  
			if(ctempString.replace(" ", "").equals("")) {
				if(!temp.equals("")) {
					String[] ts = temp.replace("\r","").replace("\n", "").replace("\t", "").split("\\^");
					if(!dic_map.containsKey(ts[0])) {
						dic_map.put(ts[0], temp);
					}else {
						dic_map.put(ts[0], dic_map.get(ts[0]) + "人卫九"+ temp);
					}
					
					if(!dic_xw.containsKey(ts[0])) {
						dic_xw.put(ts[0], ts[1]);
					}else {
						dic_xw.put(ts[0], dic_xw.get(ts[0]) + "人卫九"+ ts[1]);
					}
					
					String li = ts[3];
					for(int i = 5; i < ts.length; i++) {
						li += ts[i];
					}
					if(!dic_li.containsKey(ts[0])) {
						dic_li.put(ts[0], li);
					}else {
						dic_li.put(ts[0], dic_li.get(ts[0]) + "人卫九"+ li);
					}
					if(!dic_jm.containsKey(ts[0])) {
						dic_jm.put(ts[0], ts[2]);
					}else {
						dic_jm.put(ts[0], dic_jm.get(ts[0]) + "人卫九"+ ts[2]);
					}
					if(!dic_yl.containsKey(ts[0])) {
						dic_yl.put(ts[0], ts[4]);
					}else {
						dic_yl.put(ts[0], dic_yl.get(ts[0]) + "人卫九"+ li);
					}
					temp = "";
				}
			}
			temp += ctempString;
		}
		cReader.close();
		return dic_yl;	
	}	
}