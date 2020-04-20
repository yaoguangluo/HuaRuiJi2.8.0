package org.deta.tinos.csv;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
@SuppressWarnings("static-access")
public class CSVSwap{
	public static Object[][] xlsOrCsvFileToObjectMartix(String filePath
			, int pageSheetIndex) throws IOException {	
		FileInputStream fileInputStream= new FileInputStream(filePath);
		POIFSFileSystem pOIFSFileSystem= new POIFSFileSystem(fileInputStream);
		HSSFWorkbook hSSFWorkbook= new HSSFWorkbook(pOIFSFileSystem);
		HSSFSheet hSSFSheet= hSSFWorkbook.getSheetAt(Integer
				.valueOf(pageSheetIndex)); 		 
		HSSFRow hSSFRow= hSSFSheet.getRow(0);   
		Object[][] output= new String[hSSFSheet.getPhysicalNumberOfRows()]
				[hSSFRow.getLastCellNum()];
		for (int i= 0; i< hSSFSheet.getPhysicalNumberOfRows(); i++) {//ROW
			if (null!= (hSSFRow= hSSFSheet.getRow(i))) {
				for(int j= 0; j< hSSFRow.getLastCellNum(); j++){//CULUMN
					HSSFCell hSSFCell= hSSFRow.getCell(j);
					if(hSSFCell.CELL_TYPE_STRING== hSSFCell.getCellType()){
						output[i][j]= hSSFCell.getStringCellValue();
					}
					if(hSSFCell.CELL_TYPE_BOOLEAN== hSSFCell.getCellType()){
						output[i][j]= hSSFCell.getBooleanCellValue();
					}
					if(hSSFCell.CELL_TYPE_NUMERIC== hSSFCell.getCellType()){
						if(HSSFDateUtil.isCellDateFormatted(hSSFCell)){
							output[i][j]= hSSFCell.getDateCellValue();
						}else{
							output[i][j]= hSSFCell.getNumericCellValue();
						}
					}
					if(hSSFCell.CELL_TYPE_ERROR== hSSFCell.getCellType()){
						output[i][j]= hSSFCell.getErrorCellValue();
					}
				}
			}
		}		
		return output;
	}

	public static List<Object[]> xlsOrCsvFileToListObject(String filePath
			, int pageSheetIndex) throws IOException {	
		FileInputStream fileInputStream= new FileInputStream(filePath);
		POIFSFileSystem pOIFSFileSystem= new POIFSFileSystem(fileInputStream);
		HSSFWorkbook hSSFWorkbook= new HSSFWorkbook(pOIFSFileSystem);
		HSSFSheet hSSFSheet= hSSFWorkbook.getSheetAt(Integer
				.valueOf(pageSheetIndex)); 		 
		HSSFRow hSSFRow= hSSFSheet.getRow(0); 
		List<Object[]> list= new ArrayList<>();
		for (int i= 0; i< hSSFSheet.getPhysicalNumberOfRows(); i++) {//ROW
			Object[] objectRow= new String[hSSFRow.getLastCellNum()];
			if (null!= (hSSFRow= hSSFSheet.getRow(i))) {
				for(int j= 0; j< hSSFRow.getLastCellNum(); j++){//CULUMN
					HSSFCell hSSFCell= hSSFRow.getCell(j);
					if(hSSFCell.CELL_TYPE_STRING== hSSFCell.getCellType()){
						objectRow[j]= hSSFCell.getStringCellValue();
					}
					if(hSSFCell.CELL_TYPE_BOOLEAN== hSSFCell.getCellType()){
						objectRow[j]= hSSFCell.getBooleanCellValue();
					}
					if(hSSFCell.CELL_TYPE_NUMERIC== hSSFCell.getCellType()){
						if(HSSFDateUtil.isCellDateFormatted(hSSFCell)){
							objectRow[j]= hSSFCell.getDateCellValue();
						}else{
							objectRow[j]= hSSFCell.getNumericCellValue();
						}
					}
					if(hSSFCell.CELL_TYPE_ERROR== hSSFCell.getCellType()){
						objectRow[j]= hSSFCell.getErrorCellValue();
					}
				}
			}
			list.add(objectRow);
		}		
		return list;
	}

	public static List<Object[]> xlsOrCsvFileToRangedListObject(String filePath
			, int pageSheetIndex, Map<Integer, Boolean> rows
			, Map<Integer, Boolean> culumns) throws IOException {	
		FileInputStream fileInputStream= new FileInputStream(filePath);
		POIFSFileSystem pOIFSFileSystem= new POIFSFileSystem(fileInputStream);
		HSSFWorkbook hSSFWorkbook= new HSSFWorkbook(pOIFSFileSystem);
		HSSFSheet hSSFSheet= hSSFWorkbook
				.getSheetAt(Integer.valueOf(pageSheetIndex)); 		 
		HSSFRow hSSFRow= hSSFSheet.getRow(0); 
		List<Object[]> list= new ArrayList<>();
		for (int i= 0; i< hSSFSheet.getPhysicalNumberOfRows()
				&& rows.containsKey(i); i++) {//ROW
			Object[] objectRow= new String[hSSFRow.getLastCellNum()];
			if (null!= (hSSFRow= hSSFSheet.getRow(i))) {
				for(int j= 0; j< hSSFRow.getLastCellNum()
						&& culumns.containsKey(j); j++){//CULUMN
					HSSFCell hSSFCell= hSSFRow.getCell(j);
					if(hSSFCell.CELL_TYPE_STRING== hSSFCell.getCellType()){
						objectRow[j]= hSSFCell.getStringCellValue();
					}
					if(hSSFCell.CELL_TYPE_BOOLEAN== hSSFCell.getCellType()){
						objectRow[j]= hSSFCell.getBooleanCellValue();
					}
					if(hSSFCell.CELL_TYPE_NUMERIC== hSSFCell.getCellType()){
						if(HSSFDateUtil.isCellDateFormatted(hSSFCell)){
							objectRow[j]= hSSFCell.getDateCellValue();
						}else{
							objectRow[j]= hSSFCell.getNumericCellValue();
						}
					}
					if(hSSFCell.CELL_TYPE_ERROR== hSSFCell.getCellType()){
						objectRow[j]= hSSFCell.getErrorCellValue();
					}
				}
			}
			list.add(objectRow);
		}		
		return list;
	}

	public static Object[][] xlsOrCsvFileToRangedObjectMartix(String filePath
			, int pageSheetIndex, Map<Integer, Boolean> rows
			, Map<Integer, Boolean> culumns) throws IOException {	
		FileInputStream fileInputStream= new FileInputStream(filePath);
		POIFSFileSystem pOIFSFileSystem= new POIFSFileSystem(fileInputStream);
		HSSFWorkbook hSSFWorkbook= new HSSFWorkbook(pOIFSFileSystem);
		HSSFSheet hSSFSheet= hSSFWorkbook
				.getSheetAt(Integer.valueOf(pageSheetIndex)); 		 
		HSSFRow hSSFRow= hSSFSheet.getRow(0);   
		Object[][] output= new String[hSSFSheet.getPhysicalNumberOfRows()]
				[hSSFRow.getLastCellNum()];
		for (int i= 0; i< hSSFSheet.getPhysicalNumberOfRows()
				&& rows.containsKey(i); i++) {//ROW
			if (null!= (hSSFRow= hSSFSheet.getRow(i))) {
				for(int j= 0; j< hSSFRow.getLastCellNum()
						&& culumns.containsKey(j); j++){//CULUMN
					HSSFCell hSSFCell= hSSFRow.getCell(j);
					if(hSSFCell.CELL_TYPE_STRING== hSSFCell.getCellType()){
						output[i][j]= hSSFCell.getStringCellValue();
					}
					if(hSSFCell.CELL_TYPE_BOOLEAN== hSSFCell.getCellType()){
						output[i][j]= hSSFCell.getBooleanCellValue();
					}
					if(hSSFCell.CELL_TYPE_NUMERIC== hSSFCell.getCellType()){
						if(HSSFDateUtil.isCellDateFormatted(hSSFCell)){
							output[i][j]= hSSFCell.getDateCellValue();
						}else{
							output[i][j]= hSSFCell.getNumericCellValue();
						}
					}
					if(hSSFCell.CELL_TYPE_ERROR== hSSFCell.getCellType()){
						output[i][j]= hSSFCell.getErrorCellValue();
					}
				}
			}
		}		
		return output;
	}
}