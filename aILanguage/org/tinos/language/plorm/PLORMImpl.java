package org.tinos.language.plorm;
import java.util.Map;
import org.plsql.db.plsql.imp.ExecPLSQLImp;
public class PLORMImpl implements PLORMInterf{
	private String PLSQL= "";
	private String[] PLSQLArray;
	private Map<String, Object> map;
	public String getPLSQL() {
		return PLSQL;
	}

	public void setPLSQL(String pLSQL) {
		PLSQL= pLSQL;
	}

	public PLORMImpl startAtRootDir(String rootAddress) {
		PLSQL= Const.SET_ROOT+ Const.COLON+ rootAddress
				+ Const.SEMICOLON;
		return this;
	}
	
	public PLORMImpl withBaseName(String baseName) {
		PLSQL+= Const.SEMICOLON+ Const.BASE_NAME+ Const.COLON
				+ baseName;
		return this;
	}
	//
	public PLORMImpl withTableSelect (String tableName) {
		PLSQL+= Const.SEMICOLON+ Const.TABLE_NAME+ Const.COLON
				+ tableName
				+ Const.COLON+ Const.SELECT;
		return this;
	}

	public PLORMImpl withTableCreate(String tableName) {
		PLSQL+= Const.SEMICOLON+ Const.TABLE_NAME+ Const.COLON
				+ tableName
				+ Const.COLON+ Const.CREATE;
		return this; 
	}
	
	public PLORMImpl withTableDelete(String tableName) {
		PLSQL+= Const.SEMICOLON+ Const.TABLE_NAME+ Const.COLON
				+ tableName
				+ Const.COLON+ Const.DELETE;
		return this; 
	}
	
	public PLORMImpl withTableInsert(String tableName) {
		PLSQL+= Const.SEMICOLON+ Const.TABLE_NAME+ Const.COLON
				+ tableName
				+ Const.COLON+ Const.INSERT;
		return this; 
	}
	
	public PLORMImpl withTableUpdate(String tableName) {
		PLSQL+= Const.SEMICOLON+ Const.TABLE_NAME+ Const.COLON
				+ tableName
				+ Const.COLON+ Const.UPDATE;
		return this; 
	}
	
	public PLORMImpl withCondition(String conditionType) {
		PLSQL+= Const.SEMICOLON+ Const.CONDITION+ Const.COLON
				+ conditionType;
		return this;
	}

	public PLORMImpl let(String leftSet) {
		PLSQL+= Const.COLON+ leftSet;
		return this;
	}

	public PLORMImpl lessThanAndEqualTo(String compareSet) {
		PLSQL+= Const.LESS_THAN_AND_EQUAL_TO+ compareSet;
		return this;
	}
	
	public PLORMImpl equalTo(String compareSet) {
		PLSQL+= Const.EQUAL_TO+ compareSet;
		return this;
	}
	
	public PLORMImpl lessThan(String compareSet) {
		PLSQL+= Const.LESS_THAN+ compareSet;
		return this;
	}
	
	public PLORMImpl greatThan(String compareSet) {
		PLSQL+= Const.GREAT_THAN+ compareSet;
		return this;
	}
	
	public PLORMImpl greatThanAndEqualTo(String compareSet) {
		PLSQL+= Const.GREAT_THAN_AND_EQUAL_TO+ compareSet;
		return this;
	}
	
	public PLORMImpl notEqualTo(String compareSet) {
		PLSQL+= Const.NOT_EQUAL_TO+ compareSet;
		return this;
	}
	
	public PLORMImpl in(String compareSet) {
		PLSQL+= Const.IN+ compareSet;
		return this;
	}
	
	public PLORMImpl notIn(String compareSet) {
		PLSQL+= Const.NOT_IN+ compareSet;
		return this;
	}
	
	public PLORMImpl equals(String compareSet) {
		PLSQL+= Const.EQUALS+ compareSet;
		return this;
	}
	
	public PLORMImpl notEquals(String compareSet) {
		PLSQL+= Const.NOT_EQUALS+ compareSet;
		return this;
	}
	
	public PLORMImpl innerJoinWithTable(String baseName, String tableName) {
		PLSQL+= Const.SEMICOLON+ Const.JOIN+ Const.COLON+ baseName
				+ Const.COLON+ tableName;
		return this;
	}
	
	public PLORMImpl withRelation(String relationType) {
		PLSQL+= Const.SEMICOLON+ Const.RELATION+ Const.COLON
				+ relationType;
		return this;
	}
	
	public PLORMImpl as(String compareSet) {
		PLSQL+= Const.AS+ compareSet;
		return this;
	}
	
	public PLORMImpl upTo(String compareSet) {
		PLSQL+= Const.UP_TO+ compareSet;
		return this;
	}
	
	public PLORMImpl withAggregation(String aggregationType) {
		PLSQL+= Const.SEMICOLON+ Const.WITH_AGGREGATION
				+ Const.COLON+ aggregationType;
		return this;
	}
	
	public PLORMImpl getCulumns() {
		PLSQL+= Const.SEMICOLON+ Const.GET_CULUMNS;
		return this;
	}
	
	public PLORMImpl changeCulumnName(String newCulumnName, String oldCulumnName) {
		PLSQL+= Const.SEMICOLON+ Const.CHANGES_CULUMN_NAME+ Const.COLON
				+ newCulumnName+ Const.COLON+ oldCulumnName;
		return this;
	}
	
	public PLORMImpl withCulumnName(String culumnName, String dataType) {
		PLSQL+= Const.SEMICOLON+ Const.CULUMN_NAME+ Const.COLON+ culumnName
				+ Const.COLON+ dataType;
		return this;
	}
	
	public PLORMImpl withCulumnValue(String culumnName, String culumnValue) {
		PLSQL+= Const.SEMICOLON+ Const.CULUMN_VALUE+ Const.COLON+ culumnName
				+ Const.COLON+ culumnValue;
		return this;
	}

	public PLORMInterf exec(boolean b) throws Exception {
		map= ExecPLSQLImp.ExecPLORM(this, true);
		return this;
	}

	@Override
	public PLORMInterf checkErrors(String string) {
		return this;
	}

	@Override
	public PLORMInterf fixErrors(String string) {
		return this;
	}

	@Override
	public PLORMInterf finalExec(boolean b) throws Exception {
		map= ExecPLSQLImp.ExecPLORM(this, true);
		return this;
	}

	@Override
	public Map<String, Object> returnAsMap() {
		return this.map;
	}

	@Override
	public PLORMInterf checkAndFixPlsqlGrammarErrors() {
		//string to array
		this.PLSQLArray= PLSQL.split(Const.SEMICOLON);
		//条件检查 1 过滤  2 修改 3 语义检测
		//1 
		for(int i= 1; i< PLSQLArray.length; i++) {
			//1.1 过滤相同句型
			//1.2 过滤无效字符
			//1.3 过滤攻击代码
			if(PLSQLArray[i].equalsIgnoreCase(PLSQLArray[i- 1])) {
				PLSQLArray[i]= "";
			}
			PLSQLArray[i]= PLSQLArray[i].replaceAll(">+", ">");
			PLSQLArray[i]= PLSQLArray[i].replaceAll("<+", "<");
			PLSQLArray[i]= PLSQLArray[i].replaceAll("\\!+", "!");
			PLSQLArray[i]= PLSQLArray[i].replaceAll("\\~+", "~");
			PLSQLArray[i]= PLSQLArray[i].replaceAll("\\@+", "@");
			PLSQLArray[i]= PLSQLArray[i].replaceAll("\\&&+", "&&");
			PLSQLArray[i]= PLSQLArray[i].replaceAll("\\|\\|+", "||");
			PLSQLArray[i]= PLSQLArray[i].replaceAll("\\[+", "[");
			PLSQLArray[i]= PLSQLArray[i].replaceAll("\\]+", "]");
			PLSQLArray[i]= PLSQLArray[i].replaceAll("\\:+", ":");
			
			PLSQLArray[i]= PLSQLArray[i].replaceAll("\\s+", "");
		}
		//2
		//2.1 修改错误比较符号
		//2.2 修改错误语法关键字
		//2.3 修改错误标注符号
		
		//3
		//3.1 检测是否有关键字前后句段混乱
		//3.2 检测是否有关键字 格式 倒置
		//3.3 检测是否有关键字 句型 倒置
		
		//rerturn
		String string= "";
		for(int i= 0; i< PLSQLArray.length; i++) {
			string+= PLSQLArray[i]+ Const.SEMICOLON;
		}
		PLSQL= string;
		return this;
	}

	@Override
	public PLORMInterf checkAndFixSystemEnvironmentErrors() {
		return this;
	}
}