package sample.zynkx;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.List;
import java.util.Map;
public class dictionary{	
	public List<String> dic_list;
	public Map<String,Object> dic_map;
	public Map<String,Object> dic_chu_fang;
	public List<String> txtToList() throws IOException{
		List<String> TEMP_list = new ArrayList<>();
		InputStream in = getClass().getResourceAsStream("n.txt");
		BufferedReader cReader = new BufferedReader(new InputStreamReader(in));  
		String ctempString = null; 
		while ((ctempString = cReader.readLine()) != null) {  
			if(!ctempString.replace(" ", "").equals(""))
				TEMP_list.add(ctempString);
		}
		cReader.close();
		
		in = getClass().getResourceAsStream("wbx142f.txt");
		cReader = new BufferedReader(new InputStreamReader(in, "GBK"));  
		ctempString = null; 
		while ((ctempString = cReader.readLine()) != null) {  
			if(!ctempString.replace(" ","").equals(""))
				TEMP_list.add(ctempString);
		}
		cReader.close();
		
		in = getClass().getResourceAsStream("中医方剂学.txt");
		cReader = new BufferedReader(new InputStreamReader(in, "GBK"));  
		ctempString = null; 
		while ((ctempString = cReader.readLine()) != null) {  
			if(!ctempString.replace(" ","").equals(""))
				TEMP_list.add(ctempString);
		}
		cReader.close();
		
		return TEMP_list;
	}
	
	public Map<String, Object> listToMap(List<String> dic_list) throws IOException{
		Map<String,Object> dic_map = new ConcurrentHashMap<String, Object>();
		for(int i = 0; i < dic_list.size(); i++) {
			if(dic_list.get(i).contains("^")) {
				String med_name = dic_list.get(i);
				String med_text = ""+med_name;
				int j = i;				
				while(++j< dic_list.size() && !dic_list.get(j).contains("^")) {
					med_text += dic_list.get(j);
				}
				dic_map.put(med_name.replaceAll("\\s*", "").replace("〔","").replace("〕",":"), med_text.replaceAll("\\s*", "").replace("〔","").replace("〕",":"));
			}
			
			if(dic_list.get(i).contains("..")) {
				String med_name = dic_list.get(i+1);
				String med_text = ""+med_name;
				med_text += dic_list.get(i);
				int j = i+1;				
				while(j< dic_list.size() && !dic_list.get(j).contains("..")) {
					med_text += dic_list.get(j++);
				}
				dic_map.put(med_name.replaceAll("\\s*", "").replace("〔","").replace("〕",":"), med_text.replaceAll("\\s*", "").replace("〔","").replace("〕",":"));
			}
			
			if(dic_list.get(i).contains("^^")) {
				String med_name = dic_list.get(i+1);
				String med_text = "" + med_name;
				med_text += dic_list.get(i);
				int j = i+1;				
				while(j< dic_list.size() && !dic_list.get(j).contains("^^")) {
					med_text += dic_list.get(j++);
				}
				dic_map.put(med_name.replaceAll("\\s*", "").replace("〔","").replace("〕",":"), med_text.replaceAll("\\s*", "").replace("〔","").replace("〕",":"));
			}
		}
		return dic_map;
	}
	
	public Map<String, Object> MapToChuFang(List<String> dic_list,Map<String, Object> dic_map) throws IOException{
		Map<String,Object> dic_chu_fang = new ConcurrentHashMap<String, Object>();
		for(int i = 0; i < dic_list.size(); i++) {
			if(dic_list.get(i).contains("^")) {
				String med_name = dic_list.get(i);
				if(dic_map.containsKey(med_name)){
					String temp = dic_map.get(med_name).toString();
					String med_text = "";
					for(int j=0; j<temp.length()-2; j++) {
						if(("" + temp.charAt(j)).equals("-")&&(""+temp.charAt(j+1)).equals("-")&&(""+temp.charAt(j+2)).equals("-")) {
							for(int k=j+2; k<temp.length()-2; k++) {
								if(("" + temp.charAt(k)).equals("-")&&(""+temp.charAt(k+1)).equals("-")&&(""+temp.charAt(k+2)).equals("-")) {
									break;
									}
								med_text+=temp.charAt(k);
							}
						}
					}
					dic_chu_fang.put(med_name.replaceAll("\\s*", "").replace("〔","").replace("〕",":"), med_text.replaceAll("\\s*", "").replace("〔","").replace("〕",":"));
				}
			}
		}
		
		Iterator<String> it = dic_map.keySet().iterator();
		while(it.hasNext()) {
			String name = it.next();
			String temp = dic_map.get(name).toString();
			Pattern p = Pattern.compile("处方(.*?)应用"); 
			Pattern p1 = Pattern.compile("处方(.*?)$"); 
			Matcher m = p.matcher(temp); 
			Matcher m1 = p1.matcher(temp); 
			if (m.find()) {
				dic_chu_fang.put(name, m.group(0));
			}else if (m1.find()) {
				dic_chu_fang.put(name, m1.group(0));
			}
		}
		
		it = dic_map.keySet().iterator();
		while(it.hasNext()) {
			String name = it.next();
			String temp = dic_map.get(name).toString();
			Pattern p = Pattern.compile("处方(.*?)应用"); 
			Pattern p1 = Pattern.compile("处方(.*?)$"); 
			Pattern p2 = Pattern.compile("组成：(.*?)功用："); 
			Pattern p3 = Pattern.compile("组成：(.*?)$："); 
			Matcher m = p.matcher(temp); 
			Matcher m1 = p1.matcher(temp); 
			Matcher m2 = p2.matcher(temp); 
			Matcher m3 = p3.matcher(temp); 
			if (m.find()) {
				dic_chu_fang.put(name, m.group(0));
			}else if (m1.find()) {
				dic_chu_fang.put(name, m1.group(0));
			}else if (m2.find()) {
				dic_chu_fang.put(name, m2.group(0));
			}else if (m3.find()) {
				dic_chu_fang.put(name, m3.group(0));
			}
		}
		return dic_chu_fang;
	}

	public Map<String, Object> MapTomz(List<String> dic_list, Map<String, Object> dic_map) {
		Map<String,Object> dic_mz = new ConcurrentHashMap<String, Object>();
		Iterator<String> it = dic_map.keySet().iterator();
		while(it.hasNext()) {
			String name = it.next();
			String temp = dic_map.get(name).toString();
			Pattern p = Pattern.compile("脉症(.*?)治法"); 
			Pattern p1 = Pattern.compile("脉症(.*?)$"); 
			Matcher m = p.matcher(temp); 
			Matcher m1 = p1.matcher(temp); 
			if (m.find()) {
				dic_mz.put(name, m.group(0));
			}else if (m1.find()) {
				dic_mz.put(name, m1.group(0));
			}
		}
		return dic_mz;
	}

	public Map<String, Object> MapTozf(List<String> dic_list, Map<String, Object> dic_map) {
		Map<String,Object> dic_zf = new ConcurrentHashMap<String, Object>();
		Iterator<String> it = dic_map.keySet().iterator();
		while(it.hasNext()) {
			String name = it.next();
			String temp = dic_map.get(name).toString();
			Pattern p = Pattern.compile("治法(.*?)处方"); 
			Pattern p1 = Pattern.compile("治法(.*?)$"); 
			Pattern p2 = Pattern.compile("方解：(.*?)使用："); 
			Pattern p3 = Pattern.compile("方解：(.*?)$："); 
			Matcher m = p.matcher(temp); 
			Matcher m1 = p1.matcher(temp); 
			Matcher m2 = p2.matcher(temp); 
			Matcher m3 = p3.matcher(temp); 
			if (m.find()) {
				dic_zf.put(name, m.group(0));
			}else if (m1.find()) {
				dic_zf.put(name, m1.group(0));
			}else if (m2.find()) {
				dic_zf.put(name, m2.group(0));
			}else if (m3.find()) {
				dic_zf.put(name, m3.group(0));
			}
		}
		return dic_zf;
	}

	public Map<String, Object> MapToyy(List<String> dic_list, Map<String, Object> dic_map) {
		Map<String,Object> dic_yy = new ConcurrentHashMap<String, Object>();
		Iterator<String> it = dic_map.keySet().iterator();
		while(it.hasNext()) {
			String name = it.next();
			String temp = dic_map.get(name).toString();
			Pattern p1 = Pattern.compile("应用(.*?)$"); 
			Pattern p2 = Pattern.compile("主治：(.*?)方解"); 
			Pattern p3 = Pattern.compile("主治：(.*?)$"); 
			Matcher m1 = p1.matcher(temp); 
			Matcher m2 = p2.matcher(temp); 
			Matcher m3 = p3.matcher(temp); 
			if (m1.find()) {
				dic_yy.put(name, m1.group(0));
			}else if (m2.find()) {
				dic_yy.put(name, m2.group(0));
			}else if (m3.find()) {
				dic_yy.put(name, m3.group(0));
			}
		}
		return dic_yy;
	}

	public Map<String, Object> MapTosy(List<String> dic_list, Map<String, Object> dic_map) {
		Map<String,Object> dic_sy = new ConcurrentHashMap<String, Object>();
		Iterator<String> it = dic_map.keySet().iterator();
		while(it.hasNext()) {
			String name = it.next();
			String temp = dic_map.get(name).toString();
			Pattern p2 = Pattern.compile("使用：(.*?)讨论"); 
			Pattern p3 = Pattern.compile("使用：(.*?)$"); 
			Matcher m2 = p2.matcher(temp); 
			Matcher m3 = p3.matcher(temp); 
			if (m2.find()) {
				dic_sy.put(name, m2.group(0));
			}else if (m3.find()) {
				dic_sy.put(name, m3.group(0));
			}
		}
		return dic_sy;
	}

	public Map<String, Object> MapTotl(List<String> dic_list, Map<String, Object> dic_map) {
		Map<String,Object> dic_tl = new ConcurrentHashMap<String, Object>();
		Iterator<String> it = dic_map.keySet().iterator();
		while(it.hasNext()) {
			String name = it.next();
			String temp = dic_map.get(name).toString();
			Pattern p2 = Pattern.compile("讨论：(.*?)附方"); 
			Pattern p3 = Pattern.compile("讨论：(.*?)$"); 
			Matcher m2 = p2.matcher(temp); 
			Matcher m3 = p3.matcher(temp); 
			if (m2.find()) {
				dic_tl.put(name, m2.group(0));
			}else if (m3.find()) {
				dic_tl.put(name, m3.group(0));
			}
		}
		return dic_tl;
	}

	public Map<String, Object> MapToff(List<String> dic_list, Map<String, Object> dic_map) {
		Map<String,Object> dic_ff = new ConcurrentHashMap<String, Object>();
		Iterator<String> it = dic_map.keySet().iterator();
		while(it.hasNext()) {
			String name = it.next();
			String temp = dic_map.get(name).toString();
			Pattern p2 = Pattern.compile("附方：(.*?)方歌"); 
			Pattern p3 = Pattern.compile("附方：(.*?)$"); 
			Matcher m2 = p2.matcher(temp); 
			Matcher m3 = p3.matcher(temp); 
			if (m2.find()) {
				dic_ff.put(name, m2.group(0));
			}else if (m3.find()) {
				dic_ff.put(name, m3.group(0));
			}
		}
		return dic_ff;
	}

	public Map<String, Object> MapTofg(List<String> dic_list, Map<String, Object> dic_map) {
		Map<String,Object> dic_fg = new ConcurrentHashMap<String, Object>();
		Iterator<String> it = dic_map.keySet().iterator();
		while(it.hasNext()) {
			String name = it.next();
			String temp = dic_map.get(name).toString();
			Pattern p3 = Pattern.compile("方歌：(.*?)$"); 
			Matcher m3 = p3.matcher(temp); 
			if (m3.find()) {
				dic_fg.put(name, m3.group(0));
			}
		}
		return dic_fg;
	}	
}