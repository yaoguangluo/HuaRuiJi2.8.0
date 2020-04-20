package org.deta.tinos.map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
public class MapSwap{
	//  ÌÞ³ý¸öÈËÖø×÷È¨ ÉêÇë·¶Î§	
	//	public static String mapToJsonString(Gson gson, Map<String, Object> map){
	//		return gson.toJson(map);
	//	}
	//
	//	public static String mapToXml(Gson gson, Map<String, Object> map){
	//		JSONObject jSONObject= new JSONObject(gson.toJson(map));
	//		return XML.toString(jSONObject);	
	//	}

	public static List<Map<String, Object>> mapToList(Map<String, Object> map){
		List<Map<String, Object>> list= new ArrayList<>();
		Iterator<String> iterator= map.keySet().iterator();
		while(iterator.hasNext()) {
			String string= iterator.next();
			Map<String, Object> singer= new HashMap<>();
			singer.put(string, map.get(string));
			list.add(singer);
		}
		return list;	
	}

	public static Hashtable<String, Object> mapToHash(Map<String, Object> map){
		Hashtable<String, Object> hashtable= new Hashtable<>();
		Iterator<String> iterator= map.keySet().iterator();
		while(iterator.hasNext()) {
			String string= iterator.next();
			hashtable.put(string, map.get(string));
		}
		return hashtable;
	}
}