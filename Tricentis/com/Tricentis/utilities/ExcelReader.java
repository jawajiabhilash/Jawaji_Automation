package com.Tricentis.utilities;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {

	String ExcelPath=null;

	public ExcelReader(String ExcelPath) {
		this.ExcelPath=ExcelPath;
	}

	public Map<String, String> getDataInMap(String sheetName, int rowNum)
			throws Exception {
		
		if(ExcelPath.isEmpty()||ExcelPath.isBlank()||ExcelPath==null||ExcelPath==" ") {
			throw new Exception("File Not found");
		}

		File fi = new File(ExcelPath);
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet(sheetName);

		int colCount = sh.getRow(0).getLastCellNum();

		Map<String, String> testMap = new HashMap<String, String>();

		for (int i = 0; i <colCount; i++) {
			sh.getRow(rowNum).getCell(i).setCellType(CellType.STRING);
			testMap.put(sh.getRow(0).getCell(i).toString(), sh.getRow(rowNum).getCell(i).toString());
		}

		return testMap;

	}

}
