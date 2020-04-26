package sample;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
@SuppressWarnings("unused")
public class DictionaryFromDB{	
//	public List<String> dic_list;
//	public Map<String,Object> dic_map;
//	public Map<String,Object> dic_li;
//	public Map<String,Object> dic_hai;
//	public Map<String,Object> dic_xz;
//	public Map<String,Object> dic_xw;
//	public Map<String,Object> dic_jm;
//	public Map<String,Object> dic_ya;
//	public Map<String,Object> dic_cy;
//	public Map<String,Object> dic_cj;
//	public Map<String,Object> dic_jj;
//	public Map<String,Object> dic_zf;
	public List<String> txtToList() throws IOException{
		List<String> dic_list= new ArrayList<>();
	
		return dic_list;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	public Map<String, Object> listToMap(List<String> dic_list) throws IOException{
		Map<String, Object> dic_map= new ConcurrentHashMap<String, Object>();
		Map<String, Object> map = null;
		//for(int i=0; i<)
		String plsql= "setRoot:C:/DetaDB;" + 
				"baseName:ZYY;" + 
				"tableName:zybc:select;" +
				"condition:or:ID|<=|3000;";
				//"condition:or:ID|==|2;";
		try {
			map= org.plsql.db.plsql.imp.ExecPLSQLImp.ExecPLSQL(plsql, true);
		}catch(Exception e1) {
			e1.printStackTrace();
		}
		ArrayList list= (ArrayList) map.get("obj");
		Iterator<HashMap<String, Object>> iterator= list.iterator();
		return map;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Map<String, Object> listToMap(Map<String, Object> dic_yw, Map<String, Object> dic_li,
			Map<String, Object> dic_hai, Map<String, Object> dic_xz, Map<String, Object> dic_ya, 
			Map<String, Object> dic_jm, Map<String, Object> dic_xw, Map<String, Object> dic_cy, 
			Map<String, Object> dic_jj, Map<String, Object> dic_zf, Map<String, Object> dic_cj, 
			Map<String, Object> dic_yl) {
		Map<String, Object> dic_map= new ConcurrentHashMap<String, Object>();
		Map<String, Object> map = null;
		//for(int i=0; i<)
		String plsql= "setRoot:C:/DetaDB;" + 
				"baseName:ZYY;" + 
				"tableName:zybc:select;" +
				"condition:or:ID|<=|3000;";
				//"condition:or:ID|==|2;";
		try {
			map= org.plsql.db.plsql.imp.ExecPLSQLImp.ExecPLSQL(plsql, true);
		}catch(Exception e1) {
			e1.printStackTrace();
		}
		ArrayList list= (ArrayList) map.get("obj");
		Iterator<HashMap<String, Object>> iterator= list.iterator();
		while(iterator.hasNext()) {
			HashMap<String,Object> hashmap= iterator.next();
			StringBuilder stringBuilder=new StringBuilder();
			if(hashmap.containsKey("rowValue")) {
				HashMap<String, Object> rowValue= (HashMap<String, Object>) hashmap.get("rowValue");
				String keyName = null;
				if(rowValue.containsKey("中药名称")) {
					HashMap<String, Object> temp= (HashMap<String, Object>) rowValue.get("中药名称");
					keyName= temp.get("culumnValue").toString();
					stringBuilder.append(temp.get("culumnValue").toString());
				}
				if(rowValue.containsKey("常见药")) {
					HashMap<String, Object> temp= (HashMap<String, Object>) rowValue.get("常见药");
					dic_cj.put(keyName, temp.get("culumnValue").toString().replace("@biky@", ":"));
					stringBuilder.append(temp.get("culumnValue").toString());
				}
				if(rowValue.containsKey("搭配")) {
					HashMap<String, Object> temp= (HashMap<String, Object>) rowValue.get("搭配");
					dic_zf.put(keyName, temp.get("culumnValue").toString().replace("@biky@", ":"));
					stringBuilder.append(temp.get("culumnValue").toString());
				}
				if(rowValue.containsKey("愚按")) {
					HashMap<String, Object> temp= (HashMap<String, Object>) rowValue.get("愚按");
					dic_ya.put(keyName, temp.get("culumnValue").toString().replace("@biky@", ":"));
					stringBuilder.append(temp.get("culumnValue").toString());
				}
				if(rowValue.containsKey("崇源")) {
					HashMap<String, Object> temp= (HashMap<String, Object>) rowValue.get("崇源");
					dic_cy.put(keyName, temp.get("culumnValue").toString().replace("@biky@", ":"));
					stringBuilder.append(temp.get("culumnValue").toString());
				}
				if(rowValue.containsKey("经解")) {
					HashMap<String, Object> temp= (HashMap<String, Object>) rowValue.get("经解");
					dic_jj.put(keyName, temp.get("culumnValue").toString().replace("@biky@", ":"));
					stringBuilder.append(temp.get("culumnValue").toString());
				}
				if(rowValue.containsKey("经脉")) {
					HashMap<String, Object> temp= (HashMap<String, Object>) rowValue.get("经脉");
					dic_jm.put(keyName, temp.get("culumnValue").toString().replace("@biky@", ":"));
					stringBuilder.append(temp.get("culumnValue").toString());
				}
				if(rowValue.containsKey("性味")) {
					HashMap<String, Object> temp= (HashMap<String, Object>) rowValue.get("性味");
					dic_xw.put(keyName, temp.get("culumnValue").toString().replace("@biky@", ":"));
					stringBuilder.append(temp.get("culumnValue").toString());
				}
				if(rowValue.containsKey("用量")) {
					HashMap<String, Object> temp= (HashMap<String, Object>) rowValue.get("用量");
					dic_yl.put(keyName, temp.get("culumnValue").toString().replace("@biky@", ":"));
					stringBuilder.append(temp.get("culumnValue").toString());
				}
				if(rowValue.containsKey("风险规避")) {
					HashMap<String, Object> temp= (HashMap<String, Object>) rowValue.get("风险规避");
					dic_hai.put(keyName, temp.get("culumnValue").toString().replace("@biky@", ":"));
					stringBuilder.append(temp.get("culumnValue").toString());
				}
				if(rowValue.containsKey("功效")) {
					HashMap<String, Object> temp= (HashMap<String, Object>) rowValue.get("功效");
					dic_li.put(keyName, temp.get("culumnValue").toString().replace("@biky@", ":"));
					stringBuilder.append(temp.get("culumnValue").toString());
				}
				if(rowValue.containsKey("笔记原文")) {
					HashMap<String, Object> temp= (HashMap<String, Object>) rowValue.get("笔记原文");
					dic_yw.put(keyName, temp.get("culumnValue").toString().replace("@biky@", ":"));
					stringBuilder.append(temp.get("culumnValue").toString());
				}
				if(rowValue.containsKey("中医馆药理")) {
					HashMap<String, Object> temp= (HashMap<String, Object>) rowValue.get("中医馆药理");
					dic_xz.put(keyName, temp.get("culumnValue").toString().replace("@biky@", ":"));
					stringBuilder.append(temp.get("culumnValue").toString());
				}
				dic_map.put(keyName, stringBuilder.toString().replace("@biky@", ":"));
			}
		}
		return dic_map;
	}	
}