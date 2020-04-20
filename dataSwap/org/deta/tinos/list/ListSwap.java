package org.deta.tinos.list;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

import org.json.JSONObject;
import org.json.XML;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
public class ListSwap{
	public static String listToJsonString(Gson gson, List<Object> list){
		return gson.toJson(list);
	}

	public static Object stringListToJsonString(Gson gson, List<String> list) {
		return gson.toJson(list);
	}

	public static String listToXml(Gson gson, List<Object> list){
		return XML.toString(new JSONObject(gson.toJson(list)));
	}

	public static String listToMap(Gson gson, List<Object> list){
		return gson.fromJson(new JSONObject(gson.toJson(list)).toString()
				, new TypeToken<Map<String, Object>>(){}.getType());
	}

	public static Object[] listToObjectArray(List<Object> list){
		return list.toArray();
	}

	public static Iterator<Object> listToIterator(List<Object> list){
		return list.iterator();
	}

	public static Vector<Object> listToVector(List<Object> list){
		Vector<Object> vector= new Vector<>();
		Iterator<Object> iterator= list.iterator();
		while(iterator.hasNext()) {
			vector.add(iterator.next());
		}
		return vector;
	}

	public static Set<Object> listToSet(List<Object> list){
		Set<Object> sets= new TreeSet<>();
		Iterator<Object> iterator= list.iterator();
		while(iterator.hasNext()) {
			sets.add(iterator.next());
		}
		return sets;
	}

	public static String[] listToArray(List<String> list) {
		String[] output= new String[list.size()];
		int outputPoint= 0;
		Iterator<String> iterator= list.iterator();
		while(iterator.hasNext()) {
			output[outputPoint++]= iterator.next();
		}
		return output;
	}
}