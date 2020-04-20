package org.deta.tinos.tree;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import org.json.JSONObject;
import org.json.XML;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
public class TreeSwap{
	public static String treeToJsonString(Gson gson, Set<Object> sets){
		return gson.toJson(sets);
	}

	public static Object stringTreeToJsonString(Gson gson, Set<String> sets) {
		return gson.toJson(sets);
	}

	public static String treeToXml(Gson gson, Set<Object> sets){
		return XML.toString(new JSONObject(gson.toJson(sets)));
	}

	public static String treeToMap(Gson gson, Set<Object> sets){
		return gson.fromJson(new JSONObject(gson.toJson(sets)).toString()
				, new TypeToken<Map<String, Object>>(){}.getType());
	}

	public static Object[] treeToObjectArray(Set<Object> sets){
		return sets.toArray();
	}

	public static Iterator<Object> treeToIterator(Set<Object> sets){
		return sets.iterator();
	}

	public static Vector<Object> treeToVector(Set<Object> sets){
		Vector<Object> vector= new Vector<>();
		Iterator<Object> iterator= sets.iterator();
		while(iterator.hasNext()) {
			vector.add(iterator.next());
		}
		return vector;
	}
}