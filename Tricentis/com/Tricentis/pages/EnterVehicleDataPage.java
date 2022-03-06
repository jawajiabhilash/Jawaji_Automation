package com.Tricentis.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Tricentis.utilities.CommonMthods;

public class EnterVehicleDataPage  extends CommonMthods{
	
	
	
	@FindBy(id="make") public static WebElement makeDropdown;
	@FindBy(id="engineperformance")public static WebElement enginePerformanceText;
	@FindBy(id="dateofmanufacture")public static WebElement dateOfManufactureCal;
	@FindBy(id="numberofseats")public static WebElement NoOfSeatsDropdown;
	@FindBy(id="fuel")public static WebElement fuelTypeDropdown;
	@FindBy(id="listprice")public static WebElement listPriceText;
	@FindBy(id="licenseplatenumber") public static WebElement licensePlateNumberText;
	@FindBy(id="annualmileage") public static WebElement annualMileageText;
	@FindBy(id="nextenterinsurantdata") public static WebElement nextBtn;
	
	public void selectMake(String makeDrpdwnValue) {
		selectDropDown(makeDropdown, 1, makeDrpdwnValue);
	}
	public void enterEnginePerformance(String enginePerformanceValue) {
		enterText(enginePerformanceText, 1, enginePerformanceValue);
	}
	public void selectDateofManufacture(String dateOfManufactureValue) {
		selectDropDown(enginePerformanceText, 1, dateOfManufactureValue);
	}
	public void selectNoOfSeats(String NoOfSeatsDropdownValue) {
		selectDropDown(NoOfSeatsDropdown, 1, NoOfSeatsDropdownValue);
	}
	public void selectFuelType(String fuelTypeDropdownValue) {
		selectDropDown(fuelTypeDropdown, 1, fuelTypeDropdownValue);
	}
	public void enterListPrice(String listPriceTextValue) {
		enterText(listPriceText, 1, listPriceTextValue);
	}
	public void enterLicensePlateNumbe(String licensePlateNumberTextValue) {
		enterText(licensePlateNumberText, 1, licensePlateNumberTextValue);
	}
	public void enterAnnualMileage(String annualMileageTextValue) {
		enterText(annualMileageText, 1, annualMileageTextValue);
	}
	public void clickNext() {
		click(nextBtn, 1);
	}
	
	

	
	

}
