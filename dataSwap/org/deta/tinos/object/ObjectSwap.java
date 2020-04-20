package org.deta.tinos.object;
import com.google.gson.Gson;
public class ObjectSwap{
	public static String objectToJsonString(Gson gson, Object object){
		return gson.toJson(object);
	}
}