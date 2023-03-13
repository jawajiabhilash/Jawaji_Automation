package com.Tricenties.tests;

import baseTest.BaseTest;

public class TestExcelData extends BaseTest {
	
	static String path="C:\\Users\\User\\eclipse-workspace\\Demo\\TestData\\TestData.xlsx";
	
	
public static void main(String[] args) throws Exception {
	getTestData(path, "Sheet1", 2);
	  
	  System.out.println("The Username is "+ usr);
	  System.out.println("the password is "+ pwd);
	  System.out.println("the password is "+ msg);
		
}
	
	public void PrintDetailsFromExcel() throws Exception{
		
	  
	}

}
