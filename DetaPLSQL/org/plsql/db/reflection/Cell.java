package org.plsql.db.reflection;
public class Cell{
	public Object getCellValue() {
		return cellValue;
	}

	public void setCellValue(Object cellValue) {
		this.cellValue = cellValue;
	}

	private Object cellValue;
}