package sample.ji.zhen.ke.xue;
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
	public Map<String,Object> dic_bz;
	public Map<String,Object> dic_gn;
	public Map<String,Object> dic_lx;
	public Map<String,Object> dic_by;
	public Map<String,Object> dic_wx;
	public Map<String,Object> dic_bl;
	public Map<String,Object> dic_lc;
	public Map<String,Object> dic_sy;
	public Map<String,Object> dic_zd;
	public Map<String,Object> dic_bf;
	public Map<String,Object> dic_zl;
	public Map<String,Object> dic_jy;
	public Map<String,Object> dic_yh;
	public Map<String,Object> dic_yf;
	public Map<String,Object> dic_yx;
	public List<String> txtToList() throws IOException{
		List<String> TEMP_list = new ArrayList<>();
		InputStream in = getClass().getResourceAsStream("jzkx.txt");
		BufferedReader cReader = new BufferedReader(new InputStreamReader(in, "UTF8"));  
		String ctempString = null; 
		while ((ctempString = cReader.readLine()) != null) {  
			if(!ctempString.replace(" ","").equals("")) {
				if(ctempString.contains("〔")&&ctempString.contains("〕")) {
					ctempString = "〔〔"+ctempString;
				}
				TEMP_list.add(ctempString);
			}
		}
		cReader.close();
		return TEMP_list;
	}
	
	public Map<String, Object> listToMap(List<String> dic_list) throws IOException{
		Map<String,Object> dic_map = new ConcurrentHashMap<String, Object>();
		for(int i = 0;i < dic_list.size(); i++) {
			if(dic_list.get(i).contains("病症段落")) {
				String med_name = dic_list.get(i).replace("病症段落", "")+dic_list.get(i+1)+dic_list.get(i+2);
				String med_text = "" + med_name;
				int j = i;				
				while(++j< dic_list.size() && !(dic_list.get(j).contains("病症段落"))) {
					med_text += dic_list.get(j);
					//j+=1;
				}
				dic_map.put(med_name.replaceAll("\\s*", "").replace("〔","").replace("〕",":"), (med_text+"〔〔").replace("\\s+", " "));
			}
		}
		return dic_map;
	}

	public Map<String, Object> mapToMap_zl(Map<String, Object> dic_map) {
		Map<String,Object> dic_zl = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name).toString().replace("\n", "");	
			Pattern p = Pattern.compile("〔治疗(.*?)〔〔"); 
			Matcher m = p.matcher(med_text); 
			Pattern p1 = Pattern.compile("治疗〕(.*?)〔〔"); 
			Matcher m1 = p1.matcher(med_text); 
			Pattern p2 = Pattern.compile("处理〕(.*?)〔〔"); 
			Matcher m2 = p2.matcher(med_text); 
			Pattern p3 = Pattern.compile("〔救治(.*?)〔〔"); 
			Matcher m3 = p3.matcher(med_text); 
			String temp ="";
			if (m.find()) {
				temp=m.group(0);		
			}else if(m1.find()) {
				temp=m1.group(0);	
			}else if(m2.find()) {
				temp=m2.group(0);	
			}else if(m3.find()) {
				temp=m3.group(0);	
			}
			dic_zl.put(med_name.replaceAll("\\s*", "").replace("〔","").replace("〕",":"), temp.replaceAll("\\s*", "").replace("〔","").replace("〕",":"));		
		}
		return dic_zl;
	}

	public Map<String, Object> mapToMap_zd(Map<String, Object> dic_map) {
		Map<String,Object> dic_zd = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name).toString().replace("\n", "");	
			Pattern p = Pattern.compile("〔诊断(.*?)〔〔"); 
			Matcher m = p.matcher(med_text); 
			Pattern p1 = Pattern.compile("诊断〕(.*?)〔〔"); 
			Matcher m1 = p1.matcher(med_text); 
			Pattern p2 = Pattern.compile("方法〕(.*?)〔〔"); 
			Matcher m2 = p2.matcher(med_text); 
			String temp ="";
			if (m.find()) {
				temp=m.group(0);		
			}else if(m1.find()) {
				temp=m1.group(0);	
			}else if(m2.find()) {
				temp=m2.group(0);	
			}
			dic_zd.put(med_name.replaceAll("\\s*", "").replace("〔","").replace("〕",":"), temp.replaceAll("\\s*", "").replace("〔","").replace("〕",":"));
		}
		return dic_zd;
	}

	public Map<String, Object> mapToMap_bf(Map<String, Object> dic_map) {
		Map<String,Object> dic_bf = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name).toString().replace("\n", "");	
			Pattern p = Pattern.compile("〔并发(.*?)〔〔"); 
			Matcher m = p.matcher(med_text); 
			Pattern p1 = Pattern.compile("并发症〕(.*?)〔〔"); 
			Matcher m1 = p1.matcher(med_text); 
			String temp ="";
			if (m.find()) {
				temp=m.group(0);		
			}else if(m1.find()) {
				temp=m1.group(0);	
			}
			dic_bf.put(med_name.replaceAll("\\s*", "").replace("〔","").replace("〕",":"), temp.replaceAll("\\s*", "").replace("〔","").replace("〕",":"));
		}
		return dic_bf;
	}

	public Map<String, Object> mapToMap_jy(Map<String, Object> dic_map) {
		Map<String,Object> dic_jy = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name).toString().replace("\n", "");	
			Pattern p = Pattern.compile("〔教育(.*?)〔〔"); 
			Matcher m = p.matcher(med_text); 
			Pattern p1 = Pattern.compile("〔处置(.*?)〔〔"); 
			Matcher m1 = p1.matcher(med_text); 
			String temp ="";
			if (m.find()) {
				temp = m.group(0);		
			}else if (m1.find()) {
				temp = m1.group(0);		
			}
			dic_jy.put(med_name.replaceAll("\\s*", "").replace("〔","").replace("〕",":"), temp.replaceAll("\\s*", "").replace("〔","").replace("〕",":"));
		}
		return dic_jy;
	}

	public Map<String, Object> mapToMap_yh(Map<String, Object> dic_map) {
		Map<String,Object> dic_yh = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name).toString().replace("\n", "");	
			Pattern p = Pattern.compile("〔预后(.*?)〔〔"); 
			Matcher m = p.matcher(med_text); 
			Pattern p1 = Pattern.compile("预后〕(.*?)〔〔"); 
			Matcher m1 = p1.matcher(med_text); 
			String temp ="";
			if (m.find()) {
				temp=m.group(0);		
			}else if(m1.find()) {
				temp=m1.group(0);	
			}
			dic_yh.put(med_name.replaceAll("\\s*", "").replace("〔","").replace("〕",":"), temp.replaceAll("\\s*", "").replace("〔","").replace("〕",":"));
		}
		return dic_yh;
	}

	public Map<String, Object> mapToMap_yf(Map<String, Object> dic_map) {
		Map<String,Object> dic_yf = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name).toString().replace("\n", "");	
			Pattern p = Pattern.compile("〔预防(.*?)〔〔"); 
			Matcher m = p.matcher(med_text); 
			Pattern p1 = Pattern.compile("预防〕(.*?)〔〔"); 
			Matcher m1 = p1.matcher(med_text); 
			String temp ="";
			if (m.find()) {
				temp=m.group(0);
			}else if(m1.find()) {
				temp=m1.group(0);
			}
			dic_yf.put(med_name.replaceAll("\\s*", "").replace("〔","").replace("〕",":"), temp.replaceAll("\\s*", "").replace("〔","").replace("〕",":"));
		}
		return dic_yf;
	}

	public Map<String, Object> mapToMap_yx(Map<String, Object> dic_map) {
		Map<String,Object> dic_yx = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name).toString().replace("\n", "");	
			Pattern p = Pattern.compile("〔影像(.*?)〔〔"); 
			Matcher m = p.matcher(med_text); 
			String temp ="";
			if (m.find()) {
				temp=m.group(0);		
			}
			dic_yx.put(med_name.replaceAll("\\s*", "").replace("〔","").replace("〕",":"), temp.replaceAll("\\s*", "").replace("〔","").replace("〕",":"));
		}
		return dic_yx;
	}

	public Map<String, Object> mapToMap_sy(Map<String, Object> dic_map) {
		Map<String,Object> dic_sy = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name).toString().replace("\n", "");	
			Pattern p = Pattern.compile("〔实验(.*?)〔〔"); 
			Matcher m = p.matcher(med_text); 
			Pattern p1 = Pattern.compile("检查〕(.*?)〔〔"); 
			Matcher m1 = p1.matcher(med_text); 
			String temp ="";
			if (m.find()) {
				temp=m.group(0);
			}else if(m1.find()) {
				temp=m1.group(0);
			}
			dic_sy.put(med_name.replaceAll("\\s*", "").replace("〔","").replace("〕",":"), temp.replaceAll("\\s*", "").replace("〔","").replace("〕",":"));
		}
		return dic_sy;
	}

	public Map<String, Object> mapToMap_lc(Map<String, Object> dic_map) {
		Map<String,Object> dic_lc = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name).toString().replace("\n", "");	
			Pattern p = Pattern.compile("〔临床(.*?)〔〔"); 
			Matcher m = p.matcher(med_text); 
			Pattern p1 = Pattern.compile("临床〕(.*?)〔〔"); 
			Matcher m1 = p1.matcher(med_text); 
			String temp ="";
			if (m.find()) {
				temp=m.group(0);
			}else if(m1.find()) {
				temp=m1.group(0);
			}
			dic_lc.put(med_name.replaceAll("\\s*", "").replace("〔","").replace("〕",":"), temp.replaceAll("\\s*", "").replace("〔","").replace("〕",":"));
		}
		return dic_lc;
	}

	public Map<String, Object> mapToMap_bl(Map<String, Object> dic_map) {
		Map<String,Object> dic_bl = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name).toString().replace("\n", "");	
			Pattern p = Pattern.compile("〔病理(.*?)〔〔"); 
			Matcher m = p.matcher(med_text); 
			Pattern p1 = Pattern.compile("病理〕(.*?)〔〔"); 
			Matcher m1 = p1.matcher(med_text); 
			Pattern p2 = Pattern.compile("分类〕(.*?)〔〔"); 
			Matcher m2 = p2.matcher(med_text); 
			Pattern p3 = Pattern.compile("类型〕(.*?)〔〔"); 
			Matcher m3 = p3.matcher(med_text); 
			Pattern p4 = Pattern.compile("生理〕(.*?)〔〔"); 
			Matcher m4 = p4.matcher(med_text); 
			Pattern p5 = Pattern.compile("种类〕(.*?)〔〔"); 
			Matcher m5 = p5.matcher(med_text); 
			String temp ="";
			if (m.find()) {
				temp=m.group(0);
			}else if(m1.find()) {
				temp=m1.group(0);
			}else if(m2.find()) {
				temp=m2.group(0);
			}else if(m3.find()) {
				temp=m3.group(0);
			}else if(m4.find()) {
				temp=m4.group(0);
			}else if(m5.find()) {
				temp=m5.group(0);
			}
			dic_bl.put(med_name.replaceAll("\\s*", "").replace("〔","").replace("〕",":"), temp.replaceAll("\\s*", "").replace("〔","").replace("〕",":"));
		}
		return dic_bl;
	}

	public Map<String, Object> mapToMap_wx(Map<String, Object> dic_map) {
		Map<String,Object> dic_wx = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name).toString().replace("\n", "");	
			Pattern p = Pattern.compile("〔危险(.*?)〔〔"); 
			Matcher m = p.matcher(med_text); 
			Pattern p1 = Pattern.compile("因素〕(.*?)〔〔"); 
			Matcher m1 = p1.matcher(med_text); 
			Pattern p2 = Pattern.compile("反应〕(.*?)〔〔"); 
			Matcher m2 = p2.matcher(med_text); 
			Pattern p3 = Pattern.compile("〔注意(.*?)〔〔"); 
			Matcher m3 = p3.matcher(med_text); 
			String temp ="";
			if (m.find()) {
				temp=m.group(0);
			}else if(m1.find()) {
				temp=m1.group(0);
			}else if(m2.find()) {
				temp=m2.group(0);
			}else if(m3.find()) {
				temp=m3.group(0);
			}
			dic_wx.put(med_name.replaceAll("\\s*", "").replace("〔","").replace("〕",":"), temp.replaceAll("\\s*", "").replace("〔","").replace("〕",":"));
		}
		return dic_wx;
	}

	public Map<String, Object> mapToMap_by(Map<String, Object> dic_map) {
		Map<String,Object> dic_by = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name).toString().replace("\n", "");	
			Pattern p = Pattern.compile("〔病因(.*?)〔〔"); 
			Matcher m = p.matcher(med_text); 
			Pattern p1 = Pattern.compile("病因〕(.*?)〔〔"); 
			Matcher m1 = p1.matcher(med_text); 
			Pattern p2 = Pattern.compile("〔发病(.*?)〔〔"); 
			Matcher m2 = p2.matcher(med_text); 
			Pattern p3 = Pattern.compile("机制〕(.*?)〔〔"); 
			Matcher m3 = p3.matcher(med_text); 
			
			String temp ="";
			if (m.find()) {
				temp=m.group(0);
			}else if(m1.find()) {
				temp=m1.group(0);
			}else if(m2.find()) {
				temp=m2.group(0);
			}else if(m3.find()) {
				temp=m3.group(0);
			}
			dic_by.put(med_name.replaceAll("\\s*", "").replace("〔","").replace("〕",":"), temp.replaceAll("\\s*", "").replace("〔","").replace("〕",":"));
		}
		return dic_by;
	}

	public Map<String, Object> mapToMap_lx(Map<String, Object> dic_map) {
		Map<String,Object> dic_lx = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name).toString().replace("\n", "");	
			Pattern p = Pattern.compile("〔流行(.*?)〔〔"); 
			Matcher m = p.matcher(med_text); 
			String temp ="";
			if (m.find()) {
				temp=m.group(0);		
			}
			dic_lx.put(med_name.replaceAll("\\s*", "").replace("〔","").replace("〕",":"), temp.replaceAll("\\s*", "").replace("〔","").replace("〕",":"));
		}
		return dic_lx;
	}

	public Map<String, Object> mapToMap_gn(Map<String, Object> dic_map) {
		Map<String,Object> dic_gn = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name).toString().replace("\n", "");	
			Pattern p = Pattern.compile("〔概念(.*?)〔〔"); 
			Pattern p1 = Pattern.compile("概念〕(.*?)〔〔"); 
			Pattern p2 = Pattern.compile("解剖〕(.*?)〔〔"); 
			Pattern p3 = Pattern.compile("〔概述(.*?)〔〔"); 
			Pattern p4 = Pattern.compile("概述〕(.*?)〔〔"); 
			Matcher m = p.matcher(med_text); 
			Matcher m1 = p1.matcher(med_text); 
			Matcher m2 = p2.matcher(med_text); 
			Matcher m3 = p3.matcher(med_text); 
			Matcher m4 = p4.matcher(med_text); 
			String temp ="";
			if (m.find()) {
				temp=m.group(0);
			}else if(m1.find()) {
				temp=m1.group(0);
			}else if(m2.find()) {
				temp=m2.group(0);
			}else if(m3.find()) {
				temp=m3.group(0);
			}else if(m4.find()) {
				temp=m4.group(0);
			}
			dic_gn.put(med_name.replaceAll("\\s*", "").replace("〔","").replace("〕",":"), temp.replaceAll("\\s*", "").replace("〔","").replace("〕",":"));
		}
		return dic_gn;
	}
}