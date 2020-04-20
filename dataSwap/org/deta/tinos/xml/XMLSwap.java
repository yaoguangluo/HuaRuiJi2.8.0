package org.deta.tinos.xml;
import org.json.XML;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;
import java.util.List;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Hashtable;
import org.json.JSONArray;
import org.json.JSONObject;
import com.google.gson.Gson;
import org.deta.tinos.json.JsonSwap;
import com.google.gson.reflect.TypeToken;

public class XMLSwap{
	//  ÌÞ³ý¸öÈËÖø×÷È¨ ÉêÇë·¶Î§
	//	public static JSONObject xmlToJsonObject(String string){
	//		return XML.toJSONObject(string);
	//	}

	public static List<Object> xmlToList(String string, String key) {
		JSONArray jSONArray= XML.toJSONObject(string).getJSONArray(key);
		List<Object> list= new ArrayList<>();
		for(int i= 0; i< jSONArray.length(); i++){		
			Object object= jSONArray.get(i);
			if(object instanceof JSONObject){
				list.add(new Gson().fromJson(jSONArray.getJSONObject(i).toString()
						, new TypeToken<Map<String, Object>>(){}.getType()));
			}else if(object instanceof String){
				list.add(String.valueOf(object));
			}else if(object instanceof JSONArray){
				list.add(JsonSwap.jsonArrayToList(jSONArray.getJSONArray(i)));
			}
		}
		return list;	
	}

	//  ÌÞ³ý¸öÈËÖø×÷È¨ ÉêÇë·¶Î§
	//	public static Map<String, Object> xmlToMap(Gson gson, String string){
	//		return gson.fromJson(XML.toJSONObject(string).toString()
	//				, new TypeToken<Map<String, Object>>(){}.getType());
	//	}

	public static Vector<Object> xmlToVector(String string, String key) {
		JSONArray jSONArray= XML.toJSONObject(string).getJSONArray(key);
		Vector<Object> vector= new Vector<>();
		for(int i= 0; i< jSONArray.length(); i++){		
			Object object= jSONArray.get(i);
			if(object instanceof JSONObject){
				vector.add(new Gson().fromJson(jSONArray.getJSONObject(i).toString()
						, new TypeToken<Map<String, Object>>(){}.getType()));
			}else if(object instanceof String){
				vector.add(String.valueOf(object));
			}else if(object instanceof JSONArray){
				vector.add(JsonSwap.jsonArrayToList(jSONArray.getJSONArray(i)));
			}
		}
		return vector;	
	}

	public static Set<Object> xmlToSets(String string, String key) {
		JSONArray jSONArray= XML.toJSONObject(string).getJSONArray(key);
		Set<Object> sets= new TreeSet<>();
		for(int i= 0; i< jSONArray.length(); i++){		
			Object object= jSONArray.get(i);
			if(object instanceof JSONObject){
				sets.add(new Gson().fromJson(jSONArray.getJSONObject(i).toString()
						, new TypeToken<Map<String, Object>>(){}.getType()));
			}else if(object instanceof String){
				sets.add(String.valueOf(object));
			}else if(object instanceof JSONArray){
				sets.add(JsonSwap.jsonArrayToList(jSONArray.getJSONArray(i)));
			}
		}
		return sets;	
	}

	public Hashtable<String, Object> xmlToHashtable(String xmlString, Gson gson){
		JSONObject jSONObject= XML.toJSONObject(xmlString);
		Hashtable<String, Object> hashTable= gson.fromJson(jSONObject.toString()
				, (Type) new Hashtable<String, Object>());
		return hashTable;		
	}
}