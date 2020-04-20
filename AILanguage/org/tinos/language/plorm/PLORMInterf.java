package org.tinos.language.plorm;

import java.util.Map;

public interface PLORMInterf{
	public String getPLSQL();
	public void setPLSQL(String pLSQL);
	public PLORMInterf withTableCreate(String tableName);
	public PLORMInterf withTableDelete(String tableName);
	public PLORMInterf withTableInsert(String tableName);
	public PLORMInterf withTableUpdate(String tableName);
	public PLORMInterf withTableSelect(String tableName);
	public PLORMInterf getCulumns();
	public PLORMInterf startAtRootDir(String rootAddress);
	public PLORMInterf withBaseName(String baseName);
	public PLORMInterf withCondition(String conditionType);
	public PLORMInterf let(String leftSet);
	public PLORMInterf lessThanAndEqualTo(String compareSet);
	public PLORMInterf equalTo(String compareSet);
	public PLORMInterf lessThan(String compareSet);
	public PLORMInterf greatThan(String compareSet);
	public PLORMInterf greatThanAndEqualTo(String compareSet);
	public PLORMInterf notEqualTo(String compareSet) ;
	public PLORMInterf in(String compareSet) ;
	public PLORMInterf notIn(String compareSet) ;
	public PLORMInterf equals(String compareSet);
	public PLORMInterf notEquals(String compareSet);
	public PLORMInterf innerJoinWithTable(String baseName, String tableName);
	public PLORMInterf withRelation(String relationType) ;
	public PLORMInterf as(String compareSet) ;
	public PLORMInterf upTo(String compareSet);
	public PLORMInterf withAggregation(String aggregationType);
	public PLORMInterf changeCulumnName(String newCulumnName, String oldCulumnName);
	public PLORMInterf withCulumnName(String culumnName, String dataType);
	public PLORMInterf withCulumnValue(String culumnName, String culumnValue);
	public PLORMInterf checkErrors(String string);
	public PLORMInterf fixErrors(String string);
	public PLORMInterf finalExec(boolean b) throws Exception;
	public Map<String, Object> returnAsMap();
	public PLORMInterf checkAndFixPlsqlGrammarErrors();
	public PLORMInterf checkAndFixSystemEnvironmentErrors();
}