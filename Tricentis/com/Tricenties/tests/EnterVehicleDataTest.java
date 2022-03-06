package com.Tricenties.tests;

import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.Tricentis.pages.EnterVehicleDataPage;
import com.Tricentis.pages.HomePage;


public class EnterVehicleDataTest extends EnterVehicleDataPage{
	//EnterVehicleDataPage enterVehicleData= new EnterVehicleDataPage();
	
	@Test(dataProvider="vehicledata")
	public static void EnterVehicleData(Object obj1) {
		HashMap<String, String> testData= (	HashMap<String, String>)obj1;
		
		//Navigate to Home Page
		HomePage homePage= new HomePage();
		homePage.navigateAutomobile();
		
		//Enter Vehicle details
		
		EnterVehicleDataPage enterVehicleDataPage = new EnterVehicleDataPage();
		enterVehicleDataPage.selectMake(testData.get("Make"));
		enterVehicleDataPage.enterEnginePerformance(testData.get("EnginePerformance"));
		enterVehicleDataPage.selectDateofManufacture(testData.get("DateofManufacture"));
		enterVehicleDataPage.selectNoOfSeats(testData.get("NumberOfSeats"));
		enterVehicleDataPage.selectFuelType(testData.get("FuelType"));
		enterVehicleDataPage.enterListPrice(testData.get("ListPrice"));
		enterVehicleDataPage.enterLicensePlateNumbe(testData.get("LicensePlateNumber"));
		enterVehicleDataPage.enterAnnualMileage(testData.get("AnnualMileage"));
		enterVehicleDataPage.clickNext();
	}



}
