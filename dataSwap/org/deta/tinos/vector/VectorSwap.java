package org.deta.tinos.vector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

import org.deta.tinos.stable.Stable;

import com.google.gson.Gson;
public class VectorSwap{
	public static Map<String, Object> vectorToMap(
			Vector<Object> vector){
		Map<String, Object> map= new LinkedHashMap<>();
		Iterator<Object> iterator= vector.iterator();
		int i= 0;
		while(iterator.hasNext()) {
			map.put(Stable.STRING_EMPTY+ i++, iterator.next());
		}
		return map;
	}

	public static List<Object> vectorToList(Vector<Object> vector){
		List<Object> list= new ArrayList<>();
		Iterator<Object> iterator= vector.iterator();
		while(iterator.hasNext()) {
			list.add(iterator.next());
		}
		return list;
	}

	public static Object[] vectorToArray(Vector<Object> vector){
		return vector.toArray();
	}

	public static Iterator<Object> vectorToIterator(
			Vector<Object> vector){
		return vector.iterator();
	}

	public static String vectorToJsonString(Gson gson
			,Vector<Object> vector){
		return gson.toJson(vector);
	}

	public static Set<Object> vectorToSet(Vector<Object> vector){
		Set<Object> sets= new TreeSet<>();
		Iterator<Object> iterator= vector.iterator();
		while(iterator.hasNext()) {
			sets.add(iterator.next());
		}
		return sets;
	}
}