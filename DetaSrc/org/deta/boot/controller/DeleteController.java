package org.deta.boot.controller;
import java.util.Map;

import mapProcessor.VtoV;

import org.plsql.stable.StableData;
import org.plsql.vpc.process.portImpl.RestDBDeleteImpl;
public class DeleteController {
	public static String exec(String string, Map<String, String> data)
			throws Exception {
		if(string.equalsIgnoreCase(StableData.REST_PATH_DELETE_ROWS_BY_TABLE_PATH_AND_INDEX)){
			return VtoV.ObjectToJsonString(RestDBDeleteImpl
					.deleteRowByTablePathAndIndex(data.get("tablePath")
					, data.get("pageIndex"), data.get("token")
					, data.get("email"), data.get("password"), data.get("auth")));
		}	
		return StableData.STRING_EMPTY;
	}
}