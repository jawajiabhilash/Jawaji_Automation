package com.Tricentis.utilities;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import baseTest.ObjectRepository;

public class XLReader extends ObjectRepository {
	String filePath = "/Demo/Tricentis/com/Tricenties/testData/DD1.xlsx";
	Workbook wb;
	static Sheet sh;

	public XLReader() {

		// open file - workbook
		File testDataFile = new File(filePath);
		try {
			wb = WorkbookFactory.create(testDataFile);
		} catch (EncryptedDocumentException | IOException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		sh = wb.getSheet("Sheet1");
	}

	// get test data from test data sheet in hashmap based on row number
	public static HashMap<String, String> getTestDataIntoMap(int rowNum) {
		// read data row by row and put in map
		HashMap<String, String> hm = new HashMap<String, String>();

		for (int i = 0; i < sh.getRow(0).getLastCellNum(); i++) {
			sh.getRow(rowNum).getCell(i).setCellType(CellType.STRING);
			hm.put(sh.getRow(0).getCell(i).toString(), sh.getRow(rowNum).getCell(i).toString());

		}
		return hm;
	}

	public static int getRowCount() {
		return sh.getLastRowNum();

	}

	public static void main(String[] args) throws IOException {

		System.out.println("the row count is " + XLReader.getRowCount());
		System.out.println("the column count is " + XLReader.getCellCount());
	}

	public static int getCellCount() {
		return sh.getRow(0).getLastCellNum();
	}
}
