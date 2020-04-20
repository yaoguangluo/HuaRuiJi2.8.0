package org.deta.tinos.stringBuilder;
import java.util.Map;

import org.json.JSONObject;
import org.json.XML;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
public class StringBuilderSwap{
	public static char[] stringBuilderToCharArray(StringBuilder stringBuilder) {	
		return stringBuilder.toString().toCharArray();
	}	

	public static String stringBuilderToString(StringBuilder stringBuilder) {	
		return stringBuilder.toString();
	}	

	public static String stringBuilderToJson(Gson gson
			, StringBuilder stringBuilder) {	
		return gson.toJson(stringBuilder.toString());
	}	

	public static String stringBuilderToXml(Gson gson
			, StringBuilder stringBuilder){
		JSONObject jSONObject
		= new JSONObject(gson.toJson(stringBuilder.toString()));
		return XML.toString(jSONObject);	
	}

	public static String[] stringBuilderToSplitArray(String stopBy
			, StringBuilder stringBuilder){
		String[] strings= stringBuilder.toString().split(stopBy); 
		return strings;	
	}

	public static Map<String, Object> stringBuilderToMap(Gson gson
			, StringBuilder stringBuilder){
		JSONObject jSONObject
		= new JSONObject(gson.toJson(stringBuilder.toString()));
		return gson.fromJson(jSONObject.toString()
				, new TypeToken<Map<String, Object>>(){}.getType());
	}
}