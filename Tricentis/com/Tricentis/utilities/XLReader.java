package com.Tricentis.utilities;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import baseTest.ObjectRepository;

public class XLReader extends ObjectRepository {
	String filePath;
	Workbook wb;
	Sheet sh;

	public XLReader() {
		filePath = "C:\\Users\\User\\eclipse-workspace\\Demo\\Tricentis\\com\\Tricenties\\testData\\VehicleInsuranceCalcualator_TestData.xlsx";
	}

	// get test data from test data sheet in hashmap based on row number
	public HashMap<String, String> getTestDataIntoMap(int rowNum) throws IOException {
		File testDataFile = new File(filePath);
		wb = WorkbookFactory.create(testDataFile);
		sh = wb.getSheet("InsurancePremium");
		// read data row by row and put in map
		HashMap<String, String> hm = new HashMap<String, String>();

		for (int i = 0; i < sh.getRow(0).getLastCellNum(); i++) {
			sh.getRow(rowNum).getCell(i).setCellType(CellType.STRING);
			hm.put(sh.getRow(0).getCell(i).toString(), sh.getRow(rowNum).getCell(i).toString());

		}
		return hm;
	}

	public int getRowCount() {
		return sh.getLastRowNum();

	}

	public int getCellCount() {
		return sh.getRow(0).getLastCellNum();
	}

	public static void main(String[] args) throws IOException {
		XLReader xr = new XLReader();
		System.out.println(xr.getTestDataIntoMap(2));
		System.out.println("the row count is " + xr.getRowCount());
		System.out.println("the column count is " + xr.getCellCount());
	}

}
