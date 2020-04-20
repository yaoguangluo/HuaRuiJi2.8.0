package org.deta.tinos.hash;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import org.json.XML;
public class HashSwap{
	public static String hashTableToJson(Gson gson
			, Hashtable<String, Object> hashtable) {	
		return gson.toJson(hashtable);
	}

	public static String hashTableToXml(Gson gson
			, Hashtable<String, Object> hashtable){
		JSONObject jSONObject= new JSONObject(gson.toJson(hashtable));
		return XML.toString(jSONObject);	
	}

	public static List<Object> hashTableToList(Gson gson
			, Hashtable<String, Object> hashtable){
		List<Object> list= new ArrayList<>();
		Iterator<String> iterator= hashtable.keySet().iterator();	
		while(iterator.hasNext()) {
			list.add(hashtable.get(iterator.next()));
		}
		return list;
	}

	public static Object[] hashTableToObjectArray(Gson gson
			, Hashtable<String, Object> hashtable){
		List<Object> list= new ArrayList<>();
		Iterator<String> iterator= hashtable.keySet().iterator();	
		while(iterator.hasNext()) {
			list.add(hashtable.get(iterator.next()));
		}
		return list.toArray();
	}
}