package org.tinos.language.plorm;
public class Create{
//动机：准备将下面的plsql翻译成orm，省的养疗经的query模式太固定，上手修改麻烦。
//	String plsql= "setRoot:C:/DetaDB;";
//	   plsql+= "baseName:ZYY;"; 
//	   plsql+= "tableName:zybc:create;" + 
//	   		"culumnName:pk:ID:string;" + 
//	   		"culumnName:uk:打分:string;" + 
//	   		"culumnName:uk:中药名称:string;" + 
//	   		"culumnName:uk:笔记原文:string;" + 
//	   		"culumnName:uk:功效:string;" + 
//	   		"culumnName:uk:风险规避:string;" + 
//	   		"culumnName:uk:用量:string;" + 
//	   		"culumnName:uk:性味:string;" + 
//	   		"culumnName:uk:经脉:string;" + 
//	   		"culumnName:uk:中医馆药理:string;" + 
//	   		"culumnName:uk:经解:string;" + 
//	   		"culumnName:uk:崇源:string;" + 
//	   		"culumnName:uk:愚按:string;" + 
//	   		"culumnName:uk:搭配:string;" + 
//	   		"culumnName:uk:常见药:string;";
//这个函数用于确定Deta PLSQL的Root like: 'c:/dsdsd' etc
	String PLSQL= "";
	public String startAtRootDir(String rootAddress) {
		PLSQL= "setRoot:"+ rootAddress+ ";";
		return PLSQL;
	}
	
	public String withBaseName(String baseName) {
		PLSQL+= "baseName:"+ baseName+ ";";
		return PLSQL; 
	}
	
	public String withTableCreate(String tableName) {
		PLSQL+= "tableName:"+ tableName+ ":create;";
		return PLSQL; 
	}
	
	public String withCulumnName(String culumnName, String keyType, String dataFormat) {
		PLSQL+= "culumnName:"+ keyType+ ":"+ culumnName+ ":"+ dataFormat+ ";";
		return PLSQL; 
	}
}