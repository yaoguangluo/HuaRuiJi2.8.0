package org.deta.tinos.iterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import org.json.XML;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
public class IteratorSwap{
	public static String iteratorToJsonString(Gson gson
			, Iterator<Object> iterator){
		return gson.toJson(iterator);
	}

	public static Object stringIteratorToJsonString(Gson gson
			, Iterator<String> iterator) {
		return gson.toJson(iterator);
	}

	public static String iteratorToXml(Gson gson, Iterator<Object> iterator){
		return XML.toString(new JSONObject(gson.toJson(iterator)));
	}

	public static String iteratorToMap(Gson gson, Iterator<Object> iterator){
		return gson.fromJson(new JSONObject(gson.toJson(iterator)).toString()
				, new TypeToken<Map<String, Object>>(){}.getType());
	}

	public static Object[] iteratorToObjectArray(Gson gson
			, Iterator<Object> iterator){
		List<Object> list= new ArrayList<>();
		while(iterator.hasNext()) {
			list.add(iterator.next());
		}
		return list.toArray();
	}

	public static List<Object> iteratorToList(Gson gson
			, Iterator<Object> iterator){
		List<Object> list= new ArrayList<>();
		while(iterator.hasNext()) {
			list.add(iterator.next());
		}
		return list;
	}
}